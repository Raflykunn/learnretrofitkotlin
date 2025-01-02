package com.rafly.learnretrofitkotlin.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rafly.learnretrofitkotlin.databinding.AlbumItemBinding
import com.rafly.learnretrofitkotlin.model.AlbumItem

class RvAdapter (private val albumList: List<AlbumItem>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: AlbumItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder (
            AlbumItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = albumList[position]
        holder.binding.apply {
            tvId.text = "Id: ${currentItem.id}"
            tvUserId.text = "User Id: ${currentItem.userId}"
            tvTitle.text = "Title: ${currentItem.title}"
        }
    }
}