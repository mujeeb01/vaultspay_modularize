package com.vaultspay.core.extensions

import android.content.Context
import com.google.gson.Gson
import com.vaultspay.core.R
import com.vaultspay.core.local.models.ResponseError
import com.vaultspay.core.remote.Resource
import retrofit2.Response
import javax.inject.Inject

suspend fun <T> handleApiResponse(
    isInternetConnected: Boolean,
    apiCall: suspend () -> Response<T>
): Resource<T> {
    return try {

        if (isInternetConnected) {
            val c = apiCall()
            c.let {
                if (c.isSuccessful) {

                    return Resource.success(c.body()!!)

                } else if (it.code() == 401 || it.code() == 400 || it.code() == 402 || it.code() == 403) {
                    val errorMessagesJson = it.errorBody()?.source()?.buffer?.readUtf8()!!

                    return Resource.error(
                        "", null, extractErrorMessage(
                            errorMessagesJson
                        )
                    )

                } else {
                    /*return Resource.error(
                        MainApplication.applicationContext.getString(R.string.something_went_wrong),
                        null, null
                    )*/
                    return Resource.error(
                        "something_went_wrong",
                        null, null
                    )
                }
            }
        }else{
            /*Resource.error(
                MainApplication.applicationContext.getString(
                    R.string.no_internet_connection
                ), null, null
            )*/
            Resource.error(
                "no_internet_connection",
                null, null
            )
        }
    } catch (e: Exception) {
        Resource.error(e.message!!, null, null)
    }
}

private fun extractErrorMessage(errorMessagesJson: String): ResponseError {
    val gsonObj = Gson()

    gsonObj.serializeNulls()
    val errorObj = gsonObj.fromJson(errorMessagesJson, ResponseError::class.java)
    val msg = errorObj.message

    return errorObj
}
