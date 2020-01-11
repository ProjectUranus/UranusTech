package com.projecturanus.uranustech.common.block.entity

import com.projecturanus.uranustech.common.block.structure.CokeOvenControllerBlock.pattern
import net.minecraft.block.FacingBlock
import net.minecraft.block.entity.BlockEntity
import net.minecraft.inventory.BasicInventory
import net.minecraft.util.Tickable
import net.minecraft.util.math.Direction

class CokeOvenBlockEntity(var facing: Direction = Direction.NORTH) : BlockEntity(COKE_OVEN), Tickable {
    val inventory = BasicInventory(9)
    val recipeManager get() = world!!.recipeManager

    fun match() {
        facing = cachedState[FacingBlock.FACING]
        println(pattern.checkPatternAt(world!!, pos, facing))
    }

    override fun tick() {
    }
}
