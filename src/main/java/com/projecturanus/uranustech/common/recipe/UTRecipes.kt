package com.projecturanus.uranustech.common.recipe

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.WildcardMaterial
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.material.info.ToolInfo
import com.projecturanus.uranustech.api.tool.Tool
import com.projecturanus.uranustech.api.tool.Tools
import com.projecturanus.uranustech.common.item.FormItem
import com.projecturanus.uranustech.common.item.UTToolItem
import com.projecturanus.uranustech.common.toolMaterialMap
import com.projecturanus.uranustech.common.util.asIterable
import com.projecturanus.uranustech.common.util.get
import com.projecturanus.uranustech.common.util.iterator
import com.projecturanus.uranustech.common.util.matStack
import net.minecraft.inventory.CraftingInventory
import net.minecraft.item.ItemStack
import net.minecraft.item.ToolItem
import net.minecraft.recipe.RecipeSerializer
import net.minecraft.recipe.SpecialCraftingRecipe
import net.minecraft.recipe.SpecialRecipeSerializer
import net.minecraft.util.DefaultedList
import net.minecraft.util.Identifier
import net.minecraft.world.World

val toolSerializer = SpecialRecipeSerializer(::ToolRecipe)
val formsSerializer = SpecialRecipeSerializer(::FormsRecipe)

class ToolRecipe(identifier: Identifier): SpecialCraftingRecipe(identifier) {
    override fun craft(inventory: CraftingInventory): ItemStack {
        var toolInfo: ToolInfo? = null
        var handleMaterial: Material? = null
        var toolMaterial: Material? = null
        var tool: Tool? = null
        if (inventory.asIterable().toList().count { !it.isEmpty } != 2)
            return ItemStack.EMPTY
        inventory.iterator().forEach { stack ->
            if (stack.item is FormItem) {
                // Find head material
                val matStack = (stack.item as FormItem).stack
                if (matStack.form != Forms.STICK) {
                    toolInfo = (stack.item as FormItem).stack.material.getInfo(Constants.TOOL_INFO)
                    toolMaterial = matStack.material
                    tool = Tools.valueOf(matStack.form.name.removePrefix("tool_head_").toUpperCase())
                }
                else
                    handleMaterial = matStack.material
            } else if (stack != ItemStack.EMPTY) {
                handleMaterial = stack.matStack?.material
            }
        }
        if (toolInfo?.handleMaterial == handleMaterial || (toolInfo?.handleMaterial is WildcardMaterial && (toolInfo?.handleMaterial as WildcardMaterial).isSubtype(handleMaterial)) && toolMaterial != null && tool != null) {
            return toolMaterialMap[toolMaterial!!]?.get(tool!!)?.let(::ItemStack) ?: ItemStack.EMPTY
        }
        return ItemStack.EMPTY
    }

    override fun fits(x: Int, y: Int) = x * y >= 2

    override fun getSerializer() = toolSerializer

    override fun matches(inventory: CraftingInventory, world: World): Boolean {
        var toolInfo: ToolInfo? = null
        if (inventory.asIterable().toList().count { !it.isEmpty } != 2)
            return false
        inventory.iterator().forEach { stack ->
            if (stack.item is FormItem) {
                if (toolInfo != null) {
                    return toolInfo?.handleMaterial == (stack.item as FormItem).stack.material
                }
                toolInfo = (stack.item as FormItem).stack.material.getInfo(Constants.TOOL_INFO)
                if (toolInfo?.handleMaterial == null)
                    return false
                return true
            }
        }
        return false
    }

    override fun getRemainingStacks(inventory_1: CraftingInventory?): DefaultedList<ItemStack> {
        return super.getRemainingStacks(inventory_1)
    }
}

class FormsRecipe(identifier: Identifier): SpecialCraftingRecipe(identifier) {
    override fun craft(inv: CraftingInventory): ItemStack {
        if (inv[0].item is UTToolItem) {
            val tool = inv[0].item as UTToolItem
            when (tool.tool) {
                Tools.FILE -> {

                }
            }
        }
        return ItemStack.EMPTY
    }

    override fun getRemainingStacks(inventory: CraftingInventory): DefaultedList<ItemStack> {
        val remaining = super.getRemainingStacks(inventory)
        return remaining
    }

    override fun fits(x: Int, y: Int) = x * y > 4

    override fun getSerializer() = formsSerializer

    override fun matches(inv: CraftingInventory, world: World) =
        inv.asIterable().any { it.item is FormItem } && inv.asIterable().any { it.item is ToolItem }
}

fun registerToolRecipes() {
    RecipeSerializer.register("$MODID:crafting_special_tool_assemble", toolSerializer)
    RecipeSerializer.register("$MODID:crafting_special_forms", formsSerializer)
}
