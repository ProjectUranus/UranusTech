package dev.lasm.uranustech.geology.worldgen

import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.core.HolderSet
import net.minecraft.world.level.block.state.BlockState

/**
 * The contact ores that apply to each pair of rock types, with a weighted draw per pair.
 *
 * A bidirectional entry is registered under both orders, so a lookup never has to try the pair the
 * other way round. Pairs are keyed by rock ordinal packed into a long, which needs no allocation per
 * seam, because this is asked once for every rock boundary in the chunk.
 *
 * Immutable once built, so one instance serves every chunk worker at once.
 */
class ContactOreMatcher private constructor(private val buckets: Map<Long, WeightedTable<DoubleLayerOre>>) {
    val isEmpty: Boolean get() = buckets.isEmpty()

    /** The contact ore for one seam, or null when the seam has none. */
    fun select(seed: Long, x: Int, y: Int, z: Int, upper: HostRockType, lower: HostRockType): DoubleLayerOre? {
        val table = buckets[key(upper, lower)] ?: return null
        val draw = Math.floorMod(VeinRegistry.hash(seed, x, z, SALT_CONTACT), table.totalWeight)
        val ore = table.pick(draw)
        if (y < ore.minY || y > ore.maxY) return null
        val densityDraw = Math.floorMod(VeinRegistry.hash(seed, x * 31 + y, z * 17 - y, SALT_DENSITY), ore.density)
        return if (densityDraw == 0) ore else null
    }

    companion object {
        private const val SALT_CONTACT = 0x6F1A
        private const val SALT_DENSITY = 0x7B2C

        /** An empty matcher, which [isEmpty] reports so the caller can skip the seam checks entirely. */
        val EMPTY = ContactOreMatcher(emptyMap())

        fun build(entries: HolderSet<DoubleLayerOre>): ContactOreMatcher {
            val grouped = HashMap<Long, MutableList<DoubleLayerOre>>()
            for (holder in entries) {
                val ore = holder.value()
                grouped.getOrPut(key(ore.first, ore.second)) { mutableListOf() } += ore
                if (ore.bothDirections) {
                    grouped.getOrPut(key(ore.second, ore.first)) { mutableListOf() } += ore
                }
            }
            if (grouped.isEmpty()) return EMPTY
            return ContactOreMatcher(grouped.mapValues { (_, list) -> WeightedTable.of(list, DoubleLayerOre::weight) })
        }

        /** The block state a contact ore uses in the given rock, or null when it cannot resolve. */
        fun stateFor(ore: DoubleLayerOre, host: HostRockType): BlockState? {
            val states = OreResolver.resolve(ore.ore)
            return if (states.isEmpty()) null else OreResolver.stateFor(states, host)
        }

        private fun key(upper: HostRockType, lower: HostRockType): Long =
            (upper.ordinal.toLong() shl 32) or (lower.ordinal.toLong() and 0xFFFFFFFFL)
    }
}
