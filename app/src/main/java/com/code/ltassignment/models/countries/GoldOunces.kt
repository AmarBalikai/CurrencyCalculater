package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesGoldOunces
import com.google.gson.annotations.SerializedName

   
data class GoldOunces (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesGoldOunces

)