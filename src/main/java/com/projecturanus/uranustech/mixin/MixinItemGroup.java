package com.projecturanus.uranustech.mixin;

import com.projecturanus.uranustech.UranusTechKt;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.TranslatableText;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemGroup.class)
public class MixinItemGroup {
    @Shadow @Final private String id;

    private String localizedTextCache;

    @Inject(method = "getTranslationKey", at = @At("INVOKE"), cancellable = true)
    public void onGetTranslationKey(CallbackInfoReturnable<String> info) {
        if (id.startsWith(UranusTechKt.MODID + ".form.")) {
            if (localizedTextCache == null) localizedTextCache = new TranslatableText("form." + UranusTechKt.MODID + "." + id.split("\\.", 3)[2]).asString();
            info.setReturnValue(localizedTextCache);
        }
    }
}
