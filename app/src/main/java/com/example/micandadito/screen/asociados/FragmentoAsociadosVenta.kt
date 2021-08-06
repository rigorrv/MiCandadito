package com.example.micandadito.screen.asociados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentAsociadosVentaBinding

class FragmentoAsociadosVenta : Fragment() {


    lateinit var fragmentoAsociadosVentaBinding: FragmentAsociadosVentaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentoAsociadosVentaBinding =
            FragmentAsociadosVentaBinding.inflate(inflater, container, false)
        return fragmentoAsociadosVentaBinding.root
    }
}