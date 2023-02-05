package com.olegsaz209.evorter.activity.main.components.slider

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.compose.ui.zIndex
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.olegsaz209.evorter.R
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HeaderPagerSlider(pagerState: PagerState) {
    Column(
    ) {
        HorizontalPager(state = pagerState) { page ->
            Box(
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset =
                            calculateCurrentOffsetForPage(page).absoluteValue
                        lerp(
                            start = 0.95f,
                            stop = 1f,
                            fraction = 1f - pageOffset.coerceIn(0f, 1f)
                        ).also { scale ->
                            scaleX = scale
                            scaleY = scale
                        }
                    }
            ) {
                val pageSlide = sliderList[page]
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(start = 10.dp, top = 40.dp)
                ) {
                    Text(
                        text = "Hello Atiq",
                        color = Color(0xFFFFFFFF),
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Start,
                    )
                    Text(
                        stringResource(id = pageSlide.title),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp,
                        color = Color(0xFFFAFAFA),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 3.dp),
                        textAlign = TextAlign.Start,
                    )
                }
                Column(
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                        .zIndex(-1f)
                ) {
                    Image(
                        painterResource(
                            id = when (sliderList.size) {
                                sliderList.size -> pageSlide.image
                                else -> R.drawable.img_3
                            }
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .height(370.dp)
                            .fillMaxWidth()
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, top = 10.dp)
                        .offset(y = (270).dp)
                ) {
                    Text(
                        stringResource(id = pageSlide.subtitle),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Start,
                    )
                    Text(
                        stringResource(id = pageSlide.text),
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp,
                        color = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 3.dp),
                        textAlign = TextAlign.Start,
                    )
                }
            }
            HeaderPagerSliderIndicator(pagerState)
        }
    }
}