package com.olegsaz209.evorter.ui.shared.colors

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.olegsaz209.evorter.R

object Fonts {
    fun getNunitoFont(fontTypeId: Int): FontFamily {
        return FontFamily(Font(fontTypeId))
    }
}