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
        implementation(detekt)
        implementation(kotlin)
        implementation(kotlinSerialization)
        implementation(versions)
    }
}
