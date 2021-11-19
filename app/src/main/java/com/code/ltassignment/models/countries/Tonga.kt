package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesTonga
import com.google.gson.annotations.SerializedName

   
data class Tonga (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesTonga

)