package com.code.ltassignment.repository

import com.code.ltassignment.models.CurrencyResponse
import com.code.ltassignment.network.CurrencyApi
import com.code.ltassignment.utils.Resource
import java.lang.Exception
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api:CurrencyApi
):MainRepository {
    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try {
            val response=api.getRates()
            val result=response.body()
            if(response.isSuccessful && result!=null)
            {
                Resource.Success(result)
            }
            else{
                Resource.Error(response.message())
            }
        }catch (error:Exception)
        {
            Resource.Error(error.message?:"An error occurred")
        }
    }
}