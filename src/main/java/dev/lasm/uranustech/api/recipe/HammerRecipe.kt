package dev.lasm.uranustech.api.recipe

import net.minecraft.core.HolderLookup
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.item.crafting.RecipeType
import net.minecraft.world.level.Level

class HammerRecipe : UTRecipe {
    override fun matches(
        input: UTRecipeInput,
        level: Level
    ): Boolean {
        TODO("Not yet implemented")
    }

    override fun assemble(
        input: UTRecipeInput,
        registries: HolderLookup.Provider
    ): ItemStack {
        TODO("Not yet implemented")
    }

    override fun getResultItem(registries: HolderLookup.Provider): ItemStack {
        TODO("Not yet implemented")
    }

    override fun getSerializer(): RecipeSerializer<*> {
        TODO("Not yet implemented")
    }

    override fun getType(): RecipeType<*> {
        TODO("Not yet implemented")
    }
}