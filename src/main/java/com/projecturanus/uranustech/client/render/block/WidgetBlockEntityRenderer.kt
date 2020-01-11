package com.projecturanus.uranustech.client.render.block

import net.minecraft.block.Blocks
import net.minecraft.block.entity.BlockEntity
import net.minecraft.client.MinecraftClient
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher
import net.minecraft.client.render.block.entity.BlockEntityRenderer
import net.minecraft.client.util.math.MatrixStack

class WidgetBlockEntityRenderer<T : BlockEntity>(dispatcher: BlockEntityRenderDispatcher) : BlockEntityRenderer<T>(dispatcher) {
    override fun render(blockEntity: T, tickDelta: Float, matrices: MatrixStack, vertexConsumers: VertexConsumerProvider, light: Int, overlay: Int) {
        MinecraftClient.getInstance().blockRenderManager.renderBlock(Blocks.STONE.defaultState, blockEntity.pos, blockEntity.world, matrices, vertexConsumers.getBuffer(RenderLayer.getSolid()), false, blockEntity.world?.random)
    }
}
