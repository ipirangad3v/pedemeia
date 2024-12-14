package com.example.pedemeia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pedemeia.ui.navigation.Constants.HOME_ROUTE
import com.example.pedemeia.ui.screens.MainScreen

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
    ) {
        composable(route = HOME_ROUTE) {
            MainScreen(navController)
        }
    }
}
