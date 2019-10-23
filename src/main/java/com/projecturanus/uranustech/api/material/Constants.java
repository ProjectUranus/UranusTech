package com.projecturanus.uranustech.api.material;

import net.minecraft.util.Identifier;

import static com.projecturanus.uranustech.UranusTechKt.MODID;

public interface Constants {
    /**
     * Kelvin to Celsius
     */
    int CELSIUS = 273;

    /**
     * From GregTech 6:
     *
     * Renamed from "MATERIAL_UNIT" to just "U"
     *
     * This is worth exactly one normal Item.
     * This Constant can be divided by many commonly used Numbers such as
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 18, 20, 21, 22, 24, 25, ... 64, 81, 96, 144 or 1000
     * without loosing precision and is for that reason used as Unit of Amount.
     * But it is also small enough to be multiplied with larger Numbers.
     *
     * This is used to determine the amount of Material contained inside a prefixed Ore.
     * For example Nugget = U / 9 as it contains out of 1/9th of an Ingot.
     */
    long U = 648648000, U2 = U/2, U3 = U/3, U4 = U/4, U5 = U/5, U6 = U/6, U7 = U/7, U8 = U/8, U9 = U/9, U10 = U/10, U11 = U/11, U12 = U/12, U13 = U/13, U14 = U/14, U15 = U/15, U16 = U/16, U17 = U/17, U18 = U/18, U20 = U/20, U24 = U/24, U25 = U/25, U32 = U/32, U36 = U/36, U40 = U/40, U48 = U/48, U50 = U/50, U64 = U/64, U72 = U/72, U80 = U/80, U96 = U/96, U100 = U/100, U128 = U/128, U144 = U/144, U192 = U/192, U200 = U/200, U240 = U/240, U256 = U/256, U288 = U/288, U480 = U/480, U500 = U/500, U512 = U/512, U1000 = U/1000, U1440 = U/1440;

    Identifier TOOL_INFO = new Identifier(MODID, "tool");
    Identifier ORE_INFO = new Identifier(MODID, "ore");
    Identifier STATE_INFO = new Identifier(MODID, "state");
    Identifier ATOM_INFO = new Identifier(MODID, "atom");
    Identifier MATTER_INFO = new Identifier(MODID, "matter");
}
