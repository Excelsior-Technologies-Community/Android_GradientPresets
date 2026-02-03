package com.ext.gradientpreset

import android.graphics.drawable.GradientDrawable
import android.view.View

object GradientUtils {

    fun create(
        preset: GradientPreset,
        orientation: GradientDrawable.Orientation =
            GradientDrawable.Orientation.LEFT_RIGHT,
        cornerRadius: Float = 0f
    ): GradientDrawable {
        return GradientDrawable(
            orientation,
            preset.colors
        ).apply {
            this.cornerRadius = cornerRadius
        }
    }

    fun apply(
        view: View,
        preset: GradientPreset,
        cornerRadius: Float = 0f
    ) {
        view.background = create(preset, cornerRadius = cornerRadius)
    }
}
