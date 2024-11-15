package com.olegsaz209.evorter.ui.components.menu

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
                .padding(start = 2.dp, end = 2.dp, bottom = 2.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color(0xF8FF623B))
                    .padding(horizontal = 35.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                IconButton(onClick = {
                    vm.startMainActivity(context as Activity)
                }) {
                    Image(
                        painterResource(id = R.drawable.house),
                        contentDescription = "",
                        modifier = Modifier
                            .width(28.dp)
                            .height(28.dp)
                    )
                }
                IconButton(onClick = {
                    vm.startPlacesActivity(context as Activity)
                }) {
                    Image(
                        painterResource(id = R.drawable.map),
                        contentDescription = "",
                        modifier = Modifier
                            .width(26.dp)
                            .height(28.dp)
                    )
                }
                IconButton(onClick = {
                    vm.startBookingActivity(context as Activity)
                }) {
                    Image(
                        painterResource(id = R.drawable.booking),
                        contentDescription = "",
                        modifier = Modifier
                            .width(26.dp)
                            .height(28.dp)
                    )
                }
                IconButton(onClick = {
                    vm.startSettingsActivity(context as Activity)
                }) {
                    Image(
                        painterResource(id = R.drawable.settings),
                        contentDescription = "",
                        modifier = Modifier
                            .width(28.dp)
                            .height(28.dp)
                    )
                }
            }
        }
    }
}