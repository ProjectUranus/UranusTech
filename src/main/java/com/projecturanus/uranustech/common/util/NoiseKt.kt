package com.projecturanus.uranustech.common.util

import net.minecraft.util.math.BlockPos
import kotlin.random.Random

fun noise(pos: Pair<Float, Float>, seed: Int = Random.Default.nextInt(), function: FastNoise.(Float, Float) -> Float, setup: FastNoise.() -> Unit): Float {
    val noise = FastNoise(seed)
    noise.setup()
    return noise.function(pos.first, pos.second)
}

fun noise(pos: Pair<Float, Pair<Float, Float>>, seed: Int = Random.Default.nextInt(), function: FastNoise.(Float, Float, Float) -> Float, setup: FastNoise.() -> Unit): Float {
    val noise = FastNoise(seed)
    noise.setup()
    return noise.function(pos.first, pos.second.first, pos.second.second)
}

fun noise(pos: BlockPos, seed: Int = Random.Default.nextInt(), function: FastNoise.(Float, Float, Float) -> Float, setup: FastNoise.() -> Unit): Float {
    val noise = FastNoise(seed)
    noise.setup()
    return noise.function(pos.x.toFloat(), pos.y.toFloat(), pos.z.toFloat())
}

fun noise(map: Array<FloatArray>, seed: Int = Random.Default.nextInt(), function: FastNoise.(Float, Float) -> Float, setup: FastNoise.() -> Unit) {
    val noise = FastNoise(seed)
    noise.setup()
    map.forEachIndexed { x, floats ->
        floats.forEachIndexed { y, _ ->
            map[x][y] = noise.function(x.toFloat(), y.toFloat())
        }
    }
}

fun noise(map: Array<Array<FloatArray>>, seed: Int = Random.Default.nextInt(), function: FastNoise.(Float, Float, Float) -> Float, setup: FastNoise.() -> Unit) {
    val noise = FastNoise(seed)
    noise.setup()
    map.forEachIndexed { x, floats ->
        floats.forEachIndexed { y, column ->
            column.forEachIndexed { z, _ ->
                map[x][y][z] = noise.function(x.toFloat(), y.toFloat(), z.toFloat())
            }
        }
    }
}
