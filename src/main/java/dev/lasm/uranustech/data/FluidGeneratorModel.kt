package dev.lasm.uranustech.data

import dev.lasm.uranustech.api.chemical.material.IconSet
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.MaterialTag
import dev.lasm.uranustech.api.chemical.material.Rgba
import dev.lasm.uranustech.utils.rloc
import net.minecraft.resources.ResourceLocation
import java.util.*

enum class MaterialPhase { SOLID, LIQUID, GAS, PLASMA }

enum class FluidGeneratorModel(val formName: String, val iconName: String, val lightLevel: Int, val gaseous: Boolean = false) {
    LIQUID("liquid", "molten", 0),
    MOLTEN("molten", "molten", 10),
    GAS("gas", "gas", 0, true),
    PLASMA("plasma", "plasma", 15, true);

    private val texturesByIcon = EnumMap<IconSet, ResourceLocation>(IconSet::class.java)

    fun registrationId(materialId: String): String = when (this) {
        LIQUID -> if (materialId == "oxygen") "liquid_oxygen" else materialId
        MOLTEN -> "molten_$materialId"
        GAS -> materialId
        PLASMA -> "plasma_$materialId"
    }

    fun texture(material: Material): ResourceLocation {
        val iconSet = if (material.appearance.iconSet == IconSet.NONE) IconSet.DULL else material.appearance.iconSet
        return texturesByIcon.getOrPut(iconSet) { rloc("block/materialicons/${iconSet.sName}/$iconName") }
    }

    fun color(material: Material): Rgba = when (this) {
        LIQUID, MOLTEN -> material.appearance.colorLiquid
        GAS -> material.appearance.colorGas
        PLASMA -> material.appearance.colorPlasma
    }

    /** Choose a temperature inside the phase, using CS.DEF_ENV_TEMP when its interval permits it. */
    fun temperature(material: Material): Int {
        val physics = material.physics
        val kelvin = when (this) {
            LIQUID, MOLTEN -> when {
                physics.meltingPoint <= 0 -> 1_000L
                physics.meltingPoint < CS.DEF_ENV_TEMP -> minOf(CS.DEF_ENV_TEMP, physics.boilingPoint - 1)
                else -> physics.meltingPoint
            }
            GAS -> when {
                physics.boilingPoint <= 0 -> 3_000L
                physics.boilingPoint < CS.DEF_ENV_TEMP -> minOf(CS.DEF_ENV_TEMP, physics.plasmaPoint - 1)
                else -> physics.boilingPoint
            }
            PLASMA -> if (physics.plasmaPoint <= 0) 10_000L else maxOf(CS.DEF_ENV_TEMP, physics.plasmaPoint)
        }
        return kelvin.coerceIn(1L, Int.MAX_VALUE.toLong()).toInt()
    }

    companion object {
        // Loader_Fluids explicitly registers these two plasmas before its tag-driven loop.
        private val plasmaMaterials = setOf("helium", "nitrogen")

        /** GT6 OreDictMaterial.fluid checks phase boundaries from hottest to coldest, inclusively. */
        fun phaseAt(material: Material, temperature: Long = CS.DEF_ENV_TEMP): MaterialPhase = with(material.physics) {
            when {
                temperature >= plasmaPoint -> MaterialPhase.PLASMA
                temperature >= boilingPoint -> MaterialPhase.GAS
                temperature >= meltingPoint -> MaterialPhase.LIQUID
                else -> MaterialPhase.SOLID
            }
        }

        fun forMaterial(material: Material): Set<FluidGeneratorModel> = buildSet {
            if (material.hasTag(MaterialTag.Properties.INVALID_MATERIAL)) return@buildSet
            if (material.hasTag(MaterialTag.ItemGenerator.LIQUID)) add(LIQUID)
            if (material.hasTag(MaterialTag.ItemGenerator.GASES)) add(GAS)
            if (material.hasTag(MaterialTag.ItemGenerator.MOLTEN)) add(MOLTEN)
            // GT6 has a separate liquidoxygen registration; it is not a generic gas rule.
            if (material.id == "oxygen") add(LIQUID)
            if (material.id in plasmaMaterials) add(PLASMA)
        }
    }
}
