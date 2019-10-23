package com.projecturanus.uranustech

import com.projecturanus.uranustech.common.materialRegistry
import com.projecturanus.uranustech.common.recipe.registerToolRecipes
import com.projecturanus.uranustech.common.registerBuiltin
import com.projecturanus.uranustech.common.registerCommands
import com.projecturanus.uranustech.common.resource.UTResourceListener
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.resource.ResourceManagerHelper
import net.minecraft.resource.ResourceType
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.apache.logging.log4j.LogManager

const val MODID = "uranustech"
val logger = LogManager.getFormatterLogger("UranusTech")

object UranusTech: ModInitializer {
    override fun onInitialize() {
        logger.info("[UranusTech] Initializing...")
        Registry.REGISTRIES.add(Identifier(MODID, "material"), materialRegistry)
        ResourceManagerHelper.get(ResourceType.SERVER_DATA).registerReloadListener(UTResourceListener)
        registerBuiltin()
        registerToolRecipes()
        registerCommands()
//        registerResources()
        logger.info("[UranusTech] Initialization Complete")
    }
}
