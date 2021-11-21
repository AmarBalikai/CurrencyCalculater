package com.code.ltassignment.repository

import com.code.ltassignment.models.CurrencyResponse
import com.code.ltassignment.utils.Resource
import okhttp3.Response
import okhttp3.ResponseBody

interface MainRepository {
    suspend fun getRates():Resource<ResponseBody>
}