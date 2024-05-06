package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class Recycleradapter(
    var titlelist: ArrayList<String>,
    var imagelist: ArrayList<Int>,
    var descriptionlist: ArrayList<String>
):RecyclerView.Adapter<Recycleradapter.CarViewHOlder>()
{

    class CarViewHOlder(view : View) :RecyclerView.ViewHolder(view){
    var title:TextView=view.findViewById(R.id.textviewtitle)
    var description:TextView=view.findViewById(R.id.textviewdescription)
    var image : ImageView =view.findViewById(R.id.imageView)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHOlder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.sample_recycle_view,parent,false)
        return CarViewHOlder(view)
    }

    override fun getItemCount(): Int {
    return  titlelist.size
    }

    override fun onBindViewHolder(holder: CarViewHOlder, position: Int) {
     holder.title.text=titlelist[position]
        holder.description.text =descriptionlist[position]
        holder.image.setImageResource((imagelist[position]))


    }


}