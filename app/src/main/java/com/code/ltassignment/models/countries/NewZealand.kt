package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesNewZealand
import com.google.gson.annotations.SerializedName

   
data class NewZealand (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesNewZealand

)