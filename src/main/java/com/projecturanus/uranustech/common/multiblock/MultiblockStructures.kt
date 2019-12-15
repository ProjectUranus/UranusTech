package com.projecturanus.uranustech.common.multiblock

import com.projecturanus.uranustech.common.util.minus
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.fluid.FluidState
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView
import net.minecraft.world.WorldView

/**
 * Simplified version of Minecraft structure
 * @see net.minecraft.structure.Structure
 */
abstract class BasicStructure(val delegateWorld: WorldView, var positionMapper: (BlockPos) -> BlockPos = { it }) : BlockView {
    val positions = arrayListOf<BlockPos>()

    open fun addPos(pos: BlockPos): Boolean {
        return positions.add(pos)
    }

    override fun getBlockEntity(blockPos: BlockPos): BlockEntity? =
            delegateWorld.getBlockEntity(positionMapper(blockPos))

    override fun getFluidState(blockPos: BlockPos): FluidState? =
            delegateWorld.getFluidState(positionMapper(blockPos))

    override fun getBlockState(blockPos: BlockPos): BlockState =
            delegateWorld.getBlockState(positionMapper(blockPos))
}

open class RelativeStructure(val base: BlockPos, delegateWorld: WorldView) : BasicStructure(delegateWorld, { it.subtract(base) }) {
    override fun addPos(pos: BlockPos): Boolean {
        return positions.add(pos - base)
    }
}

class PatternStructure(val pattern: MultiblockPattern, base: BlockPos, delegateWorld: WorldView) : RelativeStructure(base, delegateWorld) {
    val zero = base - pattern.relativeBasePos

    override fun addPos(pos: BlockPos): Boolean {
        return super.addPos(pos)
    }
}
