package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.UranusTech
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

/** Supplies geology server tags in memory. Material ores and fluids use the material pack. */
class UranusGenDynamicResourcePack(
    private val packLocation: PackLocationInfo,
    private val type: PackType
) : PackResources {
    override fun getRootResource(vararg elements: String?): IoSupplier<InputStream?>? = null

    override fun getResource(packType: PackType, location: ResourceLocation): IoSupplier<InputStream?>? {
        if (packType != type) return null
        return cache.getResource(packType, location)
    }

    override fun listResources(
        packType: PackType, namespace: String, path: String, resourceOutput: PackResources.ResourceOutput
    ) {
        if (packType != type) return
        cache.listResources(packType, namespace, path, resourceOutput)
    }

    override fun getNamespaces(type: PackType): Set<String> =
        if (type == this.type) cache.getNamespaces(type) else emptySet()

    override fun <T : Any?> getMetadataSection(deserializer: MetadataSectionSerializer<T?>): T? {
        if (deserializer != PackMetadataSection.TYPE) return null
        @Suppress("UNCHECKED_CAST")
        return PackMetadataSection(
            Component.translatable("pack.uranustech.geology.description"),
            SharedConstants.getCurrentVersion().getPackVersion(type)
        ) as T
    }

    override fun location(): PackLocationInfo = packLocation

    override fun close() = Unit

    companion object {
        private val cache = DynamicResourcePackCache(PackType.SERVER_DATA) { UranusGenServerResources.register(this) }

        fun addPackFinder(event: AddPackFindersEvent) {
            val type = event.packType
            if (type != PackType.SERVER_DATA) return
            val location = PackLocationInfo(
                "${UranusTech.MODID}:generated_geology",
                Component.translatable("pack.uranustech.geology"),
                PackSource.BUILT_IN, Optional.empty()
            )
            val supplier = object : Pack.ResourcesSupplier {
                override fun openPrimary(location: PackLocationInfo) = UranusGenDynamicResourcePack(location, type)
                override fun openFull(location: PackLocationInfo, metadata: Pack.Metadata) =
                    UranusGenDynamicResourcePack(location, type)
            }
            val pack = Pack.readMetaAndCreate(
                location, supplier, type, PackSelectionConfig(true, Pack.Position.BOTTOM, true)
            )?.hidden() ?: return
            event.addRepositorySource { it.accept(pack) }
        }

    }
}
