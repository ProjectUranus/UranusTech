package com.projecturanus.uranustech.common.block.structure

import com.projecturanus.uranustech.common.block.entity.CokeOvenBlockEntity
import gregtech.api.multiblock.FactoryBlockPattern
import net.minecraft.block.Block
import net.minecraft.block.BlockEntityProvider
import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.block.entity.BlockEntity
import net.minecraft.util.math.BlockPos
import net.minecraft.world.BlockView
import net.minecraft.world.World
import java.util.function.Predicate

object CokeOvenControllerBlock : FactoryControllerBlock(), BlockEntityProvider {
    val pattern = FactoryBlockPattern.start()
            .aisle("XXX", "XZX", "XXX")
            .aisle("XZX", "Z#Z", "XZX")
            .aisle("XXX", "XYX", "XXX")
            .where('Z', Predicate { it.blockState?.block == Blocks.OAK_LOG })
            .where('X', Predicate { it.blockState?.block == Blocks.OAK_PLANKS })
            .where('#', airPredicate)
            .where('Y', centerPredicate)
            .build()

    override fun createBlockEntity(view: BlockView): BlockEntity {
        return CokeOvenBlockEntity()
    }

    override fun neighborUpdate(state: BlockState?, world: World?, pos: BlockPos?, block: Block?, neighborPos: BlockPos?, moved: Boolean) {
        if (world?.getBlockState(pos) == null)
            world?.let(this::createBlockEntity)
        (world?.getBlockEntity(pos) as CokeOvenBlockEntity?)?.match()
    }
}
