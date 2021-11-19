package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSolomonIslands
import com.google.gson.annotations.SerializedName

   
data class SolomonIslands (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSolomonIslands

)