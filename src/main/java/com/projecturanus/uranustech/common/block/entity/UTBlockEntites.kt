package com.projecturanus.uranustech.common.block.entity

import com.mojang.datafixers.types.constant.NamespacedStringType
import com.projecturanus.uranustech.common.block.structure.CokeOvenControllerBlock
import net.minecraft.block.entity.BlockEntityType
import java.util.function.Supplier

val COKE_OVEN by lazy { BlockEntityType.Builder.create(Supplier { CokeOvenBlockEntity() }, CokeOvenControllerBlock).build(NamespacedStringType()) }
