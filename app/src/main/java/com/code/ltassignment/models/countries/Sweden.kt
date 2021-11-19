package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSweden
import com.google.gson.annotations.SerializedName

   
data class Sweden (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSweden

)