plugins {
    FeatureUI
}

dependencies {
    implementation(project(autoModules.features.user.public))
    implementation(project(autoModules.features.user.fake))
}
