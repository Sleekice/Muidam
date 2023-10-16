package com.example.muidam.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.muidam.data.home.NavScreenHolderViewModel
import com.example.muidam.navigation.Routes
import com.example.muidam.navigation.Screen
import com.example.muidam.screen.LoginScreen
//import com.example.muidam.screen.NavScreenHolder
import com.example.muidam.screen.SignUpScreen
import com.nativemobilebits.loginflow.screens.NavScreenHolder


@Composable
fun ScreenMain(navScreenHolderViewModel: NavScreenHolderViewModel = viewModel()) {

    navScreenHolderViewModel.checkForActiveSession()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {

        if (navScreenHolderViewModel.isUserLoggedIn.value == true) {
            Routes.navigateTo(Screen.SignUpScreen)
        }

        Crossfade(targetState = Routes.currentScreen) { currentState ->
                when (currentState.value) {
                    is Screen.SignUpScreen -> {
                        SignUpScreen()
                    }


                    is Screen.LoginScreen -> {
                        LoginScreen()
                    }

                    is Screen.NavScreenHolder -> {
                        NavScreenHolder()
                    }
                    else -> {null}
                }
            }

        }
    }

