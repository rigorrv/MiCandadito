package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentPatioBinding
import com.example.micandadito.screen.dataSearch

class FragmentoPatio : Fragment() {

    lateinit var rootView: FragmentPatioBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentPatioBinding.inflate(inflater, container, false)
        return rootView.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Buscas"
            subtitleTxt.text = "con patio?"
            checkPatio.setOnClickListener {
                if (checkPatio.isChecked)
                    dataSearch.patio = "true"
                else
                    dataSearch.patio = "false"
            }
        }
    }
}