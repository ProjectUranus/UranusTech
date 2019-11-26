package com.projecturanus.uranustech.common.index

import com.google.gson.JsonObject
import com.google.gson.JsonPrimitive
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.common.materialDirectory
import net.fabricmc.loader.api.FabricLoader
import org.apache.lucene.document.*
import org.apache.lucene.store.MMapDirectory

fun registerIndex() {
    materialDirectory = MMapDirectory(FabricLoader.getInstance().configDirectory.toPath().resolve("uranustech").resolve("index"))
}

fun Material.toDocument(): Document {
    val doc = Document()
    doc.add(TextField("id", identifier.toString(), Field.Store.YES))
    doc.add(TextField("chemicalCompound", chemicalCompound ?: "?", Field.Store.YES))
    return doc
}

fun JsonObject.toDocument(): Document {
    val doc = Document()
    entrySet().forEach { (key, value) ->
        when (value) {
            is JsonPrimitive -> if (value.isNumber) {
                if (value.asLong.toDouble() != value.asDouble)
                    doc.add(DoublePoint(key, value.asDouble))
                else
                    doc.add(LongPoint(key, value.asLong))
            } else doc.add(TextField(key, value.asString, Field.Store.YES))
        }
    }
    return doc
}
