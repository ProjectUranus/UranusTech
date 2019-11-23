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
import com.projecturanus.uranustech.common.material.TOOL_FORMS
import com.projecturanus.uranustech.common.toolMaterialMap
import com.projecturanus.uranustech.common.util.*
import net.minecraft.inventory.CraftingInventory
import net.minecraft.item.ItemStack
import net.minecraft.recipe.Ingredient
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
                if (matStack.form in TOOL_FORMS) {
                    toolInfo = (stack.item as FormItem).stack.material.getInfo(Constants.TOOL_INFO)
                    toolMaterial = matStack.material
                    tool = Tools.valueOf(matStack.form.name.removePrefix("tool_head_").toUpperCase())
                }
                else if (matStack.form == Forms.STICK)
                    handleMaterial = matStack.material
            } else if (stack != ItemStack.EMPTY) {
                handleMaterial = stack.matStack?.material
            }
        }
        if (toolInfo?.handleMaterial == handleMaterial || (toolInfo?.handleMaterial is WildcardMaterial && (toolInfo?.handleMaterial as WildcardMaterial).isSubtype(handleMaterial)) && toolMaterial != null && tool != null) {
            return toolMaterialMap[toolMaterial]?.get(tool)?.let(::ItemStack) ?: ItemStack.EMPTY
        }
        return ItemStack.EMPTY
    }

    override fun fits(x: Int, y: Int) = x * y >= 2

    override fun getSerializer() = toolSerializer

    override fun matches(inventory: CraftingInventory, world: World): Boolean {
        /*
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
        */
        return craft(inventory) != ItemStack.EMPTY
    }
}

class FormsRecipe(identifier: Identifier): SpecialCraftingRecipe(identifier) {
    override fun craft(inv: CraftingInventory): ItemStack {
        if (inv.getOffsetStack(0, 0).item is UTToolItem) {
            val tool = inv.getOffsetStack(0, 0).item as UTToolItem
            when (tool.tool) {
                Tools.FILE -> {
                    // Screw
                    if (inv.getOffsetStack(1, 0).hasMaterialData() && inv.getOffsetStack(0, 1).hasMaterialData()) {
                        val matStack1 = inv.getOffsetStack(1, 0).matStack!!
                        val matStack2 = inv.getOffsetStack(0, 1).matStack!!
                        if (matStack1 == matStack2 && matStack1.form == Forms.BOLT) {
                            return matStack1.clone().apply { form = Forms.SCREW }.createItemStack()
                        }
                    }

                    // Stick
                    if (!inv.getOffsetStack(1, 1).hasMaterialData()) return ItemStack.EMPTY
                    val matStack = inv.getOffsetStack(1, 1).matStack!!
                    when (matStack.form) {
                        Forms.INGOT -> return matStack.clone().apply { form = Forms.STICK }.createItemStack()
                    }
                }
                Tools.HAMMER -> {
                    if (inv.getOffsetStack(0, 1).hasMaterialData() && inv.getOffsetStack(0, 2).hasMaterialData()) {
                        val matStack1 = inv.getOffsetStack(0, 1).matStack!!
                        val matStack2 = inv.getOffsetStack(0, 2).matStack!!
                        if (matStack1 == matStack2) {
                            return matStack1.clone().apply { form = when (matStack1.form) {
                                Forms.INGOT -> Forms.INGOT_DOUBLE
                                Forms.GEM -> Forms.PLATE_GEM
                                Forms.INGOT_DOUBLE -> Forms.INGOT_QUADRUPLE
                                Forms.PLATE -> Forms.PLATE_DOUBLE
                                else -> null
                            } }.createItemStack()
                        }
                    }

                    // Plate
                    if (inv.getOffsetStack(0, 1).hasMaterialData()) {
                        val matStack = inv.getOffsetStack(0, 1).matStack!!
                        return matStack.clone().apply { form = when (matStack.form) {
                            Forms.INGOT_DOUBLE -> Forms.PLATE
                            Forms.INGOT_QUADRUPLE -> Forms.PLATE_DOUBLE
                            else -> null
                        } }.createItemStack()
                    }
                }
            }
        }
        return ItemStack.EMPTY
    }

    override fun getRemainingStacks(inv: CraftingInventory): DefaultedList<ItemStack> {
        val list = DefaultedList.ofSize(inv.invSize, ItemStack.EMPTY)
        if (inv.getOffsetStack(0, 0).item is UTToolItem) {
            val tool = inv.getOffsetStack(0, 0).item as UTToolItem
            return list.also { it[inv.offset.first + inv.offset.second * inv.height] = inv.getOffsetStack(0, 0).copy().apply { damage++ } }
        }
        return list
    }

    override fun fits(x: Int, y: Int) = (x == 2 && y == 2) || (x == 9 && y == 9)

    override fun getSerializer() = formsSerializer

    override fun matches(inv: CraftingInventory, world: World) =
        craft(inv) != ItemStack.EMPTY

    override fun getPreviewInputs(): DefaultedList<Ingredient> {
        return super.getPreviewInputs()
    }
}

fun registerToolRecipes() {
    RecipeSerializer.register("$MODID:crafting_special_tool_assemble", toolSerializer)
    RecipeSerializer.register("$MODID:crafting_special_forms", formsSerializer)
}
