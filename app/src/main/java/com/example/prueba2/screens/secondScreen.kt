package com.example.prueba2.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prueba2.navegation.AppScreens

@Composable
fun SecondScreen(navController: NavController){
    Scaffold (
        topBar = {
            TopAppBar {
                Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Retorno",
                modifier = Modifier.clickable {
                    navController.navigate(route = AppScreens.FirstScreen.route)
                })
                Icon(imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Retorno",
                    modifier = Modifier.clickable {
                        navController.navigate(route = AppScreens.ThirdScreen.route)
                    })
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Segunda Pantalla")
            }
                }
            ){
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Primera Pagina")
        Button(onClick = {
            navController.navigate(route = AppScreens.FirstScreen.route)
        }) {
            Text(text = "Regresar")
        }
        Text(text = "Tercera Pagina")
        Button(onClick = {
            navController.navigate(route = AppScreens.ThirdScreen.route)
        }) {
            Text(text = "Siguente")
        }
    }
}
