//package com.example.muidam.screen
//
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.RowScope
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//
////import androidx.compose.material.BottomNavigation
////import androidx.compose.material.BottomNavigationItem
////import androidx.compose.material.ContentAlpha
////import androidx.compose.material.LocalContentColor
//
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Favorite
//import androidx.compose.material.icons.filled.Home
//import androidx.compose.material.icons.filled.Settings
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.SnackbarDuration
//import androidx.compose.material3.SnackbarVisuals
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.navigation.NavDestination
//import androidx.navigation.NavDestination.Companion.hierarchy
//import androidx.navigation.NavGraph.Companion.findStartDestination
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.currentBackStackEntryAsState
//import androidx.navigation.compose.rememberNavController
//import com.example.muidam.component.HeadingTextComponent
//import com.example.muidam.data.NavigationItem
//import com.example.muidam.data.home.NavScreenHolderViewModel
//
//
//
///**class SnackbarVisualsWithError(
////    override val message: String,
////    val isError: Boolean
////) : SnackbarVisuals {
////    override val actionLabel: String
////        get() = if (isError) "Error" else "OK"
////    override val withDismissAction: Boolean
////        get() = false
////    override val duration: SnackbarDuration
////        get() = SnackbarDuration.Indefinite
////}
//**/
//
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun NavScreenHolder(navScreenHolderViewModel: NavScreenHolderViewModel = viewModel()) {
//
//
//    //....
//    /**    Scaffold(
//    //        snackbarHost = { SnackbarHost(snackbarHostState) },
//    //
//    //       // scaffoldState = scaffoldState,
//    //        topBar = {
//    //            AppToolbar(toolbarTitle = stringResource(id = R.string.home),
//    //                logoutButtonClicked = {
//    //                    homeViewModel.logout()
//    //                },
//    //                navigationIconClicked = {
//    //                    coroutineScope.launch {
//    //                        scaffoldState.drawerState.open()
//    //                    }
//    //                }
//    //            )
//    //        },
//    //        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
//    //        drawerContent = {
//    //            NavigationDrawerHeader(homeViewModel.emailId.value)
//    //            NavigationDrawerBody(navigationDrawerItems = homeViewModel.navigationItemsList,
//    //                onNavigationItemClicked = {
//    //                    Log.d("ComingHere","inside_NavigationItemClicked")
//    //                    Log.d("ComingHere","${it.itemId} ${it.title}")
//    //                })
//    //        }
//    //
//    //    ) { paddingValues ->
//    //
//    //        Surface(
//    //            modifier = Modifier
//    //                .fillMaxSize()
//    //                .background(Color.White)
//    //                .padding(paddingValues)
//    //        ) {
//    //            Column(modifier = Modifier.fillMaxSize()) {
//    //
//    //
//    //            }
//    //
//    //        }
//    //    }
//     **/
//
//    val navController = rememberNavController()
//    HeadingTextComponent("Hello There Peter")
//
//
//
//}
////
//@Preview
//@Composable
//fun HomeScreenPreview() {
//    NavScreenHolder()
//}

package com.nativemobilebits.loginflow.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.muidam.component.NavigationDrawerBody
import com.example.muidam.component.NavigationDrawerHeader
import com.example.muidam.data.home.NavScreenHolderViewModel

import kotlinx.coroutines.launch

@Composable
fun NavScreenHolder(navScreenHolderViewModel: NavScreenHolderViewModel = viewModel()) {

    //val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    navScreenHolderViewModel.getUserData()

    Text(
        text = "Center",
        textAlign = TextAlign.Center,
        modifier = Modifier.size(100.dp)
            .background(Color.Cyan)
            .wrapContentHeight(),
    )
}
@Preview
@Composable
fun NavScreenHolderPreview() {
    NavScreenHolder()
}