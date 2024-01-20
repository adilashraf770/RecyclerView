package com.coconat.recyclerviewactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val context: Context,private val arrFoods: ArrayList<FootModel> )
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):FoodViewHolder {
      return FoodViewHolder(LayoutInflater.from(context).inflate(R.layout.sample_layout, parent, false))
     }

     override fun onBindViewHolder(holder: FoodAdapter.FoodViewHolder, position: Int) {
        holder.name.text = arrFoods[position].name
        holder.image.setImageResource(arrFoods[position].img)
     }

     override fun getItemCount(): Int {
         return arrFoods.size
     }

     class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.food_text)
        val image: ImageView = itemView.findViewById(R.id.food_image)
     }
 }