package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesPakistan
import com.google.gson.annotations.SerializedName

   
data class Pakistan (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesPakistan

)