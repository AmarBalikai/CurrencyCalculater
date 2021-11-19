package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSamoa
import com.google.gson.annotations.SerializedName

   
data class Samoa (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSamoa

)