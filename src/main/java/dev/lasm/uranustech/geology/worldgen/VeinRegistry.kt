package dev.lasm.uranustech.geology.worldgen

import net.minecraft.core.HolderSet

/**
 * Vein selection and geometry, shared by world generation and the debug command.
 *
 * Both go through this object so `/uranustech vein` reports exactly what generation does, rather than
 * a second implementation that can drift away from it.
 *
 * Everything here is a pure function of the world seed and chunk coordinates, so it can be called
 * outside chunk generation without changing its answer. Nothing here touches the level, which is why
 * the debug command can run on the server thread while chunks generate elsewhere.
 */
object VeinRegistry {
    private const val SALT_VEIN = 0x4176

    /** Origins are the chunks where both coordinates are 1 mod 3, which is GT6's spacing. */
    const val CHUNK_STRIDE = 3

    /**
     * How far to look for vein origins, in chunks.
     *
     * A vein spans `origin - (size - 1)` to `origin + 15 + (size - 1)` blocks. With `size` capped at 64
     * that is at most 63 blocks below the origin chunk and 78 above it, which is four chunks away in
     * both directions.
     */
    const val REACH = 4

    private val weights = WeightedTableCache<OreVein>(OreVein::weight)

    /** True when a chunk can hold a vein origin. */
    fun isOrigin(chunkX: Int, chunkZ: Int): Boolean =
        Math.floorMod(chunkX, CHUNK_STRIDE) == 1 && Math.floorMod(chunkZ, CHUNK_STRIDE) == 1

    /**
     * The veins that reach a chunk, paired with the origin each belongs to.
     *
     * A chunk can be covered by the veins of several nearby origins, so the result is a list. Origins
     * are visited in a fixed order, so the result is ordered and stable.
     */
    fun select(seed: Long, chunkX: Int, chunkZ: Int, veins: HolderSet<OreVein>): List<Pair<VeinOrigin, OreVein>> {
        val result = ArrayList<Pair<VeinOrigin, OreVein>>(4)
        for (originChunkX in chunkX - REACH..chunkX + REACH) {
            if (Math.floorMod(originChunkX, CHUNK_STRIDE) != 1) continue
            for (originChunkZ in chunkZ - REACH..chunkZ + REACH) {
                if (Math.floorMod(originChunkZ, CHUNK_STRIDE) != 1) continue
                val origin = VeinOrigin(originChunkX, originChunkZ)
                // Only origins whose vein body actually overlaps this chunk contribute anything.
                val vein = veinAt(seed, origin, veins) ?: continue
                if (!VeinBounds.of(seed, origin, vein).overlapsChunk(chunkX, chunkZ)) continue
                result += origin to vein
            }
        }
        return result
    }

    /** The vein of one origin chunk, chosen by weight. */
    fun veinAt(seed: Long, origin: VeinOrigin, veins: HolderSet<OreVein>): OreVein? {
        val table = weights.table(veins) ?: return null
        val draw = Math.floorMod(hash(seed, origin.chunkX, origin.chunkZ, SALT_VEIN), table.totalWeight)
        return table.pick(draw)
    }

    /** The origin chunk that owns the region a chunk lies in, used by the debug command. */
    fun originFor(chunkX: Int, chunkZ: Int): VeinOrigin {
        val originX = chunkX - Math.floorMod(chunkX - 1, CHUNK_STRIDE)
        val originZ = chunkZ - Math.floorMod(chunkZ - 1, CHUNK_STRIDE)
        return VeinOrigin(originX, originZ)
    }

    internal fun hash(seed: Long, x: Int, z: Int, salt: Int): Int = mix(seed, x, z, salt).toInt()

    internal fun mix(seed: Long, x: Int, z: Int, salt: Int): Long {
        var value = seed xor (x.toLong() shl 32) xor (z.toLong() and 0xFFFFFFFFL) xor (salt.toLong() shl 16)
        value = (value xor (value ushr 33)) * -49064778989728563L
        value = (value xor (value ushr 29)) * -4658895280553007687L
        return value xor (value ushr 32)
    }

}
