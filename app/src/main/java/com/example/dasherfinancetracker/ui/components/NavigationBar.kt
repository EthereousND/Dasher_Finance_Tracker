package com.example.dasherfinancetracker.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationBar() {
    // Create a NavController to navigate between composables
    val navController = rememberNavController()

    // NavHost holds the navigation graph and is responsible for swapping composables in and out
    NavHost(navController = navController, startDestination = "home") {
        // Define composable destinations
        composable("home") { /* HomeScreen composable here */ }
        composable("profile") { /* ProfileScreen composable here */ }
        composable("settings") { /* SettingsScreen composable here */ }
    }

    // TODO: Add BottomNavigationBar or other UI elements to navigate between composables
}
