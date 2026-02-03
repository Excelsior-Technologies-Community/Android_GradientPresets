package com.ext.gradientpreset

import android.view.View

fun View.setGradient(
    preset: GradientPreset,
    orientation: GradientOrientation = GradientOrientation.LEFT_RIGHT,
    cornerRadius: Float = 0f
) {
    GradientUtils.apply(
        view = this,
        preset = preset,
        orientation = orientation,
        cornerRadius = cornerRadius
    )
}
