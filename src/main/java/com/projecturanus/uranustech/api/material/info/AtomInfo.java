package com.projecturanus.uranustech.api.material.info;

import com.projecturanus.uranustech.api.material.Constants;
import net.minecraft.util.Identifier;

public class AtomInfo implements MaterialInfo {
    public int neutrons, protons, electrons;

    @Override
    public Identifier getIdentifier() {
        return Constants.ATOM_INFO;
    }
}
