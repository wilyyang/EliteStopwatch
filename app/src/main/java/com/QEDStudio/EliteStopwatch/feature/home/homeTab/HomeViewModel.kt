package com.QEDStudio.EliteStopwatch.feature.home.homeTab

import androidx.lifecycle.SavedStateHandle
import com.QEDStudio.EliteStopwatch.core.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val savedStateHandle : SavedStateHandle
) : BaseViewModel<HomeContract.State, HomeContract.Event, HomeContract.Effect>()  {


    override fun setInitialState() = HomeContract.State(
        emptyMessage = ""
    )

    override fun handleEvents(event : HomeContract.Event) {
        when (event) {
            else -> {}
        }
    }

    init {
        launchWithLoading {

        }
    }
}