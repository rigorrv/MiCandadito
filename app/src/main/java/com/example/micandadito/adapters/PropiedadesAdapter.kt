package com.example.micandadito.adapters

import android.view.*
import android.widget.TextView
import androidx.recyclerview.selection.ItemDetailsLookup
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.widget.RecyclerView
import com.example.micandadito.communicator.Communicator
import com.example.micandadito.databinding.DirectionItemsBinding
import com.example.micandadito.model.DirectionJson


class PropiedadesAdapter() :
    RecyclerView.Adapter<PropiedadesAdapter.ViewHolder>() {
    lateinit var binding: DirectionItemsBinding
    private var listInfo = mutableListOf<DirectionJson>()
    var list: List<Int> = arrayListOf()
    var tracker: SelectionTracker<Long>? = null

    init {
        setHasStableIds(true)
    }

    fun getDireccions(list: List<DirectionJson>) {
        listInfo.clear()
        listInfo.addAll(list)
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val number = list[position]
        tracker?.let {
            holder.bind(listInfo, it.isSelected(position.toLong()))
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DirectionItemsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun getItemId(position: Int): Long = position.toLong()

    inner class ViewHolder(biding: DirectionItemsBinding) :
        RecyclerView.ViewHolder(biding.root) {

        fun bind(homeInfo: List<DirectionJson>, isActivated: Boolean = false) {
            binding.direccionRecyclerTxt.text = homeInfo.map {
                it.direccion
            }.toString()
            itemView.isActivated = isActivated
        }

        fun getItemDetails(): ItemDetailsLookup.ItemDetails<Long> =
            object : ItemDetailsLookup.ItemDetails<Long>() {
                override fun getPosition(): Int = adapterPosition
                override fun getSelectionKey(): Long? = itemId
                override fun inSelectionHotspot(e: MotionEvent): Boolean {
                    return true
                }

                override fun hasSelectionKey(): Boolean {
                    return false
                }
            }
    }
}