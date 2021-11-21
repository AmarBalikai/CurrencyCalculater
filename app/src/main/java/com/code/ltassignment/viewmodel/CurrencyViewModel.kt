package com.code.ltassignment.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.code.ltassignment.models.CurrencyInfo
import com.code.ltassignment.repository.MainRepository
import com.code.ltassignment.utils.CurrencyEvent
import com.code.ltassignment.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import org.json.JSONObject
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList

@HiltViewModel
class CurrencyViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {
    private val _conversion = MutableStateFlow<CurrencyEvent>(CurrencyEvent.Empty)
    val conversion: StateFlow<CurrencyEvent> = _conversion


    fun getCurrencyApi() {
        viewModelScope.launch(Dispatchers.IO) {
            _conversion.value = CurrencyEvent.Loading
            when (val rateResponse = repository.getRates()) {
                is Resource.Error -> _conversion.value =
                    CurrencyEvent.Failure(rateResponse.message!!)
                is Resource.Success -> {
//                   var jsonObject= rateResponse.data?.brandData?.brands?.WBC?.portfolios?.foreignExchange?.Products
                    var jsonObject = JSONObject(rateResponse.data?.string())
                        .getJSONObject("data")
                        .getJSONObject("Brands")
                        .getJSONObject("WBC")
                        .getJSONObject("Portfolios")
                        .getJSONObject("FX")
                        .getJSONObject("Products")
                    var currencyList = ArrayList<CurrencyInfo>()
                    jsonObject.let {
                        val keys: Iterator<String> = it.keys()
                        while (keys.hasNext()) {
                            val key = keys.next()
                            Log.v("**********", "**********")
                            Log.v("category key", key)
//                            currencyList.add(it.getJSONObject(key))
                            val ratesJObject: JSONObject = it.getJSONObject(key)
                            val ratesInnerKeys = ratesJObject.keys()
                            while (ratesInnerKeys.hasNext()) {
                                val innerKkey = ratesInnerKeys.next()
                                var innermostJObject = JSONObject()
                                try {
                                    innermostJObject = ratesJObject.getJSONObject(innerKkey)
                                } catch (e: Exception) {
                                    // ignore for String type
                                }

                                val innerMostKeys = innermostJObject.keys()
                                while (innerMostKeys.hasNext()) {
                                    val innerMostKkey = innerMostKeys.next()
                                    val mainObject = innermostJObject.getJSONObject(innerMostKkey)
                                    var currencyInfo = CurrencyInfo(
                                        currencyCode = mainObject.getString("currencyCode"),
                                        currencyName = mainObject.getString("currencyName"),
                                        country = mainObject.getString("country"),
                                        buyTT = mainObject.getString("buyTT"),
                                        sellTT = mainObject.getString("sellTT"),
                                        buyTC = mainObject.getString("buyTC"),
                                        buyNotes = mainObject.getString("buyNotes"),
                                        sellNotes = mainObject.getString("sellNotes"),
                                        SpotRate_Date_Fmt = mainObject.getString("SpotRate_Date_Fmt"),
                                        effectiveDate_Fmt = mainObject.getString("effectiveDate_Fmt"),
                                        updateDate_Fmt = mainObject.getString("updateDate_Fmt"),
                                        LASTUPDATED = mainObject.getString("LASTUPDATED")
                                    )
                                    currencyList.add(currencyInfo)

                                }
                            }
                        }
                    }
                    Log.e("currencyList", "${currencyList.size}")

                    /*val rates=rateResponse.data?.brandData?.brands?.WBC?.portfolios?.foreignExchange?.products?.republicChina?.rates?.currencyInfo?.buyT*/
                }
            }
        }
    }
}

