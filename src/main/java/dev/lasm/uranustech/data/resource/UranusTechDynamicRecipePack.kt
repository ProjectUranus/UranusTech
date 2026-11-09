package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.api.chemical.material.Material
import dev.lasm.uranustech.api.chemical.material.MaterialTag
import dev.lasm.uranustech.api.chemical.material.ref
import dev.lasm.uranustech.data.CS
import dev.lasm.uranustech.data.ItemGeneratorModel
import dev.lasm.uranustech.data.UranusTechMaterialItems
import dev.lasm.uranustech.utils.rloc
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject
import net.minecraft.SharedConstants
import net.minecraft.network.chat.Component
import net.minecraft.resources.ResourceLocation
import net.minecraft.server.packs.PackLocationInfo
import net.minecraft.server.packs.PackResources
import net.minecraft.server.packs.PackSelectionConfig
import net.minecraft.server.packs.PackType
import net.minecraft.server.packs.metadata.MetadataSectionSerializer
import net.minecraft.server.packs.metadata.pack.PackMetadataSection
import net.minecraft.server.packs.repository.Pack
import net.minecraft.server.packs.repository.PackSource
import net.minecraft.server.packs.resources.IoSupplier
import net.neoforged.neoforge.event.AddPackFindersEvent
import java.io.InputStream
import java.util.*

class UranusTechDynamicRecipePack(private val packLocation: PackLocationInfo) : PackResources {
    override fun getRootResource(vararg elements: String?): IoSupplier<InputStream?>? = null

    override fun getResource(packType: PackType, location: ResourceLocation): IoSupplier<InputStream?>? =
        cache.getResource(packType, location)

    override fun listResources(
        packType: PackType,
        namespace: String,
        path: String,
        resourceOutput: PackResources.ResourceOutput
    ) {
        cache.listResources(packType, namespace, path, resourceOutput)
    }

    override fun getNamespaces(type: PackType): Set<String> = cache.getNamespaces(type)

    override fun <T : Any?> getMetadataSection(deserializer: MetadataSectionSerializer<T?>): T? {
        if (deserializer != PackMetadataSection.TYPE) return null
        @Suppress("UNCHECKED_CAST")
        return PackMetadataSection(
            Component.literal("Generated UranusTech material recipes"),
            SharedConstants.getCurrentVersion().getPackVersion(PackType.SERVER_DATA)
        ) as T
    }

    override fun location(): PackLocationInfo = packLocation

    override fun close() = Unit

    companion object {
        private val cache = DynamicResourcePackCache(PackType.SERVER_DATA) {
            val materialsById = UranusTech.BUILTIN_MATERIALS.associateBy(Material::id)
            for (material in UranusTech.BUILTIN_MATERIALS) {
                if (!material.hasTag(MaterialTag.Processing.FURNACE) ||
                    !material.hasTag(MaterialTag.ItemGenerator.ORES)
                ) continue

                val target = material.fluids.smeltingTarget
                val targetMaterialId = target?.ref?.location()?.path ?: material.id
                val amount = target?.amount ?: CS.U
                if (amount <= 0L) continue

                val form: ItemGeneratorModel
                val count: Long
                if (amount % CS.U == 0L) {
                    form = ItemGeneratorModel.INGOT
                    count = amount / CS.U
                } else {
                    form = ItemGeneratorModel.NUGGET
                    count = amount / (CS.U / 9)
                }
                if (count <= 0L) continue

                val targetMaterial = materialsById[targetMaterialId] ?: run {
                    UranusTech.LOGGER.warn(
                        "Skipping blasting recipe for {}: smelting target {} is not a built-in material",
                        material.id,
                        targetMaterialId
                    )
                    continue
                }
                val result = UranusTechMaterialItems[
                    ref(targetMaterial.id),
                    form
                ] ?: run {
                    UranusTech.LOGGER.warn(
                        "Skipping blasting recipe for {}: target {} has no {} item",
                        material.id,
                        targetMaterial.id,
                        form.itemSuffix
                    )
                    continue
                }
                json(rloc("recipe/${material.id}_raw_ore_blasting.json")) {
                    buildJsonObject {
                        put("type", "minecraft:blasting")
                        put("category", "misc")
                        put("cookingtime", 100)
                        put("experience", 0.7)
                        put("group", "${material.id}_blasting")
                        putJsonObject("ingredient") {
                            put("tag", "c:raw_materials/${material.id}")
                        }
                        putJsonObject("result") {
                            put("id", result.id.toString())
                            put("count", count)
                        }
                    }
                }

                json(rloc("recipe/${material.id}_raw_ore_smelting.json")) {
                    buildJsonObject {
                        put("type", "minecraft:smelting")
                        put("category", "misc")
                        put("cookingtime", 200)
                        put("experience", 0.7)
                        put("group", "${material.id}_smelting")
                        putJsonObject("ingredient") {
                            put("tag", "c:raw_materials/${material.id}")
                        }
                        putJsonObject("result") {
                            put("id", result.id.toString())
                            put("count", count)
                        }
                    }
                }

            }
        }

        fun addPackFinder(event: AddPackFindersEvent) {
            if (event.packType != PackType.SERVER_DATA) return

            val location = PackLocationInfo(
                "uranustech:generated_material_recipes",
                Component.literal("UranusTech generated material recipes"),
                PackSource.BUILT_IN,
                Optional.empty()
            )
            val resources = object : Pack.ResourcesSupplier {
                override fun openPrimary(location: PackLocationInfo) = UranusTechDynamicRecipePack(location)
                override fun openFull(location: PackLocationInfo, metadata: Pack.Metadata) =
                    UranusTechDynamicRecipePack(location)
            }
            val pack = Pack.readMetaAndCreate(
                location,
                resources,
                PackType.SERVER_DATA,
                PackSelectionConfig(true, Pack.Position.TOP, true)
            )?.hidden() ?: return

            event.addRepositorySource { packConsumer -> packConsumer.accept(pack) }
        }
    }
}
