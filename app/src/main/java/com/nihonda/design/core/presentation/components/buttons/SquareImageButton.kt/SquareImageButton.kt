package com.nihonda.design.core.presentation.components.buttons.SquareImageButton.kt

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.nihonda.design.R

@Composable
fun SquareImageButton(
    @DrawableRes id: Int,
    onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .aspectRatio(1f),
        content = {
            Image(painter = painterResource(id = id), contentDescription = null)
        }
    )
}

@Preview
@Composable
fun SquareImageButtonPreview() {
    SquareImageButton(R.drawable.hidrology) {
        Log.d("====>", "Square Button Clicked")
    }
}
