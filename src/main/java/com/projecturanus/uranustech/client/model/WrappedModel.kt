package com.projecturanus.uranustech.client.model

import net.fabricmc.fabric.api.renderer.v1.model.ForwardingBakedModel
import net.minecraft.client.render.model.UnbakedModel
import net.minecraft.item.ItemStack

class WrappedModel(val mapper: (ItemStack) -> UnbakedModel) : ForwardingBakedModel()
