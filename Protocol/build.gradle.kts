import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.plugins
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc
import com.google.protobuf.gradle.generateProtoTasks

plugins {
    kotlin("jvm")
    id("com.google.protobuf") version Protobuf.pluginVersion
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    api(kotlin("stdlib"))
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Kotlin.coroutinesVersion}")
    api("io.grpc:grpc-protobuf:${Protobuf.grpcVersion}")
    api("com.google.protobuf:protobuf-java-util:${Protobuf.buildVersion}")
    api("io.grpc:grpc-kotlin-stub:${Protobuf.grpcKotlinVersion}")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/grpc", "src/main/grpckt")
}

protobuf {
    protoc {
        // Download from repositories
        artifact = "com.google.protobuf:protoc:${Protobuf.buildVersion}"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:${Protobuf.grpcVersion}"
        }
        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:${Protobuf.grpcKotlinVersion}:jdk7@jar"
        }
    }
    generatedFilesBaseDir = "$projectDir/src/"

    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc") {
                    option("Client=false")
                }
                id("grpckt") {
                    option("Client=false")
                }
            }
        }
    }
}