package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.geology.init.UranusGenBlocks
import dev.lasm.uranustech.utils.rloc
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
import net.neoforged.neoforge.common.Tags

/** Runtime equivalent of UranusGen's block, item and fluid tag providers. */
internal object UranusGenServerResources {
    fun register(resources: DynamicResourcePackCache.Builder) {
        val tags = linkedMapOf<ResourceLocation, MutableSet<String>>()
        fun tag(key: TagKey<*>, values: Iterable<String>) {
            val id = key.location()
            val directory = Registries.tagsDirPath(key.registry())
            tags.getOrPut(rloc(id.namespace, "$directory/${id.path}.json")) { linkedSetOf() }.addAll(values)
        }
        fun both(block: TagKey<*>, item: TagKey<*>, values: Iterable<String>) {
            tag(block, values)
            tag(item, values)
        }

        val natural = UranusGenBlocks.NATURAL_STONES.values.map { it.id.toString() }
        val variants = UranusGenBlocks.ROCK_VARIANTS.values.map { it.id.toString() }
        fun variants(form: String) = UranusGenBlocks.variantsForForm(form).map { it.id.toString() }

        tag(BlockTags.BASE_STONE_OVERWORLD, natural)
        tag(BlockTags.STONE_ORE_REPLACEABLES, natural)
        tag(BlockTags.MINEABLE_WITH_PICKAXE, natural + variants)
        tag(BlockTags.NEEDS_STONE_TOOL, listOf("minecraft:granite"))
        tag(BlockTags.NEEDS_IRON_TOOL, UranusGenBlocks.harvestLevelBlocks(2).map { rloc(it).toString() })
        tag(BlockTags.NEEDS_DIAMOND_TOOL, UranusGenBlocks.harvestLevelBlocks(3).map { rloc(it).toString() })
        both(BlockTags.STAIRS, ItemTags.STAIRS, variants("stairs"))
        both(BlockTags.SLABS, ItemTags.SLABS, variants("slab"))
        both(BlockTags.WALLS, ItemTags.WALLS, variants("wall"))
        both(Tags.Blocks.STONES, Tags.Items.STONES, natural)
        tag(Tags.Blocks.ORE_BEARING_GROUND_STONE, natural)
        both(Tags.Blocks.COBBLESTONES_NORMAL, Tags.Items.COBBLESTONES_NORMAL, variants("cobble"))
        both(Tags.Blocks.COBBLESTONES_MOSSY, Tags.Items.COBBLESTONES_MOSSY, variants("cobble_mossy"))
        val cobbles = listOf("#${Tags.Items.COBBLESTONES_NORMAL.location()}", "#${Tags.Items.COBBLESTONES_MOSSY.location()}")
        both(Tags.Blocks.COBBLESTONES, Tags.Items.COBBLESTONES, cobbles)
        tag(ItemTags.STONE_TOOL_MATERIALS, listOf("#${Tags.Items.COBBLESTONES_NORMAL.location()}"))
        tag(ItemTags.STONE_CRAFTING_MATERIALS, listOf("#${Tags.Items.COBBLESTONES_NORMAL.location()}"))

        with(resources) {
            tags.forEach { (location, values) ->
                json(location) {
                    buildJsonObject {
                        put("replace", false)
                        putJsonArray("values") { values.forEach { add(it) } }
                    }
                }
            }
        }
    }
}
