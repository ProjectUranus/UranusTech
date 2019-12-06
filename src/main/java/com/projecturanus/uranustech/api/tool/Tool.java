package com.projecturanus.uranustech.api.tool;

import com.projecturanus.uranustech.api.material.form.Form;
import net.minecraft.block.BlockState;

public interface Tool extends Form {
    boolean hasHandleMaterial();

    boolean isEffectiveOn(BlockState state);

    default Form getHandleForm() {
        return null;
    }
}
