package com.code.ltassignment.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.code.ltassignment.models.CurrencyInfo
import com.code.ltassignment.repository.MainRepository
import com.code.ltassignment.utils.CurrencyEvent
import com.code.ltassignment.utils.Resource
import com.google.gson.Gson
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
                            val ratesJObject: JSONObject = it.getJSONObject(key)
                            val ratesInnerKeys = ratesJObject.keys()
                            while (ratesInnerKeys.hasNext()) {
                                val innerKkey = ratesInnerKeys.next()
                                var innermostJObject = JSONObject()
                                try {
                                    innermostJObject = ratesJObject.getJSONObject(innerKkey)
                                    val mainObject =  innermostJObject.getJSONObject(key)
                                    val currencyInfo= Gson().fromJson(mainObject.toString(),CurrencyInfo::class.java)
                                    currencyList.add(currencyInfo)
                                } catch (e: Exception) {
                                    // ignore for String type
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

