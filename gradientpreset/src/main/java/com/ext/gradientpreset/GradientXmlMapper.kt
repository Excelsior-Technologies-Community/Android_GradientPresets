package com.ext.gradientpreset

internal object GradientXmlMapper {

    fun fromAttr(value: Int): GradientPreset {
        return when (value) {
            0 -> GradientPreset.SUNSET
            1 -> GradientPreset.OCEAN_BLUE
            else -> GradientPreset.SUNSET
        }
    }

    fun orientationFromAttr(value: Int): GradientOrientation {
        return when (value) {
            1 -> GradientOrientation.TOP_BOTTOM
            2 -> GradientOrientation.TL_BR
            3 -> GradientOrientation.BL_TR
            else -> GradientOrientation.LEFT_RIGHT
        }
    }
}
