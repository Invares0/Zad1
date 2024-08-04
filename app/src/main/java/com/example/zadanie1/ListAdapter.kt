package com.example.zadanie1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zadanie1.databinding.CardViewBinding

class ListAdapter(private val firstList: List<Items>): RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ViewHolder {
        val binding = CardViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        val item = firstList[position]
        holder.binding.textviewFirst.text

        holder.binding.root.setOnClickListener {
            holder.binding.root.setBackgroundColor(holder.binding.root.context.resources.getColor(R.color.green))
        }

        holder.binding.root.setOnLongClickListener {
            holder.binding.root.setBackgroundColor(holder.binding.root.context.resources.getColor(R.color.blue))
            true
        }
    }

    override fun getItemCount(): Int {
        return firstList.size
    }

    class ViewHolder(val binding: CardViewBinding) : RecyclerView.ViewHolder(binding.root)
}