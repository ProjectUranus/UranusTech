package com.projecturanus.uranustech.api.inventory;

import io.reactivex.functions.Consumer;
import net.minecraft.inventory.Inventory;

public interface ObservableInventory extends Inventory {
    void subscribeOnModify(Consumer<InventoryModificationContext> listener);
}
