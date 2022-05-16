package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class DetailsScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var navController: NavHostController = rememberNavController()
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
                Journey(navController = navController)
                Spacer(modifier = Modifier
                    .height(20.dp))
                CurrentButton(navController = navController)
                Spacer(modifier = Modifier
                    .height(20.dp))
                BackButton(navController = navController)
            }
        }
    }
}

@Composable
fun Journey(navController: NavController) {
    Text(
        text = "Full Name: Anathi Lindikhaya Mhlom"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
    Text(
        text = "Course: Diploma in ICT: Application Development"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
    Text(
        text = "Department: Faculty of Informatics and Design"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
    Text(
        text = "Student Number: 220006695"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
}

@Composable
fun CurrentButton(navController: NavController) {
    Button(
        onClick = {
            navController.navigate("ModulesScreen")
        }
    ) {
        Text(
            text = "Current Modules",
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier
            .height(20.dp))
    }
}

@Composable
fun BackButton(navController: NavController) {
    Button(
        onClick = {
            navController.popBackStack()
        }
    ) {
        Text(
            text = "Back",
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DPreview() {
    Column(modifier = Modifier
        .background(MaterialTheme.colors.primary)
        .padding(15.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Journey(navController = rememberNavController())
        Spacer(modifier = Modifier
            .height(20.dp))
        CurrentButton(navController = rememberNavController())
        Spacer(modifier = Modifier
            .height(20.dp))
        BackButton(navController = rememberNavController())
    }
}