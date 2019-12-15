package com.projecturanus.uranustech.common.multiblock

import com.projecturanus.uranustech.common.util.minus
import net.minecraft.util.math.BlockPos
import org.junit.Test

class MultiblockPatternTest {
    @Test
    fun testRanged() {
        val rangedIngredient = RangedMultiblockIngredient(1, 8, {_ -> true}, { _, _ -> true})
    }

    @Test
    fun testRelative() {
        println(BlockPos(100, 31, 1) - BlockPos(200, 32, 1))
    }
}
