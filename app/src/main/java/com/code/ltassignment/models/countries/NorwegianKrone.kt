package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesNorwegianKrone
import com.google.gson.annotations.SerializedName

   
data class NorwegianKrone (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesNorwegianKrone

)