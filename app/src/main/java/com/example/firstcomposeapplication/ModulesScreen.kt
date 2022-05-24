package com.example.firstcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
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
import androidx.compose.runtime.remember

class ModulesScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var navController: NavHostController = rememberNavController()
            Navigation(navController = navController)
            Column(
                modifier = Modifier
                    //.height(20.dp)
                    .background(MaterialTheme.colors.primary)
                    .padding(15.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center)
            {
                Modules()
                Spacer(modifier = Modifier
                    .height(20.dp))
                BackButton1(navController = navController)
                Spacer(modifier = Modifier
                    .height(20.dp))
                //ByeButton(navController = navController)
            }
        }
    }
}

@Composable
fun Modules() {
    Text(
        text = "Module Name: Project 2," +
                "Type: Practical," +
                "Duration: Year-round"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
    Text(
        text = "Module Name: Professional Practice," +
                "Type: Theory," +
                "Duration: Year-round"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
    Text(
        text = "Module Name: Project Management," +
                "Type: Theory," +
                "Duration: Year-round"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
    Text(
        text = "Module Name: Mobile Programming 2," +
                "Type: Practical," +
                "Duration: Year-round"
    )
    Spacer(modifier = Modifier
        .height(20.dp))
}

@Composable
fun BackButton1(navController: NavController) {
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

/*@Composable
fun ByeButton(navController: NavController) {
    Button(
        onClick = {
            val showDialog = remember{mutableStateOf(true)}
            if (showDialog.value) {
                AlertDialog(
                    onDismissRequest = { showDialog.value = false },
                    title = { Text(text = "Warning") },
                    text = { Text(text = "Leaving now?") },
                    YesButton = Button(
                        onClick = {
                            showDialog.value = false
                        },
                    ) {
                        Text(
                            text = "Yes",
                            color = Color.White,
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(
                            modifier = Modifier
                                .height(20.dp),
                        )
                    },
                    dismissButton = Button(
                        onClick = {
                            showDialog.value = true
                        },
                    ) {
                        Text(
                            text = "No",
                            color = Color.White,
                            fontSize = MaterialTheme.typography.h6.fontSize,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                        )
                        Spacer(
                            modifier = Modifier
                                .height(20.dp),
                        )
                    }
                    )
                )
            }
        }
    ) {
        Text(
            text = "Good bye!",
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}*/

@Preview(showBackground = true)
@Composable
fun MPreview() {
    Column(modifier = Modifier
        .background(MaterialTheme.colors.primary)
        .padding(15.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Modules()
        Spacer(modifier = Modifier
            .height(20.dp))
        BackButton1(navController = rememberNavController())
        Spacer(modifier = Modifier
            .height(20.dp))
        //ByeButton(navController = rememberNavController())
    }
}