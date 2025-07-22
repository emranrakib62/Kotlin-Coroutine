package com.example.kotlincoroutine

import androidx.lifecycle.ViewModel

class CounterViewModel  :ViewModel() {
    var value=0

    fun increment(){
        value++
    }

}