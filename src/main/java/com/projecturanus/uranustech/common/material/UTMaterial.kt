package com.projecturanus.uranustech.common.material

import com.google.gson.annotations.SerializedName
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.material.SimpleMaterial
import com.projecturanus.uranustech.api.material.WildcardMaterial
import com.projecturanus.uranustech.api.material.compound.Compound
import com.projecturanus.uranustech.api.material.element.Element
import com.projecturanus.uranustech.api.material.form.Form
import com.projecturanus.uranustech.api.material.form.Forms.*
import com.projecturanus.uranustech.api.material.info.MaterialInfo
import com.projecturanus.uranustech.api.tool.ToolHeads.*
import com.projecturanus.uranustech.common.formRegistry
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier

interface MaterialContainer {
    val stack: MaterialStack
}

class UTMaterial : SimpleMaterial() {

}

data class JsonMaterialStack(val material: String, val amount: Long)
data class MaterialComponent(val stacks: Array<JsonMaterialStack>, val dividedStacks: Array<JsonMaterialStack>, val divider: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaterialComponent) return false

        if (!stacks.contentEquals(other.stacks)) return false
        if (!dividedStacks.contentEquals(other.dividedStacks)) return false
        if (divider != other.divider) return false

        return true
    }

    override fun hashCode(): Int {
        var result = stacks.contentHashCode()
        result = 31 * result + dividedStacks.contentHashCode()
        result = 31 * result + divider
        return result
    }
}

open class JsonMaterial(var name: String, val tags: List<String>,
                        @SerializedName("textureSet")
                   var textureSetInternal: String,
                        val burnTime: Int,
                        @SerializedName("description")
                        val descriptionInternal: Array<String>?, val byProducts: Array<String>?,
                        val handleMaterial: String, val hidden: Boolean,
                        val colorSolid: Int, val colorLiquid: Int, val colorGas: Int, val colorPlasma: Int,
                        val fullName: String, val tooltipChemical: String, val gramPerCubicCentimeter: Double, val oreMultiplier: Int,
                        val oreProgressingMultiplier: Int, val toolDurability: Long, val toolSpeed: Float, val toolTypes: Int, val toolQuality: Int,
                        val meltingPoint: Int, val boilingPoint: Int, val plasmaPoint: Int, val neutrons: Int = 0, val protons: Int = 0, val electrons: Int = 0,
                        val components: MaterialComponent?): Material {
    var validFormsCache: List<Form> = emptyList()
    var elementsCache: Set<Element> = emptySet()

    override fun getDescription() = descriptionInternal?.toList() ?: emptyList()

    override fun isHidden() = hidden

    override fun getTextureSet() = textureSetInternal

    override fun getComposition() = emptyMap<Compound, Int>()

    override fun getElements() = elementsCache

    override fun getColor() = colorSolid

    override fun addInfo(info: MaterialInfo?) {}

    lateinit var infos: Map<Identifier, MaterialInfo>

    override fun getInfos() = infos.values

    override fun <T : MaterialInfo?> getInfo(infoId: Identifier?) = infos[infoId] as T

    override fun getChemicalCompound() = tooltipChemical

    override fun getValidForms() = validFormsCache

    override fun getIdentifier() = Identifier(MODID, name)
    override fun toString(): String {
        return "JsonMaterial(name='$name', tags=$tags, textureSetInternal='$textureSetInternal', descriptionInternal=${descriptionInternal?.contentToString()}, handleMaterial='$handleMaterial', hidden=$hidden, colorSolid=$colorSolid, colorLiquid=$colorLiquid, colorGas=$colorGas, colorPlasma=$colorPlasma, fullName='$fullName', tooltipChemical='$tooltipChemical', gramPerCubicCentimeter=$gramPerCubicCentimeter, oreMultiplier=$oreMultiplier, oreProgressingMultiplier=$oreProgressingMultiplier, toolDurability=$toolDurability, toolSpeed=$toolSpeed, toolTypes=$toolTypes, toolQuality=$toolQuality, meltingPoint=$meltingPoint, boilingPoint=$boilingPoint, plasmaPoint=$plasmaPoint, neutrons=$neutrons, protons=$protons, electrons=$electrons, components=$components)"
    }
}

val INGOT_FORMS = listOf(INGOT, NUGGET, PLATE, DUST, STICK, INGOT_DOUBLE, INGOT_QUADRUPLE, INGOT_QUINTUPLE, INGOT_TRIPLE, PLATE, PLATE_TINY, PLATE_GEM_TINY, PLATE_QUADRUPLE, PLATE_QUINTUPLE, PLATE_TRIPLE, PLATE_DOUBLE, PLATE_CURVED, PLATE_DENSE)
val TOOL_FORMS = listOf(TOOL_HEAD_ARROW, TOOL_HEAD_AXE, TOOL_HEAD_AXE_DOUBLE, TOOL_HEAD_BUZZ_SAW, TOOL_HEAD_CHAINSAW, TOOL_HEAD_CHISEL, TOOL_HEAD_CONSTRUCTION_PICKAXE,
        TOOL_HEAD_DRILL, TOOL_HEAD_FILE, TOOL_HEAD_HAMMER, TOOL_HEAD_HOE, TOOL_HEAD_PICKAXE, TOOL_HEAD_PLOW, TOOL_HEAD_SAW, TOOL_HEAD_SCREWDRIVER,
        TOOL_HEAD_SENSE, TOOL_HEAD_SHOVEL, TOOL_HEAD_SPADE, TOOL_HEAD_SWORD, TOOL_HEAD_UNIVERSAL_SPADE, TOOL_HEAD_WRENCH)
val GEM_FORMS = listOf(GEM, PLATE_GEM, NUGGET, STICK, DUST, LENS, PLATE_GEM_TINY)
val PART_FORMS = listOf(ROUND, RING, BOLT, ROTOR, CART_WHEELS, SCREW)
val STONE_FORMS = listOf(STONE, SMALL_BRICKS, SMALL_TILES, SMOOTH, BRICKS, BRICKS_CHISELED, BRICKS_CRACKED, BRICKS_MOSSY, BRICKS_REDSTONE, BRICKS_REINFORCED, COBBLE, COBBLE_MOSSY, SQUARE_BRICKS, TILES, WINDMILL_TILES_A, WINDMILL_TILES_B)

class UTWildcardMaterial(identifier: Identifier, vararg submaterials: Material): SimpleMaterial(), WildcardMaterial {
    val knownSubmaterials = mutableListOf<Material>()
    val materialTag: Tag<Material>

    override fun subMaterials() = knownSubmaterials

    override fun isSubtype(material: Material?) = knownSubmaterials.contains(material)

    init {
        knownSubmaterials.addAll(submaterials.flatMap { if (it is WildcardMaterial) { it.subMaterials() + it } else listOf(it) })
        setIdentifier(identifier)
        materialTag = Tag.Builder.create<Material>().add(*knownSubmaterials.toTypedArray()).build(identifier)
    }
}

class TagProcessor(val tags: List<String>) {
    fun getForms(): Set<Form> {
        val set = hashSetOf<Form>()
        tags.forEach {
            if (it.startsWith("ITEMGENERATOR."))
                if (formRegistry.asSequence().any { form -> form.asString() == it.removePrefix("ITEMGENERATOR.").removeSuffix("S").toLowerCase() })
                    set += formRegistry[Identifier(MODID, it.removePrefix("ITEMGENERATOR.").removeSuffix("S").toLowerCase())]
                else
                    when (it.removePrefix("ITEMGENERATOR.")) {
                        "INGOTS" -> set.addAll(INGOT_FORMS)
                        "INGOTS_HOT" -> set.addAll(INGOT_FORMS + INGOT_HOT)
                        "PARTS" -> set.addAll(PART_FORMS)
                        "DIRTY_DUST" -> set += DUST_IMPURE
                        "GEMS" -> set.addAll(GEM_FORMS)
                        "ORES" -> set += ORE
                        "MOLTEN" -> set += MOLTEN
                        "GAS" -> set += GAS
                    }
            else if (it == "PROPERTIES.HAS_TOOL_STATS")
                set.addAll(TOOL_FORMS)
            else if (it == "PROPERTIES.STONE")
                set.addAll(STONE_FORMS)
        }
        return set
    }
}

