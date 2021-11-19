package com.code.ltassignment.models

import com.code.ltassignment.models.countries.*
import com.google.gson.annotations.SerializedName

   
data class Products (

   @SerializedName("USD") var unitedState : UnitedState,
   @SerializedName("EUR") var euro : Euro,
   @SerializedName("GBP") var poundSterling : PoundSterling,
   @SerializedName("NZD") var cewZealand : NewZealand,
   @SerializedName("CNY") var china : China,
   @SerializedName("AED") var unitedArab : UnitedArab,
   @SerializedName("ARS") var argentina : Argentina,
   @SerializedName("BDT") var bangladesh : Bangladesh,
   @SerializedName("BND") var brunei : Brunei,
   @SerializedName("BRL") var brazil : Brazil,
   @SerializedName("CAD") var canada : Canada,
   @SerializedName("CHF") var swissFranc : SwissFranc,
   @SerializedName("CLP") var chile : Chile,
   @SerializedName("DKK") var danishKrone : DanishKrone,
   @SerializedName("FJD") var fiji : Fiji,
   @SerializedName("HKD") var hongKong : HongKong,
   @SerializedName("IDR") var indonesia : Indonesia,
   @SerializedName("INR") var indianRupee : IndianRupee,
   @SerializedName("JPY") var japan : Japan,
   @SerializedName("KRW") var southKorean : SouthKorean,
   @SerializedName("LKR") var sriLanka : SriLanka,
   @SerializedName("MYR") var malaysia : Malaysia,
   @SerializedName("NOK") var norwegianKrone : NorwegianKrone,
   @SerializedName("PGK") var papuaNewGuinea : PapuaNewGuinea,
   @SerializedName("PHP") var philippines : Philippines,
   @SerializedName("PKR") var pakistan : Pakistan,
   @SerializedName("SAR") var saudiArabia : SaudiArabia,
   @SerializedName("SBD") var solomonIslands : SolomonIslands,
   @SerializedName("SEK") var sweden : Sweden,
   @SerializedName("SGD") var singapore : Singapore,
   @SerializedName("THB") var thailand : Thailand,
   @SerializedName("TOP") var tonga : Tonga,
   @SerializedName("TWD") var newTaiwan : NewTaiwan,
   @SerializedName("VND") var vietnam : Vietnam,
   @SerializedName("VUV") var vanuatu : Vanuatu,
   @SerializedName("WST") var samoa : Samoa,
   @SerializedName("XPF") var cfpFranc : CfpFranc,
   @SerializedName("ZAR") var southAfrican : SouthAfrican,
   @SerializedName("XAU") var goldOunces : GoldOunces,
   @SerializedName("CNH") var republicChina : RepublicChina

)