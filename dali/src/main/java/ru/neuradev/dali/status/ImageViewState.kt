package ru.neuradev.dali.status

import android.graphics.Bitmap

sealed class ImageViewState {
    object Loading : ImageViewState()
    data class Display(val image: Bitmap) : ImageViewState()
    data class Error(val status: ImageErrorStatus) : ImageViewState()
}