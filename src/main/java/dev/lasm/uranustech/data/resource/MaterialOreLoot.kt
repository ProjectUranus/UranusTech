package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.MaterialTag
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.data.BlockGeneratorModel
import dev.lasm.uranustech.data.ItemGeneratorModel
import dev.lasm.uranustech.data.UranusTechMaterialBlocks
import dev.lasm.uranustech.data.UranusTechMaterialItems
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.add
import kotlinx.serialization.json.addJsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
import kotlinx.serialization.json.putJsonObject
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation

/** Cached ore drops selected from the material's registered item forms. */
internal object MaterialOreLoot {
    private data class Drop(val item: ResourceLocation, val count: Int = 1)
    private data class SmallOreDrops(val normal: List<JsonObject>, val silk: List<JsonObject>)
    private data class OreDrops(val normal: JsonObject?, val dense: JsonObject?, val small: SmallOreDrops)

    private val silkTouch = silkTouchCondition()
    private val withoutSilkTouch = buildJsonObject {
        put("condition", "minecraft:inverted")
        put("term", silkTouch)
    }
    private val survivesExplosion = buildJsonObject { put("condition", "minecraft:survives_explosion") }
    private val fortuneBonus = buildJsonObject {
        put("function", "minecraft:apply_bonus")
        put("enchantment", "minecraft:fortune")
        put("formula", "minecraft:ore_drops")
    }
    private val dropsByMaterial: Map<ResourceKey<Material>, OreDrops> by lazy {
        val materials = UranusTech.BUILTIN_MATERIALS.associateBy { ref(it.id) }
        val smallDropsByMaterial = mutableMapOf<ResourceKey<Material>, SmallOreDrops>()
        fun smallDrops(material: Material, key: ResourceKey<Material>): SmallOreDrops =
            smallDropsByMaterial.getOrPut(key) { smallOreDrops(material, key) }
        UranusTechMaterialBlocks.values().asSequence()
            .filter { it.generator.isOre }
            .distinctBy { it.key }
            .associate { entry ->
                val source = entry.material
                val targetKey = source.processing.crushingTarget?.ref?.takeIf { it in materials } ?: entry.key
                val target = materials[targetKey] ?: source
                val small = if (targetKey != entry.key) {
                    smallDrops(target, targetKey).takeIf { it.normal.isNotEmpty() }
                        ?: smallDrops(source, entry.key)
                } else {
                    smallDrops(source, entry.key)
                }
                val normal = registeredDrop(entry.key, ItemGeneratorModel.ORE_RAW)
                    ?: processedDrop(source, entry.key)
                    ?: if (targetKey != entry.key) processedDrop(target, targetKey) else null
                entry.key to OreDrops(
                    normal?.let { dropEntry(it) },
                    normal?.let { dropEntry(it.copy(count = scaledCount(it.count, 2))) },
                    small
                )
            }
    }

    private fun smallOreDrops(material: Material, key: ResourceKey<Material>): SmallOreDrops {
        val normal = mutableListOf<JsonObject>()
        val silk = mutableListOf<JsonObject>()
        val count = (material.processing.oreMultiplier.coerceAtLeast(1).toLong() *
            material.processing.oreProcessingMultiplier.coerceAtLeast(1))
            .coerceAtMost(Int.MAX_VALUE.toLong()).toInt()
        fun choice(drop: Drop?, normalWeight: Int, silkWeight: Int) {
            if (drop == null) return
            val scaled = drop.copy(count = scaledCount(count, drop.count))
            normal += dropEntry(scaled, normalWeight)
            silk += dropEntry(scaled, silkWeight)
        }

        val fragments = registeredDrop(key, ItemGeneratorModel.CRUSHED)
            ?: registeredDrop(key, ItemGeneratorModel.DUST)
        if (material.hasTag(MaterialTag.ItemGenerator.GEMS)) {
            val gem = registeredDrop(key, ItemGeneratorModel.GEM)
            choice(registeredDrop(key, ItemGeneratorModel.GEM_EXQUISITE)
                ?: gem?.copy(count = 4), 1, 3)
            choice(registeredDrop(key, ItemGeneratorModel.GEM_FLAWLESS)
                ?: gem?.copy(count = 2), 2, 6)
            choice(gem, 12, 6)

            // Missing grades retain GT6's fragment weights instead of inventing gem IDs.
            val flawed = registeredDrop(key, ItemGeneratorModel.GEM_FLAWED, 2)
            choice(flawed, 5, 10)
            choice(fragments, if (flawed != null) 10 else 15, if (flawed != null) 5 else 15)
            val chipped = registeredDrop(key, ItemGeneratorModel.GEM_CHIPPED, 4)
            choice(chipped, 5, 10)
            choice(fragments, if (chipped != null) 10 else 15, if (chipped != null) 5 else 15)
        }
        if (normal.isEmpty()) {
            choice(processedDrop(material, key), 1, 1)
        }
        return SmallOreDrops(normal.toList(), silk.toList())
    }

    private fun processedDrop(material: Material, key: ResourceKey<Material>): Drop? =
        registeredDrop(key, ItemGeneratorModel.CRUSHED)
            ?: registeredDrop(key, ItemGeneratorModel.DUST)
            ?: registeredDrop(key, ItemGeneratorModel.ORE_RAW)
            ?: registeredDrop(key, ItemGeneratorModel.ROCK)
            ?: if (material.hasTag(MaterialTag.ItemGenerator.GEMS)) registeredDrop(key, ItemGeneratorModel.GEM) else null

    private fun registeredDrop(key: ResourceKey<Material>, form: ItemGeneratorModel, count: Int = 1): Drop? =
        UranusTechMaterialItems[key, form]?.let { Drop(it.id, count) }

    private fun scaledCount(count: Int, multiplier: Int): Int =
        (count.toLong() * multiplier).coerceIn(1L, Int.MAX_VALUE.toLong()).toInt()

    fun table(entry: UranusTechMaterialBlocks.Entry): JsonObject = buildJsonObject {
        put("type", "minecraft:block")
        putJsonArray("pools") {
            when (entry.generator) {
                BlockGeneratorModel.ORE_BEDROCK -> Unit
                BlockGeneratorModel.ORE_SMALL -> {
                    val drops = dropsByMaterial.getValue(entry.key).small
                    if (drops.normal.isEmpty()) {
                        add(pool(listOf(blockDropEntry(entry))))
                    } else {
                        // Small ores yield processed fragments, even when mined with Silk Touch.
                        add(pool(drops.normal, false))
                        add(pool(drops.silk, true))
                    }
                }
                BlockGeneratorModel.ORE, BlockGeneratorModel.ORE_DENSE, BlockGeneratorModel.ORE_DUST -> {
                    val drops = dropsByMaterial.getValue(entry.key)
                    val normal = if (entry.generator == BlockGeneratorModel.ORE_DENSE) drops.dense else drops.normal
                    val drop = if (normal == null) {
                        blockDropEntry(entry)
                    } else {
                        buildJsonObject {
                            put("type", "minecraft:alternatives")
                            putJsonArray("children") {
                                add(blockDropEntry(entry, silkOnly = true))
                                add(normal)
                            }
                        }
                    }
                    add(pool(listOf(drop)))
                }
                else -> error("Not an ore generator: ${entry.generator}")
            }
        }
    }

    private fun pool(entries: List<JsonObject>, silk: Boolean? = null): JsonObject = buildJsonObject {
        put("rolls", 1)
        putJsonArray("conditions") {
            add(survivesExplosion)
            if (silk != null) add(if (silk) silkTouch else withoutSilkTouch)
        }
        putJsonArray("entries") {
            entries.forEach { add(it) }
        }
    }

    private fun blockDropEntry(entry: UranusTechMaterialBlocks.Entry, silkOnly: Boolean = false): JsonObject = buildJsonObject {
        put("type", "minecraft:item")
        put("name", entry.item.id.toString())
        if (silkOnly) putJsonArray("conditions") { add(silkTouch) }
        if (entry.generator.hasHostRock) putJsonArray("functions") {
            addJsonObject {
                put("function", "minecraft:copy_state")
                put("block", entry.block.id.toString())
                putJsonArray("properties") { add("host_rock") }
            }
        }
    }

    private fun dropEntry(drop: Drop, weight: Int = 1): JsonObject = buildJsonObject {
        put("type", "minecraft:item")
        put("name", drop.item.toString())
        put("weight", weight)
        putJsonArray("functions") {
            addJsonObject {
                put("function", "minecraft:set_count")
                put("count", drop.count)
            }
            add(fortuneBonus)
        }
    }

    private fun silkTouchCondition() = buildJsonObject {
        put("condition", "minecraft:match_tool")
        putJsonObject("predicate") {
            putJsonObject("predicates") {
                putJsonArray("minecraft:enchantments") {
                    addJsonObject {
                        put("enchantments", "minecraft:silk_touch")
                        putJsonObject("levels") { put("min", 1) }
                    }
                }
            }
        }
    }
}
