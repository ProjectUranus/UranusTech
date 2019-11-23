package com.projecturanus.uranustech.api.material;

import com.projecturanus.uranustech.api.material.compound.Compound;
import com.projecturanus.uranustech.api.material.element.Element;
import com.projecturanus.uranustech.api.material.form.Form;
import com.projecturanus.uranustech.api.material.info.MaterialInfo;
import com.projecturanus.uranustech.api.registry.RegistryEntry;
import com.projecturanus.uranustech.api.render.Colorable;
import net.minecraft.util.Identifier;

import java.util.*;

public interface Material extends RegistryEntry, Colorable {
    Map<Compound, Integer> getComposition();
    Set<Element> getElements();
    String getChemicalCompound();
    List<Form> getValidForms();
    Collection<MaterialInfo> getInfos();
    void addInfo(MaterialInfo info);
    default boolean isHidden() {
        return false;
    }
    <T extends MaterialInfo> T getInfo(Identifier infoId);
    default <T extends MaterialInfo> T get(Identifier infoId, Class<T> infoClass) {
        return getInfo(infoId);
    }
    default String getTextureSet() {
        return "none";
    }
    default Collection<String> getDescription() {
        return Collections.emptyList();
    }
}
