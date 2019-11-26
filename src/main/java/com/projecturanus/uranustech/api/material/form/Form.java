package com.projecturanus.uranustech.api.material.form;

import com.projecturanus.uranustech.api.material.generate.GenerateType;

public interface Form {
    String getName();

    /**
     * Mass multiplier based on ingots.
     * @return
     */
    double getAmountMultiplier();

    GenerateType getGenerateType();
}
