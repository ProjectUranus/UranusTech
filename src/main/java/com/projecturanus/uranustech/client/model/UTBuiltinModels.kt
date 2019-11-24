package com.projecturanus.uranustech.client.model

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.material.generate.GenerateTypes
import com.projecturanus.uranustech.api.material.info.ToolInfo
import com.projecturanus.uranustech.api.render.ItemModelMapper
import com.projecturanus.uranustech.api.render.RenderManager
import com.projecturanus.uranustech.api.render.iconset.Iconsets
import com.projecturanus.uranustech.api.tool.Tool
import com.projecturanus.uranustech.api.tool.Tools
import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.client.clientLogger
import com.projecturanus.uranustech.common.formRegistry
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.material.STONE_FORMS
import com.projecturanus.uranustech.common.materialRegistry
import com.projecturanus.uranustech.common.oreItemMap
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry
import net.fabricmc.fabric.api.client.model.ModelProviderContext
import net.fabricmc.fabric.api.client.model.ModelResourceProvider
import net.fabricmc.fabric.api.client.model.ModelVariantProvider
import net.minecraft.client.render.model.UnbakedModel
import net.minecraft.client.render.model.json.JsonUnbakedModel
import net.minecraft.client.util.ModelIdentifier
import net.minecraft.util.Identifier
import java.util.concurrent.ConcurrentHashMap
import kotlin.system.measureTimeMillis

val modelCache = ConcurrentHashMap<Identifier, JsonUnbakedModel>()

fun initModels() = runBlocking {
    ModelLoadingRegistry.INSTANCE.registerVariantProvider { ModelVariantProvider { modelId, context ->
        if (modelId.namespace == MODID) {
            when {
                modelId.path.endsWith("ore") -> loadOreModel(modelId, context)
                else -> loadCustomModel(modelId, context)
            }
        } else null
    } }

    ModelLoadingRegistry.INSTANCE.registerResourceProvider {
        ModelResourceProvider { resourceId, context ->
            loadCustomModel(resourceId, context)
        }
    }

    clientLogger.info("Caching model iconsets...")
    launch {
        // Cache form models
        launch {
            clientLogger.info("Generate form models took " + measureTimeMillis {
                Iconsets.values().forEach {
                    formRegistry.asSequence().filter { form -> form.generateType == GenerateTypes.ITEM }.forEach { form ->
                        model(Identifier(MODID, "${it.getName()}/${form.name}")) {
                            itemSetup()
                            layer("item/materialicons/${it.getName()}/${form.name}")
                            layer("item/materialicons/${it.getName()}/${form.name}_overlay")
                            register()
                        }
                    }
                }

                // Rock item
                Rocks.values().forEach {
                    STONE_FORMS.forEach { form ->
                        model(Identifier(MODID, "${it.identifier.path}_${form.getName()}_item")) {
                            parent = "$MODID:block/${it.identifier.path}_${form.getName()}"
                            register()
                        }
                    }
                }
            } + "ms")
        }

        // Cache block models
        launch {
            clientLogger.info("Generate block models took " + measureTimeMillis {
                Iconsets.values().forEach {
                    formRegistry.asSequence().filter { form -> form.generateType == GenerateTypes.BLOCK && form != Forms.ORE && form !in STONE_FORMS }.forEach { form ->
                        model(Identifier(MODID, "${it.getName()}/${form.name}")) {
                            blockSetup()
                            texture("base", "block/materialicons/${it.getName()}/${form.name}")
                            texture("overlay", "block/materialicons/${it.getName()}/${form.name}_overlay")
                            element {
                                from = Triple(0, 0, 0)
                                to = Triple(16, 16, 16)
                                faces {
                                    texture = "#base"
                                    tintIndex = 0
                                }
                            }
                            element {
                                from = Triple(0, 0, 0)
                                to = Triple(16, 16, 16)
                                faces {
                                    texture = "#overlay"
                                }
                            }
                            register()
                        }
                    }

                    // Ore
                    Rocks.values().forEach { rock ->
                        model(Identifier(MODID, "${it.getName()}/${rock.asString()}/ore")) {
                            blockSetup()
                            texture("base", "block/materialicons/${it.getName()}/ore")
                            texture("overlay", "block/materialicons/${it.getName()}/ore_overlay")
                            texture("stone", if (rock == Rocks.STONE) Identifier("minecraft", "block/stone") else Identifier(MODID, "block/stones/${rock.asString()}/stone"))
                            element {
                                from = Triple(0, 0, 0)
                                to = Triple(16, 16, 16)
                                faces {
                                    texture = "#stone"
                                }
                            }
                            element {
                                from = Triple(0, 0, 0)
                                to = Triple(16, 16, 16)
                                faces {
                                    texture = "#overlay"
                                }
                            }
                            element {
                                from = Triple(0, 0, 0)
                                to = Triple(16, 16, 16)
                                faces {
                                    texture = "#base"
                                    tintIndex = 0
                                }
                            }
                            register()
                        }
                    }
                }

                // Rock block model
                Rocks.values().forEach {
                    STONE_FORMS.forEach { form ->
                        model(Identifier(MODID, "${it.identifier.path}_${form.getName()}")) {
                            parent = "block/cube_all"
                            texture("all", "block/stones/${it.identifier.path}/${form.getName()}")
                            register()
                        }
                    }
                }
                oreItemMap.forEach { (ore, item) ->
                    RenderManager.ITEM_MODEL_MAPPERS[item] = ItemModelMapper {
                        ModelIdentifier(Identifier(MODID, ore.stack.material.identifier.path + "_ore"), "rock=" + it.tag?.getString("rock"))
                    }
                }
            } + "ms")
        }

        // Cache tool models
        launch {
            // Cache tool models
            clientLogger.info("Generate tool models took " +
                    measureTimeMillis {
                        Iconsets.values().forEach {
                            formRegistry.asSequence().filter { form -> form.generateType == GenerateTypes.TOOL }.map { form -> form as Tool }.forEach { tool ->
                                if (tool.hasHandleMaterial()) {
                                    Iconsets.values().forEach { handleSet ->
                                        when (tool) {
                                            Tools.FILE, Tools.SCREWDRIVER, Tools.SAW, Tools.CHISEL -> model(Identifier(MODID, "${it.getName()}/${handleSet.getName()}/${tool.name}")) {
                                                itemSetup()
                                                layer("item/materialicons/${it.getName()}/tool_head_${tool.name}")
                                                layer("item/materialicons/${it.getName()}/tool_head_${tool.name}_overlay")
                                                layer("item/iconsets/handle_${tool.name}")
                                                layer("item/iconsets/handle_${tool.name}_overlay")
                                                register()
                                            }
                                            else -> model(Identifier(MODID, "${it.getName()}/${handleSet.getName()}/${tool.name}")) {
                                                itemSetup()
                                                layer("item/materialicons/${handleSet.getName()}/stick")
                                                layer("item/materialicons/${handleSet.getName()}/stick_overlay")
                                                layer("item/materialicons/${it.getName()}/tool_head_${tool.name}")
                                                layer("item/materialicons/${it.getName()}/tool_head_${tool.name}_overlay")
                                                register()
                                            }
                                        }
                                    }
                                } else {
                                    model(Identifier(MODID, "${it.getName()}/${tool.name}")) {
                                        itemSetup()
                                        layer("item/iconsets/${tool.name}")
                                        layer("item/iconsets/${tool.name}_overlay")
                                        register()
                                    }
                                }
                            }
                        }
                    } + "ms")
        }
    }.join()
    launch {
        builderMap.forEach { (id, modelBuilder) ->
            launch {
                modelCache[id] = modelBuilder.build()
            }
        }
    }.join()
    clientLogger.info("Cached ${modelCache.size} models")
}

private fun loadOreModel(modelId: ModelIdentifier, context: ModelProviderContext): UnbakedModel? {
    val rock =
            if (modelId.variant.isNullOrEmpty() || modelId.variant == "inventory") Rocks.STONE.asString()
            else modelId.variant.split(',').first { it.startsWith("rock=") }.removePrefix("rock=")
    val material = materialRegistry[Identifier(MODID, modelId.path.removePrefix("item/").removeSuffix("_ore"))]
    return modelCache[Identifier(MODID, "${material.textureSet?.toLowerCase()}/$rock/ore")]
}

private fun loadCustomModel(resourceId: Identifier, context: ModelProviderContext): UnbakedModel? {
    if (resourceId.namespace != MODID)
        return null
    // TODO Unifying iconset finding
    val form = formRegistry.asSequence().find { resourceId.path.endsWith(it.name) }
    if (form != null) {
        if (form in STONE_FORMS) {
            if (resourceId is ModelIdentifier && resourceId.variant == "inventory") {
                return modelCache[Identifier(resourceId.namespace, resourceId.path.removePrefix("block/").removePrefix("item/") + "_item")]
            }
            return modelCache[Identifier(resourceId.namespace, resourceId.path.removePrefix("block/"))]
        } else if (form.generateType == GenerateTypes.TOOL) {
            val tool = form as Tool
            val material = materialRegistry[Identifier(MODID, resourceId.path.removePrefix("item/").removeSuffix("_${tool.getName()}"))]
            if (material is JsonMaterial) {
                val toolInfo = material[Constants.TOOL_INFO, ToolInfo::class.java]
                return if (tool.hasHandleMaterial())
                    modelCache[Identifier(MODID, "${material.textureSet.toLowerCase()}/${toolInfo?.handleMaterial?.textureSet?.toLowerCase() ?: "none"}/${tool.getName()}")]
                else modelCache[Identifier(MODID, "${material.textureSet.toLowerCase()}/${tool.getName()}")]
            }
        } else {
            val material = materialRegistry[Identifier(MODID, resourceId.path.removePrefix("item/").removeSuffix("_${form.name}"))]
            if (material is JsonMaterial)
                return modelCache[Identifier(MODID, "${material.textureSet.toLowerCase()}/${form.name}")]
        }
    }
    return null
}
