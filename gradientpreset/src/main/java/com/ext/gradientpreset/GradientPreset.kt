package com.ext.gradientpreset

enum class GradientPreset(
    val colors: List<GradientColor>
) {

    SUNSET(
        listOf(
            GradientColor.Static(0xFFFF512F.toInt()),
            GradientColor.Static(0xFFDD2476.toInt())
        )
    ),

    FIRE(
        listOf(
            GradientColor.Static(0xFFF12711.toInt()),
            GradientColor.Static(0xFFF5AF19.toInt())
        )
    ),

    OCEAN(
        listOf(
            GradientColor.Static(0xFF2193B0.toInt()),
            GradientColor.Static(0xFF6DD5ED.toInt())
        )
    ),

    SKY(
        listOf(
            GradientColor.Static(0xFF2980B9.toInt()),
            GradientColor.Static(0xFF6DD5FA.toInt())
        )
    ),

    FOREST(
        listOf(
            GradientColor.Static(0xFF134E5E.toInt()),
            GradientColor.Static(0xFF71B280.toInt())
        )
    ),

    MINT(
        listOf(
            GradientColor.Static(0xFF76B852.toInt()),
            GradientColor.Static(0xFF8DC26F.toInt())
        )
    ),

    LAVENDER(
        listOf(
            GradientColor.Static(0xFF7F00FF.toInt()),
            GradientColor.Static(0xFFE100FF.toInt())
        )
    ),

    NIGHT(
        listOf(
            GradientColor.Static(0xFF141E30.toInt()),
            GradientColor.Static(0xFF243B55.toInt())
        )
    ),

    PEACH(
        listOf(
            GradientColor.Static(0xFFED4264.toInt()),
            GradientColor.Static(0xFFFFEDBC.toInt())
        )
    )
}
