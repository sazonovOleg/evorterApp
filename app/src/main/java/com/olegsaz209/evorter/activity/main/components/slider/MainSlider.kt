package com.olegsaz209.evorter.activity.main.components.slider

import androidx.compose.animation.core.snap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.compose.ui.zIndex
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.pager.*
import com.olegsaz209.evorter.R
import com.olegsaz209.evorter.activity.main.MainActivityVM
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainSlider(vm: MainActivityVM = viewModel()) {
    val pagerState = rememberPagerState(
        pageCount = sliderList.size
    )

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(800000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
                animationSpec = snap(2500)
            )
        }
    }

    Column(
        Modifier
            .fillMaxHeight(1f)
            .offset(y = (-20).dp)
    ) {
        PagerSlider(pagerState)
        SliderIndicator(pagerState)
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
private fun PagerSlider(pagerState: PagerState) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .clip(RoundedCornerShape(bottomEnd = 80.dp))
    ) {
        HorizontalPager(state = pagerState) { page ->
            Box(
                modifier = Modifier
                    .graphicsLayer {
                        val pageOffset =
                            calculateCurrentOffsetForPage(page).absoluteValue
                        lerp(
                            start = 1f,
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
                    //Filter for images
                    val contrast = 1.5f
                    val brightness = -10f
                    val colorMatrix = floatArrayOf(
                        contrast, 0f, 0f, 0f, brightness,
                        0f, contrast, 0f, 0f, brightness,
                        0f, 0f, contrast, 0f, brightness,
                        0f, 0f, 0f, 1f, 0f
                    )

                    Image(
                        painterResource(
                            id = when (sliderList.size) {
                                sliderList.size -> pageSlide.image
                                else -> R.drawable.img_3
                            }
                        ),
                        contentDescription = "",
                        modifier = Modifier
                            .height(362.dp)
                            .fillMaxWidth(),
                        colorFilter = ColorFilter.colorMatrix(ColorMatrix(colorMatrix))
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
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
private fun SliderIndicator(pagerState: PagerState) {
    Box(
        Modifier
            .zIndex(1f)
            .offset(y = (-25).dp),
        contentAlignment = Alignment.BottomCenter,
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .fillMaxWidth()
        ) {
            HorizontalPagerIndicator(
                pagerState = pagerState,
                indicatorWidth = 5.5.dp,
                indicatorHeight = 5.5.dp,
                activeColor = Color(0xFFFFFFFF),
                inactiveColor = Color(0xF8FF623B),
                spacing = 15.dp
            )
        }
    }
}