package com.projecturanus.uranustech.common.resource

import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
import org.apache.commons.compress.utils.IOUtils
import java.util.zip.ZipEntry

fun ZipArchiveInputStream.asSequence(): Sequence<Pair<ZipEntry, ByteArray>> {
    val inputStream = this
    return sequence<Pair<ZipEntry, ByteArray>> {
        var entry: ZipEntry? = null
        while (nextZipEntry?.also { entry = it } != null) {
            if (entry != null)
                yield(entry!! to IOUtils.toByteArray(inputStream))
        }
        close()
    }
}

suspend fun ZipArchiveInputStream.forEach(action: suspend (ByteArray, ZipEntry) -> Unit) {
    var entry: ZipEntry? = null
    while (nextZipEntry?.also { entry = it } != null) {
        if (entry != null)
            action(IOUtils.toByteArray(this), entry!!)
    }
    close()
}
