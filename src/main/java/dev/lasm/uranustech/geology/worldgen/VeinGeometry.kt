package dev.lasm.uranustech.geology.worldgen

import net.minecraft.core.SectionPos

/**
 * The origin chunk of a vein, in both chunk and block coordinates.
 *
 * A vein belongs to exactly one origin chunk and spreads outwards from it, so every property of a
 * vein is derived from this and the world seed rather than from where it happens to be generated.
 */
data class VeinOrigin(val chunkX: Int, val chunkZ: Int) {
    val blockX: Int = SectionPos.sectionToBlockCoord(chunkX)
    val blockZ: Int = SectionPos.sectionToBlockCoord(chunkZ)
}

/**
 * The absolute bounds and heights of one vein.
 *
 * A pure function of the seed and the origin, so any chunk can compute the same bounds for the same
 * vein. Nothing here depends on the chunk being generated, which is what lets each chunk write its
 * own part without coordinating with its neighbours.
 *
 * The horizontal span reproduces GT6: the vein reaches `rand(size)` blocks below the origin chunk and
 * `16 + rand(size)` blocks above it, so a large vein covers several chunks per direction.
 */
data class VeinBounds(
    val seed: Long,
    val origin: VeinOrigin,
    val minX: Int,
    val maxX: Int,
    val minZ: Int,
    val maxZ: Int,
    val centerY: Int
) {
    /** True when any part of the vein falls inside the given chunk. */
    fun overlapsChunk(chunkX: Int, chunkZ: Int): Boolean {
        val chunkMinX = SectionPos.sectionToBlockCoord(chunkX)
        val chunkMinZ = SectionPos.sectionToBlockCoord(chunkZ)
        if (maxX < chunkMinX || minX > chunkMinX + 15) return false
        return maxZ >= chunkMinZ && minZ <= chunkMinZ + 15
    }

    companion object {
        private const val SALT_HEIGHT = 0x4E17
        private const val SALT_SIZE_X_MIN = 0x5354
        private const val SALT_SIZE_X_MAX = 0x5345
        private const val SALT_SIZE_Z_MIN = 0x5A54
        private const val SALT_SIZE_Z_MAX = 0x5A45

        fun of(seed: Long, origin: VeinOrigin, vein: OreVein): VeinBounds {
            val centerY = vein.minY + Math.floorMod(
                VeinRegistry.hash(seed, origin.chunkX, origin.chunkZ, SALT_HEIGHT),
                vein.maxY - vein.minY - 5
            )
            val size = vein.size
            val minX = origin.blockX - Math.floorMod(VeinRegistry.hash(seed, origin.chunkX, origin.chunkZ, SALT_SIZE_X_MIN), size)
            val maxX = origin.blockX + 15 + Math.floorMod(VeinRegistry.hash(seed, origin.chunkX, origin.chunkZ, SALT_SIZE_X_MAX), size)
            val minZ = origin.blockZ - Math.floorMod(VeinRegistry.hash(seed, origin.chunkX, origin.chunkZ, SALT_SIZE_Z_MIN), size)
            val maxZ = origin.blockZ + 15 + Math.floorMod(VeinRegistry.hash(seed, origin.chunkX, origin.chunkZ, SALT_SIZE_Z_MAX), size)
            return VeinBounds(seed, origin, minX, maxX, minZ, maxZ, centerY)
        }
    }
}

/**
 * How sparsely a vein fills its bounds.
 *
 * GT6's rule, reproduced exactly: for every column, the distance from the column to the further of
 * the two vein ends, divided by the density, is the denominator of a chance. A draw of zero out of
 * that denominator places one block, so a column in the middle of a large vein with a low density is
 * usually empty, and only the ends, where the distance is small, are reliably filled.
 *
 * The distance is taken to the *further* end, which is what makes a vein a pair of dense tips rather
 * than a solid blob. The two axes are evaluated separately and either one may accept, matching GT6.
 */
class VeinDensity(
    private val seed: Long,
    private val minX: Int,
    private val minZ: Int,
    private val startX: Int,
    private val endX: Int,
    private val startZ: Int,
    private val endZ: Int,
    private val density: Int,
    private val saltX: Int,
    private val saltZ: Int
) {
    /**
     * True when a block should be placed at this column.
     *
     * The draw does not depend on y: GT6 decides once per column and then places a single block, so
     * the vertical position is the caller's business.
     */
    fun keep(x: Int, z: Int): Boolean {
        val xDraw = VeinRegistry.hash(seed, x, z, saltX)
        if (Math.floorMod(xDraw, chance(x, startX, endX)) == 0) return true
        val zDraw = VeinRegistry.hash(seed, x, z, saltZ)
        return Math.floorMod(zDraw, chance(z, startZ, endZ)) == 0
    }

    /** Chance denominator for one coordinate, never below one, so a draw over one always succeeds. */
    private fun chance(coordinate: Int, start: Int, end: Int): Int {
        val toStart = kotlin.math.abs(coordinate - start)
        val toEnd = kotlin.math.abs(coordinate - end)
        return maxOf(1, maxOf(toStart, toEnd) / density)
    }

    companion object {
        fun of(bounds: VeinBounds, minX: Int, minZ: Int, density: Int): VeinDensity = VeinDensity(
            bounds.seed, minX, minZ,
            bounds.minX, bounds.maxX, bounds.minZ, bounds.maxZ, density,
            SALT_DENSITY_X, SALT_DENSITY_Z
        )

        private const val SALT_DENSITY_X = 0x2B4C
        private const val SALT_DENSITY_Z = 0x3D5A
    }
}
