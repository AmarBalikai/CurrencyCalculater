package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesCfpFranc
import com.google.gson.annotations.SerializedName

   
data class CfpFranc (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesCfpFranc

)