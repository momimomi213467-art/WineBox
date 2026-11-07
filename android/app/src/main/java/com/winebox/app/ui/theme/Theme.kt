package com.winebox.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val WineBoxDark = darkColorScheme(
    primary = Color(0xFF7C4DFF),
    onPrimary = Color.White,
    secondary = Color(0xFF03DAC6),
    background = Color(0xFF0D0D12),
    surface = Color(0xFF16161E),
    onBackground = Color(0xFFEAEAF0),
    onSurface = Color(0xFFEAEAF0),
    surfaceVariant = Color(0xFF22222E),
    primaryContainer = Color(0xFF3D2B6B),
    onPrimaryContainer = Color(0xFFE8DDFF)
)

@Composable
fun WineBoxTheme(
    darkTheme: Boolean = true, // sempre dark stile GameHub
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = WineBoxDark,
        content = content
    )
}
