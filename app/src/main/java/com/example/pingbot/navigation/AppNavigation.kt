package com.example.pingbot.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.pingbot.data.datasource.previousGamesList
import com.example.pingbot.ui.screens.AnalyticsScreen
import com.example.pingbot.ui.screens.CurrentGameScreen
import com.example.pingbot.ui.screens.FaqScreen
import com.example.pingbot.ui.screens.HomeScreen
import com.example.pingbot.ui.screens.LoginScreen
import com.example.pingbot.ui.screens.PreviousGameScreen
import com.example.pingbot.ui.screens.ProfileScreen
import com.example.pingbot.ui.screens.RegisterScreen


@Composable
fun AppNavigation (
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = "current",
        modifier = modifier
    ) {
        composable(route = "home") {
            HomeScreen(
                navController = navController
            )
        }

        composable(route = "current") {
            CurrentGameScreen(
                navController = navController
            )
        }

        composable(route = "faq") {
            FaqScreen(
                navController = navController
            )
        }

        composable(route = "login") {
            LoginScreen(
                navController = navController
            )
        }

        composable(route = "analytics") {
            AnalyticsScreen(
                navController = navController
            )
        }

        composable(route = "Register") {
            RegisterScreen(
                navController = navController
            )
        }

        composable(route = "profile") {
            ProfileScreen(
                navController = navController
            )
        }

        composable(
            route = "previousGame/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val gameId = backStackEntry.arguments?.getInt("id") ?: 0
            // Buscar jogo pelo ID (mock ou função real)
            val game = previousGamesList.previousGames.find { it.id == gameId }
            PreviousGameScreen(game = game, navController = navController)
        }
    }
}