package dev.lasm.uranustech.geology.worldgen

import com.mojang.datafixers.util.Either
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
import net.minecraft.world.level.block.state.BlockState

/**
 * An ore vein, addressed by vein name rather than by the material it yields.
 *
 * Vein names are their own set of identities: `uranustech:sapphire` is the sapphire vein, and the
 * blocks it places are whatever the vein data says. For that entry they are blue, orange, yellow and
 * green sapphire plus ruby, but name and materials are independent, so a pack can point the sapphire
 * vein at different materials or add a vein that shares nothing with its name.
 *
 * The four roles reproduce GT6's `WorldgenOresLarge`: `bottom` is the body below the vein centre,
 * `top` the body above it, `between` the slab just above the centre and `spread` the scattered
 * pockets around the height. A role that is absent from the JSON becomes [OreRef.None], and an entry
 * whose four roles are all absent is rejected.
 *
 * Heights are world heights, not offsets. The centre is drawn in `min_y until max_y - 5`, which is
 * why the codec requires more than five blocks between them.
 */
data class OreVein(
    val weight: Int,
    val density: Int,
    val size: Int,
    val minY: Int,
    val maxY: Int,
    val hostRocks: Set<HostRockType> = emptySet(),
    val bottom: OreRef = OreRef.None,
    val top: OreRef = OreRef.None,
    val between: OreRef = OreRef.None,
    val spread: OreRef = OreRef.None
) {
    init {
        require(weight >= 1) { "weight must be positive" }
        require(density >= 1) { "density must be positive" }
        require(size >= 1) { "size must be positive" }
        require(maxY - minY > 5) { "max_y must be more than 5 above min_y" }
        require(!isEmpty) { "An ore vein needs at least one of bottom, top, between or spread" }
    }

    /** True when the vein has no ore at all, which makes it useless as world generation. */
    val isEmpty: Boolean get() = bottom === OreRef.None && top === OreRef.None &&
        between === OreRef.None && spread === OreRef.None

    /** True when this vein may replace the given rock. Empty means any rock is allowed. */
    fun allowsHost(host: HostRockType): Boolean = hostRocks.isEmpty() || host in hostRocks

    companion object {
        /**
         * Rock layers a vein may spawn in.
         *
         * Empty means any rock. This is what makes a material exclusive to one layer, the way GT6's
         * underground ores are tied to the stone layer they sit in rather than to a biome.
         */
        private val HOST_ROCKS: Codec<Set<HostRockType>> =
            StringRepresentable.fromEnum(HostRockType::values).listOf()
                .xmap({ it.toSet() }, { it.toList() })

        val DIRECT_CODEC: Codec<OreVein> = RecordCodecBuilder.create { instance ->
            instance.group(
                Codec.intRange(1, 32767).fieldOf("weight").forGetter(OreVein::weight),
                Codec.intRange(1, 64).fieldOf("density").forGetter(OreVein::density),
                Codec.intRange(1, 64).fieldOf("size").forGetter(OreVein::size),
                Codec.INT.fieldOf("min_y").forGetter(OreVein::minY),
                Codec.INT.fieldOf("max_y").forGetter(OreVein::maxY),
                HOST_ROCKS.optionalFieldOf("host_rocks", emptySet()).forGetter(OreVein::hostRocks),
                OreRef.CODEC.optionalFieldOf("bottom", OreRef.None).forGetter(OreVein::bottom),
                OreRef.CODEC.optionalFieldOf("top", OreRef.None).forGetter(OreVein::top),
                OreRef.CODEC.optionalFieldOf("between", OreRef.None).forGetter(OreVein::between),
                OreRef.CODEC.optionalFieldOf("spread", OreRef.None).forGetter(OreVein::spread)
            ).apply(instance, ::OreVein)
        }

        val CODEC: Codec<Holder<OreVein>> = RegistryFileCodec.create(UranusTech.ORE_VEIN_REGISTRY_KEY, DIRECT_CODEC)

        val LIST_CODEC: Codec<HolderSet<OreVein>> =
            RegistryCodecs.homogeneousList(UranusTech.ORE_VEIN_REGISTRY_KEY, DIRECT_CODEC)
    }
}

/**
 * What a vein places in one role.
 *
 * [OfMaterial] names a material and expands to that material's ore block at generation time, so a
 * single entry covers every host rock. [OfBlocks] names blocks directly, for veins that are not
 * about one material. [None] means the vein has no ore in this role.
 */
sealed interface OreRef {
    data object None : OreRef

    data class OfMaterial(val material: ResourceKey<Material>) : OreRef

    data class OfBlocks(val blocks: List<BlockState>) : OreRef

    companion object {
        private val EITHER: Codec<Either<ResourceKey<Material>, List<BlockState>>> = Codec.either(
            ResourceKey.codec(UranusTech.MATERIAL_REGISTRY_KEY),
            BlockState.CODEC.listOf()
        )

        val CODEC: Codec<OreRef> = EITHER.xmap(
            { either -> either.map({ OfMaterial(it) }, { OfBlocks(it) }) },
            { ref: OreRef ->
                when (ref) {
                    is OfMaterial -> Either.left(ref.material)
                    is OfBlocks -> Either.right(ref.blocks)
                    is None -> Either.left(NONE_MATERIAL)
                }
            }
        )

        /** Written when a [None] role is serialized; never read back from hand written data. */
        private val NONE_MATERIAL: ResourceKey<Material> = ResourceKey.create(
            UranusTech.MATERIAL_REGISTRY_KEY,
            dev.lasm.uranustech.utils.rloc("none")
        )
    }
}
