package dev.lasm.uranustech.data.resource

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import net.minecraft.resources.ResourceLocation
import net.minecraft.server.packs.PackResources
import net.minecraft.server.packs.PackType
import net.minecraft.server.packs.resources.IoSupplier
import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.charset.StandardCharsets

/**
 * Lazily indexes each pack type and serializes each resource once, including content shared by several paths.
 * Keep one instance per logical pack so metadata probes and resource reloads reuse the same immutable resources.
 */
class DynamicResourcePackCache(providers: Map<PackType, Builder.() -> Unit>) {
    constructor(type: PackType, provider: Builder.() -> Unit) : this(mapOf(type to provider))

    private val indexes = providers.mapValues { (_, provider) ->
        lazy { Builder().apply(provider).buildIndex() }
    }

    fun getResource(type: PackType, location: ResourceLocation): IoSupplier<InputStream?>? =
        indexes[type]?.value?.resources?.get(location)?.supplier

    fun listResources(type: PackType, namespace: String, path: String, output: PackResources.ResourceOutput) {
        indexes[type]?.value?.namespaces?.get(namespace)?.listResources(path, output)
    }

    fun getNamespaces(type: PackType): Set<String> = indexes[type]?.value?.namespaces?.keys ?: emptySet()

    /** A shared resource handle; opening it always returns a fresh stream over the cached bytes. */
    class Resource internal constructor(content: () -> ByteArray) {
        private val bytes = lazy(content)
        internal val supplier: IoSupplier<InputStream?> = IoSupplier { ByteArrayInputStream(bytes.value) }
    }

    class Builder internal constructor() {
        private val resources = linkedMapOf<ResourceLocation, Resource>()

        fun bytes(content: () -> ByteArray): Resource = Resource(content)

        fun text(content: () -> String): Resource = bytes { content().toByteArray(StandardCharsets.UTF_8) }

        fun json(content: () -> JsonElement): Resource = text {
            Json.encodeToString(JsonElement.serializer(), content())
        }

        fun add(location: ResourceLocation, resource: Resource) {
            check(location !in resources) { "Dynamic resource already registered: $location" }
            resources[location] = resource
        }

        fun bytes(location: ResourceLocation, content: () -> ByteArray) = add(location, bytes(content))

        fun text(location: ResourceLocation, content: () -> String) = add(location, text(content))

        fun json(location: ResourceLocation, content: () -> JsonElement) = add(location, json(content))

        internal fun buildIndex(): Index = Index(resources.toMap(), resources.entries
            .groupBy { it.key.namespace }
            .mapValues { (_, entries) -> NamespaceIndex(entries) })
    }

    internal class Index(val resources: Map<ResourceLocation, Resource>, val namespaces: Map<String, NamespaceIndex>)

    internal class NamespaceIndex(resources: List<Map.Entry<ResourceLocation, Resource>>) {
        private val sortedResources = resources.sortedBy { it.key.path }
        private class Range(val start: Int, var end: Int)
        private val directories = hashMapOf<String, Range>().apply {
            for ((index, resource) in sortedResources.withIndex()) {
                val path = resource.key.path
                var slash = path.indexOf('/')
                while (slash >= 0) {
                    val prefix = path.substring(0, slash + 1)
                    val range = getOrPut(prefix) { Range(index, index + 1) }
                    range.end = index + 1
                    if (slash > 0 && path[slash - 1] != '/') put(path.substring(0, slash), range)
                    slash = path.indexOf('/', slash + 1)
                }
            }
            put("", Range(0, sortedResources.size))
        }

        fun listResources(path: String, output: PackResources.ResourceOutput) {
            // Directory ranges include descendants and both accepted forms of a trailing slash.
            val range = directories[path] ?: return
            for (index in range.start until range.end) {
                val (location, resource) = sortedResources[index]
                output.accept(location, resource.supplier)
            }
        }
    }
}
