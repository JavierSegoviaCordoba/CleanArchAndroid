allprojects {
    tasks {
        withType<Delete> { delete(buildDir) }
    }
}
