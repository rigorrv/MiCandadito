package com.example.micandadito.adapters

import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.selection.ItemDetailsLookup
import androidx.recyclerview.widget.RecyclerView


internal class DemoAdapter(private val mRecyclerView: RecyclerView) :
    ItemDetailsLookup<Long>() {
    override fun getItemDetails(e: MotionEvent): ItemDetails<Long>? {
        val view: View? = mRecyclerView.findChildViewUnder(e.x, e.y)
        if (view != null) {
            val holder: MainAdapter.ViewHolder =
                mRecyclerView.getChildViewHolder(view) as MainAdapter.ViewHolder
            if (holder is MainAdapter.ViewHolder) {
                return (holder as MainAdapter).ViewHolder(view).getItemDetails()
            }
        }
        return null
    }
}