package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesThailand
import com.google.gson.annotations.SerializedName

   
data class Thailand (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesThailand

)