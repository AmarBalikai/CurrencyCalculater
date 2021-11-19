package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesFiji
import com.google.gson.annotations.SerializedName

   
data class Fiji (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesFiji

)