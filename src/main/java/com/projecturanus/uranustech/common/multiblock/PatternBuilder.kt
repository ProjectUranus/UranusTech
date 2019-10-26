package com.projecturanus.uranustech.common.multiblock

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.util.math.BlockPos

open class MultiblockIngredient(
        /**
         * Validates a BlockState
         */
        val validator: (BlockState) -> Boolean,

        /**
         * Known valid states, used in recipe gui
         */
        val knownStates: List<BlockState> = listOf(),

        /**
         * Determines this ingredient is on axis position
         */
        var axis: Boolean = false,

        /**
         * Determines this ingredient is on base position
         */
        var base: Boolean = false
) {
    override fun toString(): String {
        return "MultiblockIngredient(knownStates=$knownStates, axis=$axis, base=$base)"
    }
}

class RangedMultiblockIngredient(val min: Int, val max: Int, validator: (BlockState) -> Boolean, val indexedValidator: (BlockState, Int) -> Boolean, knownStates: List<BlockState> = listOf()) : MultiblockIngredient(validator, knownStates)

class PatternBuilder {
    companion object {
        private fun anyToIngredient(obj: Any) =  when(obj) {
            is Block -> MultiblockIngredient({ state -> state.block == obj }, obj.stateFactory.states)
            is BlockState -> MultiblockIngredient({ state -> state == obj }, listOf(obj))
            is Collection<*> -> MultiblockIngredient({ state -> state in obj },
                    obj.flatMap { when(it) {
                        is Block -> it.stateFactory.states
                        is BlockState -> listOf(it)
                        else -> emptyList()
                    } })
            is MultiblockIngredient -> obj
            else -> throw IllegalArgumentException("$obj is not a valid type of multiblock pattern: [Block, BlockState, Collection<Block>, Collection<BlockState>, MultiblockIngredient]")
        }
    }

    var allowRotate: Boolean = true
    val patterns = arrayListOf<MutableList<MutableList<MultiblockIngredient>>>()

    fun row(vararg ingredients: Any) =
        ingredients.asSequence().map(::anyToIngredient).toMutableList()

    fun layer(vararg rows: MutableList<MultiblockIngredient>) {
        patterns.add(rows.toMutableList())
    }

    fun base(obj: Any) = anyToIngredient(obj).apply { base = true; axis = true }

    fun axis(obj: Any) = anyToIngredient(obj).apply { axis = true }

    fun ingredient(obj: Any) = anyToIngredient(obj)

    fun ranged(min: Int, max: Int, validator: (BlockState) -> Boolean, indexedValidator: (BlockState, Int) -> Boolean, knownStates: List<BlockState> = listOf()) =
        RangedMultiblockIngredient(min, max, validator, indexedValidator, knownStates)

    fun build(reversed: Boolean): MultiblockPattern {
        require(patterns.count { it.count { it.count(MultiblockIngredient::base) == 1 } == 1 } == 1) { "Multiblock base missing or more than 1: $patterns" }
        return if (reversed) MultiblockPattern(patterns.asReversed(), allowRotate) else MultiblockPattern(patterns, allowRotate)
    }
}

class MultiblockPattern(val patterns: List<List<List<MultiblockIngredient>>>, var allowRotate: Boolean) {
    var relativeBasePos: BlockPos = BlockPos.ORIGIN
    val axisIndex = mutableMapOf<Int, Pair<Int, Int>>()

    init {
        patterns.forEachIndexed { y, layer ->
            layer.forEachIndexed { z, row ->
                row.forEachIndexed { x, ingredient ->
                    if (ingredient.base)
                        relativeBasePos = BlockPos(x, y, z)
                    if (ingredient.axis)
                        axisIndex[y] = x to z
                }
            }
        }
    }

    operator fun get(y: Int) = patterns[y]

    override fun toString(): String {
        return "MultiblockPattern(patterns=$patterns, relativeBasePos=$relativeBasePos, axisIndex=$axisIndex)"
    }
}

fun multiblock(reversed: Boolean = false, init: PatternBuilder.() -> Unit): MultiblockPattern {
    val builder = PatternBuilder()
    builder.init()
    return builder.build(reversed)
}
