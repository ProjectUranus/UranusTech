package dev.lasm.uranustech.geology.worldgen

import kotlin.math.abs
import kotlin.math.roundToInt

/**
 * Cellular layer noise, the shape GT6 uses to pick rock layers.
 *
 * The world is divided into cells and each cell has one random offset point. The value at a
 * coordinate is derived from the nearest cell's coordinates, so it is continuous across cell borders
 * and identical for the same coordinate in every chunk. Everything is hashed from the coordinates
 * instead of a random source, which keeps world generation independent of chunk order.
 *
 * The offset table is generated with SplitMix64 from a fixed seed, so the same world seed always
 * produces the same layers, and the table itself never has to be stored or shipped.
 */
object LayerNoise {
    private const val X_PRIME = 1619
    private const val Y_PRIME = 31337
    private const val Z_PRIME = 6971

    private const val TABLE_SIZE = 1 shl 16
    private const val TABLE_MASK = TABLE_SIZE - 1

    /** Per-cell offsets, each in `[-0.45, 0.45)` so the nearest point stays near its cell. */
    private val offsetsX = FloatArray(TABLE_SIZE)
    private val offsetsY = FloatArray(TABLE_SIZE)
    private val offsetsZ = FloatArray(TABLE_SIZE)

    init {
        // SplitMix64 from a fixed seed, so the table is identical on every client and server.
        var state = -3041304341192250317L
        var bits = 0
        var scratch = 0L
        fun nextFloat(): Float {
            if (bits == 0) {
                state += -7046029254386353131L
                var z = state
                z = (z xor (z ushr 30)) * -4658895280553007687L
                z = (z xor (z ushr 27)) * -7723592293110705685L
                scratch = z xor (z ushr 31)
                bits = 64
            }
            val value = scratch and 0xFFFFFFFFL
            scratch = scratch ushr 32
            bits -= 32
            return (value.toInt().toFloat() / 4294967296.0f) * 0.9f - 0.45f
        }
        for (index in 0 until TABLE_SIZE) {
            offsetsX[index] = nextFloat()
            offsetsY[index] = nextFloat()
            offsetsZ[index] = nextFloat()
        }
    }

    /**
     * The band index at a coordinate.
     *
     * @param optionCount the number of bands; the result is in `0 until optionCount`
     * @param verticalOffset shifts sampling vertically, so two dimensions can have different layers
     */
    fun sample(
        seed: Long,
        offset: Long,
        frequencyX: Float,
        frequencyY: Float,
        frequencyZ: Float,
        verticalOffset: Int,
        x: Int,
        y: Int,
        z: Int,
        optionCount: Int
    ): Int {
        if (optionCount <= 1) return 0
        val sampleX = x * frequencyX
        val sampleY = (y + verticalOffset) * frequencyY
        val sampleZ = z * frequencyZ
        val aroundX = sampleX.roundToInt()
        val aroundY = sampleY.roundToInt()
        val aroundZ = sampleZ.roundToInt()

        // Find the cell whose offset point is nearest to the sample. Its coordinates decide the band,
        // so neighbouring samples inside one cell agree and the value changes only at cell borders.
        var bestX = aroundX
        var bestY = aroundY
        var bestZ = aroundZ
        var bestDistance = Float.MAX_VALUE
        for (cellX in aroundX - 1..aroundX + 1) {
            for (cellY in aroundY - 1..aroundY + 1) {
                for (cellZ in aroundZ - 1..aroundZ + 1) {
                    val index = cellHash(seed, offset, cellX, cellY, cellZ) and TABLE_MASK
                    val deltaX = cellX - sampleX + offsetsX[index]
                    val deltaY = cellY - sampleY + offsetsY[index]
                    val deltaZ = cellZ - sampleZ + offsetsZ[index]
                    val distance = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ
                    if (distance < bestDistance) {
                        bestDistance = distance
                        bestX = cellX
                        bestY = cellY
                        bestZ = cellZ
                    }
                }
            }
        }

        // The nearest cell's coordinates select the band, so samples inside one cell agree and the
        // value only changes at a cell boundary.
        var third = (X_PRIME * bestX) xor (Y_PRIME * bestY) xor (Z_PRIME * bestZ)
        third = third * third * third * 60493
        val noise = third / 2147483648.0f
        return (((noise + 1.0f) * 0.5f) * optionCount).toInt().coerceIn(0, optionCount - 1)
    }

    private fun cellHash(seed: Long, offset: Long, x: Int, y: Int, z: Int): Int {
        var value = seed + offset
        value = (value xor (value ushr 33)) * -49064778989728563L
        value += (x.toLong() shl 34) xor (y.toLong() shl 16) xor (z.toLong() and 0xFFFFL)
        value = (value xor (value ushr 29)) * -4658895280553007687L
        return (value xor (value ushr 32)).toInt()
    }

    /**
     * Turns a distance from the edge of a vein into a chance denominator.
     *
     * A distance below the density gives a denominator of one, which always succeeds, so the middle
     * of a vein is solid and only its outer blocks thin out.
     */
    fun edgeChance(distance: Int, density: Int): Int = maxOf(1, abs(distance) / density)
}
