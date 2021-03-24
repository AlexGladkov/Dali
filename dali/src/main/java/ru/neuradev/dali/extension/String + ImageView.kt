package ru.neuradev.dali.extension

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.neuradev.dali.ImageView

@Composable
fun String.drawAsyncImage(modifier: Modifier = Modifier) {
    ImageView(imageUri = this, modifier = modifier)
}