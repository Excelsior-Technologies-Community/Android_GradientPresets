package com.ext.gradientpreset

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class GradientLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        GradientAttributeHelper.applyFromAttributes(
            view = this,
            context = context,
            attrs = attrs
        )
    }
}
