package com.projecturanus.uranustech.common.fluid

import com.projecturanus.uranustech.api.material.MaterialAPI
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.common.material.MaterialContainer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.Blocks
import net.minecraft.block.FluidBlock
import net.minecraft.fluid.BaseFluid
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.fluid.Fluids
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.particle.ParticleEffect
import net.minecraft.particle.ParticleTypes
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.state.StateManager
import net.minecraft.tag.FluidTags
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView
import net.minecraft.world.IWorld
import net.minecraft.world.World
import net.minecraft.world.WorldView
import java.util.*

abstract class MaterialFluid(override val stack: MaterialStack) : BaseFluid(), MaterialContainer {
    override fun getBucketItem(): Item {
        return Items.WATER_BUCKET
    }

    @Environment(EnvType.CLIENT)
    public override fun randomDisplayTick(world_1: World, blockPos_1: BlockPos, fluidState_1: FluidState, random_1: Random?) {
        if (!fluidState_1.isStill && !(fluidState_1.get(FALLING) as Boolean)) {
            if (random_1!!.nextInt(64) == 0) {
                world_1.playSound(blockPos_1.x.toDouble() + 0.5, blockPos_1.y.toDouble() + 0.5, blockPos_1.z.toDouble() + 0.5, SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS, random_1.nextFloat() * 0.25f + 0.75f, random_1.nextFloat() + 0.5f, false)
            }
        } else if (random_1!!.nextInt(10) == 0) {
            world_1.addParticle(ParticleTypes.UNDERWATER, (blockPos_1.x.toFloat() + random_1.nextFloat()).toDouble(), (blockPos_1.y.toFloat() + random_1.nextFloat()).toDouble(), (blockPos_1.z.toFloat() + random_1.nextFloat()).toDouble(), 0.0, 0.0, 0.0)
        }

    }

    @Environment(EnvType.CLIENT)
    public override fun getParticle(): ParticleEffect? {
        return ParticleTypes.DRIPPING_WATER
    }

    override fun isInfinite(): Boolean {
        return true
    }

    override fun beforeBreakingBlock(iWorld_1: IWorld, blockPos_1: BlockPos, blockState_1: BlockState) {
        val blockEntity = if (blockState_1.block.hasBlockEntity()) iWorld_1.getBlockEntity(blockPos_1) else null
        Block.dropStacks(blockState_1, iWorld_1.world, blockPos_1, blockEntity)
    }

    public override fun method_15733(world: WorldView): Int {
        return 4
    }

    public override fun toBlockState(fluidState_1: FluidState): BlockState {
        return Blocks.WATER.defaultState.with(FluidBlock.LEVEL, method_15741(fluidState_1)) as BlockState
    }

    override fun matchesType(fluid_1: Fluid?): Boolean {
        return fluid_1 === Fluids.WATER || fluid_1 === Fluids.FLOWING_WATER
    }

    override fun getLevelDecreasePerBlock(viewableWorld_1: WorldView): Int {
        return 1
    }

    override fun getTickRate(viewableWorld_1: WorldView): Int {
        return 5
    }

    public override fun method_15777(fluidState_1: FluidState, blockView_1: BlockView, blockPos_1: BlockPos, fluid_1: Fluid, direction_1: Direction): Boolean {
        return direction_1 == Direction.DOWN && !fluid_1.matches(FluidTags.WATER)
    }

    override fun getBlastResistance(): Float {
        return 100.0f
    }

    abstract class Flowing(stack: MaterialStack) : MaterialFluid(stack) {

        override fun appendProperties(builder: StateManager.Builder<Fluid, FluidState>) {
            super.appendProperties(builder)
            builder.add(LEVEL)
        }

        override fun getLevel(fluidState_1: FluidState): Int {
            return fluidState_1.get(LEVEL) as Int
        }

        override fun isStill(fluidState_1: FluidState): Boolean {
            return false
        }
    }

    abstract class Still(stack: MaterialStack) : MaterialFluid(stack) {

        override fun getLevel(fluidState_1: FluidState): Int {
            return 8
        }

        override fun isStill(fluidState_1: FluidState): Boolean {
            return true
        }
    }
}

abstract class MoltenMaterialFluid(override val stack: MaterialStack) : MaterialFluid(stack) {

    override fun isStill(fluidState: FluidState): Boolean = fluidState.fluid is Still

    class Flowing(stack: MaterialStack) : MoltenMaterialFluid(stack) {
        override fun getFlowing(): Fluid = this

        override fun appendProperties(builder: StateManager.Builder<Fluid, FluidState>) {
            super.appendProperties(builder)
            builder.add(LEVEL)
        }

        override fun getStill(): Fluid? = MaterialAPI.INSTANCE.getStillFluid(stack)

        override fun getLevel(fluidState_1: FluidState): Int {
            return fluidState_1.get(LEVEL) as Int
        }

        override fun isStill(fluidState: FluidState): Boolean {
            return false
        }
    }

    class Still(stack: MaterialStack) : MoltenMaterialFluid(stack) {
        override fun getStill(): Fluid = this

        override fun getLevel(fluidState_1: FluidState): Int {
            return 8
        }

        override fun isStill(fluidState: FluidState): Boolean {
            return true
        }

        override fun getFlowing(): Fluid? = MaterialAPI.INSTANCE.getFlowingFluid(stack)
    }
}
