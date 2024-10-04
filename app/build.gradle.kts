plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.devtools)
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.vaultspay.vaultspay_modularize"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.vaultspay.vaultspay_modularize"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            isDebuggable = true
            isShrinkResources = false
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    flavorDimensions += "default"
    productFlavors {
        /*create("development") {
            applicationIdSuffix = ".development"
            versionName = "1.0.0"
            buildConfigField("String", "BASE_URL", "\"development\"")
        }

        create("staging") {
            applicationIdSuffix = ".staging"
            versionName = "1.0.0"
            buildConfigField("String", "BASE_URL", "\"staging\"")
        }

        create("production") {
            applicationIdSuffix = ".production"
            versionName = "1.0.0"
            buildConfigField("String", "BASE_URL", "\"production\"")
        }*/
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    /*implementation(project(":commons"))
    implementation(project(":core"))*/
    implementation(project(":userside:auth"))
    implementation(project(":merchantside:dashboard"))

    //navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    //Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    ksp(libs.androidx.hilt.compiler)

    //retrofit
    implementation(libs.squareup.retrofit2)
    implementation(libs.squareup.retrofit2.gson)

    //room database
    implementation(libs.room.runtime)
    ksp(libs.room.compiler)
    implementation(libs.room.ktx)
}