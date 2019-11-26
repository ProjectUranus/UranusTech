package com.projecturanus.uranustech.api.material.info;

import com.projecturanus.uranustech.api.material.Constants;
import net.minecraft.util.Identifier;

public class FuelInfo implements MaterialInfo {
    public int burnTime;

    @Override
    public Identifier getIdentifier() {
        return Constants.FUEL_INFO;
    }
}
