package com.ext.gradientpreset

import android.content.Context
import android.util.TypedValue

object ThemeColorResolver {

    fun resolve(context: Context, attrRes: Int): Int {
        val typedValue = TypedValue()
        context.theme.resolveAttribute(attrRes, typedValue, true)
        return typedValue.data
    }
}
