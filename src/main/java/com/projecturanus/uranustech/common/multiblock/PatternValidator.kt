package com.projecturanus.uranustech.common.multiblock

import com.projecturanus.uranustech.common.util.minus
import com.projecturanus.uranustech.common.util.plus
import com.projecturanus.uranustech.logger
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView

fun validateMultiblock(pattern: MultiblockPattern, basePos: BlockPos, world: BlockView): Boolean = if (pattern.allowRotate) pattern.rotated().any { validateMultiblockInternal(it, basePos, world) } else validateMultiblockInternal(pattern, basePos, world)

fun validateMultiblockInternal(pattern: MultiblockPattern, basePos: BlockPos, world: BlockView): Boolean {
    val origin = basePos - pattern.relativeBasePos
    fun BlockPos.toRelative() = this.subtract(origin)
    fun BlockPos.toAbsolute() = this.add(origin)
    fun isValidOnDirection(axisPos: BlockPos, direction: Direction): Int {
        var offset = 0 // Ranged ingredient offset on this direction
        var currentPos = axisPos.offset(direction) // Current position moving on direction
        while (pattern.patternMap.containsKey(currentPos.toRelative())) {
            val ingredient = pattern[currentPos.toRelative()]
            if (ingredient is RangedMultiblockIngredient) {
                var valid = 0
                for (i in 0..ingredient.max) {
                    if (!ingredient.indexedValidator(world.getBlockState(currentPos.offset(direction, i + offset)), i))
                        return -1
                    else valid++
                }
                if (valid < ingredient.min)
                    return -1
                offset += valid - 1
            } else {
                if (!ingredient.validator(world.getBlockState(currentPos.offset(direction, offset))))
                    return -1
            }
            currentPos = currentPos.offset(direction)
        }
        return offset
    }

    try {
        for (y in pattern.axisIndex.keys) {
            var (x, z) = pattern.axisIndex[y]!!

            var axis = pattern[x, y, z]
            // Validate axis block
            if (!axis.validator(world.getBlockState(BlockPos(x, y, z).toRelative())))
                return false

            for (i in 0..pattern[y][z].size) {
                if (intArrayOf(isValidOnDirection(BlockPos(x, y, i), Direction.WEST), isValidOnDirection(BlockPos(x, y, i), Direction.EAST)).any { it == -1 })
                    return false
            }
        }
        return true
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
