package com.code.ltassignment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.code.ltassignment.repository.MainRepository
import com.code.ltassignment.utils.CurrencyEvent
import com.code.ltassignment.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrencyViewModel @Inject  constructor(
    private val repository: MainRepository
):ViewModel()
{
    private val _conversion=MutableStateFlow<CurrencyEvent>(CurrencyEvent.Empty)
    val conversion:StateFlow<CurrencyEvent> = _conversion


    fun convert(amount:String,fromCurrency:String,toCurrency:String)
    {
        val fromAmount=amount.toFloatOrNull()
        if(fromAmount==null)
        {
            _conversion.value=CurrencyEvent.Failure("Not a valid amount")
            return
        }
        viewModelScope.launch( Dispatchers.IO){
            _conversion.value=CurrencyEvent.Loading
            when(val rateResponse=repository.getRates())
            {
                is Resource.Error-> _conversion.value=CurrencyEvent.Failure(rateResponse.message!!)
                is Resource.Success->{
                    val rates=rateResponse.data?.brandData?.brands?.WBC?.portfolios?.foreignExchange?.products?.republicChina?.rates?.CNH?.buyTC
                              rateResponse.data?.brandData?.brands?.WBC?.portfolios?.foreignExchange?.products?.argentina?.rates?.argentina?.buyTC
                }
            }
        }
    }
}

