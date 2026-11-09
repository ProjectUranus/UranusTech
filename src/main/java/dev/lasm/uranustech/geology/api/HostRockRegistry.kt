package dev.lasm.uranustech.geology.api

import dev.lasm.uranustech.geology.init.UranusGenBlocks
import dev.lasm.uranustech.utils.rloc
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockState
import java.util.EnumMap
import java.util.IdentityHashMap
import java.util.function.Supplier

object HostRockRegistry {
    data class HostRock(
        val type: HostRockType,
        val id: ResourceLocation,
        val block: Supplier<out Block>,
        val texture: ResourceLocation
    ) {
        fun defaultState(): BlockState = block.get().defaultBlockState()
    }

    private val rocks = EnumMap<HostRockType, HostRock>(HostRockType::class.java)
    @Volatile
    private var cachedValues: List<HostRock>? = null
    // World generation can query this from several chunk workers at once.
    private val rocksByBlock: Map<Block, HostRock> by lazy {
        IdentityHashMap<Block, HostRock>().apply {
            rocks.values.forEach { put(it.block.get(), it) }
        }
    }

    fun register(type: HostRockType, id: ResourceLocation, block: Supplier<out Block>, texture: ResourceLocation) {
        check(type !in rocks) { "Host rock already registered: $type" }
        rocks[type] = HostRock(type, id, block, texture)
        cachedValues = null
    }

    fun get(state: BlockState): HostRock? = rocksByBlock[state.block]

    fun byType(type: HostRockType): HostRock? = rocks[type]

    fun values(): List<HostRock> {
        cachedValues?.let { return it }
        return synchronized(this) {
            cachedValues ?: rocks.values.toList().also { cachedValues = it }
        }
    }

    fun bootstrapDefaults() {
        if (rocks.isNotEmpty()) return
        val vanilla = listOf(Blocks.STONE, Blocks.DEEPSLATE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE)
        HostRockType.entries.take(5).zip(vanilla).forEach { (type, block) ->
            val id = type.serializedName
            register(type, rloc("minecraft", id), Supplier { block }, rloc("minecraft", "block/$id"))
        }
        HostRockType.entries.drop(5).forEach { type ->
            val id = type.serializedName
            register(type, rloc(id), UranusGenBlocks.NATURAL_STONES.getValue(id), rloc("block/stones/$id/stone"))
        }
    }
}
