package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSaudiArabia
import com.google.gson.annotations.SerializedName

   
data class SaudiArabia (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSaudiArabia

)