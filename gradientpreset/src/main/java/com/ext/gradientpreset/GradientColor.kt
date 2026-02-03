package com.ext.gradientpreset

import android.content.Context
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt

sealed class GradientColor {

    data class Static(@ColorInt val color: Int) : GradientColor()

    data class ThemeAttr(@AttrRes val attrRes: Int) : GradientColor()

    fun resolve(context: Context): Int {
        return when (this) {
            is Static -> color
            is ThemeAttr -> ThemeColorResolver.resolve(context, attrRes)
        }
    }
}
