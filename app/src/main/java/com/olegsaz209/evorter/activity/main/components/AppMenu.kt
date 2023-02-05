package com.olegsaz209.evorter.activity.main.components

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.activity.main.MainActivityVM

@Composable
fun AppMenu(vm: MainActivityVM = viewModel()) {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            //.clip(shape = RoundedCornerShape(25.dp))
            .background(color = Color(0xCBFFFFFF))
            .padding(horizontal = 40.dp, vertical = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Image(
            painterResource(id = R.drawable.house),
            contentDescription = "",
            modifier = Modifier
                .width(26.dp)
                .height(26.dp)
                .clickable {
                    vm.startMainActivity(context as Activity)
                }
        )
        Image(
            painterResource(id = R.drawable.map),
            contentDescription = "",
            modifier = Modifier
                .width(24.dp)
                .height(26.dp)
                .clickable {
                    vm.startPlacesActivity(context as Activity)
                }
        )
        Image(
            painterResource(id = R.drawable.booking),
            contentDescription = "",
            modifier = Modifier
                .width(24.dp)
                .height(26.dp)
                .clickable {
                    vm.startBookingActivity(context as Activity)
                }
        )
        Image(
            painterResource(id = R.drawable.settings),
            contentDescription = "",
            modifier = Modifier
                .width(26.dp)
                .height(26.dp)
                .clickable {
                    vm.startSettingsActivity(context as Activity)
                }
        )
    }
}