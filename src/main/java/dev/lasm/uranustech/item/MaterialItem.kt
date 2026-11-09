package dev.lasm.uranustech.item

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.MaterialAmount
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.data.CS
import dev.lasm.uranustech.data.ItemGeneratorModel
import net.minecraft.ChatFormatting
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag

class MaterialItem(
    definition: Material,
    val generator: ItemGeneratorModel,
    properties: Properties
) : Item(properties) {
    val material: ResourceKey<Material> = ref(definition.id)

    override fun appendHoverText(
        stack: ItemStack,
        context: TooltipContext,
        tooltips: MutableList<Component>,
        tooltipFlag: TooltipFlag
    ) {
        val material = UranusTech.MATERIAL_REGISTRY.get(material)!!
        if (material.tool.toolTypes > 0) {
            val toolStats = material.tool
            tooltips.add(Component.literal("Q: ${toolStats.toolQuality} - S: ${toolStats.toolSpeed} - D: ${toolStats.toolDurability}").withStyle(ChatFormatting.BLUE))
        }
        if (tooltipFlag.isAdvanced && material.composition.chemicalFormula?.isNotBlank() == true) {
            tooltips.add(Component.literal(material.composition.chemicalFormula).withStyle(ChatFormatting.YELLOW))
        }
        tooltips.add(Component.literal("Contained Materials:").withStyle(ChatFormatting.DARK_AQUA))
        tooltips.add(materialToolTip(MaterialAmount(ref(material.id), generator.materialAmount)))
        material.meta.originalMod?.also { tooltips.add(Component.literal("Material from $it").withStyle(ChatFormatting.BLUE)) }
    }

    fun materialToolTip(amount: MaterialAmount) : Component {
        val material = UranusTech.MATERIAL_REGISTRY.get(amount.ref)!!

        val aWeight: Double = amount.weight
        val tWeight = ((aWeight * 1000).toLong()) % 1000

        return Component.literal("%.3f".format(generator.materialAmount.toFloat() / CS.U)).apply {
            append(Component.literal(" ${material.name} ").withStyle(ChatFormatting.YELLOW))
            append("(")
            append(Component.literal("M: ").withStyle(ChatFormatting.AQUA))
            append(material.physics.meltingPoint.toString())
            append(Component.literal("K ").withStyle(ChatFormatting.RED))
            append(Component.literal("B: ").withStyle(ChatFormatting.AQUA))
            append(material.physics.boilingPoint.toString())
            append(Component.literal("K ").withStyle(ChatFormatting.RED))
            append(Component.literal("W: ").withStyle(ChatFormatting.AQUA))
            append("${aWeight.toLong()}.${if (tWeight < 1) "000" else if (tWeight < 10) "00$tWeight" else if (tWeight < 100) "0$tWeight" else tWeight}")
            append(Component.literal("kg").withStyle(ChatFormatting.YELLOW))
            append(")")
        }
    }
}
