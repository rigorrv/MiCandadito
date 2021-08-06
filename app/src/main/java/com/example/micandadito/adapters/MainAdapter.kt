package com.example.micandadito.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.selection.ItemDetailsLookup
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.widget.RecyclerView
import com.example.micandadito.R

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var list: List<Int> = arrayListOf()
    var tracker: SelectionTracker<Long>? = null

    init {
        setHasStableIds(true)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val number = list[position]
        tracker?.let {
            holder.bind(number, it.isSelected(position.toLong()))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_row, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = list.size

    override fun getItemId(position: Int): Long = position.toLong()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(value: Int, isActivated: Boolean = false) {

        }

        fun getItemDetails(): ItemDetailsLookup.ItemDetails<Long> =
            object : ItemDetailsLookup.ItemDetails<Long>() {
                override fun getPosition(): Int {
                    return 0
                }

                override fun getSelectionKey(): Long? {
                    return 0
                }

            }
    }
}