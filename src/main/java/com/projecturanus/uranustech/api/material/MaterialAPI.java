package com.projecturanus.uranustech.api.material;

import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.common.material.MaterialAPIImpl;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.MutableRegistry;

import java.util.function.Function;

public interface MaterialAPI {
    MaterialAPI INSTANCE = MaterialAPIImpl.INSTANCE;

    MutableRegistry<Material> getMaterialRegistry();

    MutableRegistry<Form> getFormRegistry();

    /**
     * Custom mapping step before the registry is built.
     * @param mapper the mapper, if returns null the material will not be mapped
     * @throws NullPointerException if the mapper is null
     */
    void addJsonMaterialMapper(Function<Material, Material> mapper);

    default BlockState getMaterialBlock(MaterialStack materialStack) {
        return null;
    }

    default ItemStack getMaterialItem(MaterialStack materialStack) {
        return ItemStack.EMPTY;
    }
}
