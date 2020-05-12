package com.projecturanus.uranustech.common.resource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
import org.apache.commons.compress.utils.IOUtils
import java.util.zip.ZipEntry

fun ZipArchiveInputStream.asFlow(): Flow<Pair<ZipEntry, ByteArray>> = flow {
    val inputStream = this@asFlow
    var entry: ZipEntry? = null
    while (nextZipEntry?.also { entry = it } != null) {
        if (entry != null)
            emit(withContext(Dispatchers.IO) { entry!! to IOUtils.toByteArray(inputStream) })
    }
    withContext(Dispatchers.IO) { close() }
}

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
