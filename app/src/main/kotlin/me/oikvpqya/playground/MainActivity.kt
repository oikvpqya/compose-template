package me.oikvpqya.playground

import android.graphics.Color
import android.os.Build.VERSION
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import dagger.hilt.android.AndroidEntryPoint
import me.oikvpqya.playground.ui.App
import me.oikvpqya.playground.ui.theme.AppTheme

@AndroidEntryPoint
@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        SystemBarStyle.auto(Color.TRANSPARENT, Color.TRANSPARENT).also { style ->
            if (VERSION.SDK_INT < 26) enableEdgeToEdge(style) else enableEdgeToEdge(style, style)
        }
        if (VERSION.SDK_INT >= 29) {
            window.isNavigationBarContrastEnforced = false
        }

        setContent {
            val isDarkTheme = isSystemInDarkTheme()
            AppTheme(isDarkTheme) {
                App(
                    calculateWindowSizeClass(this)
                )
            }
        }
    }
}
