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
        setContentView(binding.root)
        val recyclerView = binding.rvItems
        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<Items>()

        for (i in 1..5){
            data.add(Items("Item $i"))
        }
        val listAdapter = ListAdapter(data)
        binding.rvItems.adapter = listAdapter


    }
}