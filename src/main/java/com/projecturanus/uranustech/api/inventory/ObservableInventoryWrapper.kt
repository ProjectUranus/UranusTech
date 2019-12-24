package com.projecturanus.uranustech.api.inventory

import io.reactivex.functions.Consumer
import io.reactivex.subjects.PublishSubject
import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack

class ObservableInventoryWrapper(val delegate: Inventory) : ObservableInventory, Inventory by delegate {
    val modifySubject = PublishSubject.create<InventoryModificationContext>()

    override fun subscribeOnModify(listener: Consumer<InventoryModificationContext>) {
        modifySubject.subscribe(listener)
    }

    override fun setInvStack(slot: Int, stack: ItemStack) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeInvStack(slot: Int): ItemStack {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun takeInvStack(slot: Int, amount: Int): ItemStack {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
