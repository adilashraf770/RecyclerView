package com.coconat.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)

        val grid: Button = findViewById(R.id.grid)
        val list: Button = findViewById(R.id.list)

        val arrFoods =  ArrayList<FootModel>()
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))
        arrFoods.add(FootModel("burger", R.drawable.burger))


        val adopter = FoodAdapter(this, arrFoods)

        grid.setOnClickListener{recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)}
        list.setOnClickListener{recyclerView.layoutManager = LinearLayoutManager(applicationContext)}

        recyclerView.adapter  = adopter
    }
}