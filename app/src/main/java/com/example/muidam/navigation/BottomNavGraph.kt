//package com.example.muidam.navigation
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.example.muidam.screen.BottomBarScreen
//import com.example.muidam.screen.btmnavigation.HomeScreen
//import com.example.muidam.screen.btmnavigation.ProfileScreen
//import com.example.muidam.screen.btmnavigation.SettingsScreen
//
//@Composable
//fun BottomNavGraph(navController: NavHostController) {
//    NavHost(
//        navController = navController,
//        startDestination = BottomBarScreen.Home.route
//    ) {
//        composable(route = BottomBarScreen.Home.route) {
//            HomeScreen()
//        }
//        composable(route = BottomBarScreen.Profile.route) {
//            ProfileScreen()
//        }
//        composable(route = BottomBarScreen.Settings.route) {
//            SettingsScreen()
//        }
//    }
//}