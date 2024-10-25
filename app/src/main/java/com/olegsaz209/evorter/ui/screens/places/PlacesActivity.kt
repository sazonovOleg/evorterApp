package com.olegsaz209.evorter.ui.screens.places

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.ui.components.menu.Menu
import com.olegsaz209.evorter.ui.shared.colors.AppColors
import com.olegsaz209.evorter.ui.shared.colors.Fonts

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun PlacesView(navHostController: NavHostController) {
    FlowRow(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(brush = AppColors.mainBGGradient())
            .verticalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        PlacesViewItem()
        PlacesViewItem()
        PlacesViewItem()
        PlacesViewItem()
    }
    Menu(navHostController = navHostController)
}

@Composable
fun PlacesViewItem() {
    Column(
        modifier = Modifier
            .fillMaxSize(0.50f)
            .clip(RoundedCornerShape(10.dp))
            .padding(top = 10.dp, start = 5.dp, end = 5.dp)
            .border(
                BorderStroke(1.dp, SolidColor(Color(0xFF485E7D))),
                shape = RoundedCornerShape(10.dp),
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            Modifier.padding(4.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painterResource(R.drawable.places_test),
                "",
                modifier = Modifier
                    .fillMaxSize(1f)
                    .clip(RoundedCornerShape(5.dp)),
                colorFilter = ColorFilter.colorMatrix(ColorMatrix(AppColors.colorMatrix()))
            )
            Box(
                modifier = Modifier
                    .fillMaxSize(1f)
                    .padding(start = 7.dp, bottom = 5.dp),
                contentAlignment = Alignment.BottomStart,
            ) {
                Text(
                    text = "Санкт-Петербург",
                    color = Color(0xF8FFF9F7),
                    fontSize = 13.sp,
                    fontFamily = Fonts.getNunitoFont(R.font.semibold_italic),
                )
            }
        }
    }
}