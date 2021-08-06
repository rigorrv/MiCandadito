package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentRecamarasBinding
import com.example.micandadito.utility.EcuacionFunction.sumRestaRecamaras

class FragmentoRecamaras : Fragment() {

    lateinit var rootView: FragmentRecamarasBinding
    var num = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =
            FragmentRecamarasBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Cuantas"
            subtitleTxt.text = "Recamaras necesitas"
            numRecTxt.text = "0"
            menBtnRec.setOnClickListener {
                num = num - 1
                numRecTxt.text = sumRestaRecamaras(num).toString()
            }
            masBtnRec.setOnClickListener {
                num = num + 1
                numRecTxt.text = sumRestaRecamaras(num).toString()
            }
        }
    }
}