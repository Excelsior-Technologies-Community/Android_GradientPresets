package com.ext.gradientpreset

import android.content.Context
import android.util.AttributeSet
import android.view.View

fun View.applyGradientFromXml(
    context: Context,
    attrs: AttributeSet?
) {
    GradientAttributeHelper.applyFromAttributes(
        view = this,
        context = context,
        attrs = attrs
    )
}
