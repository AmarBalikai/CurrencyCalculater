package com.code.ltassignment.models

import com.code.ltassignment.models.ForeignExchange
import com.google.gson.annotations.SerializedName

   
data class Portfolios (

   @SerializedName("FX") var foreignExchange : ForeignExchange

)