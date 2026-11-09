package dev.lasm.uranustech.api.chemical.material

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.data.CS
import dev.lasm.uranustech.utils.rloc
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import net.minecraft.resources.ResourceKey

// ─────────────────────────────────────────────────────────────────────────────
// DSL marker – prevents implicit receiver leakage across nested builders
// ─────────────────────────────────────────────────────────────────────────────

@DslMarker
annotation class MaterialDsl

// ─────────────────────────────────────────────────────────────────────────────
// Primitive value types
// ─────────────────────────────────────────────────────────────────────────────

/** RGBA colour, each channel 0–255. */
@Serializable
data class Rgba(val r: Int, val g: Int, val b: Int, val a: Int = 255) {
    companion object {
        val WHITE = Rgba(255, 255, 255)
        val BLACK = Rgba(0, 0, 0)
    }
}

/** A material paired with an amount (GT6 unit system, one unit is CS.U = 648648000). */
@Serializable
data class MaterialAmount(val ref: ResourceKey<Material>, val amount: Long) {
    companion object {
        /** Parse the legacy `"MaterialId - 648648000"` string format. */
        fun parse(raw: String): MaterialAmount {
            val idx = raw.lastIndexOf(" - ")
            require(idx != -1) { "Cannot parse MaterialAmount from: $raw" }
            return MaterialAmount(
                ref(raw.substring(0, idx).trim()),
                raw.substring(idx + 3).trim().toLong()
            )
        }
    }

    val weight: Double
        get() {
            // Extended Math:
            // 9 Material-Units = 1 Cubic Meter.
            // 1000 g    = 1 kg
            // 1000 cm^3 = 1 dm^3
            // 1000 dm^3 = 1  m^3
            // ( g/cm^3 * aAmount * 1000 * 1000) / (Material-Unit * 9 * 1000)
            // ( g/ m^3 * aAmount              ) / (Material-Unit * 9 * 1000)
            // (kg/ m^3 * aAmount              ) / (Material-Unit * 9       )
            // (kg/ m^3 * aAmount * 0.111111111) /  Material-Unit
            return (UranusTech.MATERIAL_REGISTRY.get(ref)!!.physics.density * 111.111111 * amount) / CS.U.toDouble();
        }
}

/** Infix sugar: `"iron" amount 648_648_000L` → `MaterialAmount`. */
infix fun String.amount(units: Long) = MaterialAmount(ref(this), units)

/** Create a [ResourceKey] for the given material registry ID. */
fun ref(id: String): ResourceKey<Material> = ResourceKey.create(UranusTech.MATERIAL_REGISTRY_KEY, rloc(id))

// ─────────────────────────────────────────────────────────────────────────────
// Icon set
// ─────────────────────────────────────────────────────────────────────────────

// ─────────────────────────────────────────────────────────────────────────────
// Tag taxonomy  (mirrors every tag seen in OreDictMaterials_clean.json)
// ─────────────────────────────────────────────────────────────────────────────

@Serializable
sealed class MaterialTag(val key: String) {
    @Serializable
    sealed class Atomic(suffix: String) : MaterialTag("ATOMIC.$suffix") {
        object ACTINIDE             : Atomic("ACTINIDE")
        object ALKALINE_EARTH_METAL : Atomic("ALKALINE_EARTH_METAL")
        object ALKALI_METAL         : Atomic("ALKALI_METAL")
        object ANTIMATTER           : Atomic("ANTIMATTER")
        object CHALCOGEN            : Atomic("CHALCOGEN")
        object CHROMIUM_GROUP       : Atomic("CHROMIUM_GROUP")
        object COBALT_GROUP         : Atomic("COBALT_GROUP")
        object COPPER_GROUP         : Atomic("COPPER_GROUP")
        object CRYSTALLOGEN         : Atomic("CRYSTALLOGEN")
        object DIATOMIC_NONMETAL    : Atomic("DIATOMIC_NONMETAL")
        object ELEMENT              : Atomic("ELEMENT")
        object HALOGEN              : Atomic("HALOGEN")
        object ICOSAGEN             : Atomic("ICOSAGEN")
        object IRON_GROUP           : Atomic("IRON_GROUP")
        object LANTHANIDE           : Atomic("LANTHANIDE")
        object MANGANESE_GROUP      : Atomic("MANGANESE_GROUP")
        object METAL                : Atomic("METAL")
        object METALLOID            : Atomic("METALLOID")
        object NICKEL_GROUP         : Atomic("NICKEL_GROUP")
        object NOBLE_GAS            : Atomic("NOBLE_GAS")
        object NOBLE_METAL          : Atomic("NOBLE_METAL")
        object NONMETAL             : Atomic("NONMETAL")
        object PARTICLE             : Atomic("PARTICLE")
        object PLATINUM_GROUP       : Atomic("PLATINUM_GROUP")
        object PNICTOGEN            : Atomic("PNICTOGEN")
        object POLYATOMIC_NONMETAL  : Atomic("POLYATOMIC_NONMETAL")
        object POST_TRANSITION_METAL: Atomic("POST_TRANSITION_METAL")
        object PRECIOUS_METAL       : Atomic("PRECIOUS_METAL")
        object REFRACTORY_METAL     : Atomic("REFRACTORY_METAL")
        object SCANDIUM_GROUP       : Atomic("SCANDIUM_GROUP")
        object TITANIUM_GROUP       : Atomic("TITANIUM_GROUP")
        object TRANSITION_METAL     : Atomic("TRANSITION_METAL")
        object VANADIUM_GROUP       : Atomic("VANADIUM_GROUP")
        object ZINC_GROUP           : Atomic("ZINC_GROUP")
    }
    @Serializable
    sealed class Compounds(suffix: String) : MaterialTag("COMPOUNDS.$suffix") {
        object ALLOY        : Compounds("ALLOY")
        object APPROXIMATE  : Compounds("APPROXIMATE")
        object COATED       : Compounds("COATED")
        object DECOMPOSABLE : Compounds("DECOMPOSABLE")
        object LAYERED      : Compounds("LAYERED")
    }
    @Serializable
    sealed class ItemGenerator(suffix: String) : MaterialTag("ITEMGENERATOR.$suffix") {
        object ARMORS           : ItemGenerator("ARMORS")
        object CONTAINERS       : ItemGenerator("CONTAINERS")
        object CONTAINERS_FLUID : ItemGenerator("CONTAINERS_FLUID")
        object CONTAINERS_GAS   : ItemGenerator("CONTAINERS_GAS")
        object DENSEPLATES      : ItemGenerator("DENSEPLATES")
        object DUSTS            : ItemGenerator("DUSTS")
        object EMPTY            : ItemGenerator("EMPTY")
        object FOILS            : ItemGenerator("FOILS")
        object GASES            : ItemGenerator("GASES")
        object GEMS             : ItemGenerator("GEMS")
        object INGOTS           : ItemGenerator("INGOTS")
        object INGOTS_HOT       : ItemGenerator("INGOTS_HOT")
        object LENSES           : ItemGenerator("LENSES")
        object LIQUID           : ItemGenerator("LIQUID")
        object MOLTEN           : ItemGenerator("MOLTEN")
        object MULTIINGOTS      : ItemGenerator("MULTIINGOTS")
        object MULTIPLATES      : ItemGenerator("MULTIPLATES")
        object ORES             : ItemGenerator("ORES")
        object PARTS            : ItemGenerator("PARTS")
        object PLANTS           : ItemGenerator("PLANTS")
        object PLATES           : ItemGenerator("PLATES")
        object PROJECTILES      : ItemGenerator("PROJECTILES")
        object RAILS            : ItemGenerator("RAILS")
        object STICKS           : ItemGenerator("STICKS")
        object WIRES            : ItemGenerator("WIRES")

        companion object {
            /** Shorthand for the standard simple-metal item generation tag set. */
            fun simple(): List<MaterialTag> = listOf(
                PLANTS, PROJECTILES, INGOTS_HOT, MULTIINGOTS, MULTIPLATES,
                DENSEPLATES, ORES, DUSTS, FOILS, STICKS, INGOTS, PLATES,
            )
            /** Shorthand for the standard simple-gem item generation tag set. */
            fun simpleGem(): List<MaterialTag> = listOf(
                PLANTS, PROJECTILES, GEMS, ORES, DUSTS, PARTS, LENSES, STICKS, ARMORS, PLATES,
            )
        }
    }
    @Serializable
    sealed class Processing(suffix: String) : MaterialTag("PROCESSING.$suffix") {
        object BLACKLISTED_SMELTER      : Processing("BLACKLISTED_SMELTER")
        object CENTRIFUGABLE            : Processing("CENTRIFUGABLE")
        object COOL2CRYSTAL             : Processing("COOL2CRYSTAL")
        object CRUCIBLE_ALLOY           : Processing("CRUCIBLE_ALLOY")
        object CRYSTALLISABLE           : Processing("CRYSTALLISABLE")
        object ELECTROLYSABLE           : Processing("ELECTROLYSABLE")
        object EXTRUDABLE               : Processing("EXTRUDABLE")
        object EXTRUDABLE_SIMPLE        : Processing("EXTRUDABLE_SIMPLE")
        object FURNACE                  : Processing("FURNACE")
        object FUSION_SYNTHESISABLE     : Processing("FUSION_SYNTHESISABLE")
        object MELTING                  : Processing("MELTING")
        object MORTAR_GRINDABLE         : Processing("MORTAR_GRINDABLE")
        object NEVER_FURNACE            : Processing("NEVER_FURNACE")
        object PULVERIZING_CINNABAR     : Processing("PULVERIZING_CINNABAR")
        object SMITHABLE                : Processing("SMITHABLE")
        object SOLDERING_MATERIAL       : Processing("SOLDERING_MATERIAL")
        object SOLDERING_MATERIAL_BAD   : Processing("SOLDERING_MATERIAL_BAD")
        object SOLDERING_MATERIAL_GOOD  : Processing("SOLDERING_MATERIAL_GOOD")
        object UNRECYCLABLE             : Processing("UNRECYCLABLE")
        object UUM_SYNTHESISABLE        : Processing("UUM_SYNTHESISABLE")
        object WASHING_FIRESTONE        : Processing("WASHING_FIRESTONE")
        object WASHING_MERCURY          : Processing("WASHING_MERCURY")
        object WASHING_PERSULFATE       : Processing("WASHING_PERSULFATE")
    }
    @Serializable
    sealed class Properties(suffix: String) : MaterialTag("PROPERTIES.$suffix") {
        object ACID                             : Properties("ACID")
        object AUTO_BLACKLIST                   : Properties("AUTO_BLACKLIST")
        object AUTO_COLLECTING                  : Properties("AUTO_COLLECTING")
        object AUTO_MATERIAL                    : Properties("AUTO_MATERIAL")
        object BETWEENLANDS                     : Properties("BETWEENLANDS")
        object BOUNCY                           : Properties("BOUNCY")
        object BRITTLE                          : Properties("BRITTLE")
        object BURNING                          : Properties("BURNING")
        object COAL                             : Properties("COAL")
        object COMMON_ORE                       : Properties("COMMON_ORE")
        object CRYSTAL                          : Properties("CRYSTAL")
        object DONT_SHOW_THIS_COMPONENT         : Properties("DONT_SHOW_THIS_COMPONENT")
        object ENDER_DRAGON_PROOF               : Properties("ENDER_DRAGON_PROOF")
        object EXPLODES_IN_NONVANILLA_CRAFTING_GRID : Properties("EXPLODES_IN_NONVANILLA_CRAFTING_GRID")
        object EXPLOSIVE                        : Properties("EXPLOSIVE")
        object FLAMMABLE                        : Properties("FLAMMABLE")
        object FOOD                             : Properties("FOOD")
        object GLOWING                          : Properties("GLOWING")
        object HAS_TOOL_STATS                   : Properties("HAS_TOOL_STATS")
        object IGNORE_IN_COLOR_LOG              : Properties("IGNORE_IN_COLOR_LOG")
        object INVALID_MATERIAL                 : Properties("INVALID_MATERIAL")
        object LIGHTING                         : Properties("LIGHTING")
        object MAGICAL                          : Properties("MAGICAL")
        object MAGNETIC_ACTIVE                  : Properties("MAGNETIC_ACTIVE")
        object MAGNETIC_PASSIVE                 : Properties("MAGNETIC_PASSIVE")
        object MAZEBREAKER                      : Properties("MAZEBREAKER")
        object MEAT                             : Properties("MEAT")
        object NO_ADVANCED_TOOLS                : Properties("NO_ADVANCED_TOOLS")
        object PEARL                            : Properties("PEARL")
        object QUARTZ                           : Properties("QUARTZ")
        object RANDOM_SMALL_GEM_ORE             : Properties("RANDOM_SMALL_GEM_ORE")
        object ROTTEN                           : Properties("ROTTEN")
        object SOFT                             : Properties("SOFT")
        object STONE                            : Properties("STONE")
        object STRETCHY                         : Properties("STRETCHY")
        object TRANSPARENT                      : Properties("TRANSPARENT")
        object UNBURNABLE                       : Properties("UNBURNABLE")
        object UNUSED_MATERIAL                  : Properties("UNUSED_MATERIAL")
        object VALUABLE                         : Properties("VALUABLE")
        object WARPING                          : Properties("WARPING")
        object WITHER_PROOF                     : Properties("WITHER_PROOF")
        object WOOD                             : Properties("WOOD")
    }
}

// ─────────────────────────────────────────────────────────────────────────────
// Immutable data model
// ─────────────────────────────────────────────────────────────────────────────
@Serializable
data class Material(
    val id: String,
    val name: String,
    val appearance: MaterialAppearance,
    val physics: MaterialPhysics,
    val fluids: MaterialFluids,
    val tool: MaterialToolStats,
    val processing: MaterialProcessing,
    val composition: MaterialComposition,
    val meta: MaterialMeta,
    val tags: Set<MaterialTag>,
) {
    fun hasTag(tag: MaterialTag) = tags.contains(tag)
}

/** Visual colours and icon set. */
@Serializable
data class MaterialAppearance(
    val colorSolid:  Rgba = Rgba.WHITE,
    val colorLiquid: Rgba = Rgba.WHITE,
    val colorGas:    Rgba = Rgba.WHITE,
    val colorPlasma: Rgba = Rgba.WHITE,
    val iconSet: IconSet = IconSet.DULL,
)

/** Atomic, physical and thermal properties. */
@Serializable
data class MaterialPhysics(
    val protons:      Int    = 0,
    val electrons:    Int    = 0,
    val neutrons:     Int    = 0,
    val mass:         Long   = 0L,
    val density:      Double = 1.0,
    val meltingPoint: Long   = 1000L,
    val boilingPoint: Long   = 3000L,
    val plasmaPoint:  Long   = 10_000L,
    val heatDamage:   Float  = 0f,
    val hasMetallum:  Boolean = false,
)

/** Fluid state units and solidifying / smelting targets. */
@Serializable
data class MaterialFluids(
    val liquidUnit: Long = 0L,
    val gasUnit:    Long = 0L,
    val plasmaUnit: Long = 0L,
    val solidifyingTarget: MaterialAmount? = null,
    val smeltingTarget:    MaterialAmount? = null,
)

/** Tool harvest level, stats and enchantments. */
@Serializable
data class MaterialToolStats(
    val toolTypes:    Int   = 0,
    val toolQuality:  Int   = 0,
    val toolDurability: Long = 0L,
    val toolSpeed:    Float = 1f,
    // enchantment lists are represented as string keys until Enchantment registry is available
    val enchantmentTools:   List<String> = emptyList(),
    val enchantmentWeapons: List<String> = emptyList(),
    val enchantmentAmmo:    List<String> = emptyList(),
    val enchantmentRanged:  List<String> = emptyList(),
    val enchantmentFishing: List<String> = emptyList(),
    val enchantmentArmors:  List<String> = emptyList(),
)

/** Ore processing behaviour and inter-material targets. */
@Serializable
data class MaterialProcessing(
    val oreMultiplier:            Int = 1,
    val oreProcessingMultiplier:  Int = 1,
    val byProducts:               List<ResourceKey<Material>> = emptyList(),
    val crushingTarget:           MaterialAmount?            = null,
    val pulverTarget:             MaterialAmount?            = null,
    val smashingTarget:           MaterialAmount?            = null,
    val cuttingTarget:            MaterialAmount?            = null,
    val workingTarget:            MaterialAmount?            = null,
    val forgingTarget:            MaterialAmount?            = null,
    val burningTarget:            MaterialAmount?            = null,
    val bendingTarget:            MaterialAmount?            = null,
    val compressingTarget:        MaterialAmount?            = null,
    val generifyingTarget:        MaterialAmount?            = null,
    val reversingTarget:          ResourceKey<Material>?     = null,
    val registrationTarget:       ResourceKey<Material>?     = null,
    val alloyCreationRecipes:     List<String>        = emptyList(),
)

/** Chemical formula and constituent components. */
@Serializable
data class MaterialComposition(
    val chemicalFormula: String?              = null,
    val components:      List<MaterialAmount> = emptyList(),
)

/** Registry metadata, cross-references and legacy extras. */
@Serializable
data class MaterialMeta(
    val numericId:                Int          = -1,
    val hashId:                   Int          = -1,
    val originalMod:              String?      = null,
    val dictionaryBook:           String?      = null,
    val furnaceBurnTime:          Long         = 0L,
    val hidden:                   Boolean      = false,
    val priorityPrefixIndex:      Int          = 0,
    val handleMaterial:           ResourceKey<Material>?     = null,
    val aspects:                  List<String>               = emptyList(),
    val reRegistrations:          Set<ResourceKey<Material>> = emptySet(),
    val toThis:                   Set<ResourceKey<Material>> = emptySet(),
    val sourceOf:                 Set<ResourceKey<Material>> = emptySet(),
    val alloyComponentReferences: Set<ResourceKey<Material>> = emptySet(),
)

// ─────────────────────────────────────────────────────────────────────────────
// Builders
// ─────────────────────────────────────────────────────────────────────────────

@MaterialDsl
class AppearanceBuilder {
    var colorSolid:  Rgba    = Rgba.WHITE
    var colorLiquid: Rgba    = Rgba.WHITE
    var colorGas:    Rgba    = Rgba.WHITE
    var colorPlasma: Rgba    = Rgba.WHITE
    var iconSet:     IconSet = IconSet.DULL

    /** Shorthand: set all four channel colors at once. */
    var color: Rgba
        get() = colorSolid
        set(value) { colorSolid = value; colorLiquid = value; colorGas = value; colorPlasma = value }

    /** Shorthand: `colorSolid = rgba(220, 220, 220)` */
    fun rgba(r: Int, g: Int, b: Int, a: Int = 255) = Rgba(r, g, b, a)

    internal fun build() = MaterialAppearance(colorSolid, colorLiquid, colorGas, colorPlasma, iconSet)
}

@MaterialDsl
class PhysicsBuilder {
    var protons:      Int    = 0
    var electrons:    Int    = 0
    var neutrons:     Int    = 0
    var mass:         Long   = 0L
    var density:      Double = 1.0
    var meltingPoint: Long   = 1000L
    var boilingPoint: Long   = 3000L
    var plasmaPoint:  Long   = 10_000L
    var heatDamage:   Float  = 0f
    var hasMetallum:  Boolean = false

    internal fun build() = MaterialPhysics(
        protons, electrons, neutrons, mass, density,
        meltingPoint, boilingPoint, plasmaPoint, heatDamage, hasMetallum,
    )
}

@MaterialDsl
class FluidsBuilder {
    var liquidUnit: Long = 0L
    var gasUnit:    Long = 0L
    var plasmaUnit: Long = 0L
    var solidifyingTarget: MaterialAmount? = null
    var smeltingTarget:    MaterialAmount? = null

    internal fun build() = MaterialFluids(liquidUnit, gasUnit, plasmaUnit, solidifyingTarget, smeltingTarget)
}

@MaterialDsl
class ToolBuilder {
    var types:      Int   = 0
    var quality:    Int   = 0
    var durability: Long  = 0L
    var speed:      Float = 1f

    internal fun build() = MaterialToolStats(
        toolTypes = types,
        toolQuality = quality,
        toolDurability = durability,
        toolSpeed = speed,
    )
}

@MaterialDsl
class ProcessingBuilder {
    var oreMultiplier:           Int = 1
    var oreProcessingMultiplier: Int = 1
    private val _byProducts      = mutableListOf<ResourceKey<Material>>()
    var crushingTarget:          MaterialAmount?         = null
    var pulverTarget:            MaterialAmount?         = null
    var smashingTarget:          MaterialAmount?         = null
    var cuttingTarget:           MaterialAmount?         = null
    var workingTarget:           MaterialAmount?         = null
    var forgingTarget:           MaterialAmount?         = null
    var burningTarget:           MaterialAmount?         = null
    var bendingTarget:           MaterialAmount?         = null
    var compressingTarget:       MaterialAmount?         = null
    var generifyingTarget:       MaterialAmount?         = null
    var reversingTarget:         ResourceKey<Material>?  = null
    var registrationTarget:      ResourceKey<Material>?  = null
    private val _alloyRecipes    = mutableListOf<String>()

    fun byProduct(vararg ids: String)      { ids.forEach { _byProducts += ref(it) } }
    fun alloyRecipe(recipe: String)        { _alloyRecipes += recipe }

    internal fun build() = MaterialProcessing(
        oreMultiplier, oreProcessingMultiplier,
        _byProducts.toList(),
        crushingTarget, pulverTarget, smashingTarget,
        cuttingTarget, workingTarget, forgingTarget,
        burningTarget, bendingTarget, compressingTarget,
        generifyingTarget, reversingTarget, registrationTarget,
        _alloyRecipes.toList(),
    )
}

@MaterialDsl
class CompositionBuilder {
    var formula: String? = null
    private val _components = mutableListOf<MaterialAmount>()

    fun component(materialId: String, units: Long) {
        _components += materialId amount units
    }

    internal fun build() = MaterialComposition(formula, _components.toList())
}

@MaterialDsl
class MetaBuilder {
    var numericId:           Int          = -1
    var hashId:              Int          = -1
    var originalMod:         String?      = null
    var dictionaryBook:      String?      = null
    var furnaceBurnTime:     Long         = 0L
    var hidden:              Boolean      = false
    var priorityPrefixIndex: Int          = 0
    var handleMaterial:      ResourceKey<Material>?         = null
    private val _aspects              = mutableListOf<String>()
    private val _reRegistrations      = mutableSetOf<ResourceKey<Material>>()
    private val _toThis               = mutableSetOf<ResourceKey<Material>>()
    private val _sourceOf             = mutableSetOf<ResourceKey<Material>>()
    private val _alloyComponentRefs   = mutableSetOf<ResourceKey<Material>>()

    fun aspect(raw: String)                    { _aspects += raw }
    fun reRegisteredTo(id: String)              { _reRegistrations += ref(id) }
    fun toThis(id: String)                      { _toThis += ref(id) }
    fun sourceOf(vararg ids: String)            { ids.forEach { _sourceOf += ref(it) } }
    fun alloyRef(id: String)                    { _alloyComponentRefs += ref(id) }

    internal fun build() = MaterialMeta(
        numericId, hashId, originalMod, dictionaryBook,
        furnaceBurnTime, hidden, priorityPrefixIndex, handleMaterial,
        _aspects.toList(),
        _reRegistrations.toSet(), _toThis.toSet(),
        _sourceOf.toSet(), _alloyComponentRefs.toSet(),
    )
}

// ─────────────────────────────────────────────────────────────────────────────
// Top-level DSL builder
// ─────────────────────────────────────────────────────────────────────────────

@MaterialDsl
class MaterialBuilder(val id: String) {
    var name: String = id

    private var appearance  = AppearanceBuilder()
    private var physics     = PhysicsBuilder()
    private var fluids      = FluidsBuilder()
    private var tool        = ToolBuilder()
    private var processing  = ProcessingBuilder()
    private var composition = CompositionBuilder()
    private var meta        = MetaBuilder()
    private val _tags       = mutableSetOf<MaterialTag>()

    fun appearance(block: AppearanceBuilder.() -> Unit)   { appearance.apply(block) }
    fun physics(block: PhysicsBuilder.() -> Unit)         { physics.apply(block) }
    fun fluids(block: FluidsBuilder.() -> Unit)           { fluids.apply(block) }
    fun tool(block: ToolBuilder.() -> Unit)               { tool.apply(block) }
    fun processing(block: ProcessingBuilder.() -> Unit)   { processing.apply(block) }
    fun composition(block: CompositionBuilder.() -> Unit) { composition.apply(block) }
    fun meta(block: MetaBuilder.() -> Unit)               { meta.apply(block) }

    fun tags(vararg t: MaterialTag)  { _tags += t }
    fun tags(list: List<MaterialTag>) { _tags += list }
    fun tag(t: MaterialTag)          { _tags += t }

    fun build() = Material(
        id          = id,
        name        = name,
        appearance  = appearance.build(),
        physics     = physics.build(),
        fluids      = fluids.build(),
        tool        = tool.build(),
        processing  = processing.build(),
        composition = composition.build(),
        meta        = meta.build(),
        tags        = _tags.toSet(),
    )
}

/** Entry point for the material DSL. */
fun material(id: String, block: MaterialBuilder.() -> Unit): Material {
    val mat = MaterialBuilder(id).apply(block).build()
    val holder = UranusTech.MATERIALS.register(mat.id) { -> mat }
    UranusTech.BUILTIN_MATERIALS += mat
    return mat
}

class ResourceKeySerializer<T> : KSerializer<ResourceKey<T>> {
    override val descriptor: SerialDescriptor
        get() = buildClassSerialDescriptor("net.minecraft.resources.ResourceKey")

    override fun serialize(
        encoder: Encoder,
        value: ResourceKey<T>
    ) {
        TODO("Not yet implemented")
    }

    override fun deserialize(decoder: Decoder): ResourceKey<T> {
        TODO("Not yet implemented")
    }

}
