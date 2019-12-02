package com.projecturanus.uranustech.api.material;

import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.api.material.info.MatterInfo;
import com.projecturanus.uranustech.api.material.info.StateInfo;
import com.projecturanus.uranustech.common.util.UTExtensionsKt;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Nameable;

import java.util.Objects;

import static com.projecturanus.uranustech.api.material.Constants.STATE_INFO;
import static com.projecturanus.uranustech.api.material.Constants.U;

public class MaterialStack implements Cloneable, Nameable {
    private Material material;
    private Form form;
    private long amount;
    private double temperature;
    private Text customName;

    public MaterialStack(Material material, long amount) {
        this(material, null, amount);
    }

    public MaterialStack(Material material, Form form) {
        this(material, form, U, -1);
    }

    public MaterialStack(Material material, Form form, long amount) {
        this(material, form, amount, -1);
    }

    public MaterialStack(Material material, Form form, long amount, double temperature) {
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

    @Override
    public Text getName() {
        Material material = getMaterial();
        StateInfo stateInfo = material.getInfo(STATE_INFO) == null ? new StateInfo() : material.getInfo(STATE_INFO);
        TranslatableText defaultText = new TranslatableText("material.uranustech.stack",
                UTExtensionsKt.getLocalizedName(material),
                String.format("%.3f", (double) amount / U),
                stateInfo.meltingPoint,
                stateInfo.boilingPoint,
                getWeight() < 0 ? "?.???" : String.format("%.3f", getWeight()));
        return hasCustomName() ? getCustomName() : defaultText;
    }

    @Override
    public Text getCustomName() {
        return customName;
    }

    public void setCustomName(Text customName) {
        this.customName = customName;
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

    public ItemStack createItemStack() {
        return MaterialAPI.INSTANCE.getMaterialItem(this);
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

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
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

    /**
     * Modify int numbers based on amount
     */
    public int modify(int x) {
        if (getAmount() == U) return x;
        if (getAmount() > U) {
            return (int) (x * (getAmount() / U));
        } else {
            return (int) (x / (U / getAmount()));
        }
    }

    /**
     * Modify long numbers based on amount
     */
    public long modify(long x) {
        if (getAmount() == U) return x;
        if (getAmount() > U) {
            return x * (getAmount() / U);
        } else {
            return x / (U / getAmount());
        }
    }
}
