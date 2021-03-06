package com.projecturanus.uranustech.common

import com.google.common.jimfs.Configuration
import com.google.common.jimfs.Jimfs
import com.google.common.jimfs.PathType
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.JsonSyntaxException
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.builtin.WILDCARD_MATERIALS
import com.projecturanus.uranustech.api.builtin.refreshMaterials
import com.projecturanus.uranustech.api.material.Constants
import com.projecturanus.uranustech.api.material.Constants.TOOL_INFO
import com.projecturanus.uranustech.api.material.Material
import com.projecturanus.uranustech.api.material.MaterialStack
import com.projecturanus.uranustech.api.material.form.Form
import com.projecturanus.uranustech.api.material.form.Forms
import com.projecturanus.uranustech.api.material.generate.GenerateTypes
import com.projecturanus.uranustech.api.material.info.*
import com.projecturanus.uranustech.api.tool.Tool
import com.projecturanus.uranustech.api.tool.ToolHeads
import com.projecturanus.uranustech.api.tool.Tools
import com.projecturanus.uranustech.api.worldgen.Rock
import com.projecturanus.uranustech.api.worldgen.Rocks
import com.projecturanus.uranustech.common.block.MaterialBlock
import com.projecturanus.uranustech.common.block.OreBlock
import com.projecturanus.uranustech.common.block.entity.COKE_OVEN
import com.projecturanus.uranustech.common.block.structure.CokeOvenControllerBlock
import com.projecturanus.uranustech.common.command.MaterialCommand
import com.projecturanus.uranustech.common.container.MATERIAL_SHOWCASE
import com.projecturanus.uranustech.common.container.MaterialShowcaseContainer
import com.projecturanus.uranustech.common.fluid.MoltenMaterialFluid
import com.projecturanus.uranustech.common.item.FormItem
import com.projecturanus.uranustech.common.item.MaterialBlockItem
import com.projecturanus.uranustech.common.item.OreBlockItem
import com.projecturanus.uranustech.common.item.UTToolItem
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.material.MaterialAPIImpl
import com.projecturanus.uranustech.common.material.TagProcessor
import com.projecturanus.uranustech.common.material.setupDelegate
import com.projecturanus.uranustech.common.resource.asFlow
import com.projecturanus.uranustech.common.resource.asSequence
import com.projecturanus.uranustech.common.util.*
import com.projecturanus.uranustech.common.worldgen.ORE_GEN_FEATURE
import com.projecturanus.uranustech.common.worldgen.RockLayerBuilder
import com.projecturanus.uranustech.common.worldgen.SimpleOreGenFeature
import com.projecturanus.uranustech.logger
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.forEach
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.container.ContainerProviderRegistry
import net.fabricmc.fabric.api.registry.CommandRegistry
import net.minecraft.block.Block
import net.minecraft.command.arguments.IdentifierArgumentType.identifier
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
import org.dizitart.no2.Document
import org.dizitart.no2.IndexOptions
import org.dizitart.no2.IndexType
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

val formMaterialMap = ConcurrentHashMap<Material, MutableMap<Form, FormItem>>()
val toolMaterialMap = ConcurrentHashMap<Material, MutableMap<Tool, UTToolItem>>()
val blockMaterialMap = ConcurrentHashMap<Material, MutableMap<Form, MaterialBlock>>()
val itemAllFormTagMap = ConcurrentHashMap<Material, Tag<Item>>()
val itemTagMap = ConcurrentHashMap<Material, MutableMap<Form, Tag<Item>>>()
val blockAllFormTagMap = ConcurrentHashMap<Material, Tag<Block>>()
val blockTagMap = ConcurrentHashMap<Material, MutableMap<Form, Tag<Block>>>()
val oreItemMap = ConcurrentHashMap<OreBlock, MutableMap<Rock, OreBlockItem>>()
val rockMap = EnumMap<Rocks, MaterialBlock>(Rocks::class.java)
val blockItemMap = ConcurrentHashMap<MaterialBlock, MaterialBlockItem>()

fun registerBuiltin() = runBlocking {
    val mainScope = this@runBlocking
    groupMap.add(Identifier(MODID, "base"), FabricItemGroupBuilder.create(Identifier(MODID, "base")).icon { materialRegistry.get(Identifier(MODID, "steel")).getItem(Forms.INGOT) }.build())
    groupMap.add(Identifier(MODID, "tool"), FabricItemGroupBuilder.create(Identifier(MODID, "tool")).icon {toolMaterialMap.values.toList().random()?.values?.toList()?.random()?.let(::ItemStack) ?: ItemStack.EMPTY }.build())
    groupMap.add(Identifier(MODID, "ore"), FabricItemGroupBuilder.create(Identifier(MODID, "ore")).icon { oreItemMap.values.toList().random()?.values?.toList()?.random()?.let(::ItemStack) ?: ItemStack.EMPTY }.build())
    groupMap.add(Identifier(MODID, "construction_block"), FabricItemGroupBuilder.create(Identifier(MODID, "construction_block")).icon { ItemStack(blockItemMap.values.toList().random()) }.build())

    Forms.values().union(Tools.values().map { it as Form }).union(ToolHeads.values().map { it as Form }).forEach {
        formRegistry.add(Identifier(MODID, it.asString()), it)
    }

    val collection = matdb.getCollection("materials")
    val gson = GsonBuilder().create()
    logger.info("Load materials took " + measureTimeMillis {
        val zipInputStream = ZipArchiveInputStream(javaClass.getResourceAsStream("/data/uranustech/materials/materials.zip"))
        zipInputStream.asFlow().collect { (entry, content) ->
            try {
                val material = gson.fromJson(String(content), JsonMaterial::class.java).apply {
                    name = name.toLowerCase()
                    infos = mapOf(
                            Constants.ATOM_INFO to AtomInfo().also { it.electrons = electrons; it.neutrons = neutrons; it.protons = protons },
                            Constants.MATTER_INFO to MatterInfo().also { it.gramPerCubicCentimeter = gramPerCubicCentimeter },
                            Constants.ORE_INFO to OreInfo().also { it.oreMultiplier = oreMultiplier; it.oreProgressingMultiplier = oreProgressingMultiplier },
                            Constants.STATE_INFO to StateInfo().also { it.boilingPoint = boilingPoint; it.meltingPoint = meltingPoint; it.plasmaPoint = plasmaPoint },
                            Constants.FUEL_INFO to FuelInfo().also { it.burnTime = burnTime },
                            Constants.TOOL_INFO to ToolInfo().also { it.toolDurability = toolDurability; it.toolQuality = toolQuality; it.toolSpeed = toolSpeed; it.toolTypes = toolTypes; it.handleMaterialId = Identifier(MODID, handleMaterial) }
                    )
                    val tagProcessor = TagProcessor(tags)
                    validFormsCache = tagProcessor.getForms().toList()
                }
                mainScope.launch { materialRegistry.add(material.identifier, material) }
            } catch (e: JsonSyntaxException) {
                logger.error("Malformed json in " + entry.name, e)
                logger.error(String(content))
            }
        }
        refreshMaterials()
        // Wildcard materials
        WILDCARD_MATERIALS.forEach { material ->
            materialRegistry.add(material.identifier, material)
        }
        setupDelegate()
    } + "ms")
    logger.info("Registered ${materialRegistry.ids.size} materials")
    logger.info("Generating blocks...")
    logger.info("Generate blocks in " + measureTimeMillis {
        materialRegistry.forEach { material ->
            withContext(Dispatchers.Default) {
                launch {
                    val formBlocks = material.validForms
                            .asSequence()
                            .filter { form -> form.generateType == GenerateTypes.BLOCK && form != Forms.ORE }
                            .map { form ->
                                form to MaterialBlock(MaterialStack(material, form))
                            }.toMap().toMutableMap()

                    // Specific settings for ores
                    if (Forms.ORE in material.validForms) {
                        val ore = OreBlock(MaterialStack(material, Forms.ORE))
                        for (rock in Rocks.values()) {
                            val oreItem = registerItem(Identifier(MODID, "${material.identifier.path}_${rock.asString()}_ore"), OreBlockItem(ore, rock))
                            oreItemMap[ore] = (oreItemMap[ore] ?: mutableMapOf()).apply { put(rock, oreItem) }
                        }
                        registerBlock(Identifier(MODID, "${material.identifier.path}_ore"), ore, false)
                        formBlocks.remove(Forms.ORE)
                        blockMaterialMap[material] = blockMaterialMap.getOrDefault(material, mutableMapOf()).apply { put(Forms.ORE, ore) }
                    }
                    formBlocks.filter { (form, block) -> form == Forms.STONE && Rocks.values().any { rock -> rock.name == block.stack.material.identifier.path.toUpperCase() } }.forEach { (form, block) -> rockMap[Rocks.valueOf(block.stack.material.identifier.path.toUpperCase())] = block }
                    blockMaterialMap[material] = blockMaterialMap.getOrDefault(material, formBlocks.toMutableMap())
                    formBlocks.forEach { (form, block) ->
                        registerBlock(Identifier(MODID, "${block.stack.material.identifier.path}_${form.toString().toLowerCase()}"), block) { MaterialBlockItem(block).also { blockItemMap[block] = it } }
                    }
                }
                // Fluid
                launch {
                    material.validForms.asSequence().filter { it.generateType == GenerateTypes.FLUID }.forEach { form ->
                        if (form == Forms.MOLTEN) {
                            Registry.FLUID.add(Identifier(MODID, "${material.identifier.path}_molten_still"), MoltenMaterialFluid.Still(MaterialStack(material, Forms.MOLTEN)))
                        } else if (form == Forms.GAS) {

                        }
                    }
                }
            }.join()
        }
    } + "ms")
    logger.info("Generating items...")
    logger.info("Generate items in " + measureTimeMillis {
        withContext(Dispatchers.Default) {
            materialRegistry.onEach {
                        val toolInfo = it.getInfo<ToolInfo?>(TOOL_INFO)
                        if (toolInfo != null) {
                            Tools.values().forEach { tool ->
                                val toolItem =
                                    if (tool.hasHandleMaterial())
                                        UTToolItem(MaterialStack(it, tool), MaterialStack(toolInfo.handleMaterial, tool.handleForm), settings = Item.Settings().maxCount(1).group(if (it.isHidden) null else groupTool))
                                    else
                                        UTToolItem(MaterialStack(it, tool), settings = Item.Settings().maxCount(1).group(if (it.isHidden) null else groupTool))
                                registerItem(Identifier(it.identifier.namespace, "${it.identifier.path}_${tool.asString()}"),
                                        toolItem)
                                toolMaterialMap[it] = toolMaterialMap.getOrDefault(it, mutableMapOf()).apply { put(tool, toolItem) }
                            }
                        }
                    }
                    .flatMap {
                        val formItems = it.validForms.filter { form -> form.generateType == GenerateTypes.ITEM }.map { form -> form to FormItem(MaterialStack(it, form)) }
                        formMaterialMap[it] = formMaterialMap.getOrDefault(it, mutableMapOf(*formItems.toTypedArray()))
                        formItems.map { pair -> pair.first.asString() to pair.second }
                    }
        }.forEach {
            registerItem(Identifier(MODID, "${it.second.stack.material.identifier.path}_${it.first}"), it.second)
        }
    } + "ms")
    logger.info("Generating tags...")
    logger.info("Generated tags in " + measureTimeMillis {
        withContext(Dispatchers.Default) {
            materialRegistry.forEach { material ->
                launch {
                    itemTagMap[material] = mutableMapOf(*material.validForms.map {
                        it to Tag.Builder.create<Item>().add(material.getItem(it).item).build(Identifier(material.identifier.namespace, "${material.identifier.path}_${it.asString()}"))
                    }.toTypedArray())
                }
            }
            WILDCARD_MATERIALS.forEach { material ->
                launch {
                    val itemFormMap = mutableMapOf<Form, MutableList<FormItem>>()
                    material.subMaterials().forEach { subMaterial ->
                        subMaterial.validForms.forEach { form ->
                            itemFormMap[form] = itemFormMap.getOrDefault(form, mutableListOf())
                            subMaterial.getItem(form).let { if (it.item is FormItem) itemFormMap[form]?.add(it.item as FormItem) }
                        }
                    }
                    itemTagMap[material] = itemFormMap.mapValues { it.value.asItemTag(Identifier(material.identifier.namespace, "${material.identifier.path}_${it.key.asString()}")) }.toMutableMap()
                    itemAllFormTagMap[material] = itemFormMap.flatMap { it.value }.asItemTag(material.identifier)
                }
                launch {
                    val blockFormMap = mutableMapOf<Form, MutableList<MaterialBlock>>()
                    material.subMaterials().forEach { subMaterial ->
                        subMaterial.validForms.forEach { form ->
                            blockFormMap[form] = blockFormMap.getOrDefault(form, mutableListOf())
                            subMaterial.getBlock(form)?.block?.let { if (it is MaterialBlock) blockFormMap[form]?.add(it) }
                        }
                    }
                    blockTagMap[material] = blockFormMap.mapValues { it.value.asBlockTag(Identifier(material.identifier.namespace, "${material.identifier.path}_${it.key.asString()}")) }.toMutableMap()
                    blockAllFormTagMap[material] = blockFormMap.flatMap { it.value }.asBlockTag(material.identifier)
                }
            }
        }
    } + "ms")
    logger.info("Generating ore features...")
    logger.info("Generated ore features in " + measureTimeMillis {
        async {
            Registry.register(Registry.FEATURE, Identifier(MODID, "rock_layer"), ORE_GEN_FEATURE)
            for (block in rockMap.values) {
                for (biome in Registry.BIOME)
                    biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, block.defaultState, 33)).createDecoratedFeature(Decorator.COUNT_RANGE.configure(RangeDecoratorConfig(10, 0, 0, 80))))
            }
        }
    } + "ms")

    Registry.register(Registry.FEATURE, Identifier(MODID, "ore_gen"), SimpleOreGenFeature())
    Registry.register(Registry.SURFACE_BUILDER, Identifier(MODID, "rock_surface"), RockLayerBuilder())

    registerMachines()

    logger.info("Registered ${registeredItems.get()} items")
    logger.info("Registered ${registeredBlocks.get()} blocks")
    registerContainers()

    logger.info("Mapping material registry...")
    materialRegistry.forEachIndexed { index, material ->
        val mapped = MaterialAPIImpl.mappers.mapNotNull { it(material) }.lastOrNull()
        if (mapped != null)
            materialRegistry.set(index, mapped.identifier, mapped)
    }
    collection.createIndex("id", IndexOptions.indexOptions(IndexType.Unique))
    collection.createIndex("internalId", IndexOptions.indexOptions(IndexType.Fulltext))
    collection.createIndex("chemicalCompound", IndexOptions.indexOptions(IndexType.Fulltext))
    materialRegistry.forEach { material ->
        collection.insert(
            with(material) {
                Document().also { document ->
                    document["id"] = identifier.toString()
                    document["internalId"] = identifier.path.replace('_', ' ')
                    document["chemicalCompound"] = chemicalCompound
                    document["hidden"] = isHidden
                    document["textureSet"] = textureSet
                    document["elements"] = elements
                    document["infos"] = Document().also { info -> infos.forEach { info[it.identifier.toString()] = (gson.toJsonTree(it) as JsonObject).toDocument() }}
                }
            }
        )
    }
    collection.close()
    logger.info("[UranusTech] Builtin registration done")
}

suspend fun generateToolsFromMaterial(material: Material) = flow {
    for (tool in Tools.values()) {
        val toolInfo = material[Constants.TOOL_INFO, ToolInfo::class.java]!!
        val toolItem =
                if (tool.hasHandleMaterial())
                    UTToolItem(MaterialStack(material, tool), MaterialStack(toolInfo.handleMaterial, tool.handleForm), settings = Item.Settings().maxCount(1).group(if (material.isHidden) null else groupTool))
                else
                    UTToolItem(MaterialStack(material, tool), settings = Item.Settings().maxCount(1).group(if (material.isHidden) null else groupTool))
        registerItem(Identifier(material.identifier.namespace, "${material.identifier.path}_${tool.asString()}"),
                toolItem)
        emit(toolItem)
        toolMaterialMap[material] = toolMaterialMap.getOrDefault(material, mutableMapOf<Tool, UTToolItem>()).apply { put(tool, toolItem) }
    }
}

fun <E> List<E>.random(random: Random = ThreadLocalRandom.current()): E? =
    if (size > 0) this[random.nextInt(this.size)] else null

suspend fun registerMachines() {
    registerBlock(Identifier(MODID, "coke_oven_controller"), CokeOvenControllerBlock)
    Registry.register(Registry.BLOCK_ENTITY_TYPE, Identifier(MODID, "coke_oven_controller"), COKE_OVEN)
}

fun registerContainers() {
    ContainerProviderRegistry.INSTANCE.registerFactory(MATERIAL_SHOWCASE) { syncId, id, player, packet -> MaterialShowcaseContainer(packet.readIdentifier(), player.inventory, syncId) }
}

fun registerResources() {
    val fileSystem = Jimfs.newFileSystem("UranusTech", Configuration.builder(PathType.unix()).setWorkingDirectory("/").setRoots("/").build())
    /*
    Files.write(fileSystem.getPath("pack.mcmeta"), """
{
    "pack": {
        "description": "Generated data for UranusTech",
        "pack_format": 4
    }
}""".toByteArray())
*/
}

fun registerCommands() {
    CommandRegistry.INSTANCE.register(false, MaterialCommand::register)
}

val registeredItems = AtomicInteger()
val registeredBlocks = AtomicInteger()

fun <T> registerItem(identifier: Identifier, item: T): T where T: Item {
    registeredItems.getAndIncrement()
    return Registry.register(Registry.ITEM, identifier, item)
}

fun registerBlock(identifier: Identifier, block: Block, registerItem: Boolean = true, itemFunc: (Block) -> BlockItem = { BlockItem(it, Item.Settings().group(groupBase)) }) {
    Registry.register(Registry.BLOCK, identifier, block)
    registeredBlocks.getAndIncrement()
    if (registerItem) registerBlockItem(identifier, block, itemFunc)
}

fun registerBlockItem(identifier: Identifier, block: Block, itemFunc: (Block) -> BlockItem = { BlockItem(it, Item.Settings().group(groupBase)) }) {
    registerItem(identifier, itemFunc(block))
}
