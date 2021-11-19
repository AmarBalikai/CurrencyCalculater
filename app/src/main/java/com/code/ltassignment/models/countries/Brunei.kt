package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesBrunei
import com.google.gson.annotations.SerializedName

   
data class Brunei (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesBrunei

)