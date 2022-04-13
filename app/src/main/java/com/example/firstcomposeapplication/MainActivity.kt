package com.example.firstcomposeapplication

import android.graphics.Color
import android.graphics.Color.*
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
            modifier = Modifier
                .height(20.dp)
                .background(MaterialTheme.colors.primary)
                .padding(15.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center)
            {
            WelcomeText()
                Spacer(modifier = Modifier
                    .height(20.dp))
            InfoAlertDialog()
        }
        }
    }
}

@Composable
fun WelcomeText() {
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
fun InfoAlertDialog() {
    val openDialog = remember { mutableStateOf(false)  }

    Button(onClick = {
        openDialog.value = true
    },
        modifier = Modifier
            .background(color = Companion.Blue)
    ) {
        Icon(
            Icons.Filled.Info,
            contentDescription = "info"
        )
    }

    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = {
                openDialog.value = false
            },
            title = {
                Text(text = "Info Dialog")
            },
            text = {
                Text("My expectations for 2022 in Mobile Programming 2 are to further " +
                        "explore the world of Android and the new world of Jetpack Compose, " +
                        "which I have just been acquainted to. I also expect to get skilled " +
                        "in Kotlin and expand my skills in mobile programming by developing more applications.")
            },
            confirmButton = {
                Button(
                    onClick = {
                        openDialog.value = false
                    }) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                Button(
                    onClick = {
                        openDialog.value = false
                    }) {
                    Text("Dismiss")
                }
            }
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
        WelcomeText()
        Spacer(modifier = Modifier
            .height(20.dp))
        InfoAlertDialog()
    }
}