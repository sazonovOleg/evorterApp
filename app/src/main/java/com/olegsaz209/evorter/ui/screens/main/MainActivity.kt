package com.olegsaz209.evorter.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.olegsaz209.evorter.ui.components.menu.Menu
import com.olegsaz209.evorter.ui.screens.main.components.content.MainContent
import com.olegsaz209.evorter.ui.screens.main.components.slider.MainSlider
import com.olegsaz209.evorter.ui.shared.colors.AppColors

@Composable
fun MainView(
    navHostController: NavHostController,
) {
    Column(
        Modifier
            .background(brush = AppColors.mainBGGradient())
            .verticalScroll(rememberScrollState())
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainSlider()
        MainContent()
    }
    Menu(navHostController = navHostController)
}