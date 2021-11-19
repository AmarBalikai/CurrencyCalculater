package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesVanuatu
import com.google.gson.annotations.SerializedName

   
data class Vanuatu (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesVanuatu

)