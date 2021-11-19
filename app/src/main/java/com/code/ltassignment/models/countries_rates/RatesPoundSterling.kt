package com.code.ltassignment.models.countries_rates

import com.code.ltassignment.models.CurrencyInfo
import com.google.gson.annotations.SerializedName

data class RatesPoundSterling(@SerializedName("GBP") var currencyInfo : CurrencyInfo)
