package com.olegsaz209.evorter.activity.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.activity.main.components.AppHeaderSlider
import com.olegsaz209.evorter.activity.main.components.Body
import com.olegsaz209.evorter.activity.main.components.Header

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
            .fillMaxSize()
            .background(Color(0xFFFFFFFF)),
            //.paint(painterResource(R.drawable.bg_3), contentScale = ContentScale.FillHeight),
        Arrangement.Top
    ) {
        Header()
        AppHeaderSlider()
        //Body()
    }
}



@Preview
@Composable
fun MainContentPreview() {
    MainContent()
}
