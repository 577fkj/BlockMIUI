plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdk = 35
    namespace = "cn.fkj233.ui"
    defaultConfig.minSdk = 26

    buildTypes {
        release {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
    kotlin.jvmToolchain(21)
}

dependencies {
    implementation("androidx.annotation:annotation:1.8.2")
}
