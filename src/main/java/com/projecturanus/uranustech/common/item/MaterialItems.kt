package com.projecturanus.uranustech.common.item

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants.FUEL_INFO
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.material.info.FuelInfo
import com.projecturanus.uranustech.api.render.Colorable
import com.projecturanus.uranustech.common.getOrCreate
import com.projecturanus.uranustech.common.groupMap
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.material.MaterialContainer
import com.projecturanus.uranustech.common.materialRegistry
import com.projecturanus.uranustech.common.util.getItem
import com.projecturanus.uranustech.common.util.localizedName
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.text.LiteralText
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.util.Identifier
import net.minecraft.world.World
import java.util.*

class FormItem(override val stack: MaterialStack): Item(Settings()
        .group(if (stack.material.isHidden) null else groupMap.getOrCreate(Identifier(MODID, stack.form.name)) { FabricItemGroupBuilder.create(Identifier(MODID, "form." + stack.form.name)).icon { materialRegistry.getRandom(Random())?.getItem(stack.form) }.build() })
), Colorable by stack.material, MaterialContainer {

    init {
        if (stack.material.getInfo<FuelInfo>(FUEL_INFO)?.burnTime ?: 0 > 0)
            FuelRegistry.INSTANCE.add(this, stack.modify(stack.material.getInfo<FuelInfo>(FUEL_INFO)?.burnTime ?: 0))
    }

    override fun getName(itemStack: ItemStack?): TranslatableText {
        return TranslatableText("item.$MODID.form", stack.material.localizedName, stack.form.localizedName)
    }

    override fun appendTooltip(itemStack: ItemStack, world: World?, list: MutableList<Text>, tooltipContext: TooltipContext) {
        if (stack.material.chemicalCompound != null)
            list.add(LiteralText(stack.material.chemicalCompound).setStyle(Style().setColor(Formatting.GOLD)))
        if (tooltipContext.isAdvanced) {
            if (stack.material.getInfo<FuelInfo>(FUEL_INFO)?.burnTime ?: 0 > 0) {
                list.add(TranslatableText("item.$MODID.material.lore.flammable"))
            }
            list.add(TranslatableText("item.$MODID.material.lore.2", stack.material.localizedName))
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

