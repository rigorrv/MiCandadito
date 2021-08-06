package com.example.micandadito.adapters.propiedadesinfoadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.micandadito.databinding.PropiedadItemsBinding
import com.example.micandadito.model.Detalles

class PropiedadesInformacionAdapter : RecyclerView.Adapter<PropiedadesInformacionViewHolder>() {

    private var listInfo = listOf<Detalles>()

    fun getDireccions(list: Detalles) {
        listInfo = listOf(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PropiedadesInformacionViewHolder {
        val binding = PropiedadItemsBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PropiedadesInformacionViewHolder(binding)
    }

    override fun getItemCount(): Int = listInfo.size

    override fun onBindViewHolder(holder: PropiedadesInformacionViewHolder, position: Int) {
        holder.onBind(listInfo[position])
    }
}
