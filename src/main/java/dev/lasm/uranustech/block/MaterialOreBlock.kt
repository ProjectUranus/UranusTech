package dev.lasm.uranustech.block

import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.EnumProperty

class MaterialOreBlock(material: ResourceKey<Material>, properties: Properties) : MaterialBlock(material, properties) {
    init {
        registerDefaultState(defaultBlockState().setValue(HOST_ROCK, HostRockType.STONE))
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(HOST_ROCK)
    }

    companion object {
        val HOST_ROCK: EnumProperty<HostRockType> = EnumProperty.create("host_rock", HostRockType::class.java)
    }
}
