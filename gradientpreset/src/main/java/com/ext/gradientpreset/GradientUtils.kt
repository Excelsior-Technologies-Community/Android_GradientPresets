package com.ext.gradientpreset

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.view.View

object GradientUtils {

    fun create(
        context: Context,
        preset: GradientPreset,
        orientation: GradientOrientation = GradientOrientation.LEFT_RIGHT,
        cornerRadius: Float = 0f
    ): GradientDrawable {

        val resolvedColors = preset.colors
            .map { it.resolve(context) }
            .toIntArray()

        return GradientDrawable(
            orientation.androidOrientation,
            resolvedColors
        ).apply {
            this.cornerRadius = cornerRadius
        }
    }



    fun apply(
        view: View,
        preset: GradientPreset,
        orientation: GradientOrientation = GradientOrientation.LEFT_RIGHT,
        cornerRadius: Float = 0f
    ) {
        view.background = create(
            context = view.context,
            preset = preset,
            orientation = orientation,
            cornerRadius = cornerRadius
        )
    }
    fun applyColors(
        view: View,
        colors: IntArray,
        orientation: GradientOrientation,
        cornerRadius: Float
    ) {
        view.background = GradientDrawable(
            orientation.androidOrientation,
            colors
        ).apply {
            this.cornerRadius = cornerRadius
        }
    }

}
