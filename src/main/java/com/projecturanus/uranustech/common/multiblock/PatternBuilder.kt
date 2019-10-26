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
)

class RangedMultiblockIngredient(val min: Int, val max: Int, validator: (BlockState) -> Boolean, val indexedValidator: (BlockState, Int) -> Boolean, knownStates: List<BlockState> = listOf()) : MultiblockIngredient(validator, knownStates)

class MultiblockPattern {
    companion object {
        private fun anyToIngredient(obj: Any) =  when(obj) {
            is Block -> MultiblockIngredient({ state -> state.block == obj })
            is BlockState -> MultiblockIngredient({ state -> state == obj })
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

    val patterns = arrayListOf<List<MultiblockIngredient>>()

    fun layer(vararg ingredients: Any, index: Int = patterns.size) {
        patterns.add(index, ingredients.asSequence().map(::anyToIngredient).toList())
    }

    fun testPos(state: BlockState, pos: BlockPos): Boolean {
        
        return false
    }

    fun base(obj: Any) = anyToIngredient(obj).apply { base = true; axis = true }

    fun axis(obj: Any) = anyToIngredient(obj).apply { axis = true }

    fun ingredient(obj: Any) = anyToIngredient(obj)

    fun ranged(min: Int, max: Int, validator: (BlockState) -> Boolean, indexedValidator: (BlockState, Int) -> Boolean, knownStates: List<BlockState> = listOf()) =
        RangedMultiblockIngredient(min, max, validator, indexedValidator, knownStates)

    fun assignEntry(assignee: MutableList<Pair<String, Any>>.() -> Unit) {

    }
}

fun multiblock(init: MultiblockPattern.() -> Unit): MultiblockPattern {
    val builder = MultiblockPattern()
    builder.init()
    return builder
}
