package com.example.firstcomposeapplication

sealed class Screen(val route: String)

object MainScreen: Screen(route = "MainScreen")
object DetailsScreen: Screen(route = "DetailsScreen")