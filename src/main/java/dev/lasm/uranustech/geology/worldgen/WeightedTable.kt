package dev.lasm.uranustech.geology.worldgen

import net.minecraft.core.HolderSet
import java.util.concurrent.ConcurrentHashMap

/**
 * Weighted selection from a holder set, shared by veins and small ores.
 *
 * Chunk generation runs on several threads at once, and a feature instance is reused for every chunk
 * in a world, so the tables are built once through [ConcurrentHashMap.computeIfAbsent] and are
 * immutable afterwards. Nothing here mutates shared state once built, which is what makes it safe to
 * call from any worker without a lock.
 *
 * The draw is supplied by the caller and is derived from the world seed and chunk coordinates, never
 * from a shared random source, for the same reason: two workers generating neighbouring chunks must
 * not be able to influence each other's results.
 */
internal class WeightedTable<T> private constructor(private val entries: List<T>, private val cumulative: IntArray) {
    val totalWeight: Int = cumulative.lastOrNull() ?: 0

    /** The entry whose cumulative range contains [draw], found by binary search. */
    fun pick(draw: Int): T {
        var low = 0
        var high = cumulative.size - 1
        while (low < high) {
            val middle = (low + high) ushr 1
            if (draw < cumulative[middle]) high = middle else low = middle + 1
        }
        return entries[low]
    }

    companion object {
        fun <T> of(entries: List<T>, weightOf: (T) -> Int): WeightedTable<T> {
            val cumulative = IntArray(entries.size)
            var running = 0
            for (index in entries.indices) {
                running += weightOf(entries[index])
                cumulative[index] = running
            }
            return WeightedTable(entries, cumulative)
        }
    }
}

/**
 * Per holder set weight tables, built once and shared across chunk workers.
 *
 * A world holds a handful of entries because the key is the holder set from a placed feature's
 * config, so the map never grows during play. [HolderSet] has value equality, so the same config maps
 * to the same table every time.
 */
internal class WeightedTableCache<T : Any>(private val weightOf: (T) -> Int) {
    private val tables = ConcurrentHashMap<HolderSet<T>, WeightedTable<T>>()

    /**
     * The table for a set, or null when it is empty or every weight is zero.
     *
     * Built under `computeIfAbsent`, so two workers asking for the same set at the same time build it
     * once and both get the same instance.
     */
    fun table(seeds: HolderSet<T>): WeightedTable<T>? {
        val existing = tables[seeds]
        if (existing != null) return existing.takeIf { it.totalWeight > 0 }
        val built = tables.computeIfAbsent(seeds) { WeightedTable.of(it.map { holder -> holder.value() }, weightOf) }
        return built.takeIf { it.totalWeight > 0 }
    }
}
