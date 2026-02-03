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

            val hasStartColor = typedArray.hasValue(R.styleable.GradientView_startColor)
            val hasEndColor = typedArray.hasValue(R.styleable.GradientView_endColor)

            val startColor = if (hasStartColor)
                typedArray.getColor(R.styleable.GradientView_startColor, 0)
            else 0

            val endColor = if (hasEndColor)
                typedArray.getColor(R.styleable.GradientView_endColor, 0)
            else 0


            val colors: IntArray? = when {
                startColorAttr != 0 && endColorAttr != 0 -> {
                    intArrayOf(
                        ColorResolver.resolveAttr(context, startColorAttr),
                        ColorResolver.resolveAttr(context, endColorAttr)
                    )
                }

                hasStartColor && hasEndColor -> {
                    intArrayOf(startColor, endColor)
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
