package com.projecturanus.uranustech.common.block.material

import net.fabricmc.fabric.api.block.FabricMaterialBuilder
import net.minecraft.block.MaterialColor

val MATERIAL_MACHINE = FabricMaterialBuilder(MaterialColor.GREEN).blocksPistons().requiresTool().build()
