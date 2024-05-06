package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//import com.example.app.MessageActivity
import com.example.myapplication.databinding.ActivityWeek5Binding

class week5 : AppCompatActivity() {

    lateinit var LoginBindibg : ActivityWeek5Binding
    lateinit var sharedPrefences : SharedPreferences

    var username : String? =null
    var password : String? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        LoginBindibg=ActivityWeek5Binding.inflate(layoutInflater)
        var view = LoginBindibg.root

        getdata()

        LoginBindibg.button7.setOnClickListener {
            sharedPrefences=getSharedPreferences("userData" , MODE_PRIVATE)

            username = LoginBindibg.editTextText9.text.toString()
            password = LoginBindibg.editTextNumberPassword.text.toString()

            var editor = sharedPrefences.edit()
            editor.putString("username" ,username)
            editor.putString("password" ,password)

            editor.apply()

            Toast.makeText(applicationContext,"your data is saved",Toast.LENGTH_LONG).show()
        }


        setContentView(R.layout.activity_week5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
    private fun getdata() {
        sharedPrefences= getSharedPreferences("userdata" , MODE_PRIVATE)

        username = sharedPrefences.getString("username" ,"")
        username = sharedPrefences.getString("password" ,"")

        LoginBindibg.editTextNumberPassword.setText(username)
        LoginBindibg.editTextText9.setText(password)

    }

}