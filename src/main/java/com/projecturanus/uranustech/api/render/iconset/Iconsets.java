package com.projecturanus.uranustech.api.render.iconset;

public enum Iconsets implements Iconset {
    CUBE,
    CUBE_SHINY,
    DIAMOND,
    DULL,
    EMERALD,
    FIERY,
    FINE,
    FLINT,
    FLUID,
    FOOD,
    GAS,
    GEM_HORIZONTAL,
    GEM_VERTICAL,
    GLASS,
    LAPIS,
    LEAF,
    LIGNITE,
    MAGNETIC,
    METALLIC,
    NETHERSTAR,
    NONE,
    OPAL,
    PAPER,
    PLASMA,
    POWDER,
    PRISMARINE,
    QUARTZ,
    REDSTONE,
    ROUGH,
    RUBBER,
    RUBY,
    SAND,
    SHARDS,
    SHINY,
    SPACE,
    STONE,
    WOOD;

    @Override
    public String getName() {
        return name().toLowerCase();
    }
}
