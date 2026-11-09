package dev.lasm.uranustech.data

import dev.lasm.uranustech.api.chemical.material.IconSet
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.MaterialTag
import dev.lasm.uranustech.utils.rloc
import net.minecraft.resources.ResourceLocation
import java.util.concurrent.ConcurrentHashMap
import java.util.EnumMap

enum class ItemGeneratorModel(
    val itemSuffix: String,
    val iconName: String,
    /** Material amount per item in CS.U units; -1 denotes GT6's unquantified ore prefixes. */
    val materialAmount: Long
) {
    BILLET("billet", "billet", CS.U3 * 2),
    BOLT("bolt", "bolt", CS.U8),
    CASING_SMALL("small_casing", "casingsmall", CS.U2),
    ARROW_PLASTIC("plastic_arrow", "arrowgtplastic", CS.U9),
    ARROW_WOOD("wooden_arrow", "arrowgtwood", CS.U9),
    BULLET_LARGE("large_bullet", "bulletgtlarge", CS.U3),
    BULLET_MEDIUM("medium_bullet", "bulletgtmedium", 2 * CS.U9),
    BULLET_SMALL("small_bullet", "bulletgtsmall", CS.U9),
    CHAIN("chain", "chain", CS.U),
    CHUNK("chunk", "chunkgt", CS.U4),
    CRUSHED("crushed_ore", "crushed", 9 * CS.U8),
    CRUSHED_CENTRIFUGED("centrifuged_crushed_ore", "crushedcentrifuged", 11 * CS.U8),
    CRUSHED_CENTRIFUGED_TINY("tiny_centrifuged_crushed_ore", "crushedcentrifugedtiny", 11 * CS.U72),
    CRUSHED_PURIFIED("purified_crushed_ore", "crushedpurified", 10 * CS.U8),
    CRUSHED_PURIFIED_TINY("tiny_purified_crushed_ore", "crushedpurifiedtiny", 10 * CS.U72),
    CRUSHED_TINY("tiny_crushed_ore", "crushedtiny", 9 * CS.U72),
    DUST("dust", "dust", CS.U),
    DUST_DIV_72("div_72_dust", "dustdiv72", CS.U72),
    DUST_SMALL("small_dust", "dustsmall", CS.U4),
    DUST_TINY("tiny_dust", "dusttiny", CS.U9),
    FOIL("foil", "foil", CS.U4),
    GEAR("gear", "geargt", CS.U * 4),
    GEAR_SMALL("small_gear", "geargtsmall", CS.U),
    GEM("gem", "gem", CS.U),
    GEM_CHIPPED("chipped_gem", "gemchipped", CS.U4),
    GEM_EXQUISITE("exquisite_gem", "gemexquisite", CS.U * 4),
    GEM_FLAWED("flawed_gem", "gemflawed", CS.U2),
    GEM_FLAWLESS("flawless_gem", "gemflawless", CS.U * 2),
    GEM_LEGENDARY("legendary_gem", "gemlegendary", CS.U * 8),
    INGOT("ingot", "ingot", CS.U),
    INGOT_DOUBLE("double_ingot", "ingotdouble", CS.U * 2),
    INGOT_HOT("hot_ingot", "ingothot", CS.U),
    INGOT_QUADRUPLE("quadruple_ingot", "ingotquadruple", CS.U * 4),
    INGOT_QUINTUPLE("quintuple_ingot", "ingotquintuple", CS.U * 5),
    INGOT_TRIPLE("triple_ingot", "ingottriple", CS.U * 3),
    LENS("lens", "lens", CS.U4 * 3),
    MINECART_WHEELS("minecart_wheels", "minecartwheels", CS.U),
    NUGGET("nugget", "nugget", CS.U9),
    ORE_RAW("raw_ore", "oreraw", -1L),
    PLANT_BERRY("berry", "plantgtberry", CS.U9),
    PLANT_BLOSSOM("blossom", "plantgtblossom", CS.U9),
    PLANT_FIBER("fiber", "plantgtfiber", CS.U9),
    PLANT_TWIG("twig", "plantgttwig", CS.U9),
    PLANT_WART("wart", "plantgtwart", CS.U4),
    PLATE("plate", "plate", CS.U),
    PLATE_CURVED("curved_plate", "platecurved", CS.U),
    PLATE_DENSE("dense_plate", "platedense", CS.U * 9),
    PLATE_DOUBLE("double_plate", "platedouble", CS.U * 2),
    PLATE_GEM("gem_plate", "plategem", CS.U),
    PLATE_GEM_TINY("tiny_gem_plate", "plategemtiny", CS.U9),
    PLATE_QUADRUPLE("quadruple_plate", "platequadruple", CS.U * 4),
    PLATE_QUINTUPLE("quintuple_plate", "platequintuple", CS.U * 5),
    PLATE_TINY("tiny_plate", "platetiny", CS.U9),
    PLATE_TRIPLE("triple_plate", "platetriple", CS.U * 3),
    RAIL("rail", "railgt", CS.U4),
    RING("ring", "ring", CS.U4),
    ROCK("rock", "rockgt", 9 * CS.U4),
    ROTOR("rotor", "rotor", CS.U * 4 + CS.U4),
    ROUND("round", "round", CS.U9),
    SCREW("screw", "screw", CS.U9),
    SCRAP("scrap", "scrapgt", CS.U9),
    SPRING("spring", "spring", CS.U),
    SPRING_SMALL("small_spring", "springsmall", CS.U4),
    STICK("stick", "stick", CS.U2),
    STICK_LONG("long_stick", "sticklong", CS.U),
    TOOL_HEAD_ARROW("arrow_tool_head", "toolheadarrow", CS.U9),
    TOOL_HEAD_AXE("axe_tool_head", "toolheadaxe", CS.U * 3 - CS.U9),
    TOOL_HEAD_AXE_DOUBLE("double_axe_tool_head", "toolheadaxedouble", CS.U * 5 - 2 * CS.U9),
    TOOL_HEAD_BUILDER_WAND("builder_wand_tool_head", "toolheadbuilderwand", CS.U * 1),
    TOOL_HEAD_BUZZSAW("buzzsaw_tool_head", "toolheadbuzzsaw", CS.U * 4),
    TOOL_HEAD_CHAINSAW("chainsaw_tool_head", "toolheadchainsaw", CS.U * 2),
    TOOL_HEAD_CHISEL("chisel_tool_head", "toolheadchisel", 3 * CS.U2 - CS.U9),
    TOOL_HEAD_CONSTRUCTION_PICKAXE("construction_pickaxe_tool_head", "toolheadconstructionpickaxe", CS.U * 3 - CS.U9),
    TOOL_HEAD_DRILL("drill_tool_head", "toolheaddrill", CS.U * 4),
    TOOL_HEAD_FILE("file_tool_head", "toolheadfile", 3 * CS.U2),
    TOOL_HEAD_HAMMER("hammer_tool_head", "toolheadhammer", CS.U * 6),
    TOOL_HEAD_HOE("hoe_tool_head", "toolheadhoe", CS.U * 2 - CS.U9),
    TOOL_HEAD_PICKAXE("pickaxe_tool_head", "toolheadpickaxe", CS.U * 3 - CS.U9),
    TOOL_HEAD_PICKAXE_GEM("gem_pickaxe_tool_head", "toolheadpickaxegem", CS.U * 1),
    TOOL_HEAD_PLOW("plow_tool_head", "toolheadplow", CS.U * 4 - CS.U9),
    TOOL_HEAD_RAW_ARROW("raw_arrow_tool_head", "toolheadrawarrow", CS.U8),
    TOOL_HEAD_RAW_AXE("raw_axe_tool_head", "toolheadrawaxe", CS.U * 3),
    TOOL_HEAD_RAW_AXE_DOUBLE("raw_double_axe_tool_head", "toolheadrawaxedouble", CS.U * 5),
    TOOL_HEAD_RAW_CHISEL("raw_chisel_tool_head", "toolheadrawchisel", 3 * CS.U2),
    TOOL_HEAD_RAW_HOE("raw_hoe_tool_head", "toolheadrawhoe", CS.U * 2),
    TOOL_HEAD_RAW_PICKAXE("raw_pickaxe_tool_head", "toolheadrawpickaxe", CS.U * 3),
    TOOL_HEAD_RAW_PLOW("raw_plow_tool_head", "toolheadrawplow", CS.U * 4),
    TOOL_HEAD_RAW_SAW("raw_saw_tool_head", "toolheadrawsaw", CS.U * 2),
    TOOL_HEAD_RAW_SENSE("raw_scythe_tool_head", "toolheadrawsense", CS.U * 3),
    TOOL_HEAD_RAW_SHOVEL("raw_shovel_tool_head", "toolheadrawshovel", CS.U),
    TOOL_HEAD_RAW_SPADE("raw_spade_tool_head", "toolheadrawspade", CS.U),
    TOOL_HEAD_RAW_SWORD("raw_sword_tool_head", "toolheadrawsword", CS.U * 2),
    TOOL_HEAD_RAW_UNIVERSAL_SPADE("raw_universal_spade_tool_head", "toolheadrawuniversalspade", CS.U - CS.U9),
    TOOL_HEAD_SAW("saw_tool_head", "toolheadsaw", CS.U * 2 - CS.U9),
    TOOL_HEAD_SCREWDRIVER("screwdriver_tool_head", "toolheadscrewdriver", CS.U),
    TOOL_HEAD_SENSE("scythe_tool_head", "toolheadsense", CS.U * 3 - CS.U9),
    TOOL_HEAD_SHOVEL("shovel_tool_head", "toolheadshovel", CS.U - CS.U9),
    TOOL_HEAD_SPADE("spade_tool_head", "toolheadspade", CS.U - CS.U9),
    TOOL_HEAD_SWORD("sword_tool_head", "toolheadsword", CS.U * 2 - CS.U9),
    TOOL_HEAD_UNIVERSAL_SPADE("universal_spade_tool_head", "toolheaduniversalspade", CS.U - 2 * CS.U9),
    TOOL_HEAD_WRENCH("wrench_tool_head", "toolheadwrench", CS.U * 4),
    WIRE_FINE("fine_wire", "wirefine", CS.U8);

    /** Exact, reduced fraction of a material unit, calculated once for each form. */
    val materialUnitsText: String? = if (materialAmount < 0) null else run {
        var numerator = materialAmount
        var denominator = CS.U
        while (denominator != 0L) {
            val remainder = numerator % denominator
            numerator = denominator
            denominator = remainder
        }
        val divisor = numerator
        val units = materialAmount / divisor
        val parts = CS.U / divisor
        if (parts == 1L) units.toString() else "$units/$parts"
    }

    companion object {
        private val modelsByGenerator = mapOf(
            MaterialTag.ItemGenerator.DUSTS to setOf(DUST, DUST_SMALL, DUST_TINY, DUST_DIV_72),
            MaterialTag.ItemGenerator.FOILS to setOf(FOIL),
            MaterialTag.ItemGenerator.GEMS to setOf(
                GEM, GEM_CHIPPED, GEM_FLAWED, GEM_FLAWLESS, GEM_EXQUISITE, GEM_LEGENDARY,
            ),
            MaterialTag.ItemGenerator.INGOTS to setOf(INGOT, BILLET, CHUNK, NUGGET),
            MaterialTag.ItemGenerator.INGOTS_HOT to setOf(INGOT_HOT),
            MaterialTag.ItemGenerator.LENSES to setOf(LENS),
            MaterialTag.ItemGenerator.MULTIINGOTS to setOf(
                INGOT_DOUBLE, INGOT_TRIPLE, INGOT_QUADRUPLE, INGOT_QUINTUPLE,
            ),
            MaterialTag.ItemGenerator.MULTIPLATES to setOf(
                PLATE_DOUBLE, PLATE_TRIPLE, PLATE_QUADRUPLE, PLATE_QUINTUPLE,
            ),
            MaterialTag.ItemGenerator.ORES to setOf(
                ORE_RAW, CRUSHED, CRUSHED_TINY, CRUSHED_PURIFIED, CRUSHED_PURIFIED_TINY,
                CRUSHED_CENTRIFUGED, CRUSHED_CENTRIFUGED_TINY,
            ),
            MaterialTag.ItemGenerator.PARTS to setOf(
                BOLT, CASING_SMALL, CHAIN, GEAR, GEAR_SMALL, MINECART_WHEELS, RING, ROTOR, ROUND, SCREW,
                SPRING, SPRING_SMALL,
            ),
            MaterialTag.ItemGenerator.PLANTS to setOf(
                PLANT_BERRY, PLANT_BLOSSOM, PLANT_FIBER, PLANT_TWIG, PLANT_WART,
            ),
            MaterialTag.ItemGenerator.PLATES to setOf(PLATE, PLATE_CURVED, PLATE_TINY, PLATE_GEM, PLATE_GEM_TINY),
            MaterialTag.ItemGenerator.PROJECTILES to setOf(
                BULLET_SMALL, BULLET_MEDIUM, BULLET_LARGE,
            ),
            MaterialTag.ItemGenerator.EMPTY to setOf(
                ARROW_WOOD, ARROW_PLASTIC, BULLET_SMALL, BULLET_MEDIUM, BULLET_LARGE,
            ),
            MaterialTag.ItemGenerator.RAILS to setOf(RAIL),
            MaterialTag.ItemGenerator.STICKS to setOf(STICK, STICK_LONG),
            MaterialTag.ItemGenerator.WIRES to setOf(WIRE_FINE),
            MaterialTag.ItemGenerator.DENSEPLATES to setOf(PLATE_DENSE),
        )

        private val basicToolHeads = setOf(
            TOOL_HEAD_SWORD, TOOL_HEAD_PICKAXE, TOOL_HEAD_SHOVEL, TOOL_HEAD_SPADE,
            TOOL_HEAD_AXE, TOOL_HEAD_HOE, TOOL_HEAD_SENSE, TOOL_HEAD_PLOW,
        )
        private val earlyToolHeads = setOf(
            TOOL_HEAD_SCREWDRIVER, TOOL_HEAD_BUILDER_WAND,
            TOOL_HEAD_CONSTRUCTION_PICKAXE, TOOL_HEAD_AXE_DOUBLE,
        )
        private val rigidToolHeads = setOf(
            TOOL_HEAD_SAW, TOOL_HEAD_FILE, TOOL_HEAD_CHISEL, TOOL_HEAD_BUZZSAW,
            TOOL_HEAD_WRENCH, TOOL_HEAD_DRILL, TOOL_HEAD_UNIVERSAL_SPADE,
        )
        private val rawToolHeads = mapOf(
            TOOL_HEAD_ARROW to TOOL_HEAD_RAW_ARROW,
            TOOL_HEAD_AXE to TOOL_HEAD_RAW_AXE,
            TOOL_HEAD_AXE_DOUBLE to TOOL_HEAD_RAW_AXE_DOUBLE,
            TOOL_HEAD_CHISEL to TOOL_HEAD_RAW_CHISEL,
            TOOL_HEAD_HOE to TOOL_HEAD_RAW_HOE,
            TOOL_HEAD_PICKAXE to TOOL_HEAD_RAW_PICKAXE,
            TOOL_HEAD_PLOW to TOOL_HEAD_RAW_PLOW,
            TOOL_HEAD_SAW to TOOL_HEAD_RAW_SAW,
            TOOL_HEAD_SENSE to TOOL_HEAD_RAW_SENSE,
            TOOL_HEAD_SHOVEL to TOOL_HEAD_RAW_SHOVEL,
            TOOL_HEAD_SPADE to TOOL_HEAD_RAW_SPADE,
            TOOL_HEAD_SWORD to TOOL_HEAD_RAW_SWORD,
            TOOL_HEAD_UNIVERSAL_SPADE to TOOL_HEAD_RAW_UNIVERSAL_SPADE,
        )

        fun forMaterial(material: Material): Set<ItemGeneratorModel> = buildSet {
            addAll(forMaterialTags(material.tags))
            if (!material.hasTag(MaterialTag.Properties.HAS_TOOL_STATS)) return@buildSet

            // GT6 OP uses type >= 1/2 for heads; NO_ADVANCED_TOOLS caps the type at 2, not 1.
            val type = if (material.hasTag(MaterialTag.Properties.NO_ADVANCED_TOOLS)) {
                material.tool.toolTypes.coerceAtMost(2)
            } else material.tool.toolTypes
            if (type < 1) return@buildSet

            val bouncy = material.hasTag(MaterialTag.Properties.BOUNCY)
            val stretchy = material.hasTag(MaterialTag.Properties.STRETCHY)
            addAll(basicToolHeads)
            if (bouncy || stretchy || material.hasTag(MaterialTag.Properties.WOOD) || material.tool.toolQuality >= 1) {
                add(TOOL_HEAD_HAMMER)
            }
            if (material.hasTag(MaterialTag.ItemGenerator.PROJECTILES)) add(TOOL_HEAD_ARROW)
            if (GEM_FLAWED in this && material.hasTag(MaterialTag.Properties.TRANSPARENT) &&
                material.hasTag(MaterialTag.Properties.CRYSTAL) && !material.hasTag(MaterialTag.Properties.PEARL)) {
                add(TOOL_HEAD_PICKAXE_GEM)
            }
            if (type >= 2) {
                addAll(earlyToolHeads)
                if (!bouncy && !stretchy) {
                    addAll(rigidToolHeads)
                    if (CHAIN in this) add(TOOL_HEAD_CHAINSAW)
                }
            }
            for ((finished, raw) in rawToolHeads) {
                if (finished in this) add(raw)
            }
        }

        fun forMaterialTags(tags: Set<MaterialTag>): Set<ItemGeneratorModel> =
            (tags.asSequence()
                .mapNotNull(modelsByGenerator::get)
                .flatten()
                .toSet() + if (tags.any {
                    it == MaterialTag.ItemGenerator.DUSTS ||
                        it == MaterialTag.ItemGenerator.GEMS ||
                        it == MaterialTag.ItemGenerator.INGOTS
                }) setOf(SCRAP) else emptySet())
                .distinctBy { it.itemSuffix }
                .toSet()
    }
}

object ItemGeneratorModelMap {
    private val itemModels = ConcurrentHashMap<ResourceLocation, ResourceLocation>()
    private val modelsByIcon = EnumMap<IconSet, EnumMap<ItemGeneratorModel, ResourceLocation>>(IconSet::class.java)
    @Volatile
    private var cachedSnapshot: Map<ResourceLocation, ResourceLocation>? = null
    @Volatile
    private var cachedSharedModels: Set<ResourceLocation>? = null

    fun register(itemId: ResourceLocation, iconSet: IconSet, generator: ItemGeneratorModel) {
        val set = if (iconSet == IconSet.NONE) IconSet.DULL else iconSet
        val models = modelsByIcon.getOrPut(set) { EnumMap(ItemGeneratorModel::class.java) }
        val model = models.getOrPut(generator) { rloc("item/materialicons/${set.sName}/${generator.iconName}") }
        itemModels[itemId] = model
        cachedSnapshot = null
        cachedSharedModels = null
    }

    fun assignments(): Map<ResourceLocation, ResourceLocation> {
        cachedSnapshot?.let { return it }
        return synchronized(this) {
            cachedSnapshot ?: itemModels.toMap().also { cachedSnapshot = it }
        }
    }

    fun modelFor(itemId: ResourceLocation): ResourceLocation? = itemModels[itemId]

    fun sharedModels(): Set<ResourceLocation> {
        cachedSharedModels?.let { return it }
        return synchronized(this) {
            cachedSharedModels ?: assignments().values.toSet().also { cachedSharedModels = it }
        }
    }

    fun containsSharedModel(modelId: ResourceLocation): Boolean = modelId in sharedModels()
}
