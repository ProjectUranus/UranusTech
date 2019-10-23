package com.projecturanus.uranustech.common.resource

import com.projecturanus.uranustech.MODID
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener
import net.minecraft.resource.ResourceManager
import net.minecraft.util.Identifier

object UTResourceListener: SimpleSynchronousResourceReloadListener {
    override fun apply(resourceManager: ResourceManager) {
    }

    override fun getFabricId(): Identifier = Identifier(MODID, "basic")
}
