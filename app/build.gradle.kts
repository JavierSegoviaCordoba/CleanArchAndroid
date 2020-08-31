@file:Suppress("UnstableApiUsage")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("plugin.serialization")
}

commonRepositories

android {

    defaultConfig {
        minSdkVersion(21)
        compileSdkVersion(30)
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
            res.srcDir("src/main/res")
            manifest.srcFile("src/main/AndroidManifest.xml")
        }
        getByName("test") {
            java.srcDir("src/main/kotlin")
            res.srcDir("src/main/res")
            manifest.srcFile("src/androidTest/AndroidManifest.xml")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
            useIR = true
        }
    }

    buildFeatures.compose = true
}

dependencies {
    androidDependency.apply {
        implementation(appCompat)
        implementation(composeAnimation)
        implementation(composeAnimationCore)
        implementation(composeCompiler)
        implementation(composeFoundation)
        implementation(composeFoundationLayout)
        implementation(composeFoundationText)
        implementation(composeMaterial)
        implementation(composeRuntime)
        implementation(composeUI)
        implementation(composeUItooling)
    }
    commonDependency.apply {
        implementation(coroutinesCore)
        implementation(serializationCore)
    }
}
