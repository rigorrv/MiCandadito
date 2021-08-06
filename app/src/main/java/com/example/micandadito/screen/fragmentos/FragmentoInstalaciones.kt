package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentInstalacionesBinding
import com.example.micandadito.screen.dataSearch

class FragmentoInstalaciones : Fragment() {

    lateinit var rootView: FragmentInstalacionesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =
            FragmentInstalacionesBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Buscas"
            subtitleTxt.text = "Instalaciones adicionales?"
            checkInsta.setOnClickListener {
                if (checkInsta.isChecked)
                    dataSearch.instalaciones = "true"
                else
                    dataSearch.instalaciones = "false"
            }
        }
    }


}