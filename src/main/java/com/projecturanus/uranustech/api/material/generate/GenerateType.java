package com.projecturanus.uranustech.api.material.generate;

import com.projecturanus.uranustech.api.material.MaterialStack;
import com.projecturanus.uranustech.common.material.MaterialContainer;

import java.util.function.Function;

public interface GenerateType {
    Function<MaterialStack, MaterialContainer> build();
}
