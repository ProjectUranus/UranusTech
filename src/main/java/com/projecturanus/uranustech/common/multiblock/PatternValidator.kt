package com.projecturanus.uranustech.common.multiblock

import com.projecturanus.uranustech.common.util.plus
import com.projecturanus.uranustech.logger
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3i
import net.minecraft.world.BlockView

fun validateMultiblock(pattern: MultiblockPattern, basePos: BlockPos, world: BlockView): Boolean {
    try {
        if (!pattern.allowRotate) {
            // Validation starts from axis
            for (index in pattern.axisIndex) {
                val y = index.key
                val (x, z) = index.value
                // Validates axis block
                if (!pattern[y][z][x].validator(world.getBlockState(basePos + Vec3i(x, y, z))))
                    return false
                var xOffset = 0 // Offset for validating ranged ingredient
                // Left axis
                for (i in x - 1 downTo 0) {
                    val ingredient = pattern[y][z][i]
                    // Ranged ingredient
                    if (ingredient is RangedMultiblockIngredient) {
                        var passed = 0 // Valid blocks
                        for (j in 0..ingredient.max) {
                            if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, z)), j))
                                break
                            passed++
                        }
                        if (passed < ingredient.min)
                            return false
                        xOffset = -passed
                    } else { // Normal block
                        if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                            return false
                    }
                }
                // Right axis
                for (i in x + 1 until pattern[y][z].size) {
                    val ingredient = pattern[y][z][i]
                    // Ranged ingredient
                    if (ingredient is RangedMultiblockIngredient) {
                        var passed = 0 // Valid blocks
                        for (j in 0..ingredient.max) {
                            if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, z)), j))
                                break
                            passed++
                        }
                        if (passed < ingredient.min)
                            return false
                        xOffset = passed
                    } else { // Normal block
                        if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                            return false
                    }
                }
                // Move from Z axis
                for (movedZ in pattern[y].indices) {
                    if (movedZ == z) continue
                    // Validates axis block
                    if (!pattern[y][movedZ][x].validator(world.getBlockState(basePos + Vec3i(x, y, movedZ))))
                        return false
                    var xOffset = 0 // Offset for validating ranged ingredient
                    // Left axis
                    for (i in x - 1 downTo 0) {
                        val ingredient = pattern[y][movedZ][i]
                        // Ranged ingredient
                        if (ingredient is RangedMultiblockIngredient) {
                            var passed = 0 // Valid blocks
                            for (j in 0..ingredient.max) {
                                if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, movedZ)), j))
                                    break
                                passed++
                            }
                            if (passed < ingredient.min)
                                return false
                            xOffset = -passed
                        } else { // Normal block
                            if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                return false
                        }
                    }
                    // Right axis
                    for (i in x + 1 until pattern[y][movedZ].size) {
                        val ingredient = pattern[y][movedZ][i]
                        // Ranged ingredient
                        if (ingredient is RangedMultiblockIngredient) {
                            var passed = 0 // Valid blocks
                            for (j in 0..ingredient.max) {
                                if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, movedZ)), j))
                                    break
                                passed++
                            }
                            if (passed < ingredient.min)
                                return false
                            xOffset = passed
                        } else { // Normal block
                            if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                return false
                        }
                    }
                }
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
