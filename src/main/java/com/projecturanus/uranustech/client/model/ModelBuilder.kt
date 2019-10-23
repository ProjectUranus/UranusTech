package com.projecturanus.uranustech.client.model

import com.google.gson.*
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.logger
import net.minecraft.client.render.model.json.JsonUnbakedModel
import net.minecraft.util.Identifier
import net.minecraft.util.math.Direction
import java.io.Serializable
import java.lang.reflect.Type
import java.util.concurrent.ConcurrentHashMap

val builderMap = ConcurrentHashMap<Identifier, ModelBuilder>()

/**
 * Kotlin alternative for ModelTransformation in Minecraft.
 * @see net.minecraft.client.render.model.json.ModelTransformation
 */
data class Transformation(val rotation: Triple<Float, Float, Float>, val translation: Triple<Float, Float, Float>, val scale: Triple<Float, Float, Float>)

data class Quadtuple<out A, out B, out C, out D>(
        val first: A,
        val second: B,
        val third: C,
        val fourth: D
): Serializable {
    override fun toString(): String = "($first, $second, $third, $fourth)"
}

fun <T> Quadtuple<T, T, T, T>.toList(): List<T> = listOf(first, second, third, fourth)

data class ModelFace(var uv: Quadtuple<Int, Int, Int, Int> = Quadtuple(0, 0, 16, 16),
                     var texture: String = "all",
                     var tintIndex: Int = -1,
                     var cullFace: String = "",
                     var rotation: Int = -1,
                     var shade: Boolean = true)

data class ModelElement(var from: Triple<Int, Int, Int> = Triple(0, 0, 0),
                        var to: Triple<Int, Int, Int> = Triple(16, 16, 16),
                        var faces: MutableMap<String, ModelFace> = mutableMapOf())

class ModelBuilder(var identifier: Identifier) {
    companion object {
        val gson = GsonBuilder().registerTypeAdapter(ModelBuilder::class.java, ModelSerializer()).create()
    }
    //language=none
    var parent: String = "builtin/generated"
    var json: String = ""
    //language=JSON
    val builtinJson: String
        get() = gson.toJson(this)
    var layerIndex = 0
    val textures = mutableMapOf<String, Identifier>()
    val elements = mutableListOf<ModelElement>()

    fun register() {
        if (builderMap.containsKey(identifier))
            logger.warn("Duplicate key found for model $identifier, skipping registration")
        else
            builderMap[identifier] = this
    }

    fun build(): JsonUnbakedModel =
            if (json.isNotEmpty()) JsonUnbakedModel.deserialize(json)
            else JsonUnbakedModel.deserialize(builtinJson)

    fun itemSetup() {
        parent = "item/generated"
    }

    fun blockSetup() {
        parent = "block/block"
    }

    fun cubeSetup() {
        parent = "block/cube"
    }

    fun texture(key: String, path: String) {
        texture(key, Identifier(MODID, path))
    }

    fun texture(key: String, path: Identifier) {
        textures += key to path
    }

    fun layer(path: String) {
        layer(Identifier(MODID, path))
    }

    fun layer(path: Identifier) {
        layer(layerIndex++, path)
    }

    fun layer(index: Int, path: Identifier) {
        textures += "layer$index" to path
    }
}

fun model(identifier: Identifier, init: ModelBuilder.() -> Unit): ModelBuilder {
    val obj = ModelBuilder(identifier)
    obj.init()
    return obj
}

fun ModelBuilder.element(init: ModelElement.() -> Unit): ModelElement {
    val obj = ModelElement()
    obj.init()
    elements += obj
    return obj
}

fun ModelElement.face(key: String, init: ModelFace.() -> Unit): ModelFace {
    val obj = ModelFace()
    obj.init()
    if (obj.cullFace.isEmpty())
        obj.cullFace = key
    faces[key] = obj
    return obj
}

fun ModelElement.faces(init: ModelFace.() -> Unit) =
    Direction.values().map { ModelFace().apply(init).apply { cullFace = it.getName(); faces[it.getName()] = this } }.toList()

class ModelSerializer: JsonSerializer<ModelBuilder> {
    override fun serialize(src: ModelBuilder, typeOfSrc: Type, context: JsonSerializationContext): JsonElement {
        val obj = JsonObject()
        src.run {
            obj.addProperty("parent", parent)
            obj.add("textures", JsonObject().also { textureObj -> textures.forEach { key, identifier -> textureObj.addProperty(key, identifier.toString()) } })
            if (elements.isNotEmpty())
                obj.add("elements", JsonArray().also { elementArray ->
                    elements.map { element ->
                        JsonObject().also { elementObj ->
                            elementObj.add("from", JsonArray().also { arr -> element.from.toList().forEach(arr::add) })
                            elementObj.add("to", JsonArray().also { arr -> element.to.toList().forEach(arr::add) })
                            elementObj.add("faces", JsonObject().also { facesObj -> element.faces.map { (key, face) ->
                                facesObj.add(key,
                                    JsonObject().also { faceObj ->
                                        face.apply {
                                            faceObj.add("uv", JsonArray().also { arr -> uv.toList().forEach(arr::add) })
                                            faceObj.addProperty("texture", texture)
                                            if (tintIndex != -1)
                                                faceObj.addProperty("tintindex", tintIndex)
                                            faceObj.addProperty("cullface", cullFace)
                                            if (rotation != -1)
                                                faceObj.addProperty("rotation", rotation)
                                        }
                                    }
                                )
                            } })
                        }
                    }.forEach(elementArray::add)
                })
        }
        return obj
    }
}
