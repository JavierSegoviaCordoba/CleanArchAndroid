@file:Suppress("Filename", "MatchingDeclarationName", "ClassName", "ClassNaming")

object commonDependency {
    val coroutinesCore = kotlinx("coroutines-core") version versions.coroutines
    val resource = "com.javiersc.resources:resource" version versions.resource
    val serializationCore = kotlinx("serialization-core") version versions.kotlinSerialization
}

object androidDependency {
    val composeAnimation = "androidx.compose.animation:animation" version versions.compose
    val composeAnimationCore = "androidx.compose.animation:animation-core" version versions.compose
    val composeCompiler = "androidx.compose:compose-compiler" version versions.compose
    val composeFoundation = "androidx.compose.foundation:foundation" version versions.compose
    val composeFoundationLayout = "androidx.compose.foundation:foundation-layout" version versions.compose
    val composeFoundationText = "androidx.compose.foundation:foundation-text" version versions.compose
    val composeMaterial = "androidx.compose.material:material" version versions.compose
    val composeRuntime = "androidx.compose.runtime:runtime" version versions.compose
    val composeUI = "androidx.compose.ui:ui" version versions.compose
    val composeUItooling = "androidx.ui:ui-tooling" version versions.compose
}

object plugin {
    val android = "com.android.tools.build:gradle" version versions.android
    val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin" version versions.detekt
    val kotlin = kotlin("gradle-plugin") version versions.kotlin
    val kotlinSerialization = kotlin("serialization") version versions.kotlin
    val gradleVersions = "com.github.ben-manes:gradle-versions-plugin" version versions.gradleVersions
}

object other {
    val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting" version versions.detekt
}
