plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.kotlin.plugin.serialization")
}

commonRepositories

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
