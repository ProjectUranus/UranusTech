package com.projecturanus.uranustech.common.multiblock

import com.projecturanus.uranustech.common.util.plus
import com.projecturanus.uranustech.logger
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
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
        } else {
            return runBlocking {
                async {
                    // Base
                    for (index in pattern.axisIndex) {
                        val y = index.key
                        val (x, z) = index.value
                        // Validates axis block
                        if (!pattern[y][z][x].validator(world.getBlockState(basePos + Vec3i(x, y, z))))
                            return@async false
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
                                    return@async false
                                xOffset = -passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
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
                                    return@async false
                                xOffset = passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Move from Z axis
                        for (movedZ in pattern[y].indices) {
                            if (movedZ == z) continue
                            // Validates axis block
                            if (!pattern[y][movedZ][x].validator(world.getBlockState(basePos + Vec3i(x, y, movedZ))))
                                return@async false
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
                                        return@async false
                                    xOffset = -passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
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
                                        return@async false
                                    xOffset = passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                        }
                    }
                    return@async false
                }.await() ||
                async {
                    // X counter-wise
                    for (index in pattern.axisIndex) {
                        val y = index.key
                        val (x, z) = index.value
                        // Validates axis block
                        if (!pattern[y][z][pattern[y][z].size - x - 1].validator(world.getBlockState(basePos + Vec3i(x, y, z))))
                            return@async false
                        var xOffset = 0 // Offset for validating ranged ingredient
                        // Left axis
                        for (i in x - 1 downTo 0) {
                            val ingredient = pattern[y][z][pattern[y][z].size - i - 1]
                            // Ranged ingredient
                            if (ingredient is RangedMultiblockIngredient) {
                                var passed = 0 // Valid blocks
                                for (j in 0..ingredient.max) {
                                    if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, z)), j))
                                        break
                                    passed++
                                }
                                if (passed < ingredient.min)
                                    return@async false
                                xOffset = -passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Right axis
                        for (i in x + 1 until pattern[y][z].size) {
                            val ingredient = pattern[y][z][pattern[y][z].size - i - 1]
                            // Ranged ingredient
                            if (ingredient is RangedMultiblockIngredient) {
                                var passed = 0 // Valid blocks
                                for (j in 0..ingredient.max) {
                                    if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, z)), j))
                                        break
                                    passed++
                                }
                                if (passed < ingredient.min)
                                    return@async false
                                xOffset = passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Move from Z axis
                        for (movedZ in pattern[y].indices) {
                            if (movedZ == z) continue
                            // Validates axis block
                            if (!pattern[y][movedZ][pattern[y][z].size - x - 1].validator(world.getBlockState(basePos + Vec3i(x, y, movedZ))))
                                return@async false
                            var xOffset = 0 // Offset for validating ranged ingredient
                            // Left axis
                            for (i in x - 1 downTo 0) {
                                val ingredient = pattern[y][movedZ][pattern[y][z].size - i - 1]
                                // Ranged ingredient
                                if (ingredient is RangedMultiblockIngredient) {
                                    var passed = 0 // Valid blocks
                                    for (j in 0..ingredient.max) {
                                        if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, movedZ)), j))
                                            break
                                        passed++
                                    }
                                    if (passed < ingredient.min)
                                        return@async false
                                    xOffset = -passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                            // Right axis
                            for (i in x + 1 until pattern[y][movedZ].size) {
                                val ingredient = pattern[y][movedZ][pattern[y][z].size - i - 1]
                                // Ranged ingredient
                                if (ingredient is RangedMultiblockIngredient) {
                                    var passed = 0 // Valid blocks
                                    for (j in 0..ingredient.max) {
                                        if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, movedZ)), j))
                                            break
                                        passed++
                                    }
                                    if (passed < ingredient.min)
                                        return@async false
                                    xOffset = passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                        }
                    }
                    return@async false
                }.await() ||
                async {
                    // Z counter-wise
                    for (index in pattern.axisIndex) {
                        val y = index.key
                        val (x, z) = index.value
                        // Validates axis block
                        if (!pattern[y][pattern[y].size - z - 1][x].validator(world.getBlockState(basePos + Vec3i(x, y, z))))
                            return@async false
                        var xOffset = 0 // Offset for validating ranged ingredient
                        // Left axis
                        for (i in x - 1 downTo 0) {
                            val ingredient = pattern[y][pattern[y].size - z - 1][i]
                            // Ranged ingredient
                            if (ingredient is RangedMultiblockIngredient) {
                                var passed = 0 // Valid blocks
                                for (j in 0..ingredient.max) {
                                    if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, z)), j))
                                        break
                                    passed++
                                }
                                if (passed < ingredient.min)
                                    return@async false
                                xOffset = -passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Right axis
                        for (i in x + 1 until pattern[y][pattern[y].size - z - 1].size) {
                            val ingredient = pattern[y][pattern[y].size - z - 1][i]
                            // Ranged ingredient
                            if (ingredient is RangedMultiblockIngredient) {
                                var passed = 0 // Valid blocks
                                for (j in 0..ingredient.max) {
                                    if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, z)), j))
                                        break
                                    passed++
                                }
                                if (passed < ingredient.min)
                                    return@async false
                                xOffset = passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Move from Z axis
                        for (movedZ in pattern[y].indices) {
                            if (movedZ == pattern[y].size - z - 1) continue
                            // Validates axis block
                            if (!pattern[y][pattern[y].size - movedZ - 1][x].validator(world.getBlockState(basePos + Vec3i(x, y, movedZ))))
                                return@async false
                            var xOffset = 0 // Offset for validating ranged ingredient
                            // Left axis
                            for (i in x - 1 downTo 0) {
                                val ingredient = pattern[y][pattern[y].size - movedZ - 1][pattern[y][z].size - i - 1]
                                // Ranged ingredient
                                if (ingredient is RangedMultiblockIngredient) {
                                    var passed = 0 // Valid blocks
                                    for (j in 0..ingredient.max) {
                                        if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, movedZ)), j))
                                            break
                                        passed++
                                    }
                                    if (passed < ingredient.min)
                                        return@async false
                                    xOffset = -passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                            // Right axis
                            for (i in x + 1 until pattern[y][pattern[y].size - movedZ - 1].size) {
                                val ingredient = pattern[y][pattern[y].size - movedZ - 1][pattern[y][z].size - i - 1]
                                // Ranged ingredient
                                if (ingredient is RangedMultiblockIngredient) {
                                    var passed = 0 // Valid blocks
                                    for (j in 0..ingredient.max) {
                                        if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, movedZ)), j))
                                            break
                                        passed++
                                    }
                                    if (passed < ingredient.min)
                                        return@async false
                                    xOffset = passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                        }
                    }
                    return@async false
                }.await() ||
                async {
                    // X-Z switched
                    for (index in pattern.axisIndex) {
                        val y = index.key
                        val (x, z) = index.value
                        // Validates axis block
                        if (!pattern[y][z][x].validator(world.getBlockState(basePos + Vec3i(x, y, z))))
                            return@async false
                        var xOffset = 0 // Offset for validating ranged ingredient
                        // Left axis
                        for (i in x - 1 downTo 0) {
                            val ingredient = pattern[y][i][z]
                            // Ranged ingredient
                            if (ingredient is RangedMultiblockIngredient) {
                                var passed = 0 // Valid blocks
                                for (j in 0..ingredient.max) {
                                    if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, z)), j))
                                        break
                                    passed++
                                }
                                if (passed < ingredient.min)
                                    return@async false
                                xOffset = -passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Right axis
                        for (i in x + 1 until pattern[y][z].size) {
                            val ingredient = pattern[y][i][z]
                            // Ranged ingredient
                            if (ingredient is RangedMultiblockIngredient) {
                                var passed = 0 // Valid blocks
                                for (j in 0..ingredient.max) {
                                    if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, z)), j))
                                        break
                                    passed++
                                }
                                if (passed < ingredient.min)
                                    return@async false
                                xOffset = passed
                            } else { // Normal block
                                if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, z))))
                                    return@async false
                            }
                        }
                        // Move from Z axis
                        for (movedZ in pattern[y].indices) {
                            if (movedZ == x) continue
                            // Validates axis block
                            if (!pattern[y][x][movedZ].validator(world.getBlockState(basePos + Vec3i(x, y, movedZ))))
                                return@async false
                            var xOffset = 0 // Offset for validating ranged ingredient
                            // Left axis
                            for (i in x - 1 downTo 0) {
                                val ingredient = pattern[y][i][movedZ]
                                // Ranged ingredient
                                if (ingredient is RangedMultiblockIngredient) {
                                    var passed = 0 // Valid blocks
                                    for (j in 0..ingredient.max) {
                                        if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x - j, y, movedZ)), j))
                                            break
                                        passed++
                                    }
                                    if (passed < ingredient.min)
                                        return@async false
                                    xOffset = -passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                            // Right axis
                            for (i in x + 1 until pattern[y][movedZ].size) {
                                val ingredient = pattern[y][i][movedZ]
                                // Ranged ingredient
                                if (ingredient is RangedMultiblockIngredient) {
                                    var passed = 0 // Valid blocks
                                    for (j in 0..ingredient.max) {
                                        if (!ingredient.indexedValidator(world.getBlockState(basePos + Vec3i(xOffset + x + j, y, movedZ)), j))
                                            break
                                        passed++
                                    }
                                    if (passed < ingredient.min)
                                        return@async false
                                    xOffset = passed
                                } else { // Normal block
                                    if (!ingredient.validator(world.getBlockState(basePos + Vec3i(xOffset + x, y, movedZ))))
                                        return@async false
                                }
                            }
                        }
                    }
                    return@async false
                }.await()
            }
        }
    } catch (e: IndexOutOfBoundsException) {
        logger.error("", e)
    } catch (e: NullPointerException) {
        logger.error("", e)
    } catch (e: Exception) {
        logger.error("", e)
    }
    return false
}
