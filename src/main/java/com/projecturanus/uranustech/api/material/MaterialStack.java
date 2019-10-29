package com.projecturanus.uranustech.api.material;

import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.api.material.info.MatterInfo;

import java.util.Objects;

import static com.projecturanus.uranustech.api.material.Constants.U;

public class MaterialStack implements Cloneable {
    private Material material;
    private Form form;
    private double amount;
    private double temperature;

    public MaterialStack(Material material, double amount) {
        this(material, null, amount);
    }

    public MaterialStack(Material material, Form form) {
        this(material, form, U, -1);
    }

    public MaterialStack(Material material, Form form, double amount) {
        this(material, form, amount, -1);
    }

    public MaterialStack(Material material, Form form, double amount, double temperature) {
        this.material = material;
        this.amount = amount;
        this.form = form;
        this.temperature = temperature;
        if (form != null)
            if (form.getAmountMultiplier() >= 0)
                this.amount *= form.getAmountMultiplier();
            else
                this.amount /= -form.getAmountMultiplier();
    }

    public double getWeight() {
        // Extended Math:
        // 9 Material-Units = 1 Cubic Meter.
        // 1000 g    = 1 kg
        // 1000 cm^3 = 1 dm^3
        // 1000 dm^3 = 1  m^3
        // ( g/cm^3 * aAmount * 1000 * 1000) / (Material-Unit * 9 * 1000)
        // ( g/ m^3 * aAmount              ) / (Material-Unit * 9 * 1000)
        // (kg/ m^3 * aAmount              ) / (Material-Unit * 9       )
        // (kg/ m^3 * aAmount * 0.111111111) /  Material-Unit
        if (getMaterial() != null && getMaterial().<MatterInfo>getInfo(Constants.MATTER_INFO) != null)
            return (getMaterial().<MatterInfo>getInfo(Constants.MATTER_INFO).gramPerCubicCentimeter * 111.111111 * amount) / U;
        return -1;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public MaterialStack clone() {
        return new MaterialStack(material, form, amount, temperature);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MaterialStack)) return false;
        if (((MaterialStack) o).getMaterial() instanceof WildcardMaterial && !((WildcardMaterial) ((MaterialStack) o).getMaterial()).isSubtype(getMaterial())) return false;
        MaterialStack that = (MaterialStack) o;
        return Double.compare(that.getAmount(), getAmount()) == 0 &&
                Double.compare(that.getTemperature(), getTemperature()) == 0 &&
                (((MaterialStack) o).getMaterial() instanceof WildcardMaterial || Objects.equals(getMaterial(), that.getMaterial())) &&
                Objects.equals(getForm(), that.getForm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaterial(), getForm(), getAmount(), getTemperature());
    }
}
