package dev.lasm.uranustech.geology.worldgen

import dev.lasm.uranustech.UranusTech
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent

/**
 * Resolves every vein, contact ore and small ore as soon as the datapack registries are available.
 *
 * [OreResolver] and [SmallOreResolver] both fail on a reference to a material without the matching ore
 * block, but they only do so when that entry is first generated, which is a confusing place to learn
 * about a mistake in a JSON file. Resolving everything here reports the offending entry by name, once,
 * at startup, instead of failing part way through world generation.
 *
 * Resolution also warms the caches, so the first chunk that needs a vein does not pay for it while a
 * chunk worker is busy.
 */
object OreVeinValidator {
    @SubscribeEvent
    fun onServerAboutToStart(event: ServerAboutToStartEvent) {
        val access = event.server.registryAccess()
        val veins = access.registryOrThrow(UranusTech.ORE_VEIN_REGISTRY_KEY)
        for ((key, vein) in veins.entrySet()) {
            for (ref in listOf(vein.bottom, vein.top, vein.between, vein.spread)) {
                if (ref === OreRef.None) continue
                try {
                    OreResolver.resolve(ref)
                } catch (error: IllegalStateException) {
                    throw IllegalStateException("Ore vein ${key.location()} is invalid: ${error.message}", error)
                }
            }
        }

        val smallOres = access.registryOrThrow(UranusTech.SMALL_ORE_REGISTRY_KEY)
        for ((key, ore) in smallOres.entrySet()) {
            try {
                SmallOreResolver.resolve(ore)
            } catch (error: IllegalStateException) {
                throw IllegalStateException("Small ore ${key.location()} is invalid: ${error.message}", error)
            }
        }

        val contactOres = access.registryOrThrow(UranusTech.DOUBLE_LAYER_REGISTRY_KEY)
        for ((key, ore) in contactOres.entrySet()) {
            if (ore.ore === OreRef.None) {
                throw IllegalStateException("Contact ore ${key.location()} has no ore reference")
            }
            try {
                OreResolver.resolve(ore.ore)
            } catch (error: IllegalStateException) {
                throw IllegalStateException("Contact ore ${key.location()} is invalid: ${error.message}", error)
            }
        }

        UranusTech.LOGGER.info(
            "Validated {} ore veins, {} contact ores and {} small ores",
            veins.size(), contactOres.size(), smallOres.size()
        )
    }
}
