package dev.lasm.uranustech.api.recipe

import net.minecraft.world.item.crafting.Recipe

interface UTRecipe : Recipe<UTRecipeInput> {
    override fun canCraftInDimensions(width: Int, height: Int): Boolean = true

}