package com.projecturanus.uranustech.common

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.inventory.InventoryModificationContext
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.form.Form
import io.reactivex.subjects.PublishSubject
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.DefaultedRegistry
import net.minecraft.util.registry.MutableRegistry
import org.dizitart.no2.Nitrite
import org.dizitart.no2.fulltext.EnglishTextTokenizer

val matdb: Nitrite = Nitrite.builder().autoCommitBufferSize(2048).compressed().disableAutoCompact().registerModule(Jdk8Module()).registerModule(KotlinModule()).textTokenizer(EnglishTextTokenizer()).openOrCreate()

// Global Event Bus
val onModifyInventory = PublishSubject.create<InventoryModificationContext>()

val formRegistry = DefaultedRegistry<Form>("uranustech:other")
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
