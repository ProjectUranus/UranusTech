package com.projecturanus.uranustech.api.material;

import com.projecturanus.uranustech.common.material.MaterialAPIImpl;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.Function;

public interface MaterialAPI {
    MaterialAPI INSTANCE = MaterialAPIImpl.INSTANCE;

    /**
     * Custom mapping step before the registry is built.
     * @param mapper the mapper, if returns null the material will not be mapped
     * @throws NullPointerException if the mapper is null
     */
    void addJsonMaterialMapper(Function<Material, Material> mapper);

    @Nullable
    default BlockState getMaterialBlock(MaterialStack materialStack) {
        return null;
    }

    @Nonnull
    default ItemStack getMaterialItem(MaterialStack materialStack) {
        return ItemStack.EMPTY;
    }
}
