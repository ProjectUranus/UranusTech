package dev.lasm.uranustech.client.model

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.data.UranusTechMaterialFluids
import net.minecraft.client.renderer.ItemBlockRenderTypes
import net.minecraft.client.renderer.RenderType
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent
import java.util.IdentityHashMap

@EventBusSubscriber(modid = UranusTech.MODID, value = [Dist.CLIENT], bus = EventBusSubscriber.Bus.MOD)
object UtFluidColors {
    private val fluids by lazy { UranusTechMaterialFluids.values() }
    private val buckets by lazy { fluids.map { it.bucket.get() }.toTypedArray() }
    private val colors: Map<Item, Int> by lazy {
        IdentityHashMap<Item, Int>().apply { fluids.forEach { put(it.bucket.get(), it.color) } }
    }

    @SubscribeEvent
    fun registerFluidExtensions(event: RegisterClientExtensionsEvent) {
        fluids.forEach { fluid ->
            event.registerFluidType(object : IClientFluidTypeExtensions {
                override fun getStillTexture(): ResourceLocation = fluid.texture
                override fun getFlowingTexture(): ResourceLocation = fluid.flowingTexture
                override fun getTintColor(): Int = fluid.color
            }, fluid.type.get())
        }
    }

    @SubscribeEvent
    fun registerItemColors(event: RegisterColorHandlersEvent.Item) {
        val cachedColors = colors
        event.register({ stack, tintIndex ->
            // NeoForge's fluid-container model reserves tint 1 for the fluid, tint 0 for the bucket.
            if (tintIndex == 1) cachedColors[stack.item] ?: -1 else -1
        }, *buckets)
    }

    @SubscribeEvent
    fun clientSetup(event: FMLClientSetupEvent) {
        event.enqueueWork {
            fluids.forEach { fluid ->
                ItemBlockRenderTypes.setRenderLayer(fluid.source.get(), RenderType.translucent())
                ItemBlockRenderTypes.setRenderLayer(fluid.flowing.get(), RenderType.translucent())
            }
        }
    }
}
