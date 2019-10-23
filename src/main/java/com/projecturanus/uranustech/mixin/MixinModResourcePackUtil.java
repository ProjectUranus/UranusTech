package com.projecturanus.uranustech.mixin;

import com.projecturanus.uranustech.common.resource.NioResourcePackKt;
import net.fabricmc.fabric.impl.resources.ModResourcePackUtil;
import net.minecraft.resource.ResourcePack;
import net.minecraft.resource.ResourceType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value = ModResourcePackUtil.class, remap = false)
public class MixinModResourcePackUtil {
    @Inject(method = "appendModResourcePacks", at = @At("RETURN"))
    private static void onAppendModResourcePacks(List<ResourcePack> packList, ResourceType type, CallbackInfo ci) {
        packList.addAll(NioResourcePackKt.getCUSTOM_RESOURCE_PACKS());
    }
}
