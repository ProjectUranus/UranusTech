package com.projecturanus.uranustech.client

import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.Constants.TOOL_INFO
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.material.generate.GenerateTypes
import com.projecturanus.uranustech.api.material.info.ToolInfo
import com.projecturanus.uranustech.api.render.ItemModelMapper
import com.projecturanus.uranustech.api.render.RenderManager
import com.projecturanus.uranustech.api.render.iconset.Iconsets
import com.projecturanus.uranustech.api.tool.Tools
import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.client.model.builderMap
import com.projecturanus.uranustech.client.model.element
import com.projecturanus.uranustech.client.model.faces
import com.projecturanus.uranustech.client.model.model
import com.projecturanus.uranustech.common.*
import com.projecturanus.uranustech.common.block.OreBlock
import com.projecturanus.uranustech.common.item.FormItem
import com.projecturanus.uranustech.common.item.UTToolItem
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.material.STONE_FORMS
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry
import net.fabricmc.fabric.api.client.model.ModelProviderContext
import net.fabricmc.fabric.api.client.model.ModelResourceProvider
import net.fabricmc.fabric.api.client.model.ModelVariantProvider
import net.fabricmc.fabric.api.client.render.ColorProviderRegistry
import net.minecraft.client.color.block.BlockColorProvider
import net.minecraft.client.color.item.ItemColorProvider
import net.minecraft.client.render.model.UnbakedModel
import net.minecraft.client.render.model.json.JsonUnbakedModel
import net.minecraft.client.util.ModelIdentifier
import net.minecraft.util.Identifier
import org.apache.logging.log4j.LogManager
import java.util.concurrent.ConcurrentHashMap
import kotlin.system.measureTimeMillis

val modelCache = ConcurrentHashMap<Identifier, JsonUnbakedModel>()

val clientLogger = LogManager.getFormatterLogger("UranusTech Client")!!

object UranusTechClient : ClientModInitializer {
    override fun onInitializeClient() {
//        RendererAccess.INSTANCE.registerRenderer(UTRenderer)
        initModels()

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

        // Item Colors
        ColorProviderRegistry.ITEM.register(ItemColorProvider { item, tintIndex ->
            if (tintIndex == 0) {
                if (item.item is FormItem) {
                    val formItem = item.item as FormItem
                    if (formItem.stack.material is JsonMaterial && formItem.stack.material.getInfo<ToolInfo?>(TOOL_INFO) == null) {
                        (formItem.stack.material as JsonMaterial).colorSolid
                    } else formItem.stack.material.color
                } else if (item.item is UTToolItem) {
                    val toolItem = item.item as UTToolItem
                    when {
                        toolItem.tool?.hasHandleMaterial() == false -> toolItem.stack.material.color
                        toolItem.tool?.handleForm?.equals(Forms.STICK) == true -> toolItem.stack.material.getInfo<ToolInfo>(TOOL_INFO)?.handleMaterial?.color
                                ?: -1
                        else -> toolItem.stack.material.color
                    }
                } else -1
            } else if (tintIndex == 2 && item.item is UTToolItem) {
                val toolItem = item.item as UTToolItem
                when {
                    toolItem.tool?.hasHandleMaterial() == false -> -1
                    toolItem.tool?.handleForm?.equals(Forms.STICK) == true -> toolItem.stack.material.color
                    else -> toolItem.handleStack?.material?.color ?: -1
                }
            } else -1
        }, *(formMaterialMap.values.flatMap { it.values } + toolMaterialMap.values.flatMap { it.values }).toTypedArray())

        // Block Colors
        ColorProviderRegistry.BLOCK.register(BlockColorProvider { blockState, extendedBlockView, blockPos, tintIndex ->
                    if (tintIndex == 0) {
                        if (blockState.block is OreBlock) {
                            val block = blockState.block as OreBlock
                            block.stack.material.color
                } else -1
            } else -1
        }, *(blockMaterialMap.values.flatMap { it.values }.toTypedArray()))
    }

    fun initModels() = runBlocking {
        clientLogger.info("Caching model iconsets...")
        withContext(Dispatchers.Default) {
            // Cache form models
            launch {
                clientLogger.info("Generate form models took " + measureTimeMillis {
                    Iconsets.values().forEach {
                        Forms.values().filter { form -> form.generateType == GenerateTypes.ITEM }.forEach { form ->
                            model(Identifier(MODID, "${it.getName()}/${form.getName()}")) {
                                itemSetup()
                                layer("item/materialicons/${it.getName()}/${form.getName()}")
                                layer("item/materialicons/${it.getName()}/${form.getName()}_overlay")
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
                        Forms.values().filter { form -> form.generateType == GenerateTypes.BLOCK && form != Forms.ORE && form !in STONE_FORMS }.forEach { form ->
                            model(Identifier(MODID, "${it.getName()}/${form.getName()}")) {
                                blockSetup()
                                texture("base", "block/materialicons/${it.getName()}/${form.getName()}")
                                texture("overlay", "block/materialicons/${it.getName()}/${form.getName()}_overlay")
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
                                Tools.values().forEach { tool ->
                                    if (tool.hasHandleMaterial()) {
                                        Iconsets.values().forEach { handleSet ->
                                            when (tool) {
                                                Tools.FILE, Tools.SCREWDRIVER, Tools.SAW, Tools.CHISEL -> model(Identifier(MODID, "${it.getName()}/${handleSet.getName()}/${tool.getName()}")) {
                                                    itemSetup()
                                                    layer("item/materialicons/${it.getName()}/tool_head_${tool.getName()}")
                                                    layer("item/materialicons/${it.getName()}/tool_head_${tool.getName()}_overlay")
                                                    layer("item/iconsets/handle_${tool.getName()}")
                                                    layer("item/iconsets/handle_${tool.getName()}_overlay")
                                                    register()
                                                }
                                                else -> model(Identifier(MODID, "${it.getName()}/${handleSet.getName()}/${tool.getName()}")) {
                                                    itemSetup()
                                                    layer("item/materialicons/${handleSet.getName()}/stick")
                                                    layer("item/materialicons/${handleSet.getName()}/stick_overlay")
                                                    layer("item/materialicons/${it.getName()}/tool_head_${tool.getName()}")
                                                    layer("item/materialicons/${it.getName()}/tool_head_${tool.getName()}_overlay")
                                                    register()
                                                }
                                            }
                                        }
                                    } else {
                                        model(Identifier(MODID, "${it.getName()}/${tool.getName()}")) {
                                            itemSetup()
                                            layer("item/iconsets/${tool.getName()}")
                                            layer("item/iconsets/${tool.getName()}_overlay")
                                            register()
                                        }
                                    }
                                }
                            }
                        } + "ms")
            }
        }
        withContext(Dispatchers.Default) {
            builderMap.forEach { (id, modelBuilder) ->
                launch {
                    modelCache[id] = modelBuilder.build()
                }
            }
        }
        clientLogger.info("Cached ${modelCache.size} models")
    }

    private fun loadOreModel(modelId: ModelIdentifier, context: ModelProviderContext): UnbakedModel? {
        val rock =
                if (modelId.variant.isNullOrEmpty() || modelId.variant == "inventory") Rocks.STONE.asString()
                else modelId.variant.split(',').first { it.startsWith("rock=") }.removePrefix("rock=")
        val material = materialRegistry[Identifier(MODID, modelId.path.removePrefix("item/").removeSuffix("_ore"))]
        return modelCache[Identifier(MODID, "${material?.textureSet?.toLowerCase()}/$rock/ore")]
    }

    private fun loadCustomModel(resourceId: Identifier, context: ModelProviderContext): UnbakedModel? {
        if (resourceId.namespace != MODID)
            return null
        // TODO Unifying iconset finding
        val form = Forms.values().find { resourceId.path.endsWith(it.getName()) }
        if (form != null) {
            if (form in STONE_FORMS) {
                if (resourceId is ModelIdentifier && resourceId.variant == "inventory") {
                    return modelCache[Identifier(resourceId.namespace, resourceId.path.removePrefix("block/").removePrefix("item/") + "_item")]
                }
                return modelCache[Identifier(resourceId.namespace, resourceId.path.removePrefix("block/"))]
            }
            val material = materialRegistry[Identifier(MODID, resourceId.path.removePrefix("item/").removeSuffix("_${form.getName()}"))]
            if (material is JsonMaterial)
                return modelCache[Identifier(MODID, "${material.textureSet.toLowerCase()}/${form.getName()}")]
        } else {
            val tool = Tools.values().find { resourceId.path.endsWith(it.getName()) }
            if (tool != null) {
                val material = materialRegistry[Identifier(MODID, resourceId.path.removePrefix("item/").removeSuffix("_${tool.getName()}"))]
                if (material is JsonMaterial) {
                    val toolInfo = material[TOOL_INFO, ToolInfo::class.java]
                    return if (tool.hasHandleMaterial())
                        modelCache[Identifier(MODID, "${material.textureSet.toLowerCase()}/${toolInfo.handleMaterial?.textureSet?.toLowerCase()}/${tool.getName()}")]
                    else modelCache[Identifier(MODID, "${material.textureSet.toLowerCase()}/${tool.getName()}")]
                }
            }
        }
        return null
    }
}
