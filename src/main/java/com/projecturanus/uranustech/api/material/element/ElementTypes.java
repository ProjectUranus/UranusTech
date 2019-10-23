package com.projecturanus.uranustech.api.material.element;

public class ElementTypes implements ElementType {
    public static final MetalType METAL = new MetalType();
    public static final MetalType ALKALI_METAL = new MetalType();
    public static final MetalType ALKALI_EARTH_METAL = new MetalType();
    public static final MetalType LANTHANIDE = new MetalType();
    public static final MetalType ACTINIDE = new MetalType();
    public static final MetalType TRANSITION_METAL = new MetalType();
    public static final MetalType POST_TRANSITION_METAL = new MetalType();
    public static final ElementTypes METALLOID = new ElementTypes();
    public static final ElementTypes NONMETAL = new ElementTypes();
    public static final ElementTypes NOBLE_GAS = new ElementTypes();
    public static final ElementTypes UNKNOWN = new ElementTypes();

    @Override
    public String getIconSet() {
        return "";
    }

    public static class MetalType extends ElementTypes {}
}
