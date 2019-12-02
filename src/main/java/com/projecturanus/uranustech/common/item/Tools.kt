package com.projecturanus.uranustech.common.item

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants.TOOL_INFO
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.material.info.ToolInfo
import com.projecturanus.uranustech.api.render.Colorable
import com.projecturanus.uranustech.api.tool.Tool
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.material.MaterialContainer
import com.projecturanus.uranustech.common.materialRegistry
import com.projecturanus.uranustech.common.util.localizedName
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.item.ToolItem
import net.minecraft.text.LiteralText
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.util.Identifier
import net.minecraft.world.World

open class UTToolItem(override val stack: MaterialStack, val handleStack: MaterialStack? = null, settings: Settings) : ToolItem(stack.material.getInfo<ToolInfo?>(TOOL_INFO), settings), MaterialContainer, Colorable by stack.material {
    val toolInfo: ToolInfo = stack.material.getInfo(TOOL_INFO)
    val tool = stack.form as? Tool

    override fun getName(itemStack: ItemStack?): TranslatableText {
        return TranslatableText("item.$MODID.form", stack.material.localizedName, stack.form.localizedName)
    }

    override fun getItemColor(itemStack: ItemStack?, tintIndex: Int): Int =
        when (tintIndex) {
            0 -> when {
                tool?.hasHandleMaterial() == false -> stack.material.color
                tool?.handleForm?.equals(Forms.STICK) == true -> stack.material.getInfo<ToolInfo>(TOOL_INFO)?.handleMaterial?.color
                        ?: -1
                else -> stack.material.color
            }
            2 -> {
                when {
                    tool?.hasHandleMaterial() == false -> -1
                    tool?.handleForm?.equals(Forms.STICK) == true -> stack.material.color
                    else -> handleStack?.material?.color ?: -1
                }
            }
            else -> -1
        }

    override fun isDamageable() = true

    override fun appendTooltip(itemStack: ItemStack, world: World?, list: MutableList<Text>, tooltipContext: TooltipContext) {
        if (stack.material.chemicalCompound != null)
            list.add(LiteralText(stack.material.chemicalCompound).setStyle(Style().setColor(Formatting.GOLD)))
        if (tooltipContext.isAdvanced) {
            list.add(TranslatableText("item.$MODID.material.lore.2", stack.material.localizedName))
            list.add(TranslatableText("item.$MODID.material.lore.durability", itemStack.maxDamage - itemStack.damage, itemStack.maxDamage))
            list.add(stack.displayName)
            if (stack.material is JsonMaterial && (stack.material as JsonMaterial).components != null) {
                val jsonMaterial = stack.material as JsonMaterial
                jsonMaterial.components!!.dividedStacks.map {
                    MaterialStack(materialRegistry[Identifier(MODID, it.material)], stack.form, it.amount).displayName
                }.forEach { list.add(it) }
            }
        } else {
            list.add(TranslatableText("item.uranustech.lore.advanced").setStyle(Style().setColor(Formatting.DARK_GRAY)))
        }
    }

    override fun isIn(itemGroup: ItemGroup): Boolean {
        val itemGroup2 = getGroup()
        return itemGroup2 != null && (itemGroup === ItemGroup.SEARCH || itemGroup === itemGroup2) && !stack.material.isHidden
    }
}
