package com.projecturanus.uranustech.common

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Material
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.DefaultedRegistry
import net.minecraft.util.registry.MutableRegistry

val materialRegistry = DefaultedRegistry<Material>("uranustech:unknown")
val groupBase get() = groupMap[Identifier(MODID, "base")]
val groupTool get() = groupMap[Identifier(MODID, "tool")]
val groupOre get() = groupMap[Identifier(MODID, "ore")]
val groupConstructionBlock get() = groupMap[Identifier(MODID, "construction_block")]
val groupMap = DefaultedRegistry<ItemGroup>("$MODID:base")

fun <T> MutableRegistry<T>.getOrCreate(identifier: Identifier, supplier: () -> T): T? {
    if (!this.containsId(identifier))
        this.add(identifier, supplier())
    return this[identifier]
}
