package dev.lasm.uranustech.client.model

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.data.UranusTechMaterialBlocks
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent
import java.util.IdentityHashMap

@EventBusSubscriber(modid = UranusTech.MODID, value = [Dist.CLIENT], bus = EventBusSubscriber.Bus.MOD)
object UtBlockColors {
    private val materialBlocks by lazy { UranusTechMaterialBlocks.values() }
    private val blockColors: Map<Block, Int> by lazy {
        IdentityHashMap<Block, Int>().apply { materialBlocks.forEach { put(it.block.get(), it.color) } }
    }
    private val itemColors: Map<Item, Int> by lazy {
        IdentityHashMap<Item, Int>().apply { materialBlocks.forEach { put(it.item.get(), it.color) } }
    }

    @SubscribeEvent
    fun registerBlockColors(event: RegisterColorHandlersEvent.Block) {
        val colors = blockColors
        // Inline array here so that it gets cleared after registeration
        val blocks = materialBlocks.map { it.block.get() }.toTypedArray()
        event.register({ state, _, _, tintIndex ->
            if (tintIndex == 0) colors[state.block] ?: -1 else -1
        }, *blocks)
    }

    @SubscribeEvent
    fun registerItemColors(event: RegisterColorHandlersEvent.Item) {
        val colors = itemColors
        // Inline array here so that it gets cleared after registeration
        val items = materialBlocks.map { it.item.get() }.toTypedArray()
        event.register({ stack, tintIndex ->
            if (tintIndex == 0) colors[stack.item] ?: -1 else -1
        }, *items)
    }
}
