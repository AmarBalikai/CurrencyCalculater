package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesPoundSterling
import com.google.gson.annotations.SerializedName

   
data class PoundSterling (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesPoundSterling

)