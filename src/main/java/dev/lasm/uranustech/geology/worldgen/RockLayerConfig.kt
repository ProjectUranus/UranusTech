package dev.lasm.uranustech.geology.worldgen

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.core.HolderSet
import net.minecraft.core.registries.Registries
import net.minecraft.resources.HolderSetCodec
import net.minecraft.world.level.biome.Biome
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration

/**
 * Rock layers for one biome.
 *
 * A rock layer is a region of the world filled with one of the biome's rock types, chosen by cell
 * noise. The noise is sampled in three dimensions, so a layer is a curved shell rather than a flat
 * stratum. That is how GT6's stone layers behave, and it is why a vein can cut through several rock
 * types over a short distance.
 *
 * `bands` split the world by depth, because a rock type that is plausible near bedrock is not
 * plausible at the surface. A band also limits the height range it applies to.
 */
data class RockLayerConfig(
    val frequencyX: Float,
    val frequencyY: Float,
    val frequencyZ: Float,
    val seedOffset: Long,
    val verticalOffset: Int,
    val bands: List<Band>,
    val fallback: List<BlockState>
) : FeatureConfiguration {

    /**
     * One depth band.
     *
     * @param rocks the rock types available in this band, indexed by the noise value
     * @param minY inclusive lower bound
     * @param maxY exclusive upper bound
     */
    data class Band(val rocks: List<BlockState>, val minY: Int, val maxY: Int) {
        init {
            require(rocks.isNotEmpty()) { "A rock layer band needs at least one rock" }
            require(maxY > minY) { "A rock layer band needs a positive height range" }
        }

        companion object {
            val CODEC: Codec<Band> = RecordCodecBuilder.create { instance ->
                instance.group(
                    BlockState.CODEC.listOf().fieldOf("rocks").forGetter(Band::rocks),
                    Codec.INT.fieldOf("min_y").forGetter(Band::minY),
                    Codec.INT.fieldOf("max_y").forGetter(Band::maxY)
                ).apply(instance, ::Band)
            }
        }
    }

    fun bandFor(y: Int): Band? = bands.firstOrNull { y >= it.minY && y < it.maxY }

    companion object {
        val CODEC: Codec<RockLayerConfig> = RecordCodecBuilder.create { instance ->
            instance.group(
                Codec.floatRange(0.0001f, 1.0f).optionalFieldOf("frequency_x", DEFAULT_FREQUENCY_X)
                    .forGetter(RockLayerConfig::frequencyX),
                Codec.floatRange(0.0001f, 1.0f).optionalFieldOf("frequency_y", DEFAULT_FREQUENCY_Y)
                    .forGetter(RockLayerConfig::frequencyY),
                Codec.floatRange(0.0001f, 1.0f).optionalFieldOf("frequency_z", DEFAULT_FREQUENCY_Z)
                    .forGetter(RockLayerConfig::frequencyZ),
                Codec.LONG.optionalFieldOf("seed_offset", 0L).forGetter(RockLayerConfig::seedOffset),
                Codec.INT.optionalFieldOf("vertical_offset", 0).forGetter(RockLayerConfig::verticalOffset),
                Band.CODEC.listOf().fieldOf("bands").forGetter(RockLayerConfig::bands),
                // A band covering everything makes an explicit fallback unnecessary.
                BlockState.CODEC.listOf().optionalFieldOf("fallback", emptyList())
                    .forGetter(RockLayerConfig::fallback)
            ).apply(instance, ::RockLayerConfig)
        }

        /**
         * The default frequencies are GT6's stone layer frequencies: a wide, flat cell in x and z and
         * a much taller one in y, so layers are broad sheets rather than narrow columns.
         */
        const val DEFAULT_FREQUENCY_X = 0.009f
        const val DEFAULT_FREQUENCY_Y = 0.075f
        const val DEFAULT_FREQUENCY_Z = 0.009f
    }
}

/**
 * Rock layers for a set of biomes. One placed feature serves every biome on a dimension; this is the
 * per-biome part of its configuration, so adding a biome means adding an entry rather than a new
 * feature and a new biome modifier.
 */
data class BiomeRockLayers(
    val biomes: HolderSet<Biome>,
    val layers: RockLayerConfig
) {
    companion object {
        val CODEC: Codec<BiomeRockLayers> = RecordCodecBuilder.create { instance ->
            instance.group(
                HolderSetCodec.create(Registries.BIOME, Biome.CODEC, false)
                    .fieldOf("biomes").forGetter(BiomeRockLayers::biomes),
                RockLayerConfig.CODEC.fieldOf("layers").forGetter(BiomeRockLayers::layers)
            ).apply(instance, ::BiomeRockLayers)
        }
    }
}
