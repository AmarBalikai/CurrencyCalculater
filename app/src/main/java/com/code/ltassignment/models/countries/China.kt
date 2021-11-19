package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesChina
import com.google.gson.annotations.SerializedName

   
data class China (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesChina

)