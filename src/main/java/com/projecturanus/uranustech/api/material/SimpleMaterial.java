package com.projecturanus.uranustech.api.material;

import com.projecturanus.uranustech.api.material.compound.Compound;
import com.projecturanus.uranustech.api.material.element.Element;
import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.api.material.info.MaterialInfo;
import it.unimi.dsi.fastutil.objects.Object2IntRBTreeMap;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.SimpleRegistry;

import java.util.*;
import java.util.stream.Collectors;

public class SimpleMaterial implements Material {
    private boolean hidden = false;
    private Identifier identifier;
    private Map<Compound, Integer> composition = new Object2IntRBTreeMap<>();
    private List<Form> validForms = new ArrayList<>();
    private int color;
    private SimpleRegistry<MaterialInfo> infos = new SimpleRegistry<>();

    @Override
    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    @Override
    public Map<Compound, Integer> getComposition() {
        return composition;
    }

    @Override
    public Set<Element> getElements() {
        return composition.keySet().stream().flatMap(compound -> compound.getComposition().keySet().stream()).collect(Collectors.toSet());
    }

    @Override
    public String getChemicalCompound() {
        StringBuilder builder = new StringBuilder();
        composition.forEach((compound, amount) -> {
            if (amount <= 1) builder.append(compound);
            else builder.append('(').append(compound).append(')').append(amount);
        });
        return builder.toString();
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public Identifier getIdentifier() {
        return identifier;
    }

    @Override
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleMaterial)) return false;
        SimpleMaterial that = (SimpleMaterial) o;
        return Objects.equals(getIdentifier(), that.getIdentifier());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getIdentifier());
    }

    @Override
    public List<Form> getValidForms() {
        return validForms;
    }

    @Override
    public Collection<MaterialInfo> getInfos() {
        return infos.stream().collect(Collectors.toList());
    }

    @Override
    public void addInfo(MaterialInfo info) {
        infos.add(info.getIdentifier(), info);
    }

    @Override
    public <T extends MaterialInfo> T getInfo(Identifier infoId) {
        return (T) infos.get(infoId);
    }
}
