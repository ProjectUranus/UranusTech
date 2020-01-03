package gregtech.api.multiblock

import com.google.common.base.Joiner
import gregtech.api.multiblock.BlockPattern.RelativeDirection
import it.unimi.dsi.fastutil.chars.Char2ObjectMap
import it.unimi.dsi.fastutil.chars.Char2ObjectMaps
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap
import it.unimi.dsi.fastutil.ints.Int2ObjectMap
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import org.apache.commons.lang3.ArrayUtils
import org.apache.commons.lang3.StringUtils
import org.apache.commons.lang3.tuple.Pair
import java.util.*
import java.util.function.Predicate

class FactoryBlockPattern private constructor(charDir: RelativeDirection, stringDir: RelativeDirection, aisleDir: RelativeDirection) {
    private val depth: MutableList<Array<String>> = ArrayList()
    private val aisleRepetitions: MutableList<IntArray> = ArrayList()
    private val countLimits: Char2ObjectMap<IntRange> = Char2ObjectOpenHashMap()
    private val symbolMap: Char2ObjectMap<Predicate<BlockWorldState>?> = Char2ObjectOpenHashMap()
    private val layerValidators: Int2ObjectMap<Predicate<PatternMatchContext>> = Int2ObjectOpenHashMap()
    private val contextValidators: MutableList<Predicate<PatternMatchContext>> = ArrayList()
    private var aisleHeight = 0
    private var rowWidth = 0
    private val structureDir = arrayOfNulls<RelativeDirection>(3)
    /**
     * Adds a repeatable aisle to this pattern.
     */
    fun aisleRepeatable(minRepeat: Int, maxRepeat: Int, vararg aisle: String): FactoryBlockPattern {
        return if (!ArrayUtils.isEmpty(aisle) && !StringUtils.isEmpty(aisle[0])) {
            if (depth.isEmpty()) {
                aisleHeight = aisle.size
                rowWidth = aisle[0].length
            }
            if (aisle.size != aisleHeight) {
                throw IllegalArgumentException("Expected aisle with height of " + aisleHeight + ", but was given one with a height of " + aisle.size + ")")
            } else {
                for (s in aisle) {
                    require(s.length == rowWidth) { "Not all rows in the given aisle are the correct width (expected " + rowWidth + ", found one with " + s.length + ")" }
                    for (c0 in s.toCharArray()) {
                        if (!symbolMap.containsKey(c0)) {
                            symbolMap[c0] = null
                        }
                    }
                }
                depth.add(aisle as Array<String>)
                require(minRepeat <= maxRepeat) { "Lower bound of repeat counting must smaller than upper bound!" }
                aisleRepetitions.add(intArrayOf(minRepeat, maxRepeat))
                this
            }
        } else {
            throw IllegalArgumentException("Empty pattern for aisle")
        }
    }

    /**
     * Adds a single aisle to this pattern. (so multiple calls to this will increase the aisleDir by 1)
     */
    fun aisle(vararg aisle: String?): FactoryBlockPattern {
        return aisleRepeatable(1, 1, *aisle.filterNotNull().toTypedArray())
    }

    /**
     * Set last aisle repeatable
     */
    fun setRepeatable(minRepeat: Int, maxRepeat: Int): FactoryBlockPattern {
        require(minRepeat <= maxRepeat) { "Lower bound of repeat counting must smaller than upper bound!" }
        aisleRepetitions[aisleRepetitions.size - 1] = intArrayOf(minRepeat, maxRepeat)
        return this
    }

    /**
     * Set last aisle repeatable
     */
    fun setRepeatable(repeatCount: Int): FactoryBlockPattern {
        return setRepeatable(repeatCount, repeatCount)
    }

    fun setAmountLimit(symbol: Char, minAmount: Int, maxLimit: Int): FactoryBlockPattern {
        symbolMap[symbol] = null
        countLimits[symbol] = IntRange(minAmount, maxLimit)
        return this
    }

    fun setAmountAtLeast(symbol: Char, minValue: Int): FactoryBlockPattern {
        return setAmountLimit(symbol, minValue, Int.MAX_VALUE)
    }

    fun setAmountAtMost(symbol: Char, maxValue: Int): FactoryBlockPattern {
        return setAmountLimit(symbol, 0, maxValue)
    }

    fun where(symbol: Char, blockMatcher: Predicate<BlockWorldState>): FactoryBlockPattern {
        symbolMap[symbol] = blockMatcher
        return this
    }

    /**
     * Adds predicate to be run after multiblock checking to validate
     * pattern matching context before succeeding match sequence
     */
    fun validateContext(validator: Predicate<PatternMatchContext>): FactoryBlockPattern {
        contextValidators.add(validator)
        return this
    }

    /**
     * Adds predicate to validate given layer using given validator
     * Given context is layer-local and can be accessed via [BlockWorldState.getLayerContext]
     */
    fun validateLayer(layerIndex: Int, layerValidator: Predicate<PatternMatchContext>): FactoryBlockPattern {
        layerValidators[layerIndex] = layerValidator
        return this
    }

    fun build(): BlockPattern {
        return BlockPattern(makePredicateArray(), makeCountLimitsList(),
                layerValidators, contextValidators,
                structureDir, aisleRepetitions.toTypedArray())
    }

    private fun makePredicateArray(): Array<Array<Array<Predicate<BlockWorldState>?>>> {
        checkMissingPredicates()
        val predicate = java.lang.reflect.Array.newInstance(Predicate::class.java, depth.size, aisleHeight, rowWidth) as Array<Array<Array<Predicate<BlockWorldState>?>>>
        for (i in depth.indices) {
            for (j in 0 until aisleHeight) {
                for (k in 0 until rowWidth) {
                    predicate[i][j][k] = symbolMap[depth[i][j][k]]
                }
            }
        }
        return predicate
    }

    private fun makeCountLimitsList(): List<Pair<Predicate<BlockWorldState>?, IntRange>> {
        val array: MutableList<Pair<Predicate<BlockWorldState>?, IntRange>> = ArrayList(countLimits.size)
        Char2ObjectMaps.fastForEach(countLimits) { (key, value) ->
            val predicate = symbolMap[key]
            array.add(Pair.of(predicate, value))
        }
        return array
    }

    private fun checkMissingPredicates() {
        val list: MutableList<Char?> = ArrayList()
        Char2ObjectMaps.fastForEach(symbolMap) { (key, value) ->
            if (value == null) list.add(key)
        }
        check(list.isEmpty()) { "Predicates for character(s) " + COMMA_JOIN.join(list) + " are missing" }
    }

    companion object {
        private val COMMA_JOIN = Joiner.on(',')
        fun start(): FactoryBlockPattern {
            return FactoryBlockPattern(RelativeDirection.RIGHT, RelativeDirection.UP, RelativeDirection.BACK)
        }

        fun start(charDir: RelativeDirection, stringDir: RelativeDirection, aisleDir: RelativeDirection): FactoryBlockPattern {
            return FactoryBlockPattern(charDir, stringDir, aisleDir)
        }
    }

    init {
        structureDir[0] = charDir
        structureDir[1] = stringDir
        structureDir[2] = aisleDir
        var flags = 0
        for (i in 0..2) {
            when (structureDir[i]) {
                RelativeDirection.UP, RelativeDirection.DOWN -> flags = flags or 0x1
                RelativeDirection.LEFT, RelativeDirection.RIGHT -> flags = flags or 0x2
                RelativeDirection.FRONT, RelativeDirection.BACK -> flags = flags or 0x4
            }
        }
        require(flags == 0x7) { "Must have 3 different axes!" }
        symbolMap[' '] = Predicate { true }
    }
}
