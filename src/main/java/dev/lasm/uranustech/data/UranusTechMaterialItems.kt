package dev.lasm.uranustech.data

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.item.MaterialItem
import dev.lasm.uranustech.utils.rloc
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.neoforged.neoforge.registries.DeferredItem
import java.util.*
import java.util.function.Supplier

object UranusTechMaterialItems {
    private data class Registration(val material: Material, val generator: ItemGeneratorModel) {
        val baseId = "${material.id}_${generator.itemSuffix}"
        val qualifiedId = "${material.id}/${generator.itemSuffix}"
    }

    private val itemsByGenerator = EnumMap<ItemGeneratorModel, MutableList<DeferredItem<MaterialItem>>>(
        ItemGeneratorModel::class.java
    )
    private val itemsByMaterial = linkedMapOf<ResourceKey<Material>, EnumMap<ItemGeneratorModel, DeferredItem<MaterialItem>>>()
    private var registeredItems: List<DeferredItem<MaterialItem>> = emptyList()

    fun values(): List<DeferredItem<MaterialItem>> = registeredItems

    operator fun get(material: ResourceKey<Material>, generator: ItemGeneratorModel): DeferredItem<MaterialItem>? =
        itemsByMaterial[material]?.get(generator)

    fun registerMaterialItems() {
        val registrations = UranusTech.BUILTIN_MATERIALS.flatMap { material ->
            ItemGeneratorModel.forMaterial(material).map { Registration(material, it) }
        }
        val counts = registrations.groupingBy { it.baseId }.eachCount()
        val reservedIds = UranusTech.ITEMS.entries.mapTo(hashSetOf()) { it.id.path }
        val usedIds = reservedIds.toMutableSet()

        // An underscore cannot separate material and form unambiguously (e.g. vinteum_purified).
        // Plan all names before registering so collision resolution is independent of iteration order.
        val resolvedIds = registrations.map { registration ->
            val id = if (counts.getValue(registration.baseId) > 1 || registration.baseId in reservedIds) {
                registration.qualifiedId
            } else registration.baseId
            check(usedIds.add(id)) { "Duplicate material item registration: $id (${registration.generator})" }
            id
        }

        for ((index, registration) in registrations.withIndex()) {
            val (material, generator) = registration
            val key = ref(material.id)
            val forms = itemsByMaterial.getOrPut(key) { EnumMap(ItemGeneratorModel::class.java) }
            val itemId = resolvedIds[index]
            val itemLocation = rloc(itemId)
            ItemGeneratorModelMap.register(itemLocation, material.appearance.iconSet, generator)
            MaterialItemTagMap.register(itemLocation, material, generator)
            val item = UranusTech.ITEMS.register(itemId) { ->
                MaterialItem(
                    material,
                    generator,
                    Item.Properties()
                )
            }
            itemsByGenerator.getOrPut(generator) { mutableListOf() }.add(item)
            forms[generator] = item
        }
        registeredItems = itemsByGenerator.values.flatten()
    }

    fun registerCreativeTabs() {
        for ((generator, items) in itemsByGenerator) {
            val titleKey = "itemGroup.${UranusTech.MODID}.material.${generator.itemSuffix}"
            UranusTech.CREATIVE_MODE_TABS.register("material_${generator.itemSuffix}", Supplier {
                CreativeModeTab.builder()
                    .title(Component.translatable(titleKey))
                    .icon { items.first().get().defaultInstance }
                    .displayItems { _, output -> items.forEach { output.accept(it.get()) } }
                    .build()
            })
        }
    }
}
