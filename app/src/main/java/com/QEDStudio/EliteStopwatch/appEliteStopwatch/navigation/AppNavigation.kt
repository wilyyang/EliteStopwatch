package com.QEDStudio.EliteStopwatch.appEliteStopwatch.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.QEDStudio.EliteStopwatch.feature.home.homeTab.Navigation.Routes.HOME

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = HOME
    ) {

        composable(route = HOME) {
            HomeScreenDestination(navController = navController)
        }
    }
}
