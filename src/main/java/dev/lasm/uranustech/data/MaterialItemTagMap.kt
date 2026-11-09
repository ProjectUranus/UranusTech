package dev.lasm.uranustech.data

import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.utils.rloc
import net.minecraft.resources.ResourceLocation
import java.util.concurrent.ConcurrentHashMap

/** Each item belongs to its exact form and to that form's material-specific tag. */
object MaterialItemTagMap {
    private val tagsByGenerator = ItemGeneratorModel.entries.associateWith { rloc("c", tagPath(it)) }
    private val itemsByTag = ConcurrentHashMap<ResourceLocation, MutableSet<ResourceLocation>>()
    @Volatile
    private var cachedSnapshot: Map<ResourceLocation, Set<ResourceLocation>>? = null

    fun register(itemId: ResourceLocation, material: Material, generator: ItemGeneratorModel) {
        val formTag = tagsByGenerator.getValue(generator)
        val materialTag = rloc("c", "${formTag.path}/${material.id}")
        if (material.meta.reRegistrations.isNotEmpty()) {
            // Process re-registrations like any_wood_or_plastic
            for (key in material.meta.reRegistrations) {
                val reRegistrationTag = rloc("c", "${formTag.path}/${key.location().path}")
                itemsByTag.computeIfAbsent(reRegistrationTag) { ConcurrentHashMap.newKeySet() }.add(itemId)
            }
        }
        itemsByTag.computeIfAbsent(formTag) { ConcurrentHashMap.newKeySet() }.add(itemId)
        itemsByTag.computeIfAbsent(materialTag) { ConcurrentHashMap.newKeySet() }.add(itemId)
        cachedSnapshot = null
    }

    fun assignments(): Map<ResourceLocation, Set<ResourceLocation>> {
        cachedSnapshot?.let { return it }
        return synchronized(this) {
            cachedSnapshot ?: itemsByTag.mapValues { (_, items) -> items.toSet() }.also { cachedSnapshot = it }
        }
    }

    // Small/tiny and processed forms cannot substitute for a full-sized basic form.
    private fun tagPath(generator: ItemGeneratorModel): String = when (generator) {
        ItemGeneratorModel.BILLET -> "billets"
        ItemGeneratorModel.BOLT -> "bolts"
        ItemGeneratorModel.CASING_SMALL -> "small_casings"
        ItemGeneratorModel.ARROW_PLASTIC -> "plastic_arrows"
        ItemGeneratorModel.ARROW_WOOD -> "wooden_arrows"
        ItemGeneratorModel.BULLET_LARGE -> "large_bullets"
        ItemGeneratorModel.BULLET_MEDIUM -> "medium_bullets"
        ItemGeneratorModel.BULLET_SMALL -> "small_bullets"
        ItemGeneratorModel.CHAIN -> "chains"
        ItemGeneratorModel.CHUNK -> "chunks"
        ItemGeneratorModel.CRUSHED -> "crushed_ores"
        ItemGeneratorModel.CRUSHED_CENTRIFUGED -> "centrifuged_crushed_ores"
        ItemGeneratorModel.CRUSHED_CENTRIFUGED_TINY -> "tiny_centrifuged_crushed_ores"
        ItemGeneratorModel.CRUSHED_PURIFIED -> "purified_crushed_ores"
        ItemGeneratorModel.CRUSHED_PURIFIED_TINY -> "tiny_purified_crushed_ores"
        ItemGeneratorModel.CRUSHED_TINY -> "tiny_crushed_ores"
        ItemGeneratorModel.DUST -> "dusts"
        ItemGeneratorModel.DUST_DIV_72 -> "div_72_dusts"
        ItemGeneratorModel.DUST_SMALL -> "small_dusts"
        ItemGeneratorModel.DUST_TINY -> "tiny_dusts"
        ItemGeneratorModel.FOIL -> "foils"
        ItemGeneratorModel.GEAR -> "gears"
        ItemGeneratorModel.GEAR_SMALL -> "small_gears"
        ItemGeneratorModel.GEM -> "gems"
        ItemGeneratorModel.GEM_CHIPPED -> "chipped_gems"
        ItemGeneratorModel.GEM_EXQUISITE -> "exquisite_gems"
        ItemGeneratorModel.GEM_FLAWED -> "flawed_gems"
        ItemGeneratorModel.GEM_FLAWLESS -> "flawless_gems"
        ItemGeneratorModel.GEM_LEGENDARY -> "legendary_gems"
        ItemGeneratorModel.INGOT -> "ingots"
        ItemGeneratorModel.INGOT_DOUBLE -> "double_ingots"
        ItemGeneratorModel.INGOT_HOT -> "hot_ingots"
        ItemGeneratorModel.INGOT_QUADRUPLE -> "quadruple_ingots"
        ItemGeneratorModel.INGOT_QUINTUPLE -> "quintuple_ingots"
        ItemGeneratorModel.INGOT_TRIPLE -> "triple_ingots"
        ItemGeneratorModel.LENS -> "lenses"
        ItemGeneratorModel.MINECART_WHEELS -> "minecart_wheels"
        ItemGeneratorModel.NUGGET -> "nuggets"
        ItemGeneratorModel.ORE_RAW -> "raw_materials"
        ItemGeneratorModel.PLANT_BERRY -> "berries"
        ItemGeneratorModel.PLANT_BLOSSOM -> "blossoms"
        ItemGeneratorModel.PLANT_FIBER -> "fibers"
        ItemGeneratorModel.PLANT_TWIG -> "twigs"
        ItemGeneratorModel.PLANT_WART -> "warts"
        ItemGeneratorModel.PLATE -> "plates"
        ItemGeneratorModel.PLATE_CURVED -> "curved_plates"
        ItemGeneratorModel.PLATE_DENSE -> "dense_plates"
        ItemGeneratorModel.PLATE_DOUBLE -> "double_plates"
        ItemGeneratorModel.PLATE_GEM -> "gem_plates"
        ItemGeneratorModel.PLATE_GEM_TINY -> "tiny_gem_plates"
        ItemGeneratorModel.PLATE_QUADRUPLE -> "quadruple_plates"
        ItemGeneratorModel.PLATE_QUINTUPLE -> "quintuple_plates"
        ItemGeneratorModel.PLATE_TINY -> "tiny_plates"
        ItemGeneratorModel.PLATE_TRIPLE -> "triple_plates"
        ItemGeneratorModel.RAIL -> "rails"
        ItemGeneratorModel.RING -> "rings"
        ItemGeneratorModel.ROCK -> "rocks"
        ItemGeneratorModel.ROTOR -> "rotors"
        ItemGeneratorModel.ROUND -> "rounds"
        ItemGeneratorModel.SCREW -> "screws"
        ItemGeneratorModel.SCRAP -> "scraps"
        ItemGeneratorModel.SPRING -> "springs"
        ItemGeneratorModel.SPRING_SMALL -> "small_springs"
        ItemGeneratorModel.STICK -> "rods"
        ItemGeneratorModel.STICK_LONG -> "long_rods"
        ItemGeneratorModel.TOOL_HEAD_ARROW -> "arrow_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_AXE -> "axe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_AXE_DOUBLE -> "double_axe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_BUILDER_WAND -> "builder_wand_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_BUZZSAW -> "buzzsaw_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_CHAINSAW -> "chainsaw_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_CHISEL -> "chisel_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_CONSTRUCTION_PICKAXE -> "construction_pickaxe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_DRILL -> "drill_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_FILE -> "file_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_HAMMER -> "hammer_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_HOE -> "hoe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_PICKAXE -> "pickaxe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_PICKAXE_GEM -> "gem_pickaxe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_PLOW -> "plow_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_ARROW -> "raw_arrow_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_AXE -> "raw_axe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_AXE_DOUBLE -> "raw_double_axe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_CHISEL -> "raw_chisel_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_HOE -> "raw_hoe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_PICKAXE -> "raw_pickaxe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_PLOW -> "raw_plow_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_SAW -> "raw_saw_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_SENSE -> "raw_scythe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_SHOVEL -> "raw_shovel_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_SPADE -> "raw_spade_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_SWORD -> "raw_sword_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_RAW_UNIVERSAL_SPADE -> "raw_universal_spade_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_SAW -> "saw_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_SCREWDRIVER -> "screwdriver_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_SENSE -> "scythe_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_SHOVEL -> "shovel_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_SPADE -> "spade_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_SWORD -> "sword_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_UNIVERSAL_SPADE -> "universal_spade_tool_heads"
        ItemGeneratorModel.TOOL_HEAD_WRENCH -> "wrench_tool_heads"
        ItemGeneratorModel.WIRE_FINE -> "fine_wires"
    }
}
