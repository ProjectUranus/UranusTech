package dev.lasm.uranustech.api.chemical.material

import net.minecraft.util.StringRepresentable

enum class IconSet : StringRepresentable {
    NONE,
    // Fluids / gases
    FLUID, GAS,
    // Metals
    DULL, SHINY, FINE, METALLIC, MAGNETIC, COPPER,
    // Gems
    GEM_VERTICAL, GEM_HORIZONTAL, DIAMOND, RUBY, EMERALD, OPAL,
    LAPIS, QUARTZ, PRISMARINE, NETHERSTAR,
    // Powders / raw
    POWDER, SHARDS, RAD, REDSTONE,
    // Stone / earth
    STONE, ROUGH, SAND, FLINT, LIGNITE, BRICK, HEX,
    // Organic / misc
    GLASS, RUBBER, WOOD, LEAF, PAPER, FOOD,
    // Shaped
    CUBE, CUBE_SHINY, FIERY, SPACE;

    val sName: String = name.lowercase()

    override fun getSerializedName(): String {
        return sName
    }
}