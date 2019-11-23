package com.projecturanus.uranustech.client.mask

import net.minecraft.util.StringIdentifiable

enum class MaterialIcons : StringIdentifiable {
    CUBE, CUBE_SHINY, DIAMOND, DULL, EMERALD, FIERY, FINE, FLINT, FLUID, FOOD, GAS, GEM_HORIZONTAL, GEM_VERTICAL, GLASS, LAPIS,
    LEAF, LIGNITE, MAGNETIC, METALLIC, NETHERSTAR, NONE, OPAL, PAPER, PLASMA, PRISMARINE, QUARTZ, REDSTONE, ROUGH, RUBBER, RUBY,
    SAND, SHARDS, SHINY, SPACE, STONE, WOOD,

    POWDER;

    override fun asString() = name.toLowerCase()
    override fun toString() = name.toLowerCase()
}
