package com.projecturanus.uranustech.api.material.info;

import com.projecturanus.uranustech.api.material.Constants;
import net.minecraft.util.Identifier;

public class StateInfo implements MaterialInfo {
    public int meltingPoint, boilingPoint, plasmaPoint;

    @Override
    public Identifier getIdentifier() {
        return Constants.STATE_INFO;
    }
}
