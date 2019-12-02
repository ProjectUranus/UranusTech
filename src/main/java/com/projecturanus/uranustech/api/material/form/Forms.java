package com.projecturanus.uranustech.api.material.form;

import com.projecturanus.uranustech.api.material.generate.GenerateType;
import com.projecturanus.uranustech.api.material.generate.GenerateTypes;

public enum Forms implements Form {
    GEM,
    ORE(2, GenerateTypes.BLOCK),
    // Rock generation
    STONE(GenerateTypes.BLOCK),
    SMALL_BRICKS(GenerateTypes.BLOCK), SMALL_TILES(GenerateTypes.BLOCK), SMOOTH(GenerateTypes.BLOCK),
    BRICKS(GenerateTypes.BLOCK), BRICKS_CHISELED(GenerateTypes.BLOCK), BRICKS_CRACKED(GenerateTypes.BLOCK), BRICKS_MOSSY(GenerateTypes.BLOCK), BRICKS_REDSTONE(GenerateTypes.BLOCK), BRICKS_REINFORCED(GenerateTypes.BLOCK),
    COBBLE(GenerateTypes.BLOCK), COBBLE_MOSSY(GenerateTypes.BLOCK), SQUARE_BRICKS(GenerateTypes.BLOCK), TILES(GenerateTypes.BLOCK), WINDMILL_TILES_A(GenerateTypes.BLOCK), WINDMILL_TILES_B(GenerateTypes.BLOCK),
    LOG(2, GenerateTypes.BLOCK), PLANK(GenerateTypes.BLOCK),

    // Material form generation
    PIPE, WIRE_FINE(-8), FOIL(-4), LENS(0.75), ARMOR, DUST_IMPURE, SPRING,
    DUST,
    INGOT_HOT, INGOT, INGOT_DOUBLE(2), INGOT_TRIPLE(3), INGOT_QUADRUPLE(4), INGOT_QUINTUPLE(5),

    PLATE, PLATE_GEM, PLATE_TINY(-4), PLATE_DOUBLE(2), PLATE_GEM_TINY(-4), PLATE_TRIPLE(3),
    PLATE_QUADRUPLE(4), PLATE_QUINTUPLE(5), PLATE_CURVED, PLATE_DENSE(9),

    ROUND(-9), RING(-4), BOLT(-8), ROTOR(4.25), CART_WHEELS, SCREW(-9),
    NUGGET(-9), STICK(-2), SCRAP_GT(-9),
    OTHER(GenerateTypes.OTHER);

    private double massMultiplier = 1;
    private String name = name().toLowerCase();
    private GenerateType generateType = GenerateTypes.ITEM;

    Forms() {
    }

    Forms(String name) {
        this.name = name;
    }

    Forms(double massMultiplier) {
        this.massMultiplier = massMultiplier;
    }

    Forms(GenerateType generateType) {
        this.generateType = generateType;
    }

    Forms(double massMultiplier, GenerateType generateType) {
        this.massMultiplier = massMultiplier;
        this.generateType = generateType;
    }

    @Override
    public GenerateType getGenerateType() {
        return generateType;
    }

    @Override
    public String asString() {
        return name;
    }

    public double getAmountMultiplier() {
        return massMultiplier;
    }
}
