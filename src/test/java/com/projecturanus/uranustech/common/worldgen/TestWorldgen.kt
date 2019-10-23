package com.projecturanus.uranustech.common.worldgen

import com.projecturanus.uranustech.common.util.FastNoise
import com.projecturanus.uranustech.common.util.noise
import org.junit.Test
import java.util.*



class TestWorldgen {
    @Test
    fun testNoise() {
        var arr = Array(16) { FloatArray(16) { 0f } }
        noise(arr, function = FastNoise::GetCellular) {
            SetFrequency(0.075f)
        }
        arr = arr.map { it.map { f -> f }.toFloatArray() }.toTypedArray()
        val flat = arr.flatMap { it.asIterable() }.toFloatArray()

        println(Arrays.deepToString(arr))
        println(flat.count { it > 0.03 })
        println(flat.average())
    }
}
