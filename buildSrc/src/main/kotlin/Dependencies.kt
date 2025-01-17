object AndroidSdk {
    const val min = 23
    const val compile = 30
    const val buildTools = "30.0.2"
}

object AndroidLibraries {
    object Versions {
        const val core = "1.6.0"
        const val appCompat = "1.2.0"
        const val material = "1.4.0"
        const val constraintLayout = "2.1.1"
        const val lifecycleViewModel = "2.3.1"
    }

    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModel}"
}

object KotlinLibraries {
    object Versions {
        const val kotlin = "1.5.31"
        const val coroutines = "1.5.2"
    }

    const val kotlinStdLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object DILibraries {
    object Versions {
        const val hilt = "2.39"
        const val lifecycle = "1.0.0"
        const val lifecycleViewmodel = "1.0.0-alpha03"
    }

    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val lifecycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.lifecycleViewmodel}"
    const val kaptHilt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val kaptLifecycle = "androidx.hilt:hilt-compiler:${Versions.lifecycle}"

    const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

object NetworkLibraries {
    object Versions {
        const val ktor = "1.6.3"
        const val coil = "1.3.2"
    }

    const val ktorAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val ktorCio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    const val ktorGson = "io.ktor:ktor-client-gson:${Versions.ktor}"
    const val ktorLogging = "io.ktor:ktor-client-logging-jvm:${Versions.ktor}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
}

object PersistenceLibraries {
    object Versions {
        const val room = "2.3.0"
    }

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val kaptRoomCompiler = "androidx.room:room-compiler:${Versions.room}"
}

object NavigationLibraries {
    object Versions {
        const val nav = "2.3.5"
    }

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav}"
}

object LoggingLibraries {
    object Versions {
        const val timber = "5.0.1"
    }

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}

object TestLibraries {
    object Versions {
        const val jUnit = "4.13.2"
        const val mockk = "1.12.0"
        const val coroutines = "1.5.2"
        const val kotest = "4.3.2"
    }

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val kotest = "io.kotest:kotest-assertions-core:${Versions.kotest}"
}

object TestAndroidLibraries {
    object Versions {
        const val androidJUnit = "1.1.2"
        const val androidEspresso = "3.3.0"
        const val archCore = "2.1.0"
        const val hilt = "2.39"
    }

    const val androidJUnit = "androidx.test.ext:junit:${Versions.androidJUnit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.androidEspresso}"
    const val archCore = "androidx.arch.core:core-testing:${Versions.archCore}"
    const val hilt = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
}