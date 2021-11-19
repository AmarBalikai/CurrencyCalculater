package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesVietnam
import com.google.gson.annotations.SerializedName

   
data class Vietnam (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesVietnam

)