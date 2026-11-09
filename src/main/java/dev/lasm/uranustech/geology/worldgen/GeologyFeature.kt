package dev.lasm.uranustech.geology.worldgen

import com.mojang.serialization.MapCodec
import com.mojang.serialization.codecs.RecordCodecBuilder
import dev.lasm.uranustech.geology.api.HostRockRegistry
import dev.lasm.uranustech.geology.api.HostRockType
import dev.lasm.uranustech.utils.rloc
import net.minecraft.core.BlockPos
import net.minecraft.core.Holder
import net.minecraft.core.HolderSet
import net.minecraft.core.SectionPos
import net.minecraft.core.registries.Registries
import net.minecraft.tags.TagKey
import net.minecraft.world.level.WorldGenLevel
import net.minecraft.world.level.biome.Biome
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.levelgen.feature.Feature
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration

/**
 * Generates a chunk's rock layers and every ore in them in one pass.
 *
 * Rock layers, veins, contact ores and small ores are not four things in the world, they are one set
 * of decisions per column. GT6's `WorldgenStoneLayers` walks each column once, picks the rock from the
 * layer noise, and writes whatever ore belongs at that height on the way past. Splitting them into
 * separate features instead means the ore has to be decided by *reading back* the rock a previous
 * feature wrote, which is slower and is also wrong at a chunk border, where the neighbouring chunk may
 * not have written its rock yet.
 *
 * So the rock for a position is derived from the layer noise directly and the ore goes into that rock.
 * Nothing here depends on anything already in the world except whether a block may be replaced at all,
 * and that is settled before `underground_ores` runs.
 *
 * The data stays split by kind, into the [OreVein], [DoubleLayerOre] and [SmallOre] registries; only
 * the order they are consulted in lives here. Within one position a vein role wins, then a contact ore,
 * then a small ore, then the rock itself.
 *
 * Cost:
 *
 * - The biome is sampled once per column and the layer noise once per y, with the band looked up per y
 *   as well, so neither is computed twice for one position.
 * - A position whose block is not in [REPLACEABLE] is skipped before the rock is sampled, and most
 *   positions in a chunk are already air or water.
 * - The ore positions of a chunk are all derived up front, so walking a column only reads arrays.
 *
 * This runs during feature decoration, where the level is a `WorldGenRegion` that serves only the
 * chunks it has loaded, at `FEATURES` status. Only the plain block accessors may be used: asking it for
 * a chunk at `FULL` throws.
 */
class GeologyFeature(codec: MapCodec<GeologyConfig>) : Feature<GeologyConfig>(codec.codec()) {
    override fun place(context: FeaturePlaceContext<GeologyConfig>): Boolean {
        val level = context.level()
        val config = context.config()
        if (config.biomes.isEmpty()) return false

        val anchor = context.origin()
        val chunkX = SectionPos.blockToSectionCoord(anchor.x)
        val chunkZ = SectionPos.blockToSectionCoord(anchor.z)
        val seed = level.seed

        val candidates = if (config.veins.size() == 0) {
            emptyList()
        } else {
            VeinRegistry.select(seed, chunkX, chunkZ, config.veins)
        }
        val contacts = if (config.contactOres.size() == 0) {
            null
        } else {
            matchers.value(config.contactOres) { ContactOreMatcher.build(it) }
        }
        val scatter = Scatter.of(seed, level, chunkX, chunkZ, config.smallOres)

        val cursor = BlockPos.MutableBlockPos()
        // Sized for the four roles of every candidate, so a column can never drop one.
        val overlays = ColumnOverlays(candidates.size * 4)
        // Biomes are mostly vertical bands, so one sample per column is enough. The middle of the world
        // is used so the value is never clamped by the build limits.
        val biomeSampleY = (level.minBuildHeight + level.maxBuildHeight) / 2
        val minBlockX = SectionPos.sectionToBlockCoord(chunkX)
        val minBlockZ = SectionPos.sectionToBlockCoord(chunkZ)
        var placed = false

        for (localZ in 0..15) {
            val z = minBlockZ + localZ
            for (localX in 0..15) {
                val x = minBlockX + localX
                cursor.set(x, biomeSampleY, z)
                val layers = config.layersFor(level.getBiome(cursor)) ?: continue
                if (placeColumn(level, cursor, layers, contacts, scatter, candidates, overlays, seed, x, z)) {
                    placed = true
                }
            }
        }
        return placed
    }

    /** Decides and writes one column of rock and ore. Returns true when anything was written. */
    private fun placeColumn(
        level: WorldGenLevel,
        cursor: BlockPos.MutableBlockPos,
        layers: RockLayerConfig,
        contacts: ContactOreMatcher?,
        scatter: Scatter,
        candidates: List<Pair<VeinOrigin, OreVein>>,
        overlays: ColumnOverlays,
        seed: Long,
        x: Int,
        z: Int
    ): Boolean {
        overlays.build(seed, candidates, x, z, level.minBuildHeight, level.maxBuildHeight)
        val column = scatter.columnOf(x, z)
        var slot = 0
        var placed = false
        var overlaySlot = 0
        // The rock is computed for every y and the two neighbours are kept, so a contact is found by
        // comparing them rather than by reading either back out of the world.
        // The host of the rock below, or null when the block below is an ore or may not be replaced.
        // A contact needs rock on both sides, so null also means "no contact here".
        var upperHost: HostRockType? = null
        var previousBand: RockLayerConfig.Band? = null

        for (y in level.minBuildHeight until level.maxBuildHeight) {
            cursor.set(x, y, z)
            val existing = level.getBlockState(cursor)
            if (!existing.`is`(REPLACEABLE)) {
                // A block that may not be replaced interrupts the run, so no ore is seeded against a
                // neighbour across it.
                upperHost = null
                previousBand = null
                continue
            }

            val forcedDeepslate = y <= 0
            val rock: BlockState
            val host: HostRockType
            if (forcedDeepslate) {
                rock = Blocks.DEEPSLATE.defaultBlockState()
                host = HostRockType.DEEPSLATE
                previousBand = null
            } else {
                val band = if (previousBand != null && y < previousBand.maxY) previousBand else layers.bandFor(y)
                // A band names the rocks for its depth range; anything the bands leave out is filled by the
                // fallback, exactly as the rock layer feature did.
                val rocks = (band?.rocks ?: layers.fallback).takeIf { it.isNotEmpty() } ?: layers.fallback
                if (rocks.isEmpty()) {
                    upperHost = null
                    previousBand = null
                    continue
                }
                previousBand = band

                rock = rocks[
                    LayerNoise.sample(
                        seed, layers.seedOffset,
                        layers.frequencyX, layers.frequencyY, layers.frequencyZ,
                        layers.verticalOffset, x, y, z, rocks.size
                    )
                ]
                host = HostRockRegistry.get(rock)?.type ?: HostRockType.STONE
            }

            // Precedence: a vein role, then a contact ore, then a small ore, then the rock itself.
            var state: BlockState? = null
            if (overlays.yAt(overlaySlot) == y) {
                state = overlays.stateAt(overlaySlot, host, forcedDeepslate)
                overlaySlot++
            }
            if (state == null && contacts != null && upperHost != null && upperHost != host) {
                val ore = contacts.select(seed, x, y, z, upperHost, host)
                if (ore != null) state = ContactOreMatcher.stateFor(ore, host)
            }
            // The column's entries are ordered by y, so a cursor that has passed this height is spent;
            // looking one entry ahead would stall on it for the rest of the column.
            while (column >= 0 && slot < Scatter.SLOTS && scatter.yAt(column, slot) < y) slot++
            if (state == null && column >= 0 && slot < Scatter.SLOTS && scatter.yAt(column, slot) == y) {
                state = scatter.at(column, slot, host, forcedDeepslate)
                slot++
            }

            val finalState = state ?: rock
            if (finalState != existing) {
                level.setBlock(cursor, finalState, 2)
                placed = true
            }
            // A contact needs rock on both sides, so an ore block ends the run: it is not a partner for
            // the block above it.
            upperHost = if (state == null) host else null
        }
        return placed
    }

    /** Shared across chunk workers, so these are built once and are immutable afterwards. */
    private val matchers = HolderSetCache<ContactOreMatcher>()

    companion object {
        /** Blocks generated geology may replace. See the `geology_replaceable` tag. */
        val REPLACEABLE: TagKey<Block> = TagKey.create(Registries.BLOCK, rloc("geology_replaceable"))
    }
}

/** The whole world generation configuration: which rocks per biome, and the ore that goes in them. */
data class GeologyConfig(
    val biomes: List<BiomeRockLayers>,
    val veins: HolderSet<OreVein>,
    val contactOres: HolderSet<DoubleLayerOre>,
    val smallOres: HolderSet<SmallOre>
) : FeatureConfiguration {
    /** The rock layers for a biome, or null when no entry covers it. */
    fun layersFor(biome: Holder<Biome>): RockLayerConfig? =
        biomes.firstOrNull { it.biomes.contains(biome) }?.layers

    companion object {
        val CODEC: MapCodec<GeologyConfig> = RecordCodecBuilder.mapCodec { instance ->
            instance.group(
                BiomeRockLayers.CODEC.listOf().fieldOf("biomes").forGetter(GeologyConfig::biomes),
                OreVein.LIST_CODEC.fieldOf("veins").forGetter(GeologyConfig::veins),
                DoubleLayerOre.LIST_CODEC.fieldOf("contact_ores").forGetter(GeologyConfig::contactOres),
                SmallOre.LIST_CODEC.fieldOf("small_ores").forGetter(GeologyConfig::smallOres)
            ).apply(instance, ::GeologyConfig)
        }
    }
}
