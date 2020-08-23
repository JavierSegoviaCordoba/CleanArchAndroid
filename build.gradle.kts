plugins {
    Detekt
    Versions
}

repositories {
    jcenter()
}

allprojects {
    tasks {
        withType<Delete> { delete(buildDir) }
    }
}
