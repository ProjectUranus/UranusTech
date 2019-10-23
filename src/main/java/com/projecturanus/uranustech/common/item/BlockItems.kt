package com.projecturanus.uranustech.common.item

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.worldgen.Rock
import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.common.block.MaterialBlock
import com.projecturanus.uranustech.common.block.OreBlock
import com.projecturanus.uranustech.common.groupConstructionBlock
import com.projecturanus.uranustech.common.groupOre
import com.projecturanus.uranustech.common.oreItemStackMap
import com.projecturanus.uranustech.common.util.localizedName
import net.minecraft.block.BlockState
import net.minecraft.item.*
import net.minecraft.text.TranslatableText
import net.minecraft.util.DefaultedList
import net.minecraft.util.Identifier

open class MaterialBlockItem(open val block: MaterialBlock, settings: Settings = Settings().group(if (block.stack.material.isHidden) null else groupConstructionBlock)): BlockItem(block, settings) {
    override fun getName(itemStack: ItemStack?): TranslatableText {
        return TranslatableText("block.$MODID.form", block.stack.material.localizedName, block.stack.form.localizedName)
    }
}

class OreBlockItem(override val block: OreBlock): MaterialBlockItem(block, Settings().group(if (block.stack.material.isHidden) null else groupOre)) {
    fun getStack(rock: Rock) =
            ItemStack(this).apply { orCreateTag.putString("rock", rock.identifier.toString()) }

    override fun getPlacementState(context: ItemPlacementContext): BlockState? =
        context.stack.tag?.getString("rock")?.let { block.defaultState.with(Rock.ROCKS_PROPERTY, Rocks.valueOf(Identifier(it).path.toUpperCase())) }

    // Nothing to do
    override fun appendStacks(itemGroup_1: ItemGroup, defaultedList_1: DefaultedList<ItemStack>) {}
}

fun getOreItem(state: BlockState) =
        if (state.block is OreBlock) oreItemStackMap[state.block as OreBlock]?.get(state[Rock.ROCKS_PROPERTY]) else null
