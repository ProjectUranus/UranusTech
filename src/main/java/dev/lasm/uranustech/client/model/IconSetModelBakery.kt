package dev.lasm.uranustech.client.model

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.data.ItemGeneratorModelMap
import dev.lasm.uranustech.data.BlockGeneratorModelMap
import net.minecraft.client.resources.model.ModelResourceLocation
import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.client.event.ModelEvent

@EventBusSubscriber(modid = UranusTech.MODID, value = [Dist.CLIENT], bus = EventBusSubscriber.Bus.MOD)
object IconSetModelBakery {
    private val assignments: Map<ModelResourceLocation, List<ModelResourceLocation>> by lazy {
        val itemModels = ItemGeneratorModelMap.assignments() +
            BlockGeneratorModelMap.assignments().mapValues { (_, model) -> model.id }
        itemModels.entries.groupBy({ it.value }, { ModelResourceLocation.inventory(it.key) })
            .mapKeys { (model, _) -> ModelResourceLocation.standalone(model) }
    }

    @SubscribeEvent
    fun registerAdditionalModels(event: ModelEvent.RegisterAdditional) {
        assignments.keys.forEach(event::register)
    }

    @SubscribeEvent
    fun registerModels(event: ModelEvent.ModifyBakingResult) {
        val models = event.models
        val missingModels = mutableSetOf<ModelResourceLocation>()
        var mappedItems = 0

        for ((sharedLocation, items) in assignments) {
            val sharedModel = models[sharedLocation]
            if (sharedModel == null) {
                missingModels += sharedLocation
                continue
            }

            for (item in items) models[item] = sharedModel
            mappedItems += items.size
        }

        if (missingModels.isNotEmpty()) {
            UranusTech.LOGGER.error("Could not load {} shared material item model(s): {}", missingModels.size, missingModels)
        } else {
            UranusTech.LOGGER.info("Mapped {} material item(s) to {} shared icon model(s)", mappedItems, assignments.size)
        }
    }
}
