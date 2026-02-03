package com.ext.gradientpreset

import android.graphics.Color

enum class GradientPreset(
    val colors: List<GradientColor>
) {

    SUNSET(
        listOf(
            GradientColor.ThemeAttr(android.R.attr.colorPrimary),
            GradientColor.ThemeAttr(android.R.attr.colorSecondary)
        )
    ),

    OCEAN_BLUE(
        listOf(
            GradientColor.Static(0xFF2193B0.toInt()),
            GradientColor.Static(0xFF6DD5ED.toInt())
        )
    )
}
