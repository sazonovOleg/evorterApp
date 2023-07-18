package com.olegsaz209.evorter.activity.main

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
import androidx.compose.ui.unit.dp
import com.olegsaz209.evorter.activity.main.components.content.MainContent
import com.olegsaz209.evorter.activity.main.components.menu.MainMenu
import com.olegsaz209.evorter.activity.main.components.slider.MainSlider

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
    Box() {
        Column(
            Modifier
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFFFFFFF),
                            Color(0xFFFFFFFF),
                            Color(0x16FF623B),
                        )
                    )
                )
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainSlider()
            MainContent()
        }
        MainMenu()
    }
}

@Preview
@Composable
fun MainViewPreview() {
    MainView()
}
