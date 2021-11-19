package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSouthAfrican
import com.google.gson.annotations.SerializedName

   
data class SouthAfrican (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSouthAfrican

)