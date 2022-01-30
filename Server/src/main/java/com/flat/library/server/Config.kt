package com.flat.library.server

import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.util.*
import java.net.InetAddress;

class Config(name: String) {

    val grpcPort: Int
    val storageLocation: String
    val serverName: String

    init {
        val configPath = System.getProperty(name, "")
        val prop = Properties()
        var input: InputStream?
        try {
            input = FileInputStream(configPath)
        } catch (ex: IOException) {
            input = Config::class.java.classLoader.getResourceAsStream("server-default.properties")
        }

        var serverPropertyName: String? = null

        if (input == null) {
            this.grpcPort = 50051
            this.storageLocation = "/"
            println("server-default.properties is not found")
        } else {
            prop.load(input)
            input?.close()

            this.grpcPort = Integer.parseInt(prop.getProperty("server.grpcPort", "50051"))
            this.storageLocation = prop.getProperty("storage.location", "/")
            serverPropertyName = prop.getProperty("server.name")
        }

        if (serverPropertyName == null || serverPropertyName.isEmpty()) {
            val address = InetAddress.getLocalHost();
            serverName = address.hostName
        } else {
            serverName = serverPropertyName
        }
    }
}