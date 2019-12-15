package com.projecturanus.uranustech.common.block.structure

import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Material
import net.minecraft.util.math.BlockPos
import net.minecraft.world.World

class StructureBlock : Block(FabricBlockSettings.of(Material.STONE).build()) {
    override fun neighborUpdate(blockState: BlockState?, world: World?, blockPos: BlockPos?, block: Block?, blockPos2: BlockPos?, bl: Boolean) {
        super.neighborUpdate(blockState, world, blockPos, block, blockPos2, bl)
    }
}
