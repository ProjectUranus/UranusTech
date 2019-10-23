package com.projecturanus.uranustech.api.tool;

import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.api.material.form.Forms;
import com.projecturanus.uranustech.api.material.generate.GenerateType;
import com.projecturanus.uranustech.api.material.generate.GenerateTypes;

public enum Tools implements Tool {
    HAMMER(6, true, Forms.STICK), FILE(2, true), SWORD(2, true),
    SAW(6, true), SCREWDRIVER(2, true),
    CHISEL(2, true), WRENCH(6);

    private double amountMultiplier;
    private boolean hasHandleMaterial = false;
    private Form handleForm;

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
    public String getName() {
        return name().toLowerCase();
    }

    @Override
    public double getAmountMultiplier() {
        return amountMultiplier;
    }

    @Override
    public GenerateType getGenerateType() {
        return GenerateTypes.ITEM;
    }

    @Override
    public boolean hasHandleMaterial() {
        return hasHandleMaterial;
    }
}
