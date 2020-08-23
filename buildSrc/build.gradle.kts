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
    implementation(plugin.kotlin)
}
