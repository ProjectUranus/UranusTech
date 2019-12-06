package com.projecturanus.uranustech.api.tool;

import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.api.material.form.Forms;
import com.projecturanus.uranustech.api.material.generate.GenerateType;
import com.projecturanus.uranustech.api.material.generate.GenerateTypes;
import net.minecraft.block.BlockState;

import java.util.function.Predicate;

public enum Tools implements Tool {
    HAMMER(6, true, Forms.STICK), FILE(2, true), SWORD(2, true),
    SAW(6, true), SCREWDRIVER(2, true),
    CHISEL(2, true), WRENCH(6),
    ARROW, AXE(3, true), AXE_DOUBLE(6, true), BUZZ_SAW, CHAINSAW, CONSTRUCTION_PICKAXE,
    DRILL, HOE(2, true), PICKAXE(3, true), PLOW,
    SENSE, SHOVEL(1, true), SPADE, UNIVERSAL_SPADE;

    private double amountMultiplier;
    private boolean hasHandleMaterial = false;
    private Form handleForm;
    private Predicate<BlockState> effectivePredicate;

    Tools() {
        this.amountMultiplier = 1;
    }

    Tools(double amountMultiplier) {
        this.amountMultiplier = amountMultiplier;
    }

    Tools(double amountMultiplier, boolean hasHandleMaterial) {
        this.amountMultiplier = amountMultiplier;
        this.hasHandleMaterial = hasHandleMaterial;
    }

    Tools(double amountMultiplier, boolean hasHandleMaterial, Form handleForm) {
        this.amountMultiplier = amountMultiplier;
        this.hasHandleMaterial = hasHandleMaterial;
        this.handleForm = handleForm;
    }

    @Override
    public Form getHandleForm() {
        return handleForm;
    }

    @Override
    public String asString() {
        return name().toLowerCase();
    }

    @Override
    public double getAmountMultiplier() {
        return amountMultiplier;
    }

    @Override
    public GenerateType getGenerateType() {
        return GenerateTypes.TOOL;
    }

    @Override
    public boolean hasHandleMaterial() {
        return hasHandleMaterial;
    }

    @Override
    public boolean isEffectiveOn(BlockState state) {
        return effectivePredicate.test(state);
    }
}
