plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android { namespace = "com.nusafit.app"; compileSdk = 36
    defaultConfig { applicationId = "com.nusafit.app"; minSdk = 26; targetSdk = 35; versionCode = 1; versionName = "1.0.0" }
}

dependencies {
    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.activity:activity-ktx:1.10.1")
    implementation("androidx.fragment:fragment-ktx:1.8.9")
    implementation("com.google.android.gms:play-services-location:21.3.0")
    implementation("com.google.android.gms:play-services-maps:19.2.0")
    implementation("androidx.health.connect:connect-client:1.1.0")
}
