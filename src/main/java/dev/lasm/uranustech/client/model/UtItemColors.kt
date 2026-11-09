package dev.lasm.uranustech.client.model

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.data.UranusTechMaterialItems
import net.minecraft.world.item.Item
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent
import java.util.IdentityHashMap

@EventBusSubscriber(modid = UranusTech.MODID, value = [Dist.CLIENT], bus = EventBusSubscriber.Bus.MOD)
object UtItemColors {
    private val items by lazy { UranusTechMaterialItems.values().map { it.get() }.toTypedArray() }
    private val colors: Map<Item, Int> by lazy {
        val materials = UranusTech.BUILTIN_MATERIALS.associate { material ->
            val color = material.appearance.colorSolid
            ref(material.id) to ((color.a shl 24) or (color.r shl 16) or (color.g shl 8) or color.b)
        }
        IdentityHashMap<Item, Int>().apply {
            for (item in items) put(item, materials[item.material] ?: -1)
        }
    }

    @SubscribeEvent
    fun registerItemColors(event: RegisterColorHandlersEvent.Item) {
        val cachedColors = colors
        event.register({ stack, tintIndex ->
            if (tintIndex == 0) cachedColors[stack.item] ?: -1 else -1
        }, *items)
    }
}
