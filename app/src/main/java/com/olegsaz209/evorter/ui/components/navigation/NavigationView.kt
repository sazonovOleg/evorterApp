package com.olegsaz209.evorter.ui.components.navigation

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.olegsaz209.evorter.ui.screens.main.MainView
import com.olegsaz209.evorter.ui.screens.places.PlacesView
import com.olegsaz209.evorter.ui.screens.settings.SettingsView
import com.olegsaz209.evorter.ui.screens.travelservices.ServicesView
import com.olegsaz209.evorter.R

class Navigation : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vm: NavigationVM by viewModels()

        setContent {
            NavigationView(this)
        }
    }
}

@Composable
fun NavigationView(context: Context) {
    val navController = rememberNavController()

    NavHost(navController, context.getString(R.string.home_route)) {
        composable(context.getString(R.string.home_route)) {
            MainView(navController)
        }
        composable(context.getString(R.string.places_route)) {
            PlacesView(navController)
        }
        composable(context.getString(R.string.services_route)) {
            ServicesView(navController)
        }
        composable(context.getString(R.string.settings_route)) {
            SettingsView(navController)
        }
    }
}