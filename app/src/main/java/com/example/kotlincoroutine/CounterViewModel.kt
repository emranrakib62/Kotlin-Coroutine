package com.example.kotlincoroutine

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel  :ViewModel() {
   private var value:Int=0
val counterMutableLiveData=MutableLiveData<Int>()
    fun increment(){
        value++
        counterMutableLiveData.postValue(value)
    }

}