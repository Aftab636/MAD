// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    // Use the plugins DSL to declare the plugins required for the project.
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

allprojects {
    // Define repositories for all projects.
    repositories {
        google() // Use Google's Maven repository
        mavenCentral() // Use Maven Central repository
    }
}

// Remove the buildscript block if you're using the plugins DSL and have defined plugins in libs.versions.toml.
// If you need to include additional dependencies, you can create a separate build.gradle file for the app module.

