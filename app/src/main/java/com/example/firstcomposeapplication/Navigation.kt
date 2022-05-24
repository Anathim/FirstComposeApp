package com.example.firstcomposeapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(navController = navController,
        startDestination = "MainScreen") {
        composable("MainScreen") {
            Main()
            Details(navController = navController)
        }
        composable("DetailsScreen") {
            Journey()
            CurrentButton(navController = navController)
            BackButton(navController = navController)
        }
        composable("ModulesScreen") {
            Modules()
            BackButton1(navController = navController)
        }
    }
}
