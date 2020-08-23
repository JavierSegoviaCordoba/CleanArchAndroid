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
        implementation(kotlin)
        implementation(detekt)
    }
}
