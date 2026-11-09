package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.data.BlockGeneratorModel
import dev.lasm.uranustech.data.UranusTechMaterialBlocks
import dev.lasm.uranustech.data.UranusTechMaterialFluids
import dev.lasm.uranustech.utils.rloc
import kotlinx.serialization.json.add
import kotlinx.serialization.json.addJsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.tags.TagKey
import net.neoforged.neoforge.common.Tags

/** In-memory harvesting, ore, storage, fluid/bucket tags and loot for generated materials. */
internal object UranusTechMaterialServerResources {
    fun register(resources: DynamicResourcePackCache.Builder) {
        val tags = linkedMapOf<ResourceLocation, MutableSet<String>>()
        fun tag(registryPath: String, id: ResourceLocation, value: String) {
            tags.getOrPut(rloc(id.namespace, "$registryPath/${id.path}.json")) { linkedSetOf() }.add(value)
        }
        fun tag(key: TagKey<*>, value: String) = tag(Registries.tagsDirPath(key.registry()), key.location(), value)
        fun both(id: ResourceLocation, value: String) {
            tag("tags/block", id, value)
            tag("tags/item", id, value)
        }

        for (entry in UranusTechMaterialBlocks.values()) {
            val id = entry.block.id.toString()
            val generator = entry.generator
            val mineable = when {
                generator.isCrate -> BlockTags.MINEABLE_WITH_AXE
                generator == BlockGeneratorModel.BLOCK_DUST || generator == BlockGeneratorModel.ORE_DUST -> BlockTags.MINEABLE_WITH_SHOVEL
                else -> BlockTags.MINEABLE_WITH_PICKAXE
            }
            tag(mineable, id)
            if (mineable == BlockTags.MINEABLE_WITH_PICKAXE && generator != BlockGeneratorModel.ORE_BEDROCK) {
                val quality = entry.material.tool.toolQuality - if (generator == BlockGeneratorModel.ORE_SMALL) 1 else 0
                val requirement = when {
                    quality >= 3 -> BlockTags.NEEDS_DIAMOND_TOOL
                    quality == 2 -> BlockTags.NEEDS_IRON_TOOL
                    quality == 1 -> BlockTags.NEEDS_STONE_TOOL
                    else -> null
                }
                if (requirement != null) tag(requirement, id)
            }
            if (generator.isOre) {
                val oreTag = rloc("c", "ores/${entry.material.id}")
                both(oreTag, id)
                both(Tags.Blocks.ORES.location(), "#$oreTag")
                val rate = when (generator) {
                    BlockGeneratorModel.ORE_DENSE -> Tags.Blocks.ORE_RATES_DENSE
                    BlockGeneratorModel.ORE_SMALL -> Tags.Blocks.ORE_RATES_SPARSE
                    else -> Tags.Blocks.ORE_RATES_SINGULAR
                }
                both(rate.location(), id)
                resources.json(rloc("loot_table/blocks/${entry.block.id.path}.json")) { MaterialOreLoot.table(entry) }
                continue
            }
            if (generator.isStorage) {
                val materialName = if (generator == BlockGeneratorModel.BLOCK_RAW) "raw_${entry.material.id}" else entry.material.id
                val storageTag = rloc("c", "storage_blocks/$materialName")
                both(storageTag, id)
                both(Tags.Blocks.STORAGE_BLOCKS.location(), "#$storageTag")
            }
            resources.json(rloc("loot_table/blocks/${entry.block.id.path}.json")) {
                buildJsonObject {
                    put("type", "minecraft:block")
                    putJsonArray("pools") {
                        addJsonObject {
                            put("rolls", 1)
                            putJsonArray("conditions") {
                                addJsonObject { put("condition", "minecraft:survives_explosion") }
                            }
                            putJsonArray("entries") {
                                addJsonObject {
                                    put("type", "minecraft:item")
                                    put("name", entry.item.id.toString())
                                }
                            }
                        }
                    }
                }
            }
        }

        for (fluid in UranusTechMaterialFluids.values()) {
            val id = rloc("c", fluid.source.id.path)
            tag("tags/fluid", id, fluid.source.id.toString())
            tag("tags/fluid", id, fluid.flowing.id.toString())
            val bucketTag = rloc("c", "buckets/${fluid.source.id.path}")
            tag("tags/item", bucketTag, fluid.bucket.id.toString())
            tag(Tags.Items.BUCKETS, "#$bucketTag")
        }

        for ((location, values) in tags) {
            resources.json(location) {
                buildJsonObject {
                    put("replace", false)
                    putJsonArray("values") { values.forEach { add(it) } }
                }
            }
        }
    }
}
