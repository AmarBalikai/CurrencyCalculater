package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesIndonesia
import com.google.gson.annotations.SerializedName

   
data class Indonesia (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesIndonesia

)