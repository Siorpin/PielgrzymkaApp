package com.example.pielgrzymkabielskozywiecka.pielgrzymka.domain.errorHandling

typealias RootError = Error

sealed interface Result<out T, out E: RootError> {
    data class Success<out T, out E: RootError>(val data: T): Result<T, E>
    data class Error<out T, out E: RootError>(val error: E): Result<T, E>
}