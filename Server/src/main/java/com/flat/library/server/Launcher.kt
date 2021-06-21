package com.flat.library.server

import io.grpc.Server
import io.grpc.ServerBuilder
import com.flat.library.service.GreeterGrpcKt

class Launcher {

    // java -Dconfig={filePath} com.home.library.server.Launcher
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print("Hello world!")
            val port = 50051 // System.getenv("PORT")?.toInt() ?: 50051
            val server = HelloWorldServer(port)
            server.start()
            server.blockUntilShutdown()
        }
    }
}

class HelloWorldServer(private val port: Int) {
    val server: Server = ServerBuilder
        .forPort(port)
        .addService(HelloWorldService())
        .build()

    fun start() {
        server.start()
        println("Server started, listening on $port")
        Runtime.getRuntime().addShutdownHook(
            Thread {
                println("*** shutting down gRPC server since JVM is shutting down")
                this@HelloWorldServer.stop()
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

private class HelloWorldService : GreeterGrpcKt.GreeterCoroutineImplBase() {
    override suspend fun sayHello(request: FileService.HelloRequest): FileService.HelloReply {
        println(request.name)
        return FileService.HelloReply
            .newBuilder()
            .setMessage("Server Hello")
            .build()
    }
}