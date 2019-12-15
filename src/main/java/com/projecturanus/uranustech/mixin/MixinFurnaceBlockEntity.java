package com.projecturanus.uranustech.mixin;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Tickable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.SoftOverride;

@Mixin(AbstractFurnaceBlockEntity.class)
public abstract class MixinFurnaceBlockEntity implements Tickable {
    @Shadow
    protected DefaultedList<ItemStack> inventory;

    public boolean changed = true;
    public Recipe<?> recipe;

    @SoftOverride
    @Overwrite
    public ItemStack getInvStack(int slot) {
        return this.inventory.get(slot);
    }

    @SoftOverride
    @Overwrite
    public ItemStack takeInvStack(int slot, int amount) {
        return Inventories.splitStack(this.inventory, slot, amount);
    }

    @SoftOverride
    @Overwrite
    public ItemStack removeInvStack(int slot) {
        return Inventories.removeStack(this.inventory, slot);
    }
}
