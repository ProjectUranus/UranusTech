package dev.lasm.uranustech.geology

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.data.resource.UranusGenDynamicResourcePack
import dev.lasm.uranustech.geology.api.HostRockRegistry
import dev.lasm.uranustech.geology.init.UranusGenBlocks
import dev.lasm.uranustech.geology.init.UranusGenItems
import dev.lasm.uranustech.geology.worldgen.GeologyConfig
import dev.lasm.uranustech.geology.worldgen.GeologyFeature
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.levelgen.feature.Feature
import net.neoforged.bus.api.IEventBus
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

/** Registration coordinator for the UranusGen geology module inside UranusTech. */
object UranusGen {
    private val FEATURES: DeferredRegister<Feature<*>> = DeferredRegister.create(Registries.FEATURE, UranusTech.MODID)

    /**
     * The one geology feature: rock layers and every ore in them, in a single pass.
     *
     * Rock layers, veins, contact ores and small ores used to be four features in the same step, which
     * meant each later one had to read back what the earlier one wrote. They are one pass now, because
     * they are one decision per column; see [GeologyFeature].
     */
    val GEOLOGY: DeferredHolder<Feature<*>, GeologyFeature> =
        FEATURES.register("geology", Supplier { GeologyFeature(GeologyConfig.CODEC) })

    fun initialize(bus: IEventBus) {
        HostRockRegistry.bootstrapDefaults()
        // Force item registration before attaching UranusTech's shared DeferredRegisters to the bus.
        UranusGenItems.ROCK_ITEMS
        UranusTech.CREATIVE_MODE_TABS.register("geology", Supplier {
            CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.uranustech.geology"))
                .icon { UranusGenBlocks.GRANITE_BLACK.get().asItem().defaultInstance }
                .displayItems { _, output ->
                    UranusGenItems.ROCK_ITEMS.values.forEach { output.accept(it.get()) }
                    output.accept(Blocks.GRANITE)
                    output.accept(Blocks.DIORITE)
                    output.accept(Blocks.ANDESITE)
                    output.accept(UranusGenItems.CRUDE_OIL_BUCKET.get())
                }.build()
        })
        FEATURES.register(bus)
        bus.addListener(UranusGenDynamicResourcePack::addPackFinder)
    }
}
