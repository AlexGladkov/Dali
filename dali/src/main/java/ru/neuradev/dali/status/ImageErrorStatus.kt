package ru.neuradev.dali.status

sealed class ImageErrorStatus {
    object NoImageProvided : ImageErrorStatus()
    object NoImageLoaded : ImageErrorStatus()
    data class RemoteError(val cause: Exception?): ImageErrorStatus()
}
