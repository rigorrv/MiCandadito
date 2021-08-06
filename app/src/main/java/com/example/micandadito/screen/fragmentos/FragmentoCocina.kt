package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentCocinaIntegradaBinding
import com.example.micandadito.screen.dataSearch

class FragmentoCocina : Fragment() {
    lateinit var rootView: FragmentCocinaIntegradaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentCocinaIntegradaBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Buscas"
            subtitleTxt.text = "Cocina integrada?"
            checkCocina.setOnClickListener {
                if (checkCocina.isChecked)
                    dataSearch.cocina = "true"
                else
                    dataSearch.cocina = "false"
            }
        }
    }
}