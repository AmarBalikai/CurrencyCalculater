package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesRepublicChina
import com.google.gson.annotations.SerializedName

   
data class RepublicChina (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesRepublicChina

)