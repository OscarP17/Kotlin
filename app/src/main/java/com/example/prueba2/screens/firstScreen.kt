package com.example.prueba2.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prueba2.navegation.AppScreens

@Composable
fun FirstScreen(navController: NavController){
    Scaffold(
        topBar = {
        TopAppBar {
            Icon(imageVector = Icons.Default.ArrowForward,
                contentDescription = "Siguiente Pagina",
                modifier = Modifier.clickable {
                    navController.navigate(route = AppScreens.SecondScreen.route)
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Pantalla Principal")
        }
    }) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Segunda Pantalla")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }) {
            Text(text = "Siguente")
        }
        Text(text = "Tercera Pantalla")
        Button(onClick = {
            navController.navigate(route = AppScreens.ThirdScreen.route)
        }) {
            Text(text = "Siguente")
        }
    }
}
