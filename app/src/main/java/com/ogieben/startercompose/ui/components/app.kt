package com.ogieben.startercompose.ui.components

import androidx.compose.Composable
import androidx.ui.material.surface.Surface
import com.ogieben.startercompose.ui.theme.BaseTheme

@Composable
fun App(children: @Composable() () -> Unit) {
    BaseTheme {
        Surface() {
            children()
        }
    }
}