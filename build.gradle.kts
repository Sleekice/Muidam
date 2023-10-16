// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.0")
        classpath("com.android.tools.build:gradle:7.3.0")
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.9")


    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false

    id("org.jetbrains.kotlin.android") version "1.8.10" apply false

    // HILT Dependency
    //id("com.google.dagger.hilt.android") version "2.48" apply false
}