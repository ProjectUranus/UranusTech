package dev.lasm.uranustech.block

import dev.lasm.uranustech.api.chemical.material.Material
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.block.Block

open class MaterialBlock(val material: ResourceKey<Material>, properties: Properties) : Block(properties) {
}
