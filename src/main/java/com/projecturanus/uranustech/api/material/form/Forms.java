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

    // Material form generation
    PIPE, WIRE(-8), FOIL(-4), LENS(0.75), ARMOR, DUST_IMPURE, DENSEPLATE(2),
    DUST,
    INGOT_HOT, INGOT, INGOT_DOUBLE, INGOT_QUADRUPLE, INGOT_QUINTUPLE, INGOT_TRIPLE,
    PLATE, PLATE_GEM, PLATE_TINY, PLATE_GEM_TINY, PLATE_QUADRUPLE, PLATE_QUINTUPLE, PLATE_TRIPLE, PLATE_DOUBLE, PLATE_CURVED, PLATE_DENSE,
    ROUND(-9), RING(-4), BOLT(-8), ROTOR(4.25), CART_WHEELS, SCREW(-9),
    NUGGET(-9), STICK(-2),
    TOOL_HEAD_ARROW, TOOL_HEAD_AXE, TOOL_HEAD_AXE_DOUBLE, TOOL_HEAD_BUZZ_SAW, TOOL_HEAD_CHAINSAW, TOOL_HEAD_CHISEL, TOOL_HEAD_CONSTRUCTION_PICKAXE,
    TOOL_HEAD_DRILL, TOOL_HEAD_FILE, TOOL_HEAD_HAMMER, TOOL_HEAD_HOE, TOOL_HEAD_PICKAXE, TOOL_HEAD_PLOW, TOOL_HEAD_SAW, TOOL_HEAD_SCREWDRIVER,
    TOOL_HEAD_SENSE, TOOL_HEAD_SHOVEL, TOOL_HEAD_SPADE, TOOL_HEAD_SWORD, TOOL_HEAD_UNIVERSAL_SPADE, TOOL_HEAD_WRENCH;

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
    public String getName() {
        return name;
    }

    public double getAmountMultiplier() {
        return massMultiplier;
    }
}
