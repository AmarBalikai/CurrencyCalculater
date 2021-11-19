package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesMalaysia
import com.google.gson.annotations.SerializedName

   
data class Malaysia (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesMalaysia

)