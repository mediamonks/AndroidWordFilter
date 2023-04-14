@file:Suppress("DEPRECATION", "UnstableApiUsage")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.mediamonks.wordfilter"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33

        consumerProguardFiles("consumer-rules.pro")

        aarMetadata {
            minCompileSdk = 24
        }
    }

    publishing {
        singleVariant("release") {
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
