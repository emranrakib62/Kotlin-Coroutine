package com.example.kotlincoroutine

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlincoroutine.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
val viewModel:CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("Tag","1.Thread name:${Thread.currentThread()}")

        viewModel.counterMutableLiveData.observe(this@MainActivity){
            binding.incrementedValue.text="$it"
        }


        binding.increment.setOnClickListener{




            viewModel.increment()

        }
        binding.longtaskbutton.setOnClickListener{

            CoroutineScope(Dispatchers.IO).launch {
                Log.i("Tag", "2.Thread name:${Thread.currentThread()}")
                for (i in 0..9999999999999999L){


                }

                }

            CoroutineScope(Dispatchers.Default).launch {
                Log.i("Tag", "3.Thread name:${Thread.currentThread()}")
                for (i in 0..9999999999999999L){


                }

            }




        }


    }
}