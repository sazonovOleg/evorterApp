package com.olegsaz209.evorter.ui.shared.ui

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SmallAnimateButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    backgroundDrawStyle: DrawStyle = Fill,
    contentColor: Color = Color.White,
    isBlinking: Boolean = false
) {
    val blinkingAlpha = if (isBlinking) {
        rememberInfiniteTransition().animateFloat(
            initialValue = 1f,
            targetValue = 0.9f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 200, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            )
        ).value
    } else {
        1f
    }
    Button(
        modifier = modifier
            .fillMaxWidth(1f)
            .heightIn(max = 35.dp)
            .radialGradientFromLeft(backgroundDrawStyle, blinkingAlpha)
            .defaultMinSize(minHeight = 0.dp),
        onClick = { onClick?.invoke() },
        elevation = ButtonDefaults.elevationZero(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
            contentColor = contentColor
        ),
        shape = RoundedCornerShape(IMPORTANT_BUTTON_CORNER_RADIUS),
        contentPadding = PaddingValues(0.dp)
    ) {
        Text(
            fontWeight = FontWeight.W500,
            fontSize = 12.sp,
            text = text.uppercase(),
        )
    }
}

private fun Modifier.radialGradientFromLeft(style: DrawStyle, alpha: Float) = this.then(
    Modifier.drawBehind {
        val startColor = Color(0xFF15D0D9)
        val startColorAfterAlpha = Color(
            red = startColor.red * alpha,
            green = startColor.green * alpha,
            blue = startColor.blue * alpha
        )
        val endColor = Color(0xFF01C9F4)
        val endColorAfterAlpha = Color(
            red = endColor.red * alpha,
            green = endColor.green * alpha,
            blue = endColor.blue * alpha
        )
        drawRoundRect(
            brush = Brush.radialGradient(
                colors = listOf(startColorAfterAlpha, endColorAfterAlpha),
                center = Offset(x = 0f, y = this.size.height / 2),
                radius = this.size.width
            ),
            cornerRadius = CornerRadius(
                IMPORTANT_BUTTON_CORNER_RADIUS.toPx(),
                IMPORTANT_BUTTON_CORNER_RADIUS.toPx()
            ),
            style = style
        )
    }
)

@Composable
fun ButtonDefaults.elevationZero() = elevation(
    defaultElevation = 0.dp,
    pressedElevation = 0.dp,
    disabledElevation = 0.dp,
    hoveredElevation = 0.dp,
    focusedElevation = 0.dp
)

private val IMPORTANT_BUTTON_CORNER_RADIUS = 10.dp