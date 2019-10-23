package com.projecturanus.uranustech.api.material.compound;

import com.projecturanus.uranustech.api.material.element.Element;
import com.projecturanus.uranustech.api.material.element.ElementComparator;
import it.unimi.dsi.fastutil.objects.Object2IntRBTreeMap;

import java.util.Map;
import java.util.SortedMap;

public class Compound {
    private SortedMap<Element, Integer> composition = new Object2IntRBTreeMap<>(new ElementComparator());

    public void addComponent(Element element, int amount) {
        getComposition().put(element, amount);
    }

    public Map<Element, Integer> getComposition() {
        return composition;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        composition.forEach((element, amount) -> {
            builder.append(element).append(amount);
        });
        return builder.toString();
    }
}
