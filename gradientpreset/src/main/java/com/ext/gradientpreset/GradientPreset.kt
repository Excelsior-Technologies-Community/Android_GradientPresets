package com.ext.gradientpreset

import android.graphics.Color

enum class GradientPreset(
    val colors: IntArray
) {
    SUNSET(
        intArrayOf(
            Color.parseColor("#ff7e5f"),
            Color.parseColor("#feb47b")
        )
    ),

    OCEAN_BLUE(
        intArrayOf(
            Color.parseColor("#2193b0"),
            Color.parseColor("#6dd5ed")
        )
    ),

    PURPLE_DREAM(
        intArrayOf(
            Color.parseColor("#cc2b5e"),
            Color.parseColor("#753a88")
        )
    )
}
