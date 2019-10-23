package com.projecturanus.uranustech.common.resource

import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream
import java.nio.ByteBuffer
import java.util.zip.ZipEntry

fun ZipArchiveInputStream.forEach(action: suspend (ByteBuffer) -> Unit) {
    var entry: ZipEntry
    while (nextZipEntry.also { entry = it } != null) {
        entry.size
    }
}
