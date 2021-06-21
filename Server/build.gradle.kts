plugins {
	kotlin("jvm")
	application
}

repositories {
    mavenCentral()
	google()
}

dependencies {
	implementation(project(":Protocol"))
	runtimeOnly("io.grpc:grpc-netty:${Protobuf.grpcVersion}")
}

group = "com.flat.library"
version = "1.0-SNAPSHOT"

application {
	mainClass.set("com.flat.library.server.Launcher")
}