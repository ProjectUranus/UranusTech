package com.projecturanus.uranustech.common.multiblock

import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
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

open class RangedMultiblockIngredient(val min: Int, val max: Int, validator: (BlockState) -> Boolean, val indexedValidator: (BlockState, Int) -> Boolean, knownStates: List<BlockState> = listOf()) : MultiblockIngredient(validator, knownStates)

class PatternBuilder {
    companion object {
        private fun anyToIngredient(obj: Any) =  when(obj) {
            is Block -> MultiblockIngredient({ state -> state.block == obj }, obj.stateManager.states)
            is BlockState -> MultiblockIngredient({ state -> state == obj }, listOf(obj))
            is Collection<*> -> MultiblockIngredient({ state -> state in obj },
                    obj.flatMap { when(it) {
                        is Block -> it.stateManager.states
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
        return MultiblockPattern(if (reversed) patterns.asReversed() else patterns, allowRotate)
    }
}

class MultiblockPattern(val patterns: List<List<List<MultiblockIngredient>>>, var allowRotate: Boolean): Cloneable {
    val patternMap: BiMap<BlockPos, MultiblockIngredient> = HashBiMap.create()
    var relativeBasePos: BlockPos = BlockPos.ORIGIN
    lateinit var base: MultiblockIngredient
    val axisIndex = mutableMapOf<Int, Pair<Int, Int>>()

    init {
        patterns.forEachIndexed { y, layer ->
            layer.forEachIndexed { z, row ->
                row.forEachIndexed { x, ingredient ->
                    if (ingredient.base) {
                        relativeBasePos = BlockPos(x, y, z)
                        base = ingredient
                    }
                    if (ingredient.axis)
                        axisIndex[y] = x to z
                    patternMap[BlockPos(x, y, z)] = ingredient
                }
            }
        }
        if (!::base.isInitialized) {
            throw IllegalArgumentException("No multiblock base provided")
        }
    }

    operator fun get(x: Int, y: Int, z: Int) = patterns[y][z][x]

    operator fun get(pos: BlockPos) = patterns[pos.y][pos.z][pos.x]

    override fun clone() = MultiblockPattern(patterns, allowRotate)

    operator fun get(y: Int) = patterns[y]

    fun rotated(flipUpDown: Boolean = false): List<MultiblockPattern> {
        return listOf(
                MultiblockPattern(patterns.map { it.asReversed() }, allowRotate),
                MultiblockPattern(patterns.map { list -> list.map { it.asReversed() } }, allowRotate),
                MultiblockPattern(patterns.map { list -> list.map { it.asReversed() }.asReversed() }, allowRotate)
        ).also { if (flipUpDown) it + it.map { list -> MultiblockPattern(list.patterns.asReversed(), allowRotate) } }
    }

    override fun toString(): String {
        return "MultiblockPattern(patterns=$patterns, relativeBasePos=$relativeBasePos, axisIndex=$axisIndex)"
    }
}

fun multiblock(reversed: Boolean = false, init: PatternBuilder.() -> Unit): MultiblockPattern {
    val builder = PatternBuilder()
    builder.init()
    return builder.build(reversed)
}
