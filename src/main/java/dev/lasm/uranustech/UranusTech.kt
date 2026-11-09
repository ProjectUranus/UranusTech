package dev.lasm.uranustech

import com.mojang.logging.LogUtils
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.data.UranusTechMaterialBlocks
import dev.lasm.uranustech.data.UranusTechMaterialFluids
import dev.lasm.uranustech.data.UranusTechMaterialItems
import dev.lasm.uranustech.data.materials.initAllMaterials
import dev.lasm.uranustech.data.resource.UranusTechDynamicItemTagPack
import dev.lasm.uranustech.data.resource.UranusTechDynamicRecipePack
import dev.lasm.uranustech.data.resource.UranusTechDynamicResourcePack
import dev.lasm.uranustech.geology.UranusGen
import dev.lasm.uranustech.geology.command.GeologyCommands
import dev.lasm.uranustech.geology.worldgen.DoubleLayerOre
import dev.lasm.uranustech.geology.worldgen.OreVein
import dev.lasm.uranustech.geology.worldgen.OreVeinValidator
import dev.lasm.uranustech.geology.worldgen.SmallOre
import dev.lasm.uranustech.utils.rloc
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.level.block.Blocks
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.ModLoadingContext
import net.neoforged.fml.common.Mod
import net.neoforged.fml.config.ModConfig
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent
import net.neoforged.neoforge.common.NeoForge
import net.neoforged.neoforge.event.server.ServerStartingEvent
import net.neoforged.neoforge.registries.DataPackRegistryEvent
import net.neoforged.neoforge.registries.DeferredRegister
import net.neoforged.neoforge.registries.NewRegistryEvent
import net.neoforged.neoforge.registries.RegistryBuilder
import org.slf4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Suppress("unused")
@Mod(UranusTech.MODID)
object UranusTech {
    // Define mod id in a common place for everything to reference
    const val MODID: String = "uranustech"

    val LOGGER: Logger = LogUtils.getLogger()

    // Create a Deferred Register to hold Blocks which will all be registered under the "uranustech" namespace
    val BLOCKS: DeferredRegister.Blocks = DeferredRegister.createBlocks(MODID)

    // Create a Deferred Register to hold Items which will all be registered under the "uranustech" namespace
    val ITEMS: DeferredRegister.Items = DeferredRegister.createItems(MODID)

    val MATERIAL_REGISTRY_KEY: ResourceKey<Registry<Material>> = ResourceKey.createRegistryKey(rloc("materials"))
    val MATERIAL_REGISTRY: Registry<Material> = RegistryBuilder(MATERIAL_REGISTRY_KEY)
        .sync(true).create()

    /**
     * Vein identities live in their own datapack registry, so a vein name is independent of the
     * materials it yields and data packs can add veins without code changes.
     */
    val ORE_VEIN_REGISTRY_KEY: ResourceKey<Registry<OreVein>> = ResourceKey.createRegistryKey(rloc("ore_vein"))

    /** Small ore deposits, also datapack data: one material, a height range and an amount. */
    val SMALL_ORE_REGISTRY_KEY: ResourceKey<Registry<SmallOre>> = ResourceKey.createRegistryKey(rloc("small_ore"))

    /** Ores that form at the contact between two rock layers. */
    val DOUBLE_LAYER_REGISTRY_KEY: ResourceKey<Registry<DoubleLayerOre>> =
        ResourceKey.createRegistryKey(rloc("double_layer_ore"))

    val MATERIALS: DeferredRegister<Material> = DeferredRegister.create(MATERIAL_REGISTRY, MODID)

    internal val BUILTIN_MATERIALS: MutableList<Material> = mutableListOf()

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "uranustech" namespace
    val CREATIVE_MODE_TABS: DeferredRegister<CreativeModeTab> =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID)

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    init {
        // Register the commonSetup method for modloading
        MOD_BUS.addListener(this::commonSetup)


        initAllMaterials()

        MATERIALS.register(MOD_BUS)

        UranusTechMaterialItems.registerMaterialItems()
        UranusTechMaterialItems.registerCreativeTabs()
        UranusTechMaterialBlocks.registerMaterialBlocks()
        UranusTechMaterialBlocks.registerCreativeTabs()
        UranusTechMaterialFluids.registerMaterialFluids(MOD_BUS)
        UranusTechMaterialFluids.registerCreativeTabs()
        UranusGen.initialize(MOD_BUS)

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(MOD_BUS)
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(MOD_BUS)
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(MOD_BUS)

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (UranusTech) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this)

        MOD_BUS.addListener(UranusTechDynamicResourcePack::addPackFinder)
        MOD_BUS.addListener(UranusTechDynamicItemTagPack::addPackFinder)
        MOD_BUS.addListener(UranusTechDynamicRecipePack::addPackFinder)

        MOD_BUS.addListener(this::registerRegistries)
        MOD_BUS.addListener(this::registerDatapackRegistries)


        val container = ModLoadingContext.get().activeContainer

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC)

        NeoForge.EVENT_BUS.register(OreVeinValidator)
        NeoForge.EVENT_BUS.register(GeologyCommands)
    }

    private fun commonSetup(event: FMLCommonSetupEvent) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP")

        if (Config.LOG_DIRT_BLOCK.asBoolean) {
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT))
        }

        LOGGER.info("{}{}", Config.MAGIC_NUMBER_INTRODUCTION.get(), Config.MAGIC_NUMBER.asInt)

        Config.ITEM_STRINGS.get().forEach { item: String -> LOGGER.info("ITEM >> {}", item) }


    }

    private fun registerRegistries(event: NewRegistryEvent) {
        event.register(MATERIAL_REGISTRY)
    }

    private fun registerDatapackRegistries(event: DataPackRegistryEvent.NewRegistry) {
        event.dataPackRegistry(ORE_VEIN_REGISTRY_KEY, OreVein.DIRECT_CODEC)
        event.dataPackRegistry(SMALL_ORE_REGISTRY_KEY, SmallOre.DIRECT_CODEC)
        event.dataPackRegistry(DOUBLE_LAYER_REGISTRY_KEY, DoubleLayerOre.DIRECT_CODEC)
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    fun onServerStarting(event: ServerStartingEvent) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting")
    }



}
