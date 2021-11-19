package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesBrazil
import com.google.gson.annotations.SerializedName

   
data class Brazil (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesBrazil

)