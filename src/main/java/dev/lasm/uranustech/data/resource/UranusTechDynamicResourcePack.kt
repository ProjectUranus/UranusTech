package dev.lasm.uranustech.data.resource

import dev.lasm.uranustech.UranusTech
import dev.lasm.uranustech.data.BlockGeneratorModelMap
import dev.lasm.uranustech.data.ItemGeneratorModelMap
import dev.lasm.uranustech.data.UranusTechMaterialFluids
import dev.lasm.uranustech.geology.api.HostRockType
import dev.lasm.uranustech.utils.rloc
import kotlinx.serialization.json.*
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
import java.io.InputStream
import java.util.*
import java.util.concurrent.ConcurrentHashMap

class UranusTechDynamicResourcePack(
    private val packLocation: PackLocationInfo,
    private val type: PackType = PackType.CLIENT_RESOURCES
) : PackResources {
    override fun getRootResource(vararg elements: String?): IoSupplier<InputStream?>? {
        return null
    }

    override fun getResource(
        packType: PackType,
        location: ResourceLocation
    ): IoSupplier<InputStream?>? = if (packType == type) cache.getResource(packType, location) else null

    override fun listResources(
        packType: PackType,
        namespace: String,
        path: String,
        resourceOutput: PackResources.ResourceOutput
    ) {
        if (packType == type) cache.listResources(packType, namespace, path, resourceOutput)
    }

    override fun getNamespaces(type: PackType): Set<String> =
        if (type == this.type) cache.getNamespaces(type) else emptySet()

    override fun <T : Any?> getMetadataSection(deserializer: MetadataSectionSerializer<T?>): T? {
        if (deserializer != PackMetadataSection.TYPE) return null
        @Suppress("UNCHECKED_CAST")
        return PackMetadataSection(
            Component.translatable("pack.uranustech.materials.description"),
            SharedConstants.getCurrentVersion().getPackVersion(type)
        ) as T
    }

    override fun location(): PackLocationInfo {
        return packLocation
    }

    override fun close() {
    }

    companion object {
        private val texturePresence = ConcurrentHashMap<ResourceLocation, Boolean>()
        private val cache = DynamicResourcePackCache(mapOf(
            PackType.CLIENT_RESOURCES to { registerClientResources() },
            PackType.SERVER_DATA to { UranusTechMaterialServerResources.register(this) }
        ))

        private fun DynamicResourcePackCache.Builder.registerClientResources() {
            val itemsByModel = ItemGeneratorModelMap.assignments().entries.groupBy { it.value }
            for ((modelId, items) in itemsByModel) {
                json(ResourceLocation.fromNamespaceAndPath(modelId.namespace, "models/${modelId.path}.json")) {
                    sharedModelJson(modelId)
                }
                val alias = json { buildJsonObject { put("parent", modelId.toString()) } }
                items.forEach { (itemId, _) ->
                    add(ResourceLocation.fromNamespaceAndPath(itemId.namespace, "models/item/${itemId.path}.json"), alias)
                }
            }
            registerBlockModels()
            registerFluidModels()
        }

        private fun DynamicResourcePackCache.Builder.registerBlockModels() {
            val blocksByModel = BlockGeneratorModelMap.assignments().entries.groupBy { it.value }
            for ((model, blocks) in blocksByModel) {
                for ((host, modelId) in model.modelsByHost) {
                    json(rloc(modelId.namespace, "models/${modelId.path}.json")) { sharedBlockModel(model, host) }
                }
                val states = json {
                    buildJsonObject {
                        putJsonObject("variants") {
                            if (model.ore?.hasHostRock == true) {
                                for ((host, modelId) in model.modelsByHost) {
                                    putJsonObject("host_rock=${host.serializedName}") {
                                        put("model", modelId.toString())
                                    }
                                }
                            } else {
                                putJsonObject("") { put("model", model.id.toString()) }
                            }
                        }
                    }
                }
                val alias = json { buildJsonObject { put("parent", model.id.toString()) } }
                for ((blockId, _) in blocks) {
                    add(rloc(blockId.namespace, "blockstates/${blockId.path}.json"), states)
                    add(rloc(blockId.namespace, "models/block/${blockId.path}.json"), alias)
                    add(rloc(blockId.namespace, "models/item/${blockId.path}.json"), alias)
                }
            }
        }

        private fun sharedBlockModel(model: BlockGeneratorModelMap.Model, host: HostRockType): JsonObject {
            val overlay = model.overlay
            val overlayExists = hasTexture(overlay)
            return buildJsonObject {
                put("parent", "minecraft:block/block")
                put("render_type", if (model.translucent) "minecraft:translucent" else "minecraft:cutout")
                putJsonObject("textures") {
                    put("layer0", if (model.hasBackground) model.backgroundTexture(host).toString() else model.texture.toString())
                    if (model.hasBackground) put("layer1", model.texture.toString())
                    put("particle", "#layer0")
                    if (overlayExists) put("overlay", overlay.toString())
                }
                putJsonArray("elements") {
                    if (model.hasBackground) {
                        add(cube(0.0, 16.0, "#layer0", false))
                        add(cube(-0.001, 16.001, "#layer1", true))
                        if (overlayExists) add(cube(-0.002, 16.002, "#overlay", false))
                    } else {
                        add(cube(0.0, 16.0, "#layer0", true))
                        if (overlayExists) add(cube(-0.001, 16.001, "#overlay", false))
                    }
                }
            }
        }

        private fun cube(from: Double, to: Double, texture: String, tinted: Boolean) = buildJsonObject {
            putJsonArray("from") { repeat(3) { add(from) } }
            putJsonArray("to") { repeat(3) { add(to) } }
            putJsonObject("faces") {
                for (direction in listOf("down", "up", "north", "south", "west", "east")) {
                    putJsonObject(direction) {
                        put("texture", texture)
                        put("cullface", direction)
                        putJsonArray("uv") { add(0); add(0); add(16); add(16) }
                        if (tinted) put("tintindex", 0)
                    }
                }
            }
        }

        private fun DynamicResourcePackCache.Builder.registerFluidModels() {
            val fluidsByTexture = UranusTechMaterialFluids.values().groupBy { it.texture }
            for ((texture, fluids) in fluidsByTexture) {
                val model = rloc("block/materialfluids/${texture.path.removePrefix("block/materialicons/").removePrefix("block/")}")
                // LiquidBlock renders via the fluid renderer; this model only supplies its particle sprite.
                json(rloc("models/${model.path}.json")) {
                    buildJsonObject { putJsonObject("textures") { put("particle", texture.toString()) } }
                }
                val states = json {
                    buildJsonObject {
                        putJsonObject("variants") { putJsonObject("") { put("model", model.toString()) } }
                    }
                }
                for (fluid in fluids) {
                    add(rloc("blockstates/${fluid.block.id.path}.json"), states)
                    json(rloc("models/item/${fluid.bucket.id.path}.json")) {
                        buildJsonObject {
                            put("parent", "neoforge:item/bucket")
                            put("loader", "neoforge:fluid_container")
                            put("fluid", fluid.source.id.toString())
                            put("flip_gas", true)
                            put("apply_fluid_luminosity", true)
                        }
                    }
                }
            }
        }

        private fun sharedModelJson(modelId: ResourceLocation): JsonObject {
            val texturePath = modelId.path
            val overlayId = ResourceLocation.fromNamespaceAndPath(modelId.namespace, "${texturePath}_overlay")
            val overlayExists = hasTexture(overlayId)
            return buildJsonObject {
                put("parent", "minecraft:item/generated")
                putJsonObject("textures") {
                    put("layer0", modelId.toString())
                    if (overlayExists) put("layer1", overlayId.toString())
                }
            }
        }

        private fun hasTexture(texture: ResourceLocation): Boolean = texturePresence.computeIfAbsent(texture) {
            UranusTech::class.java.classLoader
                .getResource("assets/${it.namespace}/textures/${it.path}.png") != null
        }

        fun addPackFinder(event: net.neoforged.neoforge.event.AddPackFindersEvent) {
            val type = event.packType

            val location = PackLocationInfo(
                "uranustech:generated_material_resources",
                Component.translatable("pack.uranustech.materials"),
                PackSource.BUILT_IN,
                Optional.empty()
            )
            val resources = object : Pack.ResourcesSupplier {
                override fun openPrimary(location: PackLocationInfo) = UranusTechDynamicResourcePack(location, type)
                override fun openFull(location: PackLocationInfo, metadata: Pack.Metadata) =
                    UranusTechDynamicResourcePack(location, type)
            }
            val pack = Pack.readMetaAndCreate(
                location,
                resources,
                type,
                PackSelectionConfig(true, Pack.Position.TOP, true)
            )?.hidden() ?: return

            event.addRepositorySource { packConsumer -> packConsumer.accept(pack) }
        }
    }
}
