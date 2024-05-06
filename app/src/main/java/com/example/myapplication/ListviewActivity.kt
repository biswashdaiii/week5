package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ListviewActivity : AppCompatActivity() {
    lateinit var listview1 : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listview)
        listview1 =findViewById(R.id.listview1)
        var data = resources.getStringArray(R.array.car)
        var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,data)
        listview1.adapter=adapter





        }
    }
