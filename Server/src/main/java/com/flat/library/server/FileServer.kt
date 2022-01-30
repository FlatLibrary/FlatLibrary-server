package com.flat.library.server

import com.flat.library.server.service.FileListHandler
import com.flat.library.server.service.ServerHandler
import io.grpc.Server
import io.grpc.ServerBuilder
import java.io.File

class FileServer(private val config: Config) {

    private val server: Server = ServerBuilder
        .forPort(config.grpcPort)
        .addService(FileListHandler(File(config.storageLocation)))
        .addService(ServerHandler(config.serverName))
        .build()

    fun start() {
        server.start()
        println("Server started as ${config.serverName}, listening on ${config.grpcPort}")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@FileServer.stop()
                println("*** server shut down")
            }
        )
    }

    private fun stop() {
        server.shutdown()
    }

    fun blockUntilShutdown() {
        server.awaitTermination()
    }

}