package com.code.ltassignment.models.countries

import com.code.ltassignment.models.Rates
import com.google.gson.annotations.SerializedName

   
data class SouthKorean (

   @SerializedName("ProductId") var ProductId : String,
   @SerializedName("Rates") var Rates : Rates

)