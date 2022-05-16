package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class MainScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController: NavHostController = rememberNavController()
            Navigation(navController = navController)
            Column(
            modifier = Modifier
                .height(20.dp)
                .background(MaterialTheme.colors.primary)
                .padding(15.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
            {
                Main(navController = navController)
                Spacer(modifier = Modifier
                    .height(20.dp))
                Details(navController = navController)
        }
        }
    }
}

@Composable
fun Main(navController: NavController) {
    Text(
        text = "Welcome to my Jetpack Compose Journey",
        color = Companion.White,
        fontSize = MaterialTheme.typography.h6.fontSize,
        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Details(navController: NavController) {
    Button(
        onClick = {
            navController.navigate("DetailsScreen")
        }
    ) {
        Text(
            text = "Start Journey",
            color = Companion.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(modifier = Modifier
        .background(MaterialTheme.colors.primary)
        .padding(15.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Main(navController = rememberNavController())
        Spacer(modifier = Modifier
            .height(20.dp))
        Details(navController = rememberNavController())
    }
}