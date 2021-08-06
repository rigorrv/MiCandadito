package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentoBusquedaConfiguracionBinding

class FragmentoBusquedaConfig : Fragment() {

    lateinit var rootView: FragmentoBusquedaConfiguracionBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentoBusquedaConfiguracionBinding.inflate(inflater, container, false)
        return rootView.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.run {
            toolbar.setNavigationOnClickListener {
                activity?.onBackPressed()
            }
            aceptBtn.setOnClickListener {
                activity?.onBackPressed()
            }
            toolbar.title = "Configuracion de busqueda"
            compraConfigBtn.text = "Comprar"
            rentaConfigBtn.text = "Rentar"
            minimoConfigTxt.hint = "Minimo"
            maximoConfigTxt.hint = "Maximo"
            recamarasConfigTxt.hint = "Reca"
            banosConfigTxt.hint = "Banos"
            carrosConfigTxt.hint = "Carros"
            instalacionesConfigCheck.text = "Intalaciones"
            cocinaConfigCheck.text = "Cocina"
            estanciaConfigCheck.text = "Estancia"
            patioConfigCheck.text = "Patio"
            albercaConfigCheck.text = "Alberca"
            aceptarConfigCheck.text = "Aceptar"

        }
    }
}