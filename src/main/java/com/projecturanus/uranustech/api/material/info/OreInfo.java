package com.projecturanus.uranustech.api.material.info;

import com.projecturanus.uranustech.api.material.Constants;
import net.minecraft.util.Identifier;

public class OreInfo implements MaterialInfo {
    public int oreProgressingMultiplier, oreMultiplier;

    @Override
    public Identifier getIdentifier() {
        return Constants.ORE_INFO;
    }
}
