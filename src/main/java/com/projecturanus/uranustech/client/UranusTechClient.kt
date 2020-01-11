package com.projecturanus.uranustech.client

import com.projecturanus.uranustech.api.render.Colorable
import com.projecturanus.uranustech.client.gui.container.MaterialShowcaseScreen
import com.projecturanus.uranustech.client.model.initModels
import com.projecturanus.uranustech.client.render.block.WidgetBlockEntityRenderer
import com.projecturanus.uranustech.common.block.OreBlock
import com.projecturanus.uranustech.common.block.entity.COKE_OVEN
import com.projecturanus.uranustech.common.block.entity.CokeOvenBlockEntity
import com.projecturanus.uranustech.common.blockMaterialMap
import com.projecturanus.uranustech.common.container.MATERIAL_SHOWCASE
import com.projecturanus.uranustech.common.formMaterialMap
import com.projecturanus.uranustech.common.oreItemMap
import com.projecturanus.uranustech.common.toolMaterialMap
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.render.ColorProviderRegistry
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry
import net.fabricmc.fabric.api.client.screen.ScreenProviderRegistry
import net.minecraft.client.color.block.BlockColorProvider
import net.minecraft.client.color.item.ItemColorProvider
import net.minecraft.item.ItemConvertible
import org.apache.logging.log4j.LogManager

val clientLogger = LogManager.getFormatterLogger("UranusTech Client")!!

object UranusTechClient : ClientModInitializer {
    override fun onInitializeClient() {
//        RendererAccess.INSTANCE.registerRenderer(UTRenderer)
        registerColors()
        initModels()
        registerScreens()
        BlockEntityRendererRegistry.INSTANCE.register(COKE_OVEN) { WidgetBlockEntityRenderer<CokeOvenBlockEntity>(it) }
    }

    fun registerScreens() {
        ScreenProviderRegistry.INSTANCE.registerFactory(MATERIAL_SHOWCASE, ::MaterialShowcaseScreen)
    }

    fun registerColors() {
        // Item Colors
        ColorProviderRegistry.ITEM.register(ItemColorProvider { stack, tintIndex ->
            if (stack.item is Colorable) {
                (stack.item as Colorable).getItemColor(stack, tintIndex)
            } else -1
        }, *(formMaterialMap.values.flatMap { it.values } + toolMaterialMap.values.flatMap { it.values }.map { it as ItemConvertible }).toTypedArray() + oreItemMap.values.flatMap { it.values })

        // Block Colors
        ColorProviderRegistry.BLOCK.register(BlockColorProvider { blockState, extendedBlockView, blockPos, tintIndex ->
            if (tintIndex == 0) {
                if (blockState.block is OreBlock) {
                    val block = blockState.block as OreBlock
                    block.stack.material.color
                } else -1
            } else -1
        }, *(blockMaterialMap.values.flatMap { it.values }.toTypedArray()))
    }
}
