package com.olegsaz209.evorter.ui.components.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.olegsaz209.evorter.R

//TODO сделать из IconBtn или enum или data class

@Composable
fun Menu(
    navHostController: NavHostController,
) {
    Box(
        Modifier.fillMaxSize(1f),
        contentAlignment = Alignment.BottomCenter
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 7.dp, end = 7.dp, bottom = 7.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color(0xFFFFFFFF))
                    .padding(horizontal = 25.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                MenuItem(
                    drawableRes = R.drawable.home_1, iconSize = 42.dp) {
                    navHostController.navigate("home")
                }
                MenuItem(
                    drawableRes = R.drawable.locations, iconSize = 42.dp) {
                    navHostController.navigate("places")
                }
                MenuItem(
                    drawableRes = R.drawable.apps_help, iconSize = 42.dp) {
                    navHostController.navigate("services")
                }
                MenuItem(
                    drawableRes = R.drawable.settings_2, iconSize = 42.dp) {
                    navHostController.navigate("settings")
                }
            }
        }
    }
}

@Composable
fun MenuItem(
    drawableRes: Int,
    iconSize: Dp,
    onClick: (() -> Unit)? = null,
) {
    IconButton(onClick = {
        onClick?.invoke()
    }) {
        Image(
            painterResource(id = drawableRes),
            contentDescription = "",
            modifier = Modifier
                .width(iconSize)
                .height(iconSize)
        )
    }
}