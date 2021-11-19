package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesNewTaiwan
import com.google.gson.annotations.SerializedName

   
data class NewTaiwan (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesNewTaiwan

)