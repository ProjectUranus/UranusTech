package com.projecturanus.uranustech.common.container

import net.minecraft.container.Slot
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack

open class UnmodifiableSlot(inventory: Inventory, index: Int, x: Int, y: Int): Slot(inventory, index, x, y) {
    override fun canInsert(itemStack: ItemStack?): Boolean {
        return false
    }

    override fun canTakeItems(playerEntity: PlayerEntity?): Boolean {
        return false
    }
}

class SingletonSlot(inventory: Inventory, index: Int, x: Int, y: Int): UnmodifiableSlot(inventory, index, x, y) {
    override fun getMaxStackAmount(): Int {
        return 1
    }
}
