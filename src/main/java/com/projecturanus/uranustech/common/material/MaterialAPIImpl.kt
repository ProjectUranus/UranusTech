package com.projecturanus.uranustech.common.material

import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.MaterialAPI
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.common.blockMaterialMap
import com.projecturanus.uranustech.common.formMaterialMap
import com.projecturanus.uranustech.logger
import net.minecraft.block.BlockState
import net.minecraft.fluid.Fluid
import net.minecraft.item.ItemStack
import net.minecraft.util.registry.MutableRegistry
import java.util.function.Function

object MaterialAPIImpl : MaterialAPI {
    val mappers = mutableListOf<(Material) -> Material?>()

    var blockMapper: (MaterialStack) -> BlockState? = {
        blockMaterialMap[it.material]?.get(it.form)?.defaultState ?: vanillaBlockMapper[it]
    }

    var itemMapper: (MaterialStack) -> ItemStack = {
        formMaterialMap[it.material]?.get(it.form)?.let(::ItemStack) ?: vanillaItemMapper[it] ?: ItemStack.EMPTY
    }

    override fun addJsonMaterialMapper(mapper: Function<Material, Material?>?) {
        if (mapper == null) {
            logger.warn("Attempt to assign null material mapper, report to your developer", NullPointerException())
            return
        }
        mappers += mapper::apply
    }

    override fun getMaterialBlock(materialStack: MaterialStack): BlockState? = blockMapper(materialStack)

    override fun getFormRegistry() = com.projecturanus.uranustech.common.formRegistry
    override fun getMaterialRegistry(): MutableRegistry<Material> = com.projecturanus.uranustech.common.materialRegistry

    override fun getMaterialItem(materialStack: MaterialStack): ItemStack = itemMapper(materialStack)

    override fun getFlowingFluid(materialStack: MaterialStack): Fluid? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun getStillFluid(materialStack: MaterialStack): Fluid? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
