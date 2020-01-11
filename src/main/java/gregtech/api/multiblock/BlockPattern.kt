package gregtech.api.multiblock

import it.unimi.dsi.fastutil.ints.Int2ObjectMap
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView
import java.util.function.Function
import java.util.function.Predicate

class BlockPattern(//[z][y][x]
        private val blockMatches: Array<Array<Array<Predicate<BlockWorldState>?>>>,
        val countMatches: List<Pair<Predicate<BlockWorldState>?, IntRange>>,
        val layerMatchers: Int2ObjectMap<Predicate<PatternMatchContext>> = Int2ObjectOpenHashMap(),
        val validators: List<Predicate<PatternMatchContext>?>,
        val structureDir: Array<RelativeDirection>,
        val aisleRepetitions: Array<IntArray>) {
    val fingerLength //z size
            : Int
    var thumbLength = 0 //y size = 0
    var palmLength = 0 //x size = 0
    // x, y, z, minZ, maxZ
    private var centerOffset: IntArray? = null
    private val worldState = BlockWorldState()
    private val blockPos = BlockPos.Mutable()
    private val matchContext = PatternMatchContext()
    private val layerContext = PatternMatchContext()
    private fun initializeCenterOffsets() {
        loop@ for (x in 0 until palmLength) {
            for (y in 0 until thumbLength) {
                var z = 0
                var minZ = 0
                var maxZ = 0
                while (z < fingerLength) {
                    val predicate = blockMatches[z][y][x]
                    if (predicate is IPatternCenterPredicate) {
                        centerOffset = intArrayOf(x, y, z, minZ, maxZ)
                        break@loop
                    }
                    minZ += aisleRepetitions[z][0]
                    maxZ += aisleRepetitions[z][1]
                    z++
                }
            }
        }
        requireNotNull(centerOffset) { "Didn't found center predicate" }
    }

    fun checkPatternAt(world: BlockView, centerPos: BlockPos, facing: Direction): PatternMatchContext? {
        val countMatchesCache = IntArray(countMatches.size)
        var findFirstAisle = false
        var minZ = -centerOffset!![4]
        matchContext.reset()
        layerContext.reset()
        //Checking aisles
        var c = 0
        var z = minZ++
        var r: Int
        while (c < fingerLength) {
            r = 0
            loop@ while (if (findFirstAisle) r < aisleRepetitions[c][1] else z <= -centerOffset!![3]) {
                //Checking single slice
                layerContext.reset()
                var b = 0
                var y = -centerOffset!![1]
                while (b < thumbLength) {
                    var a = 0
                    var x = -centerOffset!![0]
                    while (a < palmLength) {
                        val predicate = blockMatches[c][b][a]
                        setActualRelativeOffset(blockPos, x, y, z, facing)
                        blockPos[blockPos.x + centerPos.x, blockPos.y + centerPos.y] = blockPos.z + centerPos.z
                        worldState.update(world, blockPos, matchContext, layerContext)
                        if (predicate?.test(worldState) != true) {
                            if (findFirstAisle) {
                                if (r < aisleRepetitions[c][0]) { //retreat to see if the first aisle can start later
                                    c = 0
                                    r = c
                                    z = minZ++
                                    matchContext.reset()
                                    findFirstAisle = false
                                }
                            } else {
                                z++ //continue searching for the first aisle
                            }
                            r++
                            continue@loop
                        }
                        for (i in countMatchesCache.indices) {
                            if (countMatches[i].first?.test(worldState) == true) {
                                countMatchesCache[i]++
                            }
                        }
                        a++
                        x++
                    }
                    b++
                    y++
                }
                findFirstAisle = true
                z++
                //Check layer-local matcher predicate
                val layerPredicate = layerMatchers[c]
                if (layerPredicate != null && !layerPredicate.test(layerContext)) {
                    return null
                }
                r++
            }
            //Repetitions out of range
            if (r < aisleRepetitions[c][0]) {
                return null
            }
            c++
        }
        //Check count matches amount
        for (i in countMatchesCache.indices) {
            val intRange = countMatches[i].second
            if (!intRange.contains(countMatchesCache[i])) {
                return null //count matches didn't match
            }
        }
        //Check general match predicates
        for (validator in validators) {
            if (validator?.test(matchContext) != true) {
                return null
            }
        }
        return matchContext
    }

    private fun setActualRelativeOffset(pos: BlockPos.Mutable, x: Int, y: Int, z: Int, facing: Direction): BlockPos.Mutable { //if (!ArrayUtils.contains(ALLOWED_FACINGS, facing))
//    throw new IllegalArgumentException("Can rotate only horizontally");
        val c0 = intArrayOf(x, y, z)
        val c1 = IntArray(3)
        for (i in 0..2) {
            when (structureDir[i].getActualFacing(facing)) {
                Direction.UP -> c1[1] = c0[i]
                Direction.DOWN -> c1[1] = -c0[i]
                Direction.WEST -> c1[0] = -c0[i]
                Direction.EAST -> c1[0] = c0[i]
                Direction.NORTH -> c1[2] = -c0[i]
                Direction.SOUTH -> c1[2] = c0[i]
            }
        }
        return pos.set(c1[0], c1[1], c1[2])
    }

    /**
     * Relative direction when facing horizontally
     */
    enum class RelativeDirection(var actualFacing: Function<Direction, Direction>) {
        UP(Function<Direction, Direction> { f: Direction? -> Direction.UP }), DOWN(Function<Direction, Direction> { f: Direction? -> Direction.DOWN }), LEFT(Function<Direction, Direction> { obj: Direction -> obj.rotateYCounterclockwise() }), RIGHT(Function<Direction, Direction> { obj: Direction -> obj.rotateYClockwise() }), FRONT(Function.identity()), BACK(Function<Direction, Direction> { obj: Direction -> obj.opposite });

        fun getActualFacing(facing: Direction): Direction {
            return actualFacing.apply(facing)
        }

    }

    init {
        this.layerMatchers.putAll(layerMatchers)
        fingerLength = blockMatches.size
        if (fingerLength > 0) {
            thumbLength = blockMatches[0].size
            if (thumbLength > 0) {
                palmLength = blockMatches[0][0].size
            } else {
                palmLength = 0
            }
        } else {
            thumbLength = 0
            palmLength = 0
        }
        initializeCenterOffsets()
    }
}
