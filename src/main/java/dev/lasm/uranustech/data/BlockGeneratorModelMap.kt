package dev.lasm.uranustech.data

import dev.lasm.uranustech.api.chemical.material.IconSet
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.MaterialTag
import dev.lasm.uranustech.geology.api.HostRockRegistry
import dev.lasm.uranustech.geology.api.HostRockType
import dev.lasm.uranustech.utils.rloc
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import java.util.*

enum class BlockGeneratorKind { ORE, STORAGE, CRATE, OTHER }

/** GT6 OP/Loader_PrefixBlocks/Loader_Ores forms; pipes and wires require their own connectors. */
enum class BlockGeneratorModel(
    val blockSuffix: String,
    val iconName: String,
    private val hardness: Float,
    private val resistance: Float,
    private val kind: BlockGeneratorKind = BlockGeneratorKind.OTHER,
    val hasHostRock: Boolean = false,
    sound: SoundType = SoundType.METAL
) {
    ORE("ore", "ore", 1.0f, 1.0f, BlockGeneratorKind.ORE, true, SoundType.STONE),
    ORE_BEDROCK("bedrock_ore", "orebedrock", -1.0f, 3600000.0f, BlockGeneratorKind.ORE, sound = SoundType.STONE),
    ORE_DENSE("dense_ore", "oredense", 1.0f, 1.0f, BlockGeneratorKind.ORE, true, SoundType.STONE),
    ORE_DUST("dust_ore", "oredust", 0.6f, 0.8f, BlockGeneratorKind.ORE, sound = SoundType.GRAVEL),
    ORE_SMALL("small_ore", "oresmall", 1.0f, 1.0f, BlockGeneratorKind.ORE, true, SoundType.STONE),
    BLOCK_RAW("block_raw", "blockraw", 1.5f, 4.5f, BlockGeneratorKind.STORAGE, sound = SoundType.GRAVEL),
    BLOCK_GEM("block_gem", "blockgem", 1.5f, 4.5f, BlockGeneratorKind.STORAGE, sound = SoundType.STONE),
    BLOCK_DUST("block_dust", "blockdust", 0.5f, 4.5f, BlockGeneratorKind.STORAGE, sound = SoundType.SAND),
    BLOCK_INGOT("block_ingot", "blockingot", 1.0f, 3.0f, BlockGeneratorKind.STORAGE),
    BLOCK_PLATE("block_plate", "blockplate", 1.0f, 3.0f, BlockGeneratorKind.STORAGE),
    BLOCK_PLATE_GEM("block_plate_gem", "blockplategem", 1.0f, 3.0f, BlockGeneratorKind.STORAGE, sound = SoundType.STONE),
    BLOCK_SOLID("block_solid", "blocksolid", 1.7f, 5.0f, BlockGeneratorKind.STORAGE),
    CASING_MACHINE("casing_machine", "casingmachine", 1.0f, 3.0f),
    CASING_MACHINE_DOUBLE("casing_machine_double", "casingmachinedouble", 2.0f, 6.0f),
    CASING_MACHINE_QUADRUPLE("casing_machine_quadruple", "casingmachinequadruple", 4.0f, 12.0f),
    CASING_MACHINE_DENSE("casing_machine_dense", "casingmachinedense", 9.0f, 18.0f),
    FRAME_GT("frame_gt", "framegt", 1.0f, 3.0f),
    CRATE_GT_RAW("crate_gt_raw", "crategtraw", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_GEM("crate_gt_gem", "crategtgem", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_DUST("crate_gt_dust", "crategtdust", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_INGOT("crate_gt_ingot", "crategtingot", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_PLATE("crate_gt_plate", "crategtplate", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_PLATE_GEM("crate_gt_plate_gem", "crategtplategem", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_64_RAW("crate_gt_64_raw", "crategtraw", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_64_GEM("crate_gt_64_gem", "crategtgem", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_64_DUST("crate_gt_64_dust", "crategtdust", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_64_INGOT("crate_gt_64_ingot", "crategtingot", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_64_PLATE("crate_gt_64_plate", "crategtplate", 1.0f, 0.2f, BlockGeneratorKind.CRATE),
    CRATE_GT_64_PLATE_GEM("crate_gt_64_plate_gem", "crategtplategem", 1.0f, 0.2f, BlockGeneratorKind.CRATE);

    val isStorage: Boolean = kind == BlockGeneratorKind.STORAGE
    val isCrate: Boolean = kind == BlockGeneratorKind.CRATE
    val isOre: Boolean = kind == BlockGeneratorKind.ORE
    private val soundType: SoundType = if (isCrate) SoundType.WOOD else sound

    fun isTranslucent(material: Material): Boolean = !isCrate && !isOre && material.hasTag(MaterialTag.Properties.TRANSPARENT)

    fun properties(material: Material): BlockBehaviour.Properties {
        return BlockBehaviour.Properties.of()
            .mapColor(if (isCrate) MapColor.WOOD else MapColor.COLOR_GRAY)
            .sound(soundType)
            .strength(hardness, resistance)
            .apply {
                if (!isCrate && this@BlockGeneratorModel != BLOCK_DUST) requiresCorrectToolForDrops()
                if (isTranslucent(material) || this@BlockGeneratorModel == FRAME_GT) noOcclusion()
                if (!isCrate && material.hasTag(MaterialTag.Properties.GLOWING)) lightLevel { 15 }
            }
    }

    companion object {
        fun forMaterialTags(tags: Set<MaterialTag>): Set<BlockGeneratorModel> = buildSet {
            if (MaterialTag.ItemGenerator.ORES in tags) {
                addForms(ORE, ORE_BEDROCK, ORE_DENSE, ORE_DUST, ORE_SMALL, BLOCK_RAW, CRATE_GT_RAW, CRATE_GT_64_RAW)
            }
            if (MaterialTag.ItemGenerator.DUSTS in tags) addForms(BLOCK_DUST, CRATE_GT_DUST, CRATE_GT_64_DUST)
            if (MaterialTag.ItemGenerator.GEMS in tags) addForms(BLOCK_GEM, CRATE_GT_GEM, CRATE_GT_64_GEM)
            if (MaterialTag.ItemGenerator.INGOTS in tags) {
                addForms(BLOCK_INGOT, CRATE_GT_INGOT, CRATE_GT_64_INGOT)
                add(BLOCK_SOLID)
            }
            // GT6 plate = PLATES && (INGOTS || !GEMS); plateGem = PLATES && GEMS.
            if (MaterialTag.ItemGenerator.PLATES in tags) {
                if (MaterialTag.ItemGenerator.INGOTS in tags || MaterialTag.ItemGenerator.GEMS !in tags) {
                    addForms(BLOCK_PLATE, CRATE_GT_PLATE, CRATE_GT_64_PLATE)
                }
                if (MaterialTag.ItemGenerator.GEMS in tags) {
                    addForms(BLOCK_PLATE_GEM, CRATE_GT_PLATE_GEM, CRATE_GT_64_PLATE_GEM)
                }
            }
            if (MaterialTag.ItemGenerator.STICKS in tags) add(FRAME_GT)
            if (MaterialTag.ItemGenerator.PARTS in tags && MaterialTag.Processing.SMITHABLE in tags) {
                addAll(listOf(CASING_MACHINE, CASING_MACHINE_DOUBLE, CASING_MACHINE_QUADRUPLE, CASING_MACHINE_DENSE))
            }
        }

        private fun MutableSet<BlockGeneratorModel>.addForms(vararg forms: BlockGeneratorModel) = addAll(forms)
    }
}

object BlockGeneratorModelMap {
    private val crateTexture = rloc("block/iconsets/crate")

    data class Model(
        val texture: ResourceLocation,
        val translucent: Boolean,
        val ore: BlockGeneratorModel? = null,
        val isCrate: Boolean = false
    ) {
        val hasBackground: Boolean = ore != null || isCrate
        val overlay: ResourceLocation = rloc(texture.namespace, "${texture.path}_overlay")
        val modelsByHost: Map<HostRockType, ResourceLocation> = EnumMap<HostRockType, ResourceLocation>(HostRockType::class.java).apply {
            if (ore == null) {
                put(HostRockType.STONE, rloc(texture.namespace, texture.path + if (translucent) "_translucent" else ""))
            } else {
                val path = "block/materialores/${texture.path.removePrefix("block/materialicons/")}/"
                val hosts = if (ore.hasHostRock) HostRockType.entries else listOf(HostRockType.STONE)
                for (host in hosts) {
                    val name = when (ore) {
                        BlockGeneratorModel.ORE_BEDROCK -> "bedrock"
                        BlockGeneratorModel.ORE_DUST -> "gravel"
                        else -> host.serializedName
                    }
                    put(host, rloc(texture.namespace, path + name))
                }
            }
        }
        val id: ResourceLocation = modelsByHost.getValue(HostRockType.STONE)

        // Host registrations finish after material models are assigned.
        private val backgroundsByHost: Map<HostRockType, ResourceLocation> by lazy {
            EnumMap<HostRockType, ResourceLocation>(HostRockType::class.java).apply {
                for (host in modelsByHost.keys) put(host, when {
                    isCrate -> crateTexture
                    ore == BlockGeneratorModel.ORE_BEDROCK -> rloc("minecraft", "block/bedrock")
                    ore == BlockGeneratorModel.ORE_DUST -> rloc("minecraft", "block/gravel")
                    else -> requireNotNull(HostRockRegistry.byType(host)) { "Missing ore host: $host" }.texture
                })
            }
        }

        fun backgroundTexture(host: HostRockType): ResourceLocation = backgroundsByHost.getValue(host)
    }

    private val blockModels = linkedMapOf<ResourceLocation, Model>()
    private val texturesByIcon = EnumMap<IconSet, EnumMap<BlockGeneratorModel, ResourceLocation>>(IconSet::class.java)
    private val modelsByTexture = hashMapOf<ResourceLocation, Array<Model?>>()
    @Volatile
    private var cachedAssignments: Map<ResourceLocation, Model>? = null

    fun register(blockId: ResourceLocation, material: Material, generator: BlockGeneratorModel) {
        val iconSet = if (material.appearance.iconSet == IconSet.NONE) IconSet.DULL else material.appearance.iconSet
        val textures = texturesByIcon.getOrPut(iconSet) { EnumMap(BlockGeneratorModel::class.java) }
        val texture = textures.getOrPut(generator) { rloc("block/materialicons/${iconSet.sName}/${generator.iconName}") }
        val translucent = generator.isTranslucent(material)
        val variants = modelsByTexture.getOrPut(texture) { arrayOfNulls(2) }
        val index = if (translucent) 1 else 0
        val model = variants[index] ?: Model(
            texture, translucent, generator.takeIf { it.isOre }, generator.isCrate
        ).also { variants[index] = it }
        check(blockModels.putIfAbsent(blockId, model) == null) {
            "Material block already mapped: $blockId"
        }
        cachedAssignments = null
    }

    fun assignments(): Map<ResourceLocation, Model> {
        cachedAssignments?.let { return it }
        return synchronized(this) {
            cachedAssignments ?: blockModels.toMap().also { cachedAssignments = it }
        }
    }

    fun modelFor(blockId: ResourceLocation): ResourceLocation? = blockModels[blockId]?.id
}
