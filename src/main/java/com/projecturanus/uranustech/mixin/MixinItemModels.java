package com.projecturanus.uranustech.mixin;

import com.projecturanus.uranustech.api.render.ItemModelMapper;
import com.projecturanus.uranustech.api.render.RenderManager;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemModels.class)
public class MixinItemModels {
    @Shadow @Final private BakedModelManager modelManager;

    @Inject(method = "getModel(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/render/model/BakedModel;", at = @At("HEAD"), cancellable = true)
    public void onGetModel(ItemStack stack, CallbackInfoReturnable<BakedModel> bakedModelCallbackInfoReturnable) {
        ItemModelMapper mapper = RenderManager.ITEM_MODEL_MAPPERS.get(stack.getItem());
        BakedModel model = null;
        if (mapper != null) {
            if (mapper.getBakedModel() != null)
                model = mapper.getBakedModel();
            else if (mapper.getModelId(stack) != null)
                model = modelManager.getModel(mapper.getModelId(stack));
        }
        if (model != null) {
            bakedModelCallbackInfoReturnable.setReturnValue(model);
        }
    }
}
