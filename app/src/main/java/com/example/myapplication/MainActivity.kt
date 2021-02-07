package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            val h = (height.text).toString().toFloat() /100  //altura
            val w = weight.text.toString().toFloat() //peso
            val res = w/(h*h)
            result.text = "%.2f".format(res)
        }
    }
}