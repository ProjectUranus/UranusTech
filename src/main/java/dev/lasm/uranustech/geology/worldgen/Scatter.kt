package dev.lasm.uranustech.geology.worldgen

import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.core.HolderSet
import net.minecraft.core.SectionPos
import net.minecraft.world.level.WorldGenLevel
import net.minecraft.world.level.block.state.BlockState

/**
 * The small ore blocks of one chunk, ready to be consulted as a column is walked.
 *
 * Each configured small ore independently scatters `max(1, amount/2 + rand(amount)/2)` single blocks per
 * chunk, matching GT6's `WorldgenOresSmall`. Positions are drawn here, once per chunk, rather than
 * while the column is walked. A stable salt derived from each registry key keeps the draws
 * deterministic and independent across chunk workers.
 *
 * Each of the chunk's 256 columns gets a fixed slice of [SLOTS] entries holding the y of the blocks it
 * has, unused entries filled with a value no y can equal. A column is therefore a short run the walk
 * over the chunk can index directly, with no per-column offset table, no bounds checks and no
 * allocation. The resolved block states are held alongside, so nothing is resolved per position.
 */
internal class Scatter private constructor(
    private val states: Array<Map<HostRockType, BlockState>?>?,
    private val ys: ShortArray,
    private val hostSets: Array<Set<HostRockType>?>,
    private val minBlockX: Int,
    private val minBlockZ: Int,
    val size: Int
) {
    val isEmpty: Boolean get() = size == 0 || states == null

    /**
     * The y of the block at [slot] of the column, or [NO_Y] when that slot is unused, in which case
     * no real y can match it.
     */
    fun yAt(column: Int, slot: Int): Int = ys[column * SLOTS + slot].toInt()

    /**
     * The small ore block at one position, if the deposit has one that this rock allows.
     *
     * [slot] is the position within the column's slice; a slot with no block, or one this rock is not
     * allowed in, gives null and the caller moves on.
     */
    fun at(column: Int, slot: Int, host: HostRockType, ignoreHostRestrictions: Boolean): BlockState? {
        if (states == null || yAt(column, slot) == NO_Y.toInt()) return null
        val allowed = hostSets[column * SLOTS + slot]
        if (!ignoreHostRestrictions && allowed != null && allowed.isNotEmpty() && host !in allowed) return null
        val blockStates = states[column * SLOTS + slot] ?: return null
        return blockStates[host] ?: blockStates[HostRockType.STONE]
    }

    /**
     * The column index of a position, or -1 when it is not in this chunk.
     *
     * Positions written during generation only ever have the chunk's own coordinates, so this is a
     * subtraction and a bounds test rather than a chunk lookup.
     */
    fun columnOf(x: Int, z: Int): Int {
        val localX = x - minBlockX
        val localZ = z - minBlockZ
        if (localX < 0 || localX > 15 || localZ < 0 || localZ > 15) return -1
        return localX * 16 + localZ
    }

    companion object {
        /** Entries reserved per column; small deposits are spread over the chunk's 256 columns. */
        const val SLOTS = 16

        /** A y that never occurs, marking an unused slot. */
        private const val NO_Y: Short = Short.MIN_VALUE

        private const val SALT_AMOUNT = 0x2C4D
        private const val SALT_POSITION = 0x3E5F
        private const val SALT_DEEPSLATE_POSITION = 0x4D53
        private const val DEEPSLATE_DENSITY_DIVISOR = 4

        /** A scatter with nothing, for a config that holds no small ores. */
        val EMPTY = Scatter(
            null,
            ShortArray(256 * SLOTS) { NO_Y },
            arrayOfNulls(256 * SLOTS),
            0,
            0,
            0
        )

        fun of(seed: Long, level: WorldGenLevel, chunkX: Int, chunkZ: Int, ores: HolderSet<SmallOre>): Scatter {
            if (ores.size() == 0) return EMPTY
            val ys = ShortArray(256 * SLOTS) { NO_Y }
            val hostSets = arrayOfNulls<Set<HostRockType>>(256 * SLOTS)
            val statesByPosition = arrayOfNulls<Map<HostRockType, BlockState>>(256 * SLOTS)
            val filled = IntArray(256)
            var placed = 0
            for (holder in ores) {
                val ore = holder.value()
                val states = SmallOreResolver.resolve(ore)
                if (states.isEmpty()) continue

                val oreSalt = holder.unwrapKey().orElse(null)?.location()?.hashCode()
                    ?: ore.material.location().hashCode()
                val amountRoll = Math.floorMod(
                    VeinRegistry.hash(seed, chunkX, chunkZ, SALT_AMOUNT xor oreSalt),
                    ore.amount + 1
                )
                val count = maxOf(1, ore.amount / 2 + amountRoll / 2)
                val minY = maxOf(ore.minY, level.minBuildHeight, 1)
                val maxY = minOf(ore.maxY, level.maxBuildHeight - 1)
                val deepslateMinY = level.minBuildHeight
                val deepslateMaxY = minOf(0, level.maxBuildHeight - 1)
                val deepHeight = deepslateMaxY - deepslateMinY + 1

                fun recordPosition(hash: Int, y: Int) {
                    val localX = Math.floorMod(hash, 16)
                    val localZ = Math.floorMod(hash ushr 8, 16)
                    val column = localX * 16 + localZ
                    val start = column * SLOTS
                    val duplicate = (0 until filled[column]).firstOrNull { ys[start + it].toInt() == y }
                    if (duplicate != null) {
                        // Later entries in the configured list take precedence at the same position.
                        hostSets[start + duplicate] = ore.hostRocks
                        statesByPosition[start + duplicate] = states
                        return
                    }
                    if (filled[column] >= SLOTS) return
                    val slot = start + filled[column]
                    filled[column]++
                    ys[slot] = y.toShort()
                    hostSets[slot] = ore.hostRocks
                    statesByPosition[slot] = states
                    placed++
                }

                if (maxY >= minY) {
                    val height = maxY - minY + 1
                    for (index in 0 until count) {
                        // Include the registry key in each draw so one deposit cannot perturb another.
                        val hash = VeinRegistry.hash(
                            seed,
                            chunkX * 31 + index,
                            chunkZ * 17 - index,
                            SALT_POSITION xor oreSalt
                        )
                        recordPosition(hash, minY + Math.floorMod(hash ushr 16, height))
                    }
                }

                if (deepHeight > 0) {
                    for (index in 0 until count) {
                        val hash = VeinRegistry.hash(
                            seed,
                            chunkX * 31 + index,
                            chunkZ * 17 - index,
                            SALT_DEEPSLATE_POSITION xor oreSalt
                        )
                        if (Math.floorMod(hash ushr 16, DEEPSLATE_DENSITY_DIVISOR) == 0) {
                            recordPosition(hash, deepslateMinY + Math.floorMod(hash ushr 20, deepHeight))
                        }
                    }
                }
            }
            if (placed == 0) return EMPTY
            // The slots are in draw order, but the column walk consumes them upwards, so each column
            // is sorted by y. Insertion sort: a column holds at most SLOTS entries.
            for (column in 0 until 256) {
                val start = column * SLOTS
                val used = filled[column]
                for (index in 1 until used) {
                    val y = ys[start + index]
                    val hosts = hostSets[start + index]
                    val states = statesByPosition[start + index]
                    var position = index - 1
                    while (position >= 0 && ys[start + position] > y) {
                        ys[start + position + 1] = ys[start + position]
                        hostSets[start + position + 1] = hostSets[start + position]
                        statesByPosition[start + position + 1] = statesByPosition[start + position]
                        position--
                    }
                    ys[start + position + 1] = y
                    hostSets[start + position + 1] = hosts
                    statesByPosition[start + position + 1] = states
                }
            }
            return Scatter(
                statesByPosition, ys, hostSets,
                SectionPos.sectionToBlockCoord(chunkX),
                SectionPos.sectionToBlockCoord(chunkZ),
                placed
            )
        }
    }
}
