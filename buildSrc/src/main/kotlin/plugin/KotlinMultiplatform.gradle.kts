plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.kotlin.plugin.serialization")
}

repositories {
    mavenCentral()
    jcenter()
}

kotlin {
    jvm()

    sourceSets {
        commonMain {
            dependencies {
                common.apply {
                    implementation(coroutinesCore)
                    implementation(serializationCore)
                }
            }
        }
    }
}
