package com.projecturanus.uranustech.common

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.form.Form
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.DefaultedRegistry
import net.minecraft.util.registry.MutableRegistry
import org.apache.lucene.analysis.core.SimpleAnalyzer
import org.apache.lucene.index.IndexWriter
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.index.StandardDirectoryReader
import org.apache.lucene.search.IndexSearcher
import org.apache.lucene.store.MMapDirectory

lateinit var materialDirectory: MMapDirectory
val materialIndexWriter by lazy { IndexWriter(materialDirectory, IndexWriterConfig(SimpleAnalyzer())) }
val materialIndexSearcher by lazy { IndexSearcher(StandardDirectoryReader.open(materialDirectory)) }

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
