package dev.lasm.uranustech

import dev.lasm.uranustech.UranusTech.LOGGER
import net.minecraft.client.Minecraft
import net.minecraft.client.gui.screens.Screen
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.ModContainer
import net.neoforged.fml.ModLoadingContext
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.common.Mod
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import net.neoforged.neoforge.client.gui.ConfigurationScreen
import net.neoforged.neoforge.client.gui.IConfigScreenFactory

@Mod(
    value = UranusTech.MODID,
    dist = [Dist.CLIENT]
)
@EventBusSubscriber(modid = UranusTech.MODID, value = [Dist.CLIENT])
object UranusTechClient {
    init {
        val container = ModLoadingContext.get().activeContainer

        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(
            IConfigScreenFactory::class.java,
            IConfigScreenFactory { mod: ModContainer, parent: Screen -> ConfigurationScreen(mod, parent) })

    }

    @SubscribeEvent
    fun onClientSetup(event: FMLClientSetupEvent) {
        // Some client setup code
        LOGGER.info("HELLO FROM CLIENT SETUP")
        LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().user.name)

        
    }
}
