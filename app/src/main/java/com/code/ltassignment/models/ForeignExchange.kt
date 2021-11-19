package com.code.ltassignment.models

import com.google.gson.annotations.SerializedName

   
data class ForeignExchange (

   @SerializedName("PortfolioId") var portfolioId : String,
   @SerializedName("Products") var products : Products

)