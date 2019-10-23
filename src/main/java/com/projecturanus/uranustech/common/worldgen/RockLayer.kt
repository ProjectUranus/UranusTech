package com.projecturanus.uranustech.common.worldgen

import com.mojang.datafixers.Dynamic
import net.minecraft.block.BlockState
import net.minecraft.world.biome.Biome
import net.minecraft.world.chunk.Chunk
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder
import net.minecraft.world.gen.surfacebuilder.SurfaceConfig
import java.util.*

data class RockLayerConfig(val top: BlockState, val under: BlockState): SurfaceConfig {
    override fun getUnderMaterial(): BlockState {
        TODO()
    }

    override fun getTopMaterial(): BlockState {
        TODO()
    }
}

fun deserializeRockConfig(map: Dynamic<*>): RockLayerConfig {
    TODO()
}

class RockLayerBuilder: SurfaceBuilder<RockLayerConfig>(::deserializeRockConfig) {
    override fun generate(random: Random, chunk: Chunk, biome: Biome, x: Int, y: Int, z: Int, sample: Double, defaultBlock: BlockState, defaultFluid: BlockState, seaLevel: Int, seed: Long, config: RockLayerConfig) {

    }

}
