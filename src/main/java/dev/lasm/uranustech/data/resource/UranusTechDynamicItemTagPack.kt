package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.data.MaterialItemTagMap
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonArray
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
import java.util.Optional

class UranusTechDynamicItemTagPack(private val packLocation: PackLocationInfo) : PackResources {
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
            Component.literal("Generated UranusTech material item tags"),
            SharedConstants.getCurrentVersion().getPackVersion(PackType.SERVER_DATA)
        ) as T
    }

    override fun location(): PackLocationInfo = packLocation

    override fun close() = Unit

    companion object {
        private val cache = DynamicResourcePackCache(PackType.SERVER_DATA) {
            MaterialItemTagMap.assignments().forEach { (tag, items) ->
                json(ResourceLocation.fromNamespaceAndPath(tag.namespace, "tags/item/${tag.path}.json")) {
                    buildJsonObject {
                        put("replace", false)
                        putJsonArray("values") {
                            items.sortedBy(ResourceLocation::toString).forEach { add(it.toString()) }
                        }
                    }
                }
            }
        }

        fun addPackFinder(event: AddPackFindersEvent) {
            if (event.packType != PackType.SERVER_DATA) return

            val location = PackLocationInfo(
                "uranustech:generated_material_item_tags",
                Component.literal("UranusTech generated material item tags"),
                PackSource.BUILT_IN,
                Optional.empty()
            )
            val resources = object : Pack.ResourcesSupplier {
                override fun openPrimary(location: PackLocationInfo) = UranusTechDynamicItemTagPack(location)
                override fun openFull(location: PackLocationInfo, metadata: Pack.Metadata) =
                    UranusTechDynamicItemTagPack(location)
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
