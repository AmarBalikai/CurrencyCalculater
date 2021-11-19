package com.code.ltassignment.repository

import com.code.ltassignment.models.CurrencyResponse
import com.code.ltassignment.utils.Resource

interface MainRepository {
    suspend fun getRates():Resource<CurrencyResponse>
}