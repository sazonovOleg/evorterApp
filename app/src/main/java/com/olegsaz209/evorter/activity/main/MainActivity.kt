package com.olegsaz209.evorter.activity.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.olegsaz209.evorter.activity.main.components.AppHeaderSlider
import com.olegsaz209.evorter.activity.main.components.AppMenu
import com.olegsaz209.evorter.activity.main.components.Body

class MainActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    Column(
        Modifier
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(
                        Color(0x4BBEBEBE),
                        Color(0xB2FFCBBB),
                    )
                )
            )
            .fillMaxSize()
            .offset(y = (0).dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AppHeaderSlider()
        Body()
        AppMenu()
    }
}

@Preview
@Composable
fun MainContentPreview() {
    MainContent()
}
