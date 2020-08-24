import org.gradle.api.Project
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories

val Project.commonRepositories: Unit
    get() {
        repositories {
            maven("https://oss.sonatype.org/content/repositories/snapshots")
            mavenCentral()
            jcenter()
        }
    }
