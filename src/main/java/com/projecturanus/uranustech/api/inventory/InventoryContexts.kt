package com.projecturanus.uranustech.api.inventory

import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack

data class InventoryModificationContext(
        val inventory: Inventory,
        val slot: Int,
        val expectedAmount: Int,
        val stack: ItemStack
) {
    override fun toString(): String {
        return "InventoryModificationContext(inventory=$inventory, slot=$slot, expectedAmount=$expectedAmount, stack=$stack)"
    }
}
