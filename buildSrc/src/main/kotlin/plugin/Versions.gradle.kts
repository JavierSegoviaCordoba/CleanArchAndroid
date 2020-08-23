import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    id("com.github.ben-manes.versions")
}

tasks.withType<DependencyUpdatesTask> {
    rejectVersionIf { candidate.version.isNonStable }
}

internal val String.isNonStable: Boolean
    get() = listOf("eap", "alpha", "beta", "rc").any { contains(it, ignoreCase = true) }
