package com.example.firstcomposeapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController,
        startDestination = "MainScreen") {
        composable("MainScreen") {
            Main(navController)
        }
        composable("DetailsScreen") {
            Details
        }
        composable("ModulesScreen") {
            Modules(navController = navController)
        }
    }
}
