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
 * Turns a vein's ore reference into the block states that are actually placed.
 *
 * A material reference expands through the material block registry to that material's ore block,
 * `uranustech:<material>_ore`. Ore blocks carry a `host_rock` property, so one block state is kept per
 * host rock type: the host of the block being replaced is copied onto the ore, which is why a single
 * ore reference can produce a whole family of states.
 *
 * Thread safety: chunk generation runs on several workers at once, so both caches are concurrent and
 * the resolved maps are immutable once built. The resolver holds no other mutable state, and
 * resolution only reads registries, which are frozen by the time generation starts.
 *
 * A reference to a material without a dense ore block is a mistake in the vein data and fails
 * loudly, rather than leaving a hole in the world.
 */
object OreResolver {
    private val byMaterial = ConcurrentHashMap<ResourceKey<Material>, Map<HostRockType, BlockState>>()
    private val byBlocks = ConcurrentHashMap<List<BlockState>, Map<HostRockType, BlockState>>()

    /** States to place for [ref], keyed by the host rock being replaced. */
    fun resolve(ref: OreRef): Map<HostRockType, BlockState> = when (ref) {
        is OreRef.None -> emptyMap()
        is OreRef.OfBlocks -> byBlocks.computeIfAbsent(ref.blocks) { expand(it) }
        is OreRef.OfMaterial -> byMaterial.computeIfAbsent(ref.material) { expandMaterial(it) }
    }

    private fun expandMaterial(material: ResourceKey<Material>): Map<HostRockType, BlockState> {
        val entry = UranusTechMaterialBlocks[material, BlockGeneratorModel.ORE]
            ?: error(
                "Ore vein references ${material.location()}, which has no ore block. " +
                    "Give the material the ORES generator tag or use an explicit block list."
            )
        return expand(listOf(entry.block.get().defaultBlockState()))
    }

    private fun expand(states: List<BlockState>): Map<HostRockType, BlockState> {
        val property = MaterialOreBlock.HOST_ROCK
        val result = HashMap<HostRockType, BlockState>(HostRockType.entries.size)
        for (state in states) {
            // A block without the property behaves the same for every host rock.
            val hasProperty = state.hasProperty(property)
            for (type in HostRockType.entries) {
                result.putIfAbsent(type, if (hasProperty) state.setValue(property, type) else state)
            }
        }
        check(result.isNotEmpty()) { "Ore reference resolved to no block states" }
        return result
    }

    /** State for one host rock, falling back to the stone variant for the plain-block case. */
    fun stateFor(states: Map<HostRockType, BlockState>, host: HostRockType): BlockState =
        states[host] ?: states.getValue(HostRockType.STONE)
}
