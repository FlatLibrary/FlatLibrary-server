package com.flat.library.server.service

import com.flat.library.service.ServerAPIGrpcKt
import com.flat.library.service.ServerService

class ServerHandler(var name: String): ServerAPIGrpcKt.ServerAPICoroutineImplBase() {

    override suspend fun getDetails(request: ServerService.ClientInfo): ServerService.ServerInfo {
        return ServerService.ServerInfo.newBuilder().setVersion("0.0.1").setName(name).build()
    }

}