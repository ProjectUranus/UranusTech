package com.projecturanus.uranustech.api.recipe

import net.minecraft.item.ItemStack
import net.minecraft.recipe.AbstractCookingRecipe
import net.minecraft.recipe.CookingRecipeSerializer
import net.minecraft.recipe.Ingredient
import net.minecraft.util.Identifier

class CokeOvenRecipe(id: Identifier, group: String, input: Ingredient, output: ItemStack, experience: Float, cookTime: Int) : AbstractCookingRecipe(
        COKE_OVEN_RECIPE,
        id,
        group,
        input,
        output,
        experience,
        cookTime
) {
    override fun getSerializer(): CokeOvenRecipeSerializer = CokeOvenRecipeSerializer
}

object CokeOvenRecipeSerializer : CookingRecipeSerializer<CokeOvenRecipe>(::CokeOvenRecipe, 100) {

}
