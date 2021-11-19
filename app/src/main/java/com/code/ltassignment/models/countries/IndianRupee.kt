package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesIndianRupee
import com.google.gson.annotations.SerializedName

   
data class IndianRupee (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesIndianRupee

)