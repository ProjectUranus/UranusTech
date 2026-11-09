package dev.lasm.uranustech.api.chemical.material

import net.minecraft.resources.ResourceKey

interface MaterialProvider {
    val material: ResourceKey<Material>


}