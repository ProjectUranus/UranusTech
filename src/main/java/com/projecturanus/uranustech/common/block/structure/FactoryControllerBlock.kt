package com.projecturanus.uranustech.common.block.structure

import com.projecturanus.uranustech.common.block.ExtendedFacingBlock
import com.projecturanus.uranustech.common.block.material.MATERIAL_MACHINE
import gregtech.api.multiblock.IPatternCenterPredicate
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.BlockEntityProvider
import net.minecraft.block.BlockState
import net.minecraft.container.NameableContainerProvider
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

abstract class FactoryControllerBlock(settings: Settings = FabricBlockSettings.of(MATERIAL_MACHINE).build()) : ExtendedFacingBlock(settings), BlockEntityProvider {
    val centerPredicate = IPatternCenterPredicate { it.blockState?.block == this }
    val airPredicate = IPatternCenterPredicate { it.blockState?.isAir ?: false }

    override fun onBlockAction(state: BlockState?, world: World, pos: BlockPos?, type: Int, data: Int): Boolean {
        super.onBlockAction(state, world, pos, type, data)
        val blockEntity = world.getBlockEntity(pos)
        return blockEntity?.onBlockAction(type, data) ?: false
    }

    override fun createContainerProvider(state: BlockState?, world: World, pos: BlockPos?): NameableContainerProvider? {
        val blockEntity = world.getBlockEntity(pos)
        return if (blockEntity is NameableContainerProvider) blockEntity else null
    }
}
