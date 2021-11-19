package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSouthKorean
import com.google.gson.annotations.SerializedName

   
data class SouthKorean (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSouthKorean

)