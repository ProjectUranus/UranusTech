package com.projecturanus.uranustech.client

import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.material.info.ToolInfo
import com.projecturanus.uranustech.client.model.initModels
import com.projecturanus.uranustech.common.block.OreBlock
import com.projecturanus.uranustech.common.blockMaterialMap
import com.projecturanus.uranustech.common.formMaterialMap
import com.projecturanus.uranustech.common.item.FormItem
import com.projecturanus.uranustech.common.item.UTToolItem
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.toolMaterialMap
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.render.ColorProviderRegistry
import net.minecraft.client.color.block.BlockColorProvider
import net.minecraft.client.color.item.ItemColorProvider
import org.apache.logging.log4j.LogManager

val clientLogger = LogManager.getFormatterLogger("UranusTech Client")!!

object UranusTechClient : ClientModInitializer {
    override fun onInitializeClient() {
//        RendererAccess.INSTANCE.registerRenderer(UTRenderer)
        registerColors()
        initModels()
    }

    fun registerColors() {
        // Item Colors
        ColorProviderRegistry.ITEM.register(ItemColorProvider { item, tintIndex ->
            if (tintIndex == 0) {
                if (item.item is FormItem) {
                    val formItem = item.item as FormItem
                    if (formItem.stack.material is JsonMaterial && formItem.stack.material.getInfo<ToolInfo?>(Constants.TOOL_INFO) == null) {
                        (formItem.stack.material as JsonMaterial).colorSolid
                    } else formItem.stack.material.color
                } else if (item.item is UTToolItem) {
                    val toolItem = item.item as UTToolItem
                    when {
                        toolItem.tool?.hasHandleMaterial() == false -> toolItem.stack.material.color
                        toolItem.tool?.handleForm?.equals(Forms.STICK) == true -> toolItem.stack.material.getInfo<ToolInfo>(Constants.TOOL_INFO)?.handleMaterial?.color
                                ?: -1
                        else -> toolItem.stack.material.color
                    }
                } else -1
            } else if (tintIndex == 2 && item.item is UTToolItem) {
                val toolItem = item.item as UTToolItem
                when {
                    toolItem.tool?.hasHandleMaterial() == false -> -1
                    toolItem.tool?.handleForm?.equals(Forms.STICK) == true -> toolItem.stack.material.color
                    else -> toolItem.handleStack?.material?.color ?: -1
                }
            } else -1
        }, *(formMaterialMap.values.flatMap { it.values } + toolMaterialMap.values.flatMap { it.values }).toTypedArray())

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
