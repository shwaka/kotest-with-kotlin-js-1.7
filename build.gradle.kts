plugins {
    val kotlinVersion = "1.6.21"
    // val kotlinVersion = "1.7.21"
    // kotlin("js") version kotlinVersion
    kotlin("multiplatform") version kotlinVersion
    id("io.kotest.multiplatform") version "5.0.2"
}

group = "me.shun"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

// dependencies {
//     testImplementation(kotlin("test"))
// }

kotlin {
    js {
        binaries.executable()
        browser {
            // The following works only on version >= 1.8
            // commonWebpackConfig {
            //     cssSupport {
            //         enabled.set(true)
            //     }
            // }
        }
        sourceSets {
            val jsMain by getting

            val jsTest by getting {
                dependencies {
                    implementation(kotlin("test"))
                    val kotestVersion = "5.4.1"
                    implementation("io.kotest:kotest-framework-engine:$kotestVersion")
                    // implementation("io.kotest:kotest-assertions-core:$kotestVersion")
                    // implementation("io.kotest:kotest-property:$kotestVersion")
                }
            }
        }
    }
}
