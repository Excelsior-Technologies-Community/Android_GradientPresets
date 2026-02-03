package com.ext.gradientpreset

import android.graphics.drawable.GradientDrawable

enum class GradientOrientation(
    val androidOrientation: GradientDrawable.Orientation
) {
    LEFT_RIGHT(GradientDrawable.Orientation.LEFT_RIGHT),
    TOP_BOTTOM(GradientDrawable.Orientation.TOP_BOTTOM),
    TL_BR(GradientDrawable.Orientation.TL_BR),
    BL_TR(GradientDrawable.Orientation.BL_TR)
}
