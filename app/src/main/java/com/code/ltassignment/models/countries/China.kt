package com.code.ltassignment.models.countries

import com.code.ltassignment.models.Rates
import com.google.gson.annotations.SerializedName

   
data class China (

   @SerializedName("ProductId") var ProductId : String,
   @SerializedName("Rates") var Rates : Rates

)