package com.ext.gradientpreset

import android.content.Context
import android.util.AttributeSet
import android.view.View

internal object GradientAttributeHelper {

    fun applyFromAttributes(
        view: View,
        context: Context,
        attrs: AttributeSet?
    ) {
        if (attrs == null) return

        val typedArray = context.obtainStyledAttributes(
            attrs,
            R.styleable.GradientView
        )

        try {
            val radius = typedArray.getDimension(
                R.styleable.GradientView_gradientRadius,
                0f
            )

            val orientationIndex = typedArray.getInt(
                R.styleable.GradientView_gradientOrientation,
                0
            )

            val orientation =
                GradientXmlMapper.orientationFromAttr(orientationIndex)

            val startColorAttr = typedArray.getResourceId(
                R.styleable.GradientView_startColorAttr,
                0
            )

            val endColorAttr = typedArray.getResourceId(
                R.styleable.GradientView_endColorAttr,
                0
            )

            val startColorRes = typedArray.getResourceId(
                R.styleable.GradientView_startColor,
                0
            )

            val endColorRes = typedArray.getResourceId(
                R.styleable.GradientView_endColor,
                0
            )

            val colors: IntArray? = when {
                startColorAttr != 0 && endColorAttr != 0 -> {
                    intArrayOf(
                        ColorResolver.resolveAttr(context, startColorAttr),
                        ColorResolver.resolveAttr(context, endColorAttr)
                    )
                }

                startColorRes != 0 && endColorRes != 0 -> {
                    intArrayOf(
                        ColorResolver.resolveColorRes(context, startColorRes),
                        ColorResolver.resolveColorRes(context, endColorRes)
                    )
                }

                else -> null
            }

            when {
                colors != null -> {
                    GradientUtils.applyColors(
                        view = view,
                        colors = colors,
                        orientation = orientation,
                        cornerRadius = radius
                    )
                }

                typedArray.hasValue(R.styleable.GradientView_gradientPreset) -> {

                    val presetIndex = typedArray.getInt(
                        R.styleable.GradientView_gradientPreset,
                        0
                    )

                    val preset = GradientXmlMapper.fromAttr(presetIndex)

                    GradientUtils.apply(
                        view = view,
                        preset = preset,
                        orientation = orientation,
                        cornerRadius = radius
                    )
                }
            }

        } finally {
            typedArray.recycle()
        }
    }
}
