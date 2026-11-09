package dev.lasm.uranustech.geology.worldgen

import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.world.level.block.state.BlockState

/**
 * The ore a chunk's veins put in one column, ready to be consulted while the column is walked.
 *
 * A vein gives at most one block per column per role, so this is a small set of y positions rather
 * than a shape. GT6 draws each role's height from the seed, the coordinates and the vein origin alone,
 * which is what makes two chunks agree on the block at a shared column: nothing here reads the chunk it
 * is being built for, only the coordinates it is asked about.
 *
 * The positions are sorted by y so the caller can consume them with a cursor while walking upwards,
 * which keeps the per-column cost linear and allocation free. Built fresh for each column and dropped
 * afterwards, so no state is shared between chunk workers.
 */
internal class ColumnOverlays(private val capacity: Int) {
    private val ys = IntArray(capacity)
    private val refs = arrayOfNulls<OreRef>(capacity)
    private val hostSets = arrayOfNulls<Set<HostRockType>>(capacity)
    private var count = 0

    /** The y of the entry at [slot], or a value that matches no y when the column has none. */
    fun yAt(slot: Int): Int = if (slot < count) ys[slot] else Int.MIN_VALUE

    /** The block state at [slot] for the given rock, or null when this vein does not allow it. */
    fun stateAt(slot: Int, host: HostRockType, ignoreHostRestrictions: Boolean): BlockState? {
        val allowed = hostSets[slot]
        if (!ignoreHostRestrictions && allowed != null && allowed.isNotEmpty() && host !in allowed) return null
        val ref = refs[slot] ?: return null
        val states = OreResolver.resolve(ref)
        return if (states.isEmpty()) null else OreResolver.stateFor(states, host)
    }

    /**
     * Collects the ore every candidate vein puts in one column.
     *
     * The roles reproduce GT6's `WorldgenOresLarge` shape: `bottom` and `top` occupy a band and draw
     * one y from it per column, while `between` and `spread` are a single y for the whole vein, drawn
     * from the origin so the two chunks the vein spans agree on it.
     */
    fun build(
        seed: Long,
        candidates: List<Pair<VeinOrigin, OreVein>>,
        x: Int,
        z: Int,
        minBuildHeight: Int,
        maxBuildHeight: Int
    ) {
        count = 0
        val deepslateMinY = minBuildHeight
        val deepslateMaxY = minOf(0, maxBuildHeight - 1)
        for ((origin, vein) in candidates) {
            val bounds = VeinBounds.of(seed, origin, vein)
            if (x < bounds.minX || x > bounds.maxX || z < bounds.minZ || z > bounds.maxZ) continue
            if (!VeinDensity.of(bounds, bounds.minX, bounds.minZ, vein.density).keep(x, z)) continue

            val centreY = bounds.centerY
            band(seed, origin, vein, vein.bottom, centreY - 1, centreY + 1, x, z, maxOf(minBuildHeight, 1), maxBuildHeight)
            band(seed, origin, vein, vein.top, centreY + 3, centreY + 5, x, z, maxOf(minBuildHeight, 1), maxBuildHeight)
            fixed(
                seed, origin, vein, vein.between,
                centreY + 2 + Math.floorMod(hash(seed, origin, SALT_BETWEEN), 2),
                maxOf(minBuildHeight, 1), maxBuildHeight
            )
            fixed(
                seed, origin, vein, vein.spread,
                centreY - 1 + Math.floorMod(hash(seed, origin, SALT_SPREAD), 7),
                maxOf(minBuildHeight, 1), maxBuildHeight
            )

            // Deep veins ignore the configured height band and are much sparser than ordinary veins.
            if (deepslateMinY > deepslateMaxY || Math.floorMod(
                    VeinRegistry.hash(seed, x, z, SALT_DEEPSLATE_DENSITY xor origin.chunkX),
                    DEEPSLATE_DENSITY_DIVISOR
                ) != 0
            ) continue

            val deepHeight = deepslateMaxY - deepslateMinY + 1
            val deepCentreY = deepslateMinY + Math.floorMod(
                hash(seed, origin, SALT_DEEPSLATE_HEIGHT), deepHeight
            )
            band(seed, origin, vein, vein.bottom, deepCentreY - 1, deepCentreY + 1, x, z, deepslateMinY, deepslateMaxY + 1)
            band(seed, origin, vein, vein.top, deepCentreY + 3, deepCentreY + 5, x, z, deepslateMinY, deepslateMaxY + 1)
            fixed(
                seed, origin, vein, vein.between,
                deepCentreY + 2 + Math.floorMod(hash(seed, origin, SALT_BETWEEN), 2),
                deepslateMinY, deepslateMaxY + 1
            )
            fixed(
                seed, origin, vein, vein.spread,
                deepCentreY - 1 + Math.floorMod(hash(seed, origin, SALT_SPREAD), 7),
                deepslateMinY, deepslateMaxY + 1
            )
        }
        sortByY()
    }

    /** One role over a band of heights, drawing one y for this column. */
    private fun band(
        seed: Long,
        origin: VeinOrigin,
        vein: OreVein,
        ref: OreRef,
        lowY: Int,
        highY: Int,
        x: Int,
        z: Int,
        minBuildHeight: Int,
        maxBuildHeight: Int
    ) {
        if (ref === OreRef.None) return
        val low = maxOf(lowY, minBuildHeight)
        val high = minOf(highY, maxBuildHeight - 1)
        if (low > high) return
        val y = low + Math.floorMod(
            VeinRegistry.hash(seed, x, z, SALT_VERTICAL xor origin.chunkX), high - low + 1
        )
        record(y, ref, vein.hostRocks)
    }

    /** One role at a single y, the same for the whole vein. */
    private fun fixed(
        seed: Long,
        origin: VeinOrigin,
        vein: OreVein,
        ref: OreRef,
        y: Int,
        minBuildHeight: Int,
        maxBuildHeight: Int
    ) {
        if (ref === OreRef.None) return
        if (y < minBuildHeight || y >= maxBuildHeight) return
        record(y, ref, vein.hostRocks)
    }

    private fun hash(seed: Long, origin: VeinOrigin, salt: Int): Int =
        VeinRegistry.hash(seed, origin.chunkX, origin.chunkZ, salt)

    private fun record(y: Int, ref: OreRef, hosts: Set<HostRockType>) {
        if (count >= capacity) return
        ys[count] = y
        refs[count] = ref
        hostSets[count] = hosts
        count++
    }

    /** Insertion sort on y: the columns are short, so this beats a comparison sort's overhead. */
    private fun sortByY() {
        for (index in 1 until count) {
            val y = ys[index]
            val ref = refs[index]
            val hosts = hostSets[index]
            var position = index - 1
            while (position >= 0 && ys[position] > y) {
                ys[position + 1] = ys[position]
                refs[position + 1] = refs[position]
                hostSets[position + 1] = hostSets[position]
                position--
            }
            ys[position + 1] = y
            refs[position + 1] = ref
            hostSets[position + 1] = hosts
        }
    }

    private companion object {
        private const val SALT_BETWEEN = 0x51ED
        private const val SALT_SPREAD = 0x5EAD
        private const val SALT_VERTICAL = 0x7C31
        private const val SALT_DEEPSLATE_HEIGHT = 0x4D53
        private const val SALT_DEEPSLATE_DENSITY = 0x6D53
        private const val DEEPSLATE_DENSITY_DIVISOR = 4
    }
}
