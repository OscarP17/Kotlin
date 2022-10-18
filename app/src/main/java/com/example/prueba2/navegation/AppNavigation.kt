package com.example.prueba2.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prueba2.screens.FirstScreen
import com.example.prueba2.screens.SecondScreen
import com.example.prueba2.screens.ThirdScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = AppScreens.FirstScreen.route
    ){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.ThirdScreen.route){
            ThirdScreen(navController)
        }
    }
}