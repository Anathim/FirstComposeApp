package com.example.firstcomposeapplication

sealed class Screen(val route: String)

object Main: Screen(route = "MainScreen")
object Details: Screen(route = "DetailsScreen")
object Modules: Screen(route = "ModulesScreen")