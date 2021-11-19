package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesChile
import com.google.gson.annotations.SerializedName

   
data class Chile (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesChile

)