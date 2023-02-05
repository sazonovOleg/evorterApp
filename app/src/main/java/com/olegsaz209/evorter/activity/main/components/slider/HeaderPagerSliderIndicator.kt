package com.olegsaz209.evorter.activity.main.components.slider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeaderPagerSliderIndicator(pagerState: PagerState) {
    Box(
        Modifier
            .offset(y = (165).dp)
            .zIndex(1f)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
        ) {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                modifier = Modifier.padding(top = 15.dp, bottom = 15.dp),
                indicatorWidth = 5.dp,
                indicatorHeight = 5.dp,
                activeColor = Color(0xCEFFFFFF),
                inactiveColor = Color(0x63B8B8B8),
                spacing = 15.dp
            )
        }
    }
}