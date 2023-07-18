plugins {
    val kotlinVersion = "1.6.21"
    // val kotlinVersion = "1.7.21"
    // kotlin("js") version kotlinVersion
    kotlin("multiplatform") version kotlinVersion
    id("io.kotest.multiplatform") version "5.0.2"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        binaries.executable()
        browser {}
        sourceSets {
            val jsMain by getting

            val jsTest by getting {
                dependencies {
                    // implementation(kotlin("test"))
                    val kotestVersion = "5.4.1"
                    // val kotestVersion = "5.4.2"
                    implementation("io.kotest:kotest-framework-engine:$kotestVersion")
                }
            }
        }
    }
}
