package com.olegsaz209.evorter.ui.colors

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

object AppColors {
    @Composable
    fun orangeButtonGradient(): Brush {
        return Brush.verticalGradient(
            colors = listOf(
                Color(0xFFFFCDC6),
                Color(0xFFFF7966),
            )
        )
    }

    fun blackButtonGradient(): Brush {
        return Brush.verticalGradient(
            colors = listOf(
                Color(0xE6202020),
                Color(0xFF202020),
            )
        )
    }

    fun whiteButtonGradient(): Brush {
        return Brush.verticalGradient(
            colors = listOf(
                Color(0xEBFFFFFF),
                Color(0xFFFFFFFF),
            )
        )
    }

    fun blueButtonGradient(): Brush {
        return Brush.verticalGradient(
            colors = listOf(
                Color(0xFF6791C9),
                Color(0xFF1771E6),
            )
        )
    }
}