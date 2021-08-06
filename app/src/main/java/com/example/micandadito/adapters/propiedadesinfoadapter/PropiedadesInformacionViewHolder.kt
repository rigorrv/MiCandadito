package com.example.micandadito.adapters.propiedadesinfoadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.micandadito.databinding.PropiedadItemsBinding
import com.example.micandadito.model.Detalles

class PropiedadesInformacionViewHolder(private val binding: PropiedadItemsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun onBind(info: Detalles) {
        binding.run {
            cuentaConInfoTxt.text = "Esta propiedad cuenta con:"
            seEncuentraTxt.text = "Se Encuentra cerca de:"
            if (info.recamaras > 0) {
                recamarasTxt.text = "${info.recamaras} Recamaras"
                recamarasTxt.visibility = View.VISIBLE
            }
            if (info.banos > 0) {
                banosTxt.text = "${info.banos} Banos"
                banosTxt.visibility = View.VISIBLE
            }
            if (info.carros > 0) {
                carrosTxt.text = "${info.carros} Carros"
                carrosTxt.visibility = View.VISIBLE
            }
            if (!info.instalaciones.contains("false")) {
                instalacionesTxt.text = info.instalaciones
                instalacionesTxt.visibility = View.VISIBLE
            }
            if (info.cocina.contains("true")) {
                cocinaTxt.text = "Cocina"
                cocinaTxt.visibility = View.VISIBLE
            }
            if (info.estancia.contains("true")) {
                estanciaTxt.text = "Estancia"
                estanciaTxt.visibility = View.VISIBLE
            }
            if (info.patio.contains("true")) {
                patioTxt.text = "Patio"
                patioTxt.visibility = View.VISIBLE
            }
            if (info.alberca.contains("true")) {
                albercaTxt.text = "Alberca"
                albercaTxt.visibility = View.VISIBLE
            }
            if (!info.hospital.contains("false")) {
                cuentaCont()
                hospitalTxt.text = "Hospital: ${info.hospital}"
                hospitalTxt.visibility = View.VISIBLE
            }
            if (!info.parque.contains("false")) {
                cuentaCont()
                parqueTxt.text = "Parque: ${info.parque}"
                parqueTxt.visibility = View.VISIBLE
            }
            if (!info.escuela.contains("false")) {
                cuentaCont()
                escuelaTxt.text = "Escuela: ${info.escuela}"
                escuelaTxt.visibility = View.VISIBLE
            }
            if (!info.tienda.contains("false")) {
                cuentaCont()
                tiendaTxt.text = "Tienda: ${info.tienda}"
                tiendaTxt.visibility = View.VISIBLE
            }
        }
    }

    fun cuentaCont() {
        binding.seEncuentraTxt.visibility = View.VISIBLE
    }
}