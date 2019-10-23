package com.projecturanus.uranustech.api.render;

import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.ItemStack;

@FunctionalInterface
public interface ItemModelMapper {
    default BakedModel getBakedModel() {
        return null;
    }

    ModelIdentifier getModelId(ItemStack stack);
}
