package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesDanishKrone
import com.google.gson.annotations.SerializedName

   
data class DanishKrone (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesDanishKrone

)