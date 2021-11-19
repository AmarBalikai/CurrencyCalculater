package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesCanada
import com.google.gson.annotations.SerializedName

   
data class Canada (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesCanada

)