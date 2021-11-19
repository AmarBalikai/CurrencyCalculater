package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesUnitedArab
import com.code.ltassignment.models.countries_rates.RatesUnitedState
import com.google.gson.annotations.SerializedName

   
data class UnitedArab (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesUnitedArab

)