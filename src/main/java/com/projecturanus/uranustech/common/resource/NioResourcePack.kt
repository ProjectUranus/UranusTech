package com.projecturanus.uranustech.common.resource

import net.minecraft.resource.ResourcePack
import net.minecraft.resource.ResourceType
import net.minecraft.util.Identifier
import java.util.regex.Pattern

val CUSTOM_RESOURCE_PACKS = mutableListOf<ResourcePack>()

private val RESOURCE_PACK_PATH = Pattern.compile("[a-z0-9-_]+")

private fun getFilename(type: ResourceType, identifier: Identifier): String {
    return String.format("%s/%s/%s", type.directory, identifier.namespace, identifier.path)
}

/*
class FileSystemResourcePack(val mod: ModMetadata, val packName: String, val fileSystem: FileSystem): ModResourcePack {
    private val cacheable: Boolean = false
    private var namespaceCache: Set<String>? = null

    override fun getFabricModMetadata() = mod

    override fun contains(type: ResourceType, identifier: Identifier) =
        Files.exists(fileSystem.getPath(getFilename(type, identifier)))

    override fun openRoot(name: String): InputStream? =
        Files.newInputStream(fileSystem.getPath(name))

    override fun open(type: ResourceType, identifier: Identifier): InputStream =
        Files.newInputStream(fileSystem.getPath(getFilename(type, identifier)))

    override fun getName() = packName
    override fun findResources(resourceType: ResourceType?, string: String?, string2: String?, i: Int, predicate: Predicate<String>?): MutableCollection<Identifier> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findResources(type: ResourceType, path: String, depth: Int, predicate: Predicate<String>): MutableCollection<Identifier> {
        val ids = ArrayList<Identifier>()
        val nioPath = path

        for (namespace in getNamespaces(type)) {
            val namespacePath = fileSystem.getPath(type.getName() + "/" + namespace)
            if (namespacePath != null) {
                val searchPath = namespacePath.resolve(nioPath).toAbsolutePath().normalize()

                if (Files.exists(searchPath)) {
                    try {
                        Files.walk(searchPath, depth)
                                .filter { Files.isRegularFile(it) }
                                .filter {
                                    val filename = it.fileName.toString()
                                    !filename.endsWith(".mcmeta") && predicate.test(filename)
                                }
                                .map<Path> { namespacePath.relativize(it) }
                                .map<String> { p -> p.toString() }
                                .forEach { s ->
                                    try {
                                        ids.add(Identifier(namespace, s))
                                    } catch (e: InvalidIdentifierException) {
                                        logger.error(e.message)
                                    }
                                }
                    } catch (e: IOException) {
                        logger.warn("findResources at " + path + " in namespace " + namespace + ", mod " + mod.getId() + " failed!", e)
                    }
                }
            }
        }

        return ids
    }

    override fun getNamespaces(resourceType: ResourceType): Set<String> {
        if (namespaceCache != null) {
            return namespaceCache as Set<String>
        }

        try {
            val typePath = fileSystem.getPath(resourceType.getName())
            if (typePath == null || !Files.isDirectory(typePath)) {
                return emptySet()
            }

            val namespaces = HashSet<String>()
            Files.newDirectoryStream(typePath) { path -> Files.isDirectory(path) }.use { stream ->
                for (path in stream) {
                    var s = path.fileName.toString()
                    // s may contain trailing slashes, remove them
                    s = s.replace("/", "")

                    if (RESOURCE_PACK_PATH.matcher(s).matches()) {
                        namespaces.add(s)
                    } else {
                        this.warnInvalidNamespace(s)
                    }
                }
            }

            if (cacheable) {
                namespaceCache = namespaces
            }

            return namespaces
        } catch (e: IOException) {
            logger.warn("getNamespaces in mod " + mod.id + " failed!", e)
            return emptySet()
        }

    }

    private fun warnInvalidNamespace(s: String) {
        logger.warn("Fabric NioResourcePack: ignored invalid namespace: {} in mod ID {}", s, mod.getId())
    }

    override fun close() {
        fileSystem.close()
    }

    override fun <T> parseMetadata(reader: ResourceMetadataReader<T>): T? {
        val inputStream = openRoot("pack.mcmeta")
        var var3: Throwable? = null

        val var4: T?
        try {
            var4 = AbstractFileResourcePack.parseMetadata(reader, inputStream)
        } catch (var13: Throwable) {
            var3 = var13
            throw var13
        } finally {
            if (inputStream != null) {
                if (var3 != null) {
                    try {
                        inputStream.close()
                    } catch (var12: Throwable) {
                        var3.addSuppressed(var12)
                    }

                } else {
                    inputStream.close()
                }
            }

        }

        return var4
    }

}
*/
