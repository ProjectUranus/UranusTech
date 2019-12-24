package com.projecturanus.uranustech.mixin;

import com.projecturanus.uranustech.api.inventory.InventoryModificationContext;
import com.projecturanus.uranustech.api.inventory.ObservableInventory;
import com.projecturanus.uranustech.common.UTObjectsKt;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.inventory.BasicInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.DoubleInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BasicInventory.class, CraftingInventory.class, CraftingResultInventory.class, DoubleInventory.class, AbstractFurnaceBlockEntity.class})
public abstract class MixinInventory implements ObservableInventory {
    public PublishSubject<InventoryModificationContext> modifySubject = PublishSubject.create();

    @Override
    public void subscribeOnModify(Consumer<InventoryModificationContext> listener) {
        modifySubject.subscribe(listener);
    }

    @Inject(method = "takeInvStack", at = @At("TAIL"))
    public void onTakeInvStack(int slot, int amount, CallbackInfoReturnable<ItemStack> ci) {
        InventoryModificationContext context = new InventoryModificationContext(this, slot, amount, ci.getReturnValue());
        modifySubject.onNext(context);
        UTObjectsKt.getOnModifyInventory().onNext(context);
    }

    @Inject(method = "removeInvStack", at = @At("TAIL"))
    public void onRemoveInvStack(int slot, CallbackInfoReturnable<ItemStack> ci) {
        InventoryModificationContext context = new InventoryModificationContext(this, slot, -ci.getReturnValue().getCount(), ci.getReturnValue());
        modifySubject.onNext(context);
        UTObjectsKt.getOnModifyInventory().onNext(context);
    }

    @Inject(method = "setInvStack", at = @At("TAIL"))
    public void onSetInvStack(int slot, ItemStack stack, CallbackInfo info) {
        InventoryModificationContext context = new InventoryModificationContext(this, slot, stack.getCount(), stack);
        modifySubject.onNext(context);
        UTObjectsKt.getOnModifyInventory().onNext(context);
    }
}
