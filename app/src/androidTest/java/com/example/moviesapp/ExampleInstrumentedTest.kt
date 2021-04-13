package com.example.moviesapp

import androidx.test.filters.SmallTest
import androidx.test.platform.app.InstrumentationRegistry
import com.example.moviesapp.di.BaseUrl
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@SmallTest
@HiltAndroidTest
class ExampleInstrumentedTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Inject
    @BaseUrl
    lateinit var baseUrl: String

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.moviesapp", appContext.packageName)
    }

    @Test
    fun verifyBaseUrl() {
        assertEquals("http://test-url.ch", baseUrl)
    }

}
