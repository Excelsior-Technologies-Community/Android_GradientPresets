package com.ext.gradientpreset

import android.view.View

fun View.setGradient(
    preset: GradientPreset,
    cornerRadius: Float = 0f
) {
    GradientUtils.apply(this, preset, cornerRadius)
}