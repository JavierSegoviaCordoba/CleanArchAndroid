@file:Suppress("Filename", "MatchingDeclarationName", "ClassName", "ClassNaming")

object common {
    val coroutinesCore = kotlinx("coroutines-core") version version.coroutines
    val resource = "com.javiersc.resources:resource" version version.resource
    val serializationCore = kotlinx("serialization-core") version version.kotlinSerialization
}

object android {
    val composeAnimation = "androidx.compose.animation:animation" version version.compose
    val composeAnimationCore = "androidx.compose.animation:animation-core" version version.compose
    val composeCompiler = "androidx.compose:compose-compiler" version version.compose
    val composeFoundation = "androidx.compose.foundation:foundation" version version.compose
    val composeFoundationLayout = "androidx.compose.foundation:foundation-layout" version version.compose
    val composeFoundationText = "androidx.compose.foundation:foundation-text" version version.compose
    val composeMaterial = "androidx.compose.material:material" version version.compose
    val composeRuntime = "androidx.compose.runtime:runtime-*" version version.compose
    val composeUI = "androidx.compose.ui:ui" version version.compose
    val composeUItooling = "androidx.ui:ui-tooling" version version.compose
}

object plugin {
    val android = "com.android.tools.build:gradle" version version.android
    val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin" version version.detekt
    val kotlin = kotlin("gradle-plugin") version version.kotlin
    val kotlinSerialization = kotlin("serialization") version version.kotlin
    val versions = "com.github.ben-manes:gradle-versions-plugin" version version.versions
}

object other {
    val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting" version version.detekt
}
