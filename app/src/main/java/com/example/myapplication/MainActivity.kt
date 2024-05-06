package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var radiotesla : RadioButton
    lateinit var radiolambo : RadioButton
    lateinit var radioporsche : RadioButton
    lateinit var  image : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        radiotesla = findViewById(R.id.tes)
        radiolambo = findViewById(R.id.lambs)
        radioporsche = findViewById(R.id.pors)
        image=findViewById(R.id.imageView2)


        radiotesla.setOnClickListener {
            image.setImageResource(R.drawable.lamborghiniiii)}

        radiotesla.setOnClickListener {
            image.setImageResource(R.drawable.porsche)}


                radiotesla.setOnClickListener {
            image.setImageResource(R.drawable.tesla
            )}





    }
}