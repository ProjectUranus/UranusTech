package dev.lasm.uranustech.data

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.block.MaterialBlock
import dev.lasm.uranustech.block.MaterialOreBlock
import dev.lasm.uranustech.utils.rloc
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.CreativeModeTab
import net.neoforged.neoforge.registries.DeferredBlock
import net.neoforged.neoforge.registries.DeferredItem
import java.util.*
import java.util.function.Supplier

object UranusTechMaterialBlocks {
    data class Entry(
        val material: Material,
        val key: ResourceKey<Material>,
        val generator: BlockGeneratorModel,
        val block: DeferredBlock<MaterialBlock>,
        val item: DeferredItem<BlockItem>
    ) {
        val color: Int = material.appearance.colorSolid.let {
            val alpha = if (generator.isTranslucent(material)) it.a else 255
            (alpha shl 24) or (it.r shl 16) or (it.g shl 8) or it.b
        }
    }

    private val blocksByGenerator = EnumMap<BlockGeneratorModel, MutableList<Entry>>(BlockGeneratorModel::class.java)
    private val blocksByMaterial = linkedMapOf<ResourceKey<Material>, MutableMap<BlockGeneratorModel, Entry>>()
    private var registeredBlocks: List<Entry> = emptyList()

    fun values(): List<Entry> = registeredBlocks

    operator fun get(material: ResourceKey<Material>, generator: BlockGeneratorModel): Entry? =
        blocksByMaterial[material]?.get(generator)

    fun registerMaterialBlocks() {
        for (material in UranusTech.BUILTIN_MATERIALS) {
            val key = ref(material.id)
            for (generator in BlockGeneratorModel.forMaterialTags(material.tags)) {
                val id = "${material.id}_${generator.blockSuffix}"
                BlockGeneratorModelMap.register(rloc(id), material, generator)
                val block = UranusTech.BLOCKS.register(id) { ->
                    if (generator.hasHostRock) MaterialOreBlock(key, generator.properties(material))
                    else MaterialBlock(key, generator.properties(material))
                }
                val item = UranusTech.ITEMS.registerSimpleBlockItem(id, block)
                val entry = Entry(material, key, generator, block, item)
                blocksByGenerator.getOrPut(generator) { mutableListOf() }.add(entry)
                blocksByMaterial.getOrPut(key) { EnumMap(BlockGeneratorModel::class.java) }[generator] = entry
            }
        }
        registeredBlocks = blocksByGenerator.values.flatten()
    }

    fun registerCreativeTabs() {
        for ((generator, blocks) in blocksByGenerator) {
            UranusTech.CREATIVE_MODE_TABS.register("material_${generator.blockSuffix}", Supplier {
                CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.${UranusTech.MODID}.material.${generator.blockSuffix}"))
                    .icon { blocks.first().item.get().defaultInstance }
                    .displayItems { _, output -> blocks.forEach { output.accept(it.item.get()) } }
                    .build()
            })
        }
    }
}
