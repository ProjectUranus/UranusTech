package com.projecturanus.uranustech.api.material.info;

import com.projecturanus.uranustech.api.material.Constants;
import com.projecturanus.uranustech.api.material.Material;
import com.projecturanus.uranustech.api.material.MaterialAPI;
import com.projecturanus.uranustech.api.material.form.Forms;
import com.projecturanus.uranustech.common.UTBuiltinsKt;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ToolInfo implements MaterialInfo, ToolMaterial {
    /**
     * TODO More Types
     * The Types Tools allowed, 0 = No Tools, 1 = Flint/Stone/Wood Tools, 2 = Early Tools, 3 = Advanced Tools
     */
    public int toolTypes = 0;
    /**
     * The Quality of the Material as Tool Material (ranges from 0 to 15)
     */
    public int toolQuality = 0;
    /**
     * The Durability of the Material in Tool Form
     */
    public long toolDurability = 0;
    /**
     * The Speed of the Material as mining Material
     */
    public float toolSpeed = 1.0F;

    /**
     * Handle material, can be null.
     */
    public Identifier handleMaterialId;

    @Override
    public Identifier getIdentifier() {
        return Constants.TOOL_INFO;
    }

    @Override
    public int getDurability() {
        return (int) toolDurability;
    }

    @Override
    public float getMiningSpeed() {
        return toolSpeed;
    }

    @Override
    public float getAttackDamage() {
        return toolQuality;
    }

    @Override
    public int getMiningLevel() {
        return toolTypes;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    public Material getHandleMaterial() {
        return MaterialAPI.INSTANCE.getMaterialRegistry().get(handleMaterialId);
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Optional.ofNullable(UTBuiltinsKt.getFormMaterialMap().get(getHandleMaterial())).map(formMap -> formMap.get(Forms.INGOT)).map(Ingredient::ofItems).orElse(Ingredient.EMPTY);
    }
}
