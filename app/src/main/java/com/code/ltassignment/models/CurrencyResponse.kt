package com.code.ltassignment.models

import com.google.gson.annotations.SerializedName

   
data class CurrencyResponse (

   @SerializedName("apiVersion") var apiVersion : String,
   @SerializedName("status") var status : Int,
   @SerializedName("data") var brandData : BrandData

)