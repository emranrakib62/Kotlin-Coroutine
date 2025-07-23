package com.example.kotlincoroutine

import androidx.lifecycle.ViewModel

class CounterViewModel  :ViewModel() {
    var value:Int=0

    fun increment(){
        value++
    }

}