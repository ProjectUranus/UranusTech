package com.projecturanus.uranustech.api.material.info;

import com.projecturanus.uranustech.api.material.Constants;
import net.minecraft.util.Identifier;

public class MatterInfo implements MaterialInfo {
    public double gramPerCubicCentimeter;

    @Override
    public Identifier getIdentifier() {
        return Constants.MATTER_INFO;
    }
}
