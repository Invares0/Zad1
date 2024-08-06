package com.example.zadanie1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zadanie1.databinding.CardViewBinding

class ListAdapter(private val items: ArrayList<Items>): RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
        holder.binding.textviewFirst.text = item.text

        holder.itemView.setOnClickListener{
            holder.binding.cardViewLayout.setBackgroundColor(Color.GREEN)
        }
        holder.itemView.setOnLongClickListener{
           holder.binding.cardViewLayout.setBackgroundColor(Color.BLUE)
            true
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }



    class ViewHolder(val binding: CardViewBinding) : RecyclerView.ViewHolder(binding.root)
}