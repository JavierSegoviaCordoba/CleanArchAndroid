rootProject.name = "CleanArchAndroid"

pluginManagement {
    repositories {
        jcenter()
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.library", "com.android.application" -> {
                    useModule("com.android.tools.build:gradle:${requested.version}")
                }
            }
        }
    }
}

plugins {
    id("com.pablisco.gradle.automodule") version "0.13"
}
