package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesBangladesh
import com.google.gson.annotations.SerializedName

data class Bangladesh (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesBangladesh

)