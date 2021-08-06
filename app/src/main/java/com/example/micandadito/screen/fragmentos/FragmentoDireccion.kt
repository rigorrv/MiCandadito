package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentComrentaDireccionBinding
import com.example.micandadito.utility.EcuacionFunction.direccion

class FragmentoDireccion : Fragment() {
    lateinit var rootView: FragmentComrentaDireccionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =
            FragmentComrentaDireccionBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "En donde"
            subtitleTxt.text = "te gustaria vivir?"
            drawDirecctionBtn.setOnClickListener {
                direccion(0.00000, 0.000000)
                direccionTxt.text = "4608 W Maryland Ave 85308"
            }
        }
    }
}