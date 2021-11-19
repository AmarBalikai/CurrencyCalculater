package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSriLanka
import com.google.gson.annotations.SerializedName

   
data class SriLanka (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSriLanka

)