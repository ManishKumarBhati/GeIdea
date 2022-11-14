package com.bmk.baseproject.util

sealed class ResponseState<out T> {
    object Loading : ResponseState<Nothing>()
    data class Error(val throwable: Throwable) : ResponseState<Nothing>()
    data class Success<T>(val data: T) : ResponseState<T>()
}