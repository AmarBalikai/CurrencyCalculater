package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesPhilippines
import com.google.gson.annotations.SerializedName

   
data class Philippines (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesPhilippines

)