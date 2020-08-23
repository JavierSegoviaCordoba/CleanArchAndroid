plugins {
    Detekt
}

repositories {
    jcenter()
}

allprojects {
    tasks {
        withType<Delete> { delete(buildDir) }
    }
}
