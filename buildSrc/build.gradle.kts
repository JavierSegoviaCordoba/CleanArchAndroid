plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    plugin.apply {
        implementation(android)
        implementation(detekt)
        implementation(kotlin)
        implementation(kotlinSerialization)
        implementation(gradleVersions)
    }
}
