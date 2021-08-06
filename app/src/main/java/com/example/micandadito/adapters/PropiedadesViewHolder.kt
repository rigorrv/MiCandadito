package com.example.micandadito.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.micandadito.R
import com.example.micandadito.databinding.DirectionItemsBinding
import com.example.micandadito.model.DirectionJson

class PropiedadesViewHolder(val binding: DirectionItemsBinding) :
    RecyclerView.ViewHolder(binding.root) {


    fun onBind(homeInfo: DirectionJson) {
        binding.houseIcon.setBackgroundResource(R.drawable.house0001)
    }
}