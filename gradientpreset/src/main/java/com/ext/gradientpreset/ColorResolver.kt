package com.ext.gradientpreset

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

object ColorResolver {

    @ColorInt
    fun resolveColorRes(
        context: Context,
        @ColorRes resId: Int
    ): Int {
        return ContextCompat.getColor(context, resId)
    }

    @ColorInt
    fun resolveAttr(
        context: Context,
        @AttrRes attrRes: Int
    ): Int {
        val typedValue = TypedValue()
        context.theme.resolveAttribute(attrRes, typedValue, true)
        return typedValue.data
    }
}
