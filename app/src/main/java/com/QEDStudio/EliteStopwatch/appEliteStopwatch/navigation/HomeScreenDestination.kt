package com.QEDStudio.EliteStopwatch.appEliteStopwatch.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.QEDStudio.EliteStopwatch.feature.home.homeTab.HomeViewModel
import com.QEDStudio.EliteStopwatch.feature.home.homeTab.composables.HomeScreenFrame

@Composable
fun HomeScreenDestination(navController: NavController) {
    val viewModel : HomeViewModel = hiltViewModel()
    HomeScreenFrame(
        uiState = viewModel.uiState.value,
        loadState = viewModel.loadState.value,
        effectFlow = viewModel.effect,
        onEventSent = { event -> viewModel.setEvent(event) },
        onNavigationRequested = { effect ->

        }
    )
}