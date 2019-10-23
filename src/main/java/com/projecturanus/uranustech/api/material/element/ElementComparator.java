package com.projecturanus.uranustech.api.material.element;

import java.util.Comparator;
import java.util.Objects;

public class ElementComparator implements Comparator<Element> {
    @Override
    public int compare(Element o1, Element o2) {
        if (Objects.equals(o1.getElementType(), ElementTypes.METAL))
            return 1;
        else if (Objects.equals(o2.getElementType(), ElementTypes.METAL))
            return -1;
        else if (Objects.equals(o1, Elements.O))
            return -1;
        else if (Objects.equals(o2, Elements.O))
            return 1;
        return 0;
    }
}
