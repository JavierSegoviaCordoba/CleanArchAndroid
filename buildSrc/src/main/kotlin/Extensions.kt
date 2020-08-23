
internal infix fun String.version(version: String) = "$this:$version"
internal fun kotlin(dependency: String) = "org.jetbrains.kotlin:kotlin-$dependency"
internal fun kotlinx(dependency: String) = "org.jetbrains.kotlinx:kotlinx-$dependency"
