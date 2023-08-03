package com.olegsaz209.evorter.ui.components.menu

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.ui.screens.main.MainActivityVM

//TODO сделать из IconBtn или enum или data class
@Composable
fun Menu(vm: MainActivityVM = viewModel()) {
    val context = LocalContext.current

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
                    vm.startMainActivity(context as Activity)

                }
                MenuItem(
                    drawableRes = R.drawable.locations, iconSize = 42.dp) {
                    vm.startPlacesActivity(context as Activity)

                }
                MenuItem(
                    drawableRes = R.drawable.apps_help, iconSize = 42.dp) {
                    vm.startBookingActivity(context as Activity)

                }
                MenuItem(
                    drawableRes = R.drawable.settings_2, iconSize = 42.dp) {
                    vm.startSettingsActivity(context as Activity)

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