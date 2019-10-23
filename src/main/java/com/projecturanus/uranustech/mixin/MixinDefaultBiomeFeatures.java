package com.projecturanus.uranustech.mixin;

import com.projecturanus.uranustech.common.UTBuiltinsKt;
import com.projecturanus.uranustech.common.block.MaterialBlock;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DefaultBiomeFeatures.class)
public class MixinDefaultBiomeFeatures {
    @Inject(method = "addMineables", at = @At("HEAD"))
    private static void onAddMineables(Biome biome, CallbackInfo ci) {
        for (MaterialBlock block : UTBuiltinsKt.getRockMap().values()) {
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, block.getDefaultState(), 40),  Decorator.COUNT_RANGE, new RangeDecoratorConfig(10, 0, 0, 80)));
        }
    }
}
