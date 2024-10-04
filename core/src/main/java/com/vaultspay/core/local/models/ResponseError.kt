package com.vaultspay.core.local.models

data class ResponseError(
    val message: String?,
    val code: Int?,
    val accessToken: String?
)
