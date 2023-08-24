package com.example.dasherfinancetracker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

@Composable
fun DasherFinanceTrackerTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Purple500,
            primaryVariant = Purple700,
            secondary = Purple200,
            background = Black,
            surface = Black,
            // Add other custom colors as needed
        ),
        typography = Typography,
        content = content
    )
}
