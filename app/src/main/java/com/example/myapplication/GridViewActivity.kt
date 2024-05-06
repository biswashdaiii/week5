package com.example.myapplication

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.ArrayList

class GridViewActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    var namelist = ArrayList<String>()
    var imagelist =ArrayList<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_view)
        gridView = findViewById(R.id.gridview)
        namelist.add("one")
        namelist.add("two")
        namelist.add("three")
        namelist.add("four")
        namelist.add("five")
        namelist.add("six")
        namelist.add("seven")
        namelist.add("eight")
        namelist.add("nine")



        imagelist.add(R.drawable.porsche)
        imagelist.add(R.drawable.lamborghiniiii)
        imagelist.add(R.drawable.tesla)
        imagelist.add(R.drawable.porsche)
        imagelist.add(R.drawable.porsche)
        imagelist.add(R.drawable.porsche)
        imagelist.add(R.drawable.porsche)
        imagelist.add(R.drawable.porsche)
        imagelist.add(R.drawable.porsche)
        }
    }
