package com.code.ltassignment.utils

sealed class CurrencyEvent {
    class Success(val resultText:String):CurrencyEvent()
    class Failure(val errorText: String):CurrencyEvent()
    object Loading:CurrencyEvent()
    object Empty:CurrencyEvent()
}