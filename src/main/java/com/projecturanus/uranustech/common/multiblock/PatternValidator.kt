package com.projecturanus.uranustech.common.multiblock

import com.projecturanus.uranustech.common.util.plus
import com.projecturanus.uranustech.logger
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView

fun validateMultiblock(pattern: MultiblockPattern, basePos: BlockPos, world: BlockView): Boolean {
    try {
        if (!pattern.allowRotate) {
            for (y in pattern.axisIndex.keys) {
                var (x, z) = pattern.axisIndex[y]!!

                var ingredient = pattern[y][z][x]
                // Validate axis block
                if (!ingredient.validator(world.getBlockState(BlockPos(x, y, z))))
                    return false

            }
            return true
        }
    } catch (e: IndexOutOfBoundsException) {
        logger.error("Unable to validate multiblock", e)
    } catch (e: NullPointerException) {
        logger.error("", e)
    } catch (e: Exception) {
        logger.error("", e)
    }
    return false
}

fun generateRangedIngredient(ingredient: RangedMultiblockIngredient) =
        (ingredient.min..ingredient.max)
                .map { i -> MultiblockIngredient({ state -> ingredient.indexedValidator(state, i)}, ingredient.knownStates, ingredient.axis, ingredient.base) }

fun getBasePattern(pattern: MultiblockPattern): List<MultiblockPattern> {
    val patterns = arrayListOf<MultiblockPattern>()
    for (i in pattern.patterns.indices) {
        for (j in pattern.patterns[i].indices) {
            for (k in pattern.patterns[i][j].indices) {
                if (pattern[i][j][k] is RangedMultiblockIngredient) {
                }
            }
        }
    }
    return patterns
}

fun validateRangedIngredient(ingredient: RangedMultiblockIngredient, direction: Direction, basePos: BlockPos, world: BlockView): Int {
    if (ingredient.indexedValidator(world.getBlockState(basePos), 0)) {
        var valid = 0
        var pos: BlockPos
        for (i in 0 until ingredient.max) {
            pos = basePos + direction.vector
            if (ingredient.indexedValidator(world.getBlockState(pos), i))
                valid++
        }
        return valid
    }
    return 0;
}
