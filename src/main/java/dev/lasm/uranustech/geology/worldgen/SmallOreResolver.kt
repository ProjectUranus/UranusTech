package dev.lasm.uranustech.geology.worldgen

import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.block.MaterialOreBlock
import dev.lasm.uranustech.data.BlockGeneratorModel
import dev.lasm.uranustech.data.UranusTechMaterialBlocks
import dev.lasm.uranustech.geology.api.HostRockType
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.block.state.BlockState
import java.util.concurrent.ConcurrentHashMap

/**
 * Turns a small ore's material into the small ore block states to place.
 *
 * A small ore uses the material's `ORE_SMALL` block, `uranustech:small_ore_<material>`, which like the
 * regular ore carries a `host_rock` property, so one state is kept per host rock. The result is
 * immutable and cached per material.
 */
object SmallOreResolver {
    private val byMaterial = ConcurrentHashMap<ResourceKey<Material>, Map<HostRockType, BlockState>>()

    fun resolve(ore: SmallOre): Map<HostRockType, BlockState> =
        byMaterial.computeIfAbsent(ore.material) { material ->
            val entry = UranusTechMaterialBlocks[material, BlockGeneratorModel.ORE_SMALL]
                ?: error(
                    "Small ore references ${material.location()}, which has no small ore block. " +
                        "Give the material the ORES generator tag."
                )
            val base = entry.block.get().defaultBlockState()
            val property = MaterialOreBlock.HOST_ROCK
            HashMap<HostRockType, BlockState>(HostRockType.entries.size).apply {
                for (type in HostRockType.entries) put(type, base.setValue(property, type))
            }
        }
}
