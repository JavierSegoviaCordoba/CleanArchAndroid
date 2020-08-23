@file:Suppress("Filename", "MatchingDeclarationName", "ClassName", "ClassNaming")

object plugin {
    val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin" version version.detekt
    val kotlin = kotlin("gradle-plugin") version version.kotlin
}

object other {
    val detektFormatting = "io.gitlab.arturbosch.detekt:detekt-formatting" version version.detekt
}
