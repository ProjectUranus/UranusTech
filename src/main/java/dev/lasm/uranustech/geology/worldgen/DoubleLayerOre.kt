package dev.lasm.uranustech.geology.worldgen

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder
import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.core.Holder
import net.minecraft.core.HolderSet
import net.minecraft.core.RegistryCodecs
import net.minecraft.resources.RegistryFileCodec
import net.minecraft.util.StringRepresentable

/**
 * An ore that forms at the contact between two rock layers.
 *
 * This is GT6's "double layer" or "topbottom" ore. Where two different rock types meet, one of them
 * being [first] and the other [second], the seam between them may hold ore. It is a different shape of
 * deposit from a vein: a vein is a scattered body inside one rock type, while a contact ore is a thin
 * sheet along a boundary, and that is why it is a separate registry and a separate feature.
 *
 * [bothDirections] reproduces GT6's two helpers. `topbottom(A, B)` matches only `A` above `B`, while
 * `bothsides(A, B)` matches either order. Most GT6 entries are bidirectional, but a few are not, and
 * the difference matters for ores whose host rock has a preferred side.
 *
 * The ore is whatever the four roles resolve to, and only one block per contact column is placed, so a
 * seam is a line of single blocks rather than a layer of its own.
 */
data class DoubleLayerOre(
    val first: HostRockType,
    val second: HostRockType,
    val weight: Int,
    val density: Int,
    val minY: Int,
    val maxY: Int,
    val bothDirections: Boolean = true,
    val ore: OreRef = OreRef.None
) {
    init {
        require(first != second) { "A contact ore needs two different rock types" }
        require(weight >= 1) { "weight must be positive" }
        require(density >= 1) { "density must be positive" }
        require(maxY > minY) { "max_y must be above min_y" }
        require(ore !== OreRef.None) { "A contact ore needs an ore reference" }
    }

    /** True when this pair of rocks, in this order, matches this entry. */
    fun matches(upper: HostRockType, lower: HostRockType): Boolean =
        (upper == first && lower == second) ||
            (bothDirections && upper == second && lower == first)

    companion object {
        internal val HOST_ROCK: Codec<HostRockType> = StringRepresentable.fromEnum(HostRockType::values)

        val DIRECT_CODEC: Codec<DoubleLayerOre> = RecordCodecBuilder.create { instance ->
            instance.group(
                HOST_ROCK.fieldOf("first").forGetter(DoubleLayerOre::first),
                HOST_ROCK.fieldOf("second").forGetter(DoubleLayerOre::second),
                Codec.intRange(1, 32767).fieldOf("weight").forGetter(DoubleLayerOre::weight),
                Codec.intRange(1, 64).fieldOf("density").forGetter(DoubleLayerOre::density),
                Codec.INT.fieldOf("min_y").forGetter(DoubleLayerOre::minY),
                Codec.INT.fieldOf("max_y").forGetter(DoubleLayerOre::maxY),
                Codec.BOOL.optionalFieldOf("both_directions", true).forGetter(DoubleLayerOre::bothDirections),
                OreRef.CODEC.fieldOf("ore").forGetter(DoubleLayerOre::ore)
            ).apply(instance, ::DoubleLayerOre)
        }

        val CODEC: Codec<Holder<DoubleLayerOre>> =
            RegistryFileCodec.create(UranusTech.DOUBLE_LAYER_REGISTRY_KEY, DIRECT_CODEC)

        val LIST_CODEC: Codec<HolderSet<DoubleLayerOre>> =
            RegistryCodecs.homogeneousList(UranusTech.DOUBLE_LAYER_REGISTRY_KEY, DIRECT_CODEC)
    }
}
