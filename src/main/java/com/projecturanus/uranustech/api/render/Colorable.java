package com.projecturanus.uranustech.api.render;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ExtendedBlockView;

public interface Colorable {
    int getColor();

    default int getItemColor(ItemStack itemStack, int tintIndex) {
        return tintIndex == 0 ? getColor() : -1;
    }

    default int getBlockColor(BlockState blockState, ExtendedBlockView blockView, BlockPos pos, int tintIndex) {
        return tintIndex == 0 ? getColor() : -1;
    }
}
