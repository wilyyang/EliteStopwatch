package com.QEDStudio.EliteStopwatch.feature.home.homeTab

import com.QEDStudio.EliteStopwatch.core.ui.base.ViewEvent
import com.QEDStudio.EliteStopwatch.core.ui.base.ViewSideEffect
import com.QEDStudio.EliteStopwatch.core.ui.base.ViewState

class HomeContract {
    data class State(
        val emptyMessage : String?
    ) : ViewState

    sealed class Event : ViewEvent {
    }

    sealed class Effect : ViewSideEffect {
        sealed class Navigation : Effect() {
        }
    }
}

object Navigation {
    object Routes {
        const val HOME = "home"
    }
}