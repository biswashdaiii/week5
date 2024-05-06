package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SelectActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var  edittextname : EditText
    lateinit var  edittextaddress : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_select)
     button=findViewById(R.id.button6)
        edittextname=findViewById(R.id.editTextText7)
        edittextaddress=findViewById(R.id.editTextText8)
        button.setOnClickListener {
            var intent = Intent(this@SelectActivity,SecondActiviity::class.java)
           var name : String?
           
//            intent.putExtra("name",name)
//            intent.putExtra("address",address)
            startActivity(intent)
            finish()
        }
        }
    }
