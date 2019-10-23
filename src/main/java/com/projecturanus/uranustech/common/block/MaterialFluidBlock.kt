package com.projecturanus.uranustech.common.block

import com.projecturanus.uranustech.common.fluid.MaterialFluid
import net.fabricmc.fabric.api.block.FabricBlockSettings
import net.minecraft.block.FluidBlock
import net.minecraft.block.Material

class MaterialFluidBlock(fluid: MaterialFluid) : FluidBlock(fluid, FabricBlockSettings.of(Material.WATER).build()) {
}
