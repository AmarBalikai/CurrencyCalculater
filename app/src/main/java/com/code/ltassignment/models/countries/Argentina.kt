package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesArgentina
import com.google.gson.annotations.SerializedName

   
data class Argentina (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesArgentina

)