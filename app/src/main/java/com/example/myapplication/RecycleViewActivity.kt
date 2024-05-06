package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.Recycleradapter

class RecycleViewActivity : AppCompatActivity() {
    lateinit var recycleView: RecyclerView
    var titlelist =ArrayList<String>()
    var imagelist =ArrayList<Int>()
    var descriptionlist =ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        recycleView=findViewById(R.id.recycleview)


        titlelist.add("tesla")
        titlelist.add("lambo")
        titlelist.add("porsche")

        imagelist.add(R.drawable.lamborghiniiii)
        imagelist.add(R.drawable.tesla)
        imagelist.add(R.drawable.porsche)

        descriptionlist.add("this is lamborghini...")
        descriptionlist.add("this is tesla...")
        descriptionlist.add("this is porsche...")

        var adapter = Recycleradapter(titlelist,imagelist,descriptionlist)
        recycleView.layoutManager=LinearLayoutManager(this)
        recycleView.adapter=adapter
        }
    }
