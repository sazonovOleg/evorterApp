package com.olegsaz209.evorter.ui.screens.settings

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.ui.components.menu.Menu
import com.olegsaz209.evorter.ui.shared.colors.AppColors
import com.olegsaz209.evorter.ui.shared.colors.Fonts
import com.olegsaz209.evorter.ui.shared.ui.coloredShadow
import com.olegsaz209.evorter.ui.shared.ui.elevationZero

class SettingsActivity : ComponentActivity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        setContent {
            SettingsView()
        }
    }
}

@Composable
fun SettingsView() {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(brush = AppColors.mainBGGradient())
            .padding(top = 30.dp, start = 10.dp, end = 10.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
    ) {
        Row(
            modifier = Modifier.coloredShadow(
                color = Color(0xFFE0E0E0),
                alpha = 0.3f,
                borderRadius = 10.dp,
                shadowRadius = 3.dp,
                offsetY = (3).dp
            ).zIndex(0f)
        ) {
            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(10.dp))
                    .border(
                        border = BorderStroke(1.dp, Color(0x8FD1D1D1)),
                        shape = RoundedCornerShape(10.dp),
                    )
                    .background(Color(0x8FFFFFFF))
                    .zIndex(1f)
            ) {
                SettingsViewItem(imgId = R.drawable.favorite_s, stringId = "Избранное") {
                    Log.d("Devv", "devv click ")
                }
                Spacer(modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(1.dp)
                    .background(Color(0x8FD1D1D1)))
                SettingsViewItem(imgId = R.drawable.share_4, stringId = "Поделиться") {
                    Log.d("Devv", "devv click ")
                }
                Spacer(modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(1.dp)
                    .background(Color(0x8FD1D1D1)))
                SettingsViewItem(imgId = R.drawable.info, stringId = "О приложении") {
                    Log.d("Devv", "devv click ")
                }
            }
        }
    }
    Menu()
}

@Composable
fun SettingsViewItem(
    imgId: Int,
    stringId: String,
    onClick: (() -> Unit)? = null,
) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = Color.Black,
        ),
        elevation = ButtonDefaults.elevationZero(),
        onClick = { onClick?.invoke() },
        modifier = Modifier
            .fillMaxWidth(1f)
            .background(Color.Transparent),
        contentPadding = PaddingValues(0.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(15.dp)
        ) {
            Image(
                painterResource(imgId),
                contentDescription = "",
                modifier = Modifier
                    .width(43.dp)
                    .height(43.dp)
            )
            Text(
                text = stringId,
                modifier = Modifier.padding(start = 15.dp),
                fontSize = 18.sp,
                fontFamily = Fonts.getNunitoFont(R.font.regular)
            )
        }
    }
}