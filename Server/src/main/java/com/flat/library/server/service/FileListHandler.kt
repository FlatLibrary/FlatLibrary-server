package com.flat.library.server.service

import com.flat.library.service.FileDataAPIGrpcKt
import com.flat.library.service.FileService
import java.io.File

class FileListHandler(private val root: File): FileDataAPIGrpcKt.FileDataAPICoroutineImplBase() {

    override suspend fun fileList(request: FileService.File): FileService.FileList {
        val filePath = if (request.path.endsWith("/")) {
            request.path
        } else {
            request.path + "/"
        }
        val folder = File(root, filePath)
        if (!folder.isDirectory) {
            return FileService.FileList.newBuilder().addAllFiles(ArrayList(0)).build()
        }

        val fileList = folder.listFiles()
        if (fileList == null || fileList.isEmpty()) {
            return FileService.FileList.newBuilder().addAllFiles(ArrayList(0)).build()
        }

        val result = ArrayList<FileService.File>(fileList.size)
        val builder = FileService.File.newBuilder()
        for(f in fileList) {
            val path = filePath + f.name
            result.add(builder.setPath(path).build())
        }

        return FileService.FileList.newBuilder().addAllFiles(result).build()
    }

}