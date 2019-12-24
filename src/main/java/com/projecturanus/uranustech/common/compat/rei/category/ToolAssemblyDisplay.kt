package com.projecturanus.uranustech.common.compat.rei.category

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.tool.Tool
import com.projecturanus.uranustech.api.tool.ToolHeads
import me.shedaniel.rei.api.EntryStack
import me.shedaniel.rei.plugin.crafting.DefaultCraftingDisplay
import net.minecraft.recipe.Recipe
import net.minecraft.util.Identifier
import java.util.*

class ToolAssemblyDisplay(val stack: MaterialStack) : DefaultCraftingDisplay {
    private var input: List<List<EntryStack>>
    private var output: List<EntryStack>

    init {
        assert(stack.form is Tool)
        input = listOf(listOf(EntryStack.create(stack.clone().apply { form = ToolHeads.valueOf("TOOL_HEAD_${stack.form.asString().toUpperCase()}") }.createItemStack()),
                EntryStack.create(stack.clone().apply { form = (form as Tool).handleForm }.createItemStack())))
        output = listOf(EntryStack.create(stack.createItemStack()))
    }

    override fun getOptionalRecipe(): Optional<Recipe<*>> {
        return Optional.empty()
    }

    override fun getRecipeLocation(): Optional<Identifier> {
        return Optional.of(Identifier(MODID, "tool_assemble"))
    }

    override fun getInputEntries(): List<List<EntryStack?>?>? {
        return input
    }

    override fun getOutputEntries(): List<EntryStack?>? {
        return output
    }

    override fun getRequiredEntries(): List<List<EntryStack?>?>? {
        return input
    }

    override fun getWidth(): Int {
        return 2
    }

    override fun getHeight(): Int {
        return 1
    }
}
