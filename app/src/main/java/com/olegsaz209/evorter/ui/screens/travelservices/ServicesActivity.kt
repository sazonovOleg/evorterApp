package com.olegsaz209.evorter.ui.screens.travelservices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.ui.components.menu.Menu
import com.olegsaz209.evorter.ui.shared.colors.AppColors
import com.olegsaz209.evorter.ui.shared.ui.SmallAnimateButton
import java.util.*

class ServicesActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            ServicesScreen()
        }
    }
}

@Composable
fun ServicesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(brush = AppColors.mainBGGradient())
            .padding(top = 30.dp, start = 15.dp, end = 15.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ) {
        ScreenItem()
        ScreenItem()
        ScreenItem()
        ScreenItem()
    }
    Menu()
}

@Composable
fun ScreenItem() {
    Row(
        Modifier
            .fillMaxWidth(1f)
            .heightIn(max = 150.dp)
            .padding(bottom = 20.dp)
    ) {
        Image(
            painterResource(R.drawable.logo),
            "",
            modifier = Modifier
                .width(90.dp)
                .height(90.dp)
                .clip(RoundedCornerShape(5.dp)),
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(
                text = "Aviasales".toUpperCase(Locale.ROOT),
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 5.dp)
            )
            Text(
                text = "Классика для поиска авиабилетов :)",
                color = Color.Black,
                fontSize = 13.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            SmallAnimateButton(text = "Скачать приложение")
        }
    }
}