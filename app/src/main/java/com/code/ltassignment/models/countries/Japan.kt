package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesJapan
import com.google.gson.annotations.SerializedName

   
data class Japan (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesJapan

)