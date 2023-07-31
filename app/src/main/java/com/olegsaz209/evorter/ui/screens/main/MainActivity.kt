package com.olegsaz209.evorter.ui.screens.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.olegsaz209.evorter.ui.screens.main.components.content.MainContent
import com.olegsaz209.evorter.ui.screens.main.components.slider.MainSlider
import com.olegsaz209.evorter.ui.components.menu.Menu
import com.olegsaz209.evorter.ui.shared.colors.AppColors

class MainActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            MainView()
        }
    }
}

@Composable
fun MainView() {
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
    Menu()
}

@Preview
@Composable
fun MainViewPreview() {
    MainView()
}
