plugins {
    Detekt
    Versions
}

repositories {
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    mavenCentral()
    jcenter()
    google()
}

allprojects {
    tasks {
        withType<Delete> { delete(buildDir) }
    }
}
