package dev.lasm.uranustech.geology.init

import dev.lasm.uranustech.UranusTech
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.LiquidBlock
import net.minecraft.world.level.block.SlabBlock
import net.minecraft.world.level.block.StairBlock
import net.minecraft.world.level.block.WallBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.MapColor
import net.neoforged.neoforge.registries.DeferredBlock

object UranusGenBlocks {
    data class RockFamily(val id: String, val block: DeferredBlock<Block>, val harvestLevel: Int) {
        internal val variantIds = mutableListOf<String>()
    }

    private val rockFamilies = mutableListOf<RockFamily>()
    val ROCK_VARIANTS = linkedMapOf<String, DeferredBlock<out Block>>()
    private val variantsByForm = linkedMapOf<String, MutableList<DeferredBlock<out Block>>>()
    private val harvestBlocks by lazy {
        rockFamilies.groupBy { it.harvestLevel }.mapValues { (_, families) ->
            families.flatMap { listOf(it.id) + it.variantIds }
        }
    }

    val GRANITE_BLACK = rock("granite_black", MapColor.COLOR_BLACK, 6.0f, 3.0f, 3)
    val GRANITE_RED = rock("granite_red", MapColor.TERRACOTTA_RED, 6.0f, 3.0f, 3)
    val THOLEIITIC_BASALT = rock("tholeiitic_basalt", MapColor.COLOR_BLACK, 3.0f, 2.0f, 2)
    val MARBLE = rock("marble", MapColor.QUARTZ, 0.75f, 0.5f, 0)
    val LIMESTONE = rock("limestone", MapColor.SAND, 0.75f, 0.5f, 0)
    val KOMATIITE = rock("komatiite", MapColor.COLOR_GREEN, 3.0f, 2.0f, 2)
    val GREENSCHIST = rock("greenschist", MapColor.COLOR_GREEN, 0.75f, 0.5f, 0)
    val BLUESCHIST = rock("blueschist", MapColor.COLOR_BLUE, 0.75f, 0.5f, 0)
    val KIMBERLITE = rock("kimberlite", MapColor.STONE, 3.0f, 2.0f, 2)
    val QUARTZITE = rock("quartzite", MapColor.QUARTZ, 0.75f, 0.5f, 0)
    val NATURAL_STONES: Map<String, DeferredBlock<Block>> = rockFamilies.associate { it.id to it.block }

    init {
        val textureVariants = listOf(
            "cobble", "cobble_mossy", "small_bricks", "small_tiles", "smooth", "bricks",
            "bricks_chiseled", "bricks_cracked", "bricks_mossy", "bricks_redstone",
            "bricks_reinforced", "square_bricks", "tiles", "windmill_tiles_a", "windmill_tiles_b"
        )
        for (family in rockFamilies) {
            for (form in textureVariants) {
                val id = "${family.id}_$form"
                ROCK_VARIANTS[id] = UranusTech.BLOCKS.register(id) { ->
                    Block(BlockBehaviour.Properties.ofFullCopy(family.block.get()))
                }
                indexVariant(family, form, id)
            }
            for (form in listOf("stone", "cobble", "bricks", "smooth")) {
                val stem = if (form == "stone") family.id else "${family.id}_$form"
                val base = if (form == "stone") family.block else ROCK_VARIANTS.getValue(stem)
                ROCK_VARIANTS["${stem}_stairs"] = UranusTech.BLOCKS.register("${stem}_stairs") { ->
                    StairBlock(base.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(base.get()))
                }
                indexVariant(family, "stairs", "${stem}_stairs")
                ROCK_VARIANTS["${stem}_slab"] = UranusTech.BLOCKS.register("${stem}_slab") { ->
                    SlabBlock(BlockBehaviour.Properties.ofFullCopy(base.get()))
                }
                indexVariant(family, "slab", "${stem}_slab")
                ROCK_VARIANTS["${stem}_wall"] = UranusTech.BLOCKS.register("${stem}_wall") { ->
                    WallBlock(BlockBehaviour.Properties.ofFullCopy(base.get()))
                }
                indexVariant(family, "wall", "${stem}_wall")
            }
        }
    }

    val CRUDE_OIL: DeferredBlock<LiquidBlock> = UranusGenFluids.CRUDE_OIL_ENTRY.block

    fun harvestLevelBlocks(level: Int): List<String> = harvestBlocks[level] ?: emptyList()

    fun variantsForForm(form: String): List<DeferredBlock<out Block>> = variantsByForm[form] ?: emptyList()

    private fun indexVariant(family: RockFamily, form: String, id: String) {
        family.variantIds += id
        variantsByForm.getOrPut(form) { mutableListOf() }.add(ROCK_VARIANTS.getValue(id))
    }

    private fun rock(id: String, color: MapColor, hardness: Float, resistance: Float, harvestLevel: Int): DeferredBlock<Block> {
        val block = UranusTech.BLOCKS.registerSimpleBlock(
            id, BlockBehaviour.Properties.of().mapColor(color).requiresCorrectToolForDrops().strength(hardness, resistance)
        )
        rockFamilies += RockFamily(id, block, harvestLevel)
        return block
    }
}
