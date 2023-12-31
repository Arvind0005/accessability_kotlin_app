

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
        exclude("META-INF/LICENSE")
        exclude("META-INF/LICENSE.txt")
        exclude("META-INF/license.txt")
        exclude("META-INF/NOTICE")
        exclude("META-INF/NOTICE.txt")
        exclude("META-INF/notice.txt")
        exclude("META-INF/ASL2.0")
        exclude("META-INF/*.kotlin_module")
    }
    namespace = "com.example.myapplication"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 24
        targetSdk = 33
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
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        dataBinding=true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2")
//    implementation fileTree(dir: 'libs', include: ['*.jar'])
//    implementation project(":libs:filament")
    implementation("com.google.android.filament:filament-android:1.9.10")
    implementation("com.squareup.okhttp3:okhttp:4.9.1")
//    implementation("com.github.delight-im:Android-AdvancedWebView:v3.2.1")
    implementation("com.google.android.filament:filament-utils-android:1.6.0")
    implementation("com.google.android.filament:gltfio-android:1.6.0")
//    implementation("com.google.api-client:google-api-client:1.30.10")
//    implementation("com.google.oauth-client:google-oauth-client:1.34.1")
//    implementation 'com.google.apis:google-api-services-youtube:v3-rev333-1.25.0'
//    implementation("com.google.apis:google-api-services-youtube:v3-rev222-1.25.0")
    //implementation("com.google.android.ads:mediation-test-suite:3.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
//    implementation("com.google.ml-kit:translate:17.0.1")
}