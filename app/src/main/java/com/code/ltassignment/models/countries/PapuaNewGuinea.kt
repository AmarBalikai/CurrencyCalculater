package com.code.ltassignment.models.countries

import com.code.ltassignment.models.countries_rates.RatesPapuaNewGuinea
import com.google.gson.annotations.SerializedName

   
data class PapuaNewGuinea (

   @SerializedName("ProductId") var productId : String,
   @SerializedName("Rates") var rates : RatesPapuaNewGuinea

)