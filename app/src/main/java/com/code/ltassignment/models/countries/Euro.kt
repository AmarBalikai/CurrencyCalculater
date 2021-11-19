package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesEuro
import com.google.gson.annotations.SerializedName

   
data class Euro (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesEuro

)