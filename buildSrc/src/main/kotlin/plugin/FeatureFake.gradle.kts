plugins {
    kotlin("jvm")
    kotlin("plugin.serialization")
}

commonRepositories

dependencies {
    commonDependency.apply {
        implementation(coroutinesCore)
        implementation(serializationCore)
    }
}
