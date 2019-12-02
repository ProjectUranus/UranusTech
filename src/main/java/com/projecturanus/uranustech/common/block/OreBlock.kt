package com.projecturanus.uranustech.common.block

import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.worldgen.Rock
import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.common.item.getOreItem
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.state.StateManager
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView

class OreBlock(stack: MaterialStack) : MaterialBlock(stack) {
    init {
        defaultState = defaultState.with(Rock.ROCKS_PROPERTY, Rocks.STONE)
    }

    override fun getPickStack(blockView: BlockView, blockPos: BlockPos, blockState: BlockState): ItemStack {
        return getOreItem(blockState) ?: ItemStack.EMPTY
    }

    override fun appendProperties(stateFactory: StateManager.Builder<Block, BlockState>) {
        stateFactory.add(Rock.ROCKS_PROPERTY)
    }

    override fun getPlacementState(itemPlacementContext_1: ItemPlacementContext): BlockState? {
        return this.defaultState.with(Rock.ROCKS_PROPERTY, Rocks.STONE) as BlockState
    }
}
