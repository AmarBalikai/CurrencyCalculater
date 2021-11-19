package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSingapore
import com.google.gson.annotations.SerializedName

   
data class Singapore (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSingapore

)