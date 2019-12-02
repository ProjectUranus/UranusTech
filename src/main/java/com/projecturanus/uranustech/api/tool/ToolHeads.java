package com.projecturanus.uranustech.api.tool;

import com.projecturanus.uranustech.api.material.generate.GenerateType;
import com.projecturanus.uranustech.api.material.generate.GenerateTypes;

public enum ToolHeads implements ToolHead {
    TOOL_HEAD_ARROW, TOOL_HEAD_AXE, TOOL_HEAD_AXE_DOUBLE, TOOL_HEAD_BUZZ_SAW, TOOL_HEAD_CHAINSAW, TOOL_HEAD_CHISEL, TOOL_HEAD_CONSTRUCTION_PICKAXE,
    TOOL_HEAD_DRILL, TOOL_HEAD_FILE, TOOL_HEAD_HAMMER, TOOL_HEAD_HOE, TOOL_HEAD_PICKAXE, TOOL_HEAD_PLOW, TOOL_HEAD_SAW, TOOL_HEAD_SCREWDRIVER,
    TOOL_HEAD_SENSE, TOOL_HEAD_SHOVEL, TOOL_HEAD_SPADE, TOOL_HEAD_SWORD, TOOL_HEAD_UNIVERSAL_SPADE, TOOL_HEAD_WRENCH;
    private double massMultiplier = 1;
    private String name = name().toLowerCase();
    private Tool tool;

    ToolHeads() {
        this.tool = Tools.valueOf(name().replaceFirst("TOOL_HEAD_", ""));
        this.massMultiplier = this.tool.getAmountMultiplier();
    }

    ToolHeads(Tool tool) {
        this.tool = tool;
        this.massMultiplier = this.tool.getAmountMultiplier();
    }

    ToolHeads(String name) {
        this.name = name;
    }

    ToolHeads(Tool tool, double massMultiplier) {
        this.tool = tool;
        this.massMultiplier = massMultiplier;
    }

    @Override
    public GenerateType getGenerateType() {
        return GenerateTypes.ITEM;
    }

    @Override
    public String asString() {
        return name;
    }

    public double getAmountMultiplier() {
        return massMultiplier;
    }

    @Override
    public Tool getTool() {
        return tool;
    }
}
