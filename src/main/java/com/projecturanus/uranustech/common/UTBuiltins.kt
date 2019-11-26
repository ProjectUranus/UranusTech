package com.projecturanus.uranustech.common

import com.google.common.jimfs.Configuration
import com.google.common.jimfs.Jimfs
import com.google.common.jimfs.PathType
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import com.projecturanus.uranustech.MODID
import com.projecturanus.uranustech.api.material.*
import com.projecturanus.uranustech.api.material.Constants.TOOL_INFO
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
import com.projecturanus.uranustech.common.command.MaterialCommand
import com.projecturanus.uranustech.common.container.MATERIAL_SHOWCASE
import com.projecturanus.uranustech.common.container.MaterialShowcaseContainer
import com.projecturanus.uranustech.common.index.toDocument
import com.projecturanus.uranustech.common.item.FormItem
import com.projecturanus.uranustech.common.item.MaterialBlockItem
import com.projecturanus.uranustech.common.item.OreBlockItem
import com.projecturanus.uranustech.common.item.UTToolItem
import com.projecturanus.uranustech.common.material.JsonMaterial
import com.projecturanus.uranustech.common.material.MaterialAPIImpl
import com.projecturanus.uranustech.common.material.TagProcessor
import com.projecturanus.uranustech.common.material.setupDelegate
import com.projecturanus.uranustech.common.resource.CUSTOM_RESOURCE_PACKS
import com.projecturanus.uranustech.common.resource.FileSystemResourcePack
import com.projecturanus.uranustech.common.resource.forEach
import com.projecturanus.uranustech.common.util.asBlockTag
import com.projecturanus.uranustech.common.util.asItemTag
import com.projecturanus.uranustech.common.util.getBlock
import com.projecturanus.uranustech.common.util.getItem
import com.projecturanus.uranustech.common.worldgen.ORE_GEN_FEATURE
import com.projecturanus.uranustech.common.worldgen.RockLayerBuilder
import com.projecturanus.uranustech.common.worldgen.SimpleOreGenFeature
import com.projecturanus.uranustech.logger
import kotlinx.coroutines.*
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.container.ContainerProviderRegistry
import net.fabricmc.fabric.api.registry.CommandRegistry
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.NopeDecoratorConfig
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
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
val oreItemMap = ConcurrentHashMap<OreBlock, OreBlockItem>()
val rockMap = EnumMap<Rocks, MaterialBlock>(Rocks::class.java)
val oreItemStackMap = ConcurrentHashMap<OreBlock, MutableMap<out Rock, () -> ItemStack>>()
val blockItemMap = ConcurrentHashMap<MaterialBlock, MaterialBlockItem>()

fun registerBuiltin() = runBlocking {
    groupMap.add(Identifier(MODID, "base"), FabricItemGroupBuilder.create(Identifier(MODID, "base")).icon { materialRegistry.get(Identifier(MODID, "steel"))?.getItem(Forms.INGOT) }.build())
    groupMap.add(Identifier(MODID, "tool"), FabricItemGroupBuilder.create(Identifier(MODID, "tool")).icon {toolMaterialMap.values.toList().random()?.values?.toList()?.random()?.let(::ItemStack) ?: ItemStack.EMPTY }.build())
    groupMap.add(Identifier(MODID, "ore"), FabricItemGroupBuilder.create(Identifier(MODID, "ore")).icon { oreItemStackMap.values.toList().random()?.get(Rocks.STONE)?.invoke() }.build())
    groupMap.add(Identifier(MODID, "construction_block"), FabricItemGroupBuilder.create(Identifier(MODID, "construction_block")).icon { ItemStack(blockItemMap.values.toList().random()) }.build())

    Forms.values().union(Tools.values().map { it as Form }).union(ToolHeads.values().map { it as Form }).forEach {
        formRegistry.add(Identifier(MODID, it.name), it)
    }

    val gson = Gson()
    logger.info("Load materials took " + measureTimeMillis {
        async {
            val zipInputStream = ZipArchiveInputStream(javaClass.getResourceAsStream("/data/uranustech/materials/materials.zip"))
            zipInputStream.forEach { content, entry ->
                launch {
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
                            validFormsCache = TagProcessor(tags).getForms().toList()
                        }
                        materialRegistry.add(material.identifier, material)
                        materialIndexWriter.addDocument(material.toDocument())
                    } catch (e: JsonSyntaxException) {
                        logger.error("Malformed json in " + entry.name, e)
                        logger.error(String(content))
                    }
                }
            }
        }.join()
        withContext(Dispatchers.IO) {
            materialIndexWriter.flush()
            materialIndexWriter.close()
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
            async {
                launch {
                    val formBlocks = material.validForms
                            .filter { form -> form.generateType == GenerateTypes.BLOCK && form != Forms.ORE }
                            .map { form ->
                                form to MaterialBlock(MaterialStack(material, form))
                            }.toMap().toMutableMap()

                    // Specific settings for ores
                    if (Forms.ORE in material.validForms) {
                        val ore = OreBlock(MaterialStack(material, Forms.ORE))
                        val oreItem = registerItem(Identifier(MODID, "${material.identifier.path}_ore"), OreBlockItem(ore))
                        oreItemMap[ore] = oreItem
                        oreItemStackMap[ore] = oreItemStackMap.getOrDefault(ore, mutableMapOf(*Rocks.values().map { rock -> rock to { oreItem.getStack(rock) } }.toTypedArray()))
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
            }.join()
        }
    } + "ms")
    logger.info("Generating items...")
    logger.info("Generate items in " + measureTimeMillis {
        withContext(Dispatchers.Default) {
            materialRegistry
                    .onEach {
                        val toolInfo = it.getInfo<ToolInfo?>(TOOL_INFO)
                        if (toolInfo != null) {
                            Tools.values().forEach { tool ->
                                val toolItem =
                                    if (tool.hasHandleMaterial())
                                        UTToolItem(MaterialStack(it, tool), MaterialStack(toolInfo.handleMaterial, tool.handleForm), settings = Item.Settings().maxCount(1).group(if (it.isHidden) null else groupTool))
                                    else
                                        UTToolItem(MaterialStack(it, tool), settings = Item.Settings().maxCount(1).group(if (it.isHidden) null else groupTool))
                                registerItem(Identifier(it.identifier.namespace, "${it.identifier.path}_${tool.getName()}"),
                                        toolItem)
                                toolMaterialMap[it] = toolMaterialMap.getOrDefault(it, mutableMapOf()).apply { put(tool, toolItem) }
                            }
                        }
                    }
                    .flatMap {
                        val formItems = it.validForms.filter { form -> form.generateType == GenerateTypes.ITEM }.map { form -> form to FormItem(MaterialStack(it, form)) }
                        formMaterialMap[it] = formMaterialMap.getOrDefault(it, mutableMapOf(*formItems.toTypedArray()))
                        formItems.map { pair -> pair.first.name to pair.second }
                    }
        }.forEach {
            registerItem(Identifier(MODID, "${it.second.stack.material.identifier.path}_${it.first}"), it.second)
        }
    } + "ms")
    logger.info("Generating tags...")
    logger.info("Generated tags in " + measureTimeMillis {
        async {
            materialRegistry.forEach { material ->
                launch {
                    itemTagMap[material] = mutableMapOf(*material.validForms.map {
                        it to Tag.Builder.create<Item>().add(material.getItem(it).item).build(Identifier(material.identifier.namespace, "${material.identifier.path}_${it.name}"))
                    }.toTypedArray())
                }
            }
            WILDCARD_MATERIALS.forEach { material ->
                launch {
                    val itemFormMap = mutableMapOf<Form, MutableList<FormItem>>()
                    material.subMaterials().forEach { subMaterial ->
                        subMaterial.validForms.forEach { form ->
                            itemFormMap[form] = itemFormMap.getOrDefault(form, mutableListOf())
                            subMaterial.getItem(form)?.let { if (it.item is FormItem) itemFormMap[form]?.add(it.item as FormItem) }
                        }
                    }
                    itemTagMap[material] = itemFormMap.mapValues { it.value.asItemTag(Identifier(material.identifier.namespace, "${material.identifier.path}_${it.key.name}")) }.toMutableMap()
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
                    blockTagMap[material] = blockFormMap.mapValues { it.value.asBlockTag(Identifier(material.identifier.namespace, "${material.identifier.path}_${it.key.name}")) }.toMutableMap()
                    blockAllFormTagMap[material] = blockFormMap.flatMap { it.value }.asBlockTag(material.identifier)
                }
            }
        }.join()
    } + "ms")
    logger.info("Generating ore features...")
    logger.info("Generated ore features in " + measureTimeMillis {
        async {
            Registry.register(Registry.FEATURE, Identifier(MODID, "rock_layer"), ORE_GEN_FEATURE)
            Biome.BIOMES.forEach {
                launch {
                    it.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(
                            Feature.ORE, OreFeatureConfig(
                                OreFeatureConfig.Target.NATURAL_STONE,
                                oreItemMap.keys.stream().findFirst().map { block -> block.defaultState.with(Rock.ROCKS_PROPERTY, Rocks.STONE) }.get(),
                                45),
                            Decorator.COUNT_RANGE, RangeDecoratorConfig(60, 0, 0, 10)))
                    it.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Biome.configureFeature(ORE_GEN_FEATURE, OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Blocks.ACACIA_LOG.defaultState, 100), Decorator.NOPE, NopeDecoratorConfig()))
                }
            }
        }
    } + "ms")
    Registry.register(Registry.FEATURE, Identifier(MODID, "ore_gen"), SimpleOreGenFeature())
    Registry.register(Registry.SURFACE_BUILDER, Identifier(MODID, "rock_surface"), RockLayerBuilder())

    logger.info("Registered ${registeredItems.get()} items")
    logger.info("Registered ${registeredBlocks.get()} blocks")
    registerContainers()

    logger.info("Mapping material registry...")
    materialRegistry.forEachIndexed { index, material ->
        val mapped = MaterialAPIImpl.mappers.mapNotNull { it(material) }.lastOrNull()
        if (mapped != null)
            materialRegistry.set(index, mapped.identifier, mapped)
    }
    logger.info("[UranusTech] Builtin registration done")
}

fun <E> List<E>.random(random: Random = ThreadLocalRandom.current()): E? =
    if (size > 0) this[random.nextInt(this.size)] else null

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
    CUSTOM_RESOURCE_PACKS += FileSystemResourcePack(FabricLoader.getInstance().getModContainer(MODID).get().metadata, MODID, fileSystem)
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
