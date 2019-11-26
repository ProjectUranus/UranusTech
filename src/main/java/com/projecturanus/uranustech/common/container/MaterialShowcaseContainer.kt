package com.projecturanus.uranustech.common.container

import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.common.materialRegistry
import com.projecturanus.uranustech.common.random
import com.projecturanus.uranustech.common.util.*
import net.minecraft.container.Container
import net.minecraft.container.Slot
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.BasicInventory
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import net.minecraft.util.Tickable
import java.util.concurrent.atomic.AtomicInteger

class MaterialShowcaseContainer(material: Identifier, val playerInventory: PlayerInventory, syncId: Int) : Container(null, syncId), Tickable {
    val inventory = BasicInventory(4)
    val material = materialRegistry[material]

    init {
        addSlot(SingletonSlot(this.inventory, 0, 26, 35))

        for (j in 0 until 3) {
            addSlot(SingletonSlot(this.inventory, j + 1, 61, 15 + j * 19))
        }

        for (i in 0 until 3) {
            for (j in 0 until 9) {
                addSlot(Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18))
            }
        }

        for (i in 0 until 9) {
            addSlot(Slot(playerInventory, i, 8 + i * 18, 142))
        }

        inventory[0] = this.material.getItem(Forms.INGOT)
    }

    override fun canUse(playerEntity: PlayerEntity): Boolean = true

    var tickCounter = AtomicInteger()

    override fun tick() {
        if (tickCounter.get() == 0) {
            inventory[1] = material.validForms.random()?.let(material::getItem) ?: ItemStack.EMPTY
            inventory[2] = material.validForms.random()?.let(material::getItem) ?: ItemStack.EMPTY
            inventory[3] = material.validForms.random()?.let(material::getItem) ?: ItemStack.EMPTY
            sendContentUpdates()
            tickCounter.set(0)
        } else if (tickCounter.get() == 12) { tickCounter.set(0) }
        tickCounter.getAndIncrement()
    }
}
