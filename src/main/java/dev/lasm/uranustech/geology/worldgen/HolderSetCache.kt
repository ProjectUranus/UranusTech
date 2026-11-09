package dev.lasm.uranustech.geology.worldgen

import net.minecraft.core.HolderSet
import java.util.concurrent.ConcurrentHashMap

/**
 * Values derived from a holder set, built once and shared across chunk workers.
 *
 * A feature instance is reused for every chunk of a world and several workers may run it at once, so
 * anything derived purely from the config is built through [ConcurrentHashMap.computeIfAbsent] and is
 * immutable afterwards. The key is the holder set from the feature's config, of which a world has a
 * handful, so the map never grows during play; [HolderSet] has value equality, so the same config
 * always maps to the same value.
 *
 * The holder set's element type is erased here on purpose: the map is one field of one feature, and
 * the only thing that matters about the key is which config it came from.
 */
internal class HolderSetCache<V : Any> {
    private val entries = ConcurrentHashMap<HolderSet<*>, V>()

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> value(key: HolderSet<T>, factory: (HolderSet<T>) -> V): V =
        entries.computeIfAbsent(key) { factory(key as HolderSet<T>) } as V
}
