package com.code.ltassignment.models.countries

import com.code.ltassignment.models.Portfolios
import com.google.gson.annotations.SerializedName

   
data class WBC (

   @SerializedName("Brand") var brand : String,
   @SerializedName("Portfolios") var portfolios : Portfolios

)