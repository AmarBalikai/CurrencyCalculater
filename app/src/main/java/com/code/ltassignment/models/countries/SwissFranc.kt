package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesSwissFranc
import com.google.gson.annotations.SerializedName

   
data class SwissFranc (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesSwissFranc

)