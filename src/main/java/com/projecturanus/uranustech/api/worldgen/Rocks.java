package com.projecturanus.uranustech.api.worldgen;

import com.projecturanus.uranustech.UranusTechKt;
import net.minecraft.util.Identifier;
import net.minecraft.util.StringIdentifiable;

public enum Rocks implements Rock, StringIdentifiable {
    ANDESITE, BASALT, BLUESCHIST, DIORITE, GRANITE, GRANITE_BLACK, GRANITE_RED, GREENSCHIST,
    KIMBERLITE, KOMATIITE, LIMESTONE, MARBLE, PRISMARINE_DARK, PRISMARINE_LIGHT, QUARTZITE,
    STONE;

    @Override
    public Identifier getIdentifier() {
        return new Identifier(UranusTechKt.MODID, name().toLowerCase());
    }

    @Override
    public String asString() {
        return name().toLowerCase();
    }
}
