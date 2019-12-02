package com.projecturanus.uranustech.api.material.form;

import com.projecturanus.uranustech.api.material.generate.GenerateType;
import net.minecraft.util.StringIdentifiable;

public interface Form extends StringIdentifiable {
    @Override
    String asString();

    /**
     * Mass multiplier based on ingots.
     * @return
     */
    double getAmountMultiplier();

    GenerateType getGenerateType();
}
