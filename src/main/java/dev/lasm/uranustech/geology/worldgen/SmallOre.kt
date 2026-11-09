package dev.lasm.uranustech.geology.worldgen

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder
import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.core.Holder
import net.minecraft.core.HolderSet
import net.minecraft.core.RegistryCodecs
import net.minecraft.resources.RegistryFileCodec
import net.minecraft.resources.ResourceKey
import net.minecraft.util.StringRepresentable

/**
 * A small ore deposit: a handful of single small-ore blocks scattered through one chunk.
 *
 * This is separate from [OreVein] because it is a different thing in the world: a vein is a large,
 * named, multi-material body with its own geometry, while a small ore is a scattering of one material
 * that tells you what is nearby. In GT6 it is the main way to find a material before you can mine the
 * vein that holds it. Keeping them apart as data means a pack can add either without the other.
 *
 * `amount` is GT6's per-chunk amount setting, halved and jittered into a count, so a large value gives
 * a denser scatter rather than a bigger blob.
 */
data class SmallOre(
    val material: ResourceKey<Material>,
    val minY: Int,
    val maxY: Int,
    val amount: Int,
    val hostRocks: Set<HostRockType> = emptySet()
) {
    init {
        require(amount >= 1) { "amount must be positive" }
        require(maxY > minY) { "max_y must be above min_y" }
    }

    /** True when this deposit may appear in the given rock. Empty means any rock is allowed. */
    fun allowsHost(host: HostRockType): Boolean = hostRocks.isEmpty() || host in hostRocks

    companion object {
        /**
         * Rock layers a deposit may appear in, empty for any.
         *
         * GT6 ties an underground material to the layer it belongs to, which is how a gem can be
         * exclusive to one rock type instead of appearing everywhere its height range allows.
         */
        private val HOST_ROCKS: Codec<Set<HostRockType>> =
            StringRepresentable.fromEnum(HostRockType::values).listOf()
                .xmap({ it.toSet() }, { it.toList() })

        val DIRECT_CODEC: Codec<SmallOre> = RecordCodecBuilder.create { instance ->
            instance.group(
                ResourceKey.codec(UranusTech.MATERIAL_REGISTRY_KEY).fieldOf("material").forGetter(SmallOre::material),
                Codec.INT.fieldOf("min_y").forGetter(SmallOre::minY),
                Codec.INT.fieldOf("max_y").forGetter(SmallOre::maxY),
                Codec.intRange(1, 256).fieldOf("amount").forGetter(SmallOre::amount),
                HOST_ROCKS.optionalFieldOf("host_rocks", emptySet()).forGetter(SmallOre::hostRocks)
            ).apply(instance, ::SmallOre)
        }

        val CODEC: Codec<Holder<SmallOre>> = RegistryFileCodec.create(UranusTech.SMALL_ORE_REGISTRY_KEY, DIRECT_CODEC)

        val LIST_CODEC: Codec<HolderSet<SmallOre>> =
            RegistryCodecs.homogeneousList(UranusTech.SMALL_ORE_REGISTRY_KEY, DIRECT_CODEC)
    }
}
