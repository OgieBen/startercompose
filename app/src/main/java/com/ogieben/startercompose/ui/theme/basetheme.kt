package com.ogieben.startercompose.ui.theme

import androidx.compose.Composable
import androidx.ui.graphics.Color
import androidx.ui.material.MaterialTheme
import androidx.ui.material.MaterialColors


val lightThemeColors = mapOf( "green" to Color(0xFF1EB980) )
// val darkThemeColors = mapOf()
val defaultPrimaryColor = Color(0xFF1EB980)

private val colorPalette = MaterialColors(
    primary = lightThemeColors["green"] ?: defaultPrimaryColor,
    surface = Color.DarkGray,
    onSurface = lightThemeColors["green"] ?: defaultPrimaryColor,
    secondaryVariant = Color.Yellow
)

@Composable
fun BaseTheme(children: @Composable() () -> Unit){
    MaterialTheme(colors = colorPalette) {
        children()
    }
}
