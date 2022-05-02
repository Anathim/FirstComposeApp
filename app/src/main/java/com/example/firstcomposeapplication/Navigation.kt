package com.example.firstcomposeapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(navController = navController,
        startDestination = "MainScreen") {
        composable("MainScreen") {
            MainScreen(navController = navController)
        }
        composable("DetailsScreen") {
            DetailsScreen(navController = navController)
        }
    }
}
