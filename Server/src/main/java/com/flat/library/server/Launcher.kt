package com.flat.library.server

import java.io.File

class Launcher {

    // java -Dconfig={filePath} com.home.library.server.Launcher
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val config = Config("config")
            val server = FileServer(config)
            server.start()
            server.blockUntilShutdown()



        }
    }
}