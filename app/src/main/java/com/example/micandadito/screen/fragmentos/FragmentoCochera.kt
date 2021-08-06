package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentCocheraBinding
import com.example.micandadito.utility.EcuacionFunction.sumRestaCarros

class FragmentoCochera : Fragment() {

    lateinit var rootView: FragmentCocheraBinding
    var num = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentCocheraBinding.inflate(inflater, container, false)
        return rootView.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Cuantos"
            subtitleTxt.text = "Carros tienes?"
            numCarTxt.text = "0"
            menBtnCar.setOnClickListener {
                num = num - 1
                rootView.numCarTxt.text = sumRestaCarros(num).toString()
            }
            masBtnCar.setOnClickListener {
                num = num + 1
                rootView.numCarTxt.text = sumRestaCarros(num).toString()
            }
        }
    }
}