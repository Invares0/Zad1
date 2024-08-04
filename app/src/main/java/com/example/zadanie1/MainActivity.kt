package com.example.zadanie1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zadanie1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<Items>()

        for (i in 1..5){
            data.add(Items("Item $i"))
        }
        val adapter = ListAdapter(data)
        recyclerView.adapter = adapter
//        Log.d("Adapter", "Item count: ${adapter.itemCount}")

    }
}