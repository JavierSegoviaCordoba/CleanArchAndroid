@file:Suppress("Filename", "MatchingDeclarationName", "ClassName", "ClassNaming")

object common {
    val coroutinesCore = kotlinx("coroutines-core") version version.coroutines
    val resource = "com.javiersc.resources:resource" version version.resource
    val serializationCore = kotlinx("serialization-core") version version.kotlinSerialization
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
