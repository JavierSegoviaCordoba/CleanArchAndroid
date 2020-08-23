@file:Suppress("Filename", "MatchingDeclarationName", "ClassName", "ClassNaming")

object common {
    val kotlinSerialization = kotlinx("serialization-core") version version.kotlinSerialization
}

object plugin {
    val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin" version version.detekt
    val kotlin = kotlin("gradle-plugin") version version.kotlin
    val kotlinSerialization = kotlin("serialization") version version.kotlin
    val versions = "com.github.ben-manes:gradle-versions-plugin" version version.versions
}

object other {
    val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting" version version.detekt
}
