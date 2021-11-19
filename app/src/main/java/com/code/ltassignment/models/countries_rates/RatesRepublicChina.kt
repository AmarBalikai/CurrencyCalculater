package com.code.ltassignment.models.countries_rates

import com.code.ltassignment.models.CurrencyInfo
import com.code.ltassignment.models.countries.RepublicChina
import com.google.gson.annotations.SerializedName

   
data class RatesRepublicChina (
   @SerializedName("CNH") var currencyInfo : CurrencyInfo
)