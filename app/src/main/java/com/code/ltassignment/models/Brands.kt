package com.code.ltassignment.models

import com.code.ltassignment.models.countries.WBC
import com.google.gson.annotations.SerializedName

   
data class Brands (

   @SerializedName("WBC") var WBC : WBC

)