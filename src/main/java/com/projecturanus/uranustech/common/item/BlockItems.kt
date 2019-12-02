package com.projecturanus.uranustech.common.item

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.info.FuelInfo
import com.projecturanus.uranustech.api.render.Colorable
import com.projecturanus.uranustech.api.worldgen.Rock
import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.common.block.MaterialBlock
import com.projecturanus.uranustech.common.block.OreBlock
import com.projecturanus.uranustech.common.groupConstructionBlock
import com.projecturanus.uranustech.common.groupOre
import com.projecturanus.uranustech.common.oreItemMap
import com.projecturanus.uranustech.common.util.localizedName
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.block.BlockState
import net.minecraft.item.BlockItem
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.text.TranslatableText
import net.minecraft.util.DefaultedList

open class MaterialBlockItem(open val block: MaterialBlock, settings: Settings = Settings().group(if (block.stack.material.isHidden) null else groupConstructionBlock)): BlockItem(block, settings) {
    init {
        if (this !is OreBlockItem && block.stack.material.getInfo<FuelInfo>(Constants.FUEL_INFO)?.burnTime ?: 0 > 0)
            FuelRegistry.INSTANCE.add(this, block.stack.modify(block.stack.material.getInfo<FuelInfo>(Constants.FUEL_INFO)?.burnTime ?: 0))
    }

    override fun getName(itemStack: ItemStack?): TranslatableText {
        return TranslatableText("block.$MODID.form", block.stack.material.localizedName, block.stack.form.localizedName)
    }
}

class OreBlockItem(override val block: OreBlock, val rock: Rocks): MaterialBlockItem(block, Settings().group(if (block.stack.material.isHidden) null else groupOre)), Colorable {
    override fun getPlacementState(context: ItemPlacementContext): BlockState? =
        block.defaultState.with(Rock.ROCKS_PROPERTY, rock)

    override fun appendStacks(itemGroup: ItemGroup, defaultedList: DefaultedList<ItemStack>) {
        if (this.isIn(itemGroup)) {
            defaultedList.add(ItemStack(this))
        }
    }

    override fun getName(itemStack: ItemStack?): TranslatableText {
        return TranslatableText("item.$MODID.ores", rock.localizedName, block.stack.material.localizedName)
    }

    override fun getColor() = block.stack.material.color
}

fun getOreItem(state: BlockState): ItemStack = oreItemMap[state.block as OreBlock]?.get(state[Rock.ROCKS_PROPERTY])?.let { ItemStack(it) } ?: ItemStack.EMPTY
