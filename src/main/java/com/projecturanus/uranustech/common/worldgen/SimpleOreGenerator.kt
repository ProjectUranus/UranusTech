package com.projecturanus.uranustech.common.worldgen

import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.common.rockMap
import com.projecturanus.uranustech.common.util.FastNoise
import com.projecturanus.uranustech.common.util.noise
import net.minecraft.block.Blocks
import net.minecraft.util.math.BlockPos
import net.minecraft.world.IWorld
import net.minecraft.world.gen.chunk.ChunkGenerator
import net.minecraft.world.gen.chunk.ChunkGeneratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import java.util.*

val ORE_GEN_FEATURE = SimpleOreGenFeature()

class SimpleOreGenFeature : Feature<OreFeatureConfig>(OreFeatureConfig::deserialize) {
    override fun generate(world: IWorld, chunkGenerator: ChunkGenerator<out ChunkGeneratorConfig>, random: Random, pos: BlockPos, config: OreFeatureConfig): Boolean {
        if (noise(pos, world.seed.toInt(), FastNoise::GetCellular) { SetFrequency(0.045f) } > 0.3f) {
            setBlockState(world, pos, rockMap[Rocks.GRANITE_BLACK]?.defaultState ?: Blocks.ACACIA_LOG.defaultState)
            return true
        }
        return false
    }
}
