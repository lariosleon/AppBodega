import com.android.aaptcompiler.maskAndApply

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.proyecto_piwapp_1_0"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.proyecto_piwapp_1_0"
        minSdk = 23
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
        viewBinding = true;
        dataBinding = true;
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    //firebase
    implementation("com.google.firebase:firebase-bom:32.7.0")
    //implementation("com.google.firebase:firebase-analytics")
    //implementation("com.google.firebase:firebase-auth-ktx:22.3.0")
    //implementation("com.google.firebase:firebase-database:20.3.0")
    //implementation("com.google.firebase:firebase-auth:22.3.0")
    //implementation("com.google.firebase:firebase-firestore:24.10.0")
    //implementation("com.google.firebase:firebase-analytics-ktx:21.5.0")
    //implementation("com.google.firebase:firebase-auth-ktx:22.3.0")
    //implementation("com.google.android.gms:play-services-auth:20.7.0")
    implementation("com.google.firebase:firebase-analytics:21.5.0")
    implementation("com.google.firebase:firebase-auth-ktx:22.3.0")
    implementation("com.google.firebase:firebase-firestore:24.10.0")
    implementation("com.google.firebase:firebase-firestore-ktx:24.10.0")
    //CLOUD STORAGE
    implementation("com.google.firebase:firebase-storage-ktx:20.3.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")
    //implementation("com.google.firebase:firebase-database")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Generador QR
    implementation ("com.journeyapps:zxing-android-embedded:4.3.0")
    implementation ("com.google.zxing:core:3.3.0")
    implementation ("com.airbnb.android:lottie:3.4.0")
}