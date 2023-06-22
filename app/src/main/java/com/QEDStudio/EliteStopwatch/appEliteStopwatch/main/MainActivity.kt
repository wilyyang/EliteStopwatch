package com.QEDStudio.EliteStopwatch.appEliteStopwatch.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.QEDStudio.EliteStopwatch.appEliteStopwatch.navigation.AppNavigation
import com.QEDStudio.EliteStopwatch.core.ui.theme.EliteStopwatchTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EliteStopwatchTheme() {
                AppNavigation()
            }
        }
    }
}