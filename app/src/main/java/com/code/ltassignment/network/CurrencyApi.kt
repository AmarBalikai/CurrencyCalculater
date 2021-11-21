package com.code.ltassignment.network

import com.code.ltassignment.models.CurrencyResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {
    @GET("/bin/getJsonRates.wbc.fx.json")
    suspend fun getRates():Response<ResponseBody>
}