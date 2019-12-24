package com.projecturanus.uranustech.common.compat.rei

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.common.compat.rei.category.ToolAssembleCategory
import me.shedaniel.rei.api.RecipeHelper
import me.shedaniel.rei.api.plugins.REIPluginV0
import net.minecraft.util.Identifier

object UTREIPlugin : REIPluginV0 {
    private val id = Identifier(MODID, "plugin")

    override fun getPluginIdentifier() = id

    override fun registerPluginCategories(recipeHelper: RecipeHelper) {
        recipeHelper.registerCategory(ToolAssembleCategory)
    }
}
