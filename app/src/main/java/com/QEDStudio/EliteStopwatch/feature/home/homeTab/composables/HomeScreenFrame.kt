package com.QEDStudio.EliteStopwatch.feature.home.homeTab.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.QEDStudio.EliteStopwatch.core.ui.base.BaseScreen
import com.QEDStudio.EliteStopwatch.core.ui.component.ButtonIconFixed
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import com.QEDStudio.EliteStopwatch.R
import com.QEDStudio.EliteStopwatch.core.ui.base.LoadState
import com.QEDStudio.EliteStopwatch.core.ui.base.SIDE_EFFECTS_KEY
import com.QEDStudio.EliteStopwatch.core.ui.theme.colorScheme
import com.QEDStudio.EliteStopwatch.core.ui.theme.typography
import com.QEDStudio.EliteStopwatch.feature.home.homeTab.HomeContract

@Composable
fun HomeScreenFrame(
    uiState : HomeContract.State,
    loadState : LoadState,
    effectFlow: Flow<HomeContract.Effect>?,
    onEventSent : (event : HomeContract.Event) -> Unit,
    onNavigationRequested: (HomeContract.Effect.Navigation) -> Unit
) {
    LaunchedEffect(SIDE_EFFECTS_KEY) {
        effectFlow?.onEach { effect ->
        }?.collect()
    }

    BaseScreen(
        loadState = loadState,
        isOverlayTopBar = false,
        idNavigationIcon = R.drawable.ic_chevron_left_36px,
        onClickNavigation = {},
        actions = {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.End
            ) {
                ButtonIconFixed(
                    modifier = Modifier.fillMaxHeight(),
                    idIcon = R.drawable.ic_preview_play_24px,
                    onClick = {
                        //
                    }
                )
            }
        }
    ) {
        uiState.run {
            HomeScreenContent(
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MakeStartScreenPreview() {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography
    ) {
        HomeScreenFrame(
            loadState = LoadState.Idle,
            uiState = HomeContract.State(
                emptyMessage = null
            ),
            effectFlow = null,
            onEventSent = {},
            onNavigationRequested = {}
        )
    }
}