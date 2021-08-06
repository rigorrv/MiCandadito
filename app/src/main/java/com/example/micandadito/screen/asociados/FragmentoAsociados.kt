package com.example.micandadito.screen.asociados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.example.micandadito.R
import com.example.micandadito.databinding.FragmentAsociadosVentaBinding
import com.example.micandadito.screen.FragmentoTutorialCompra

class FragmentoAsociados : Fragment() {


    lateinit var rootView: FragmentAsociadosVentaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView =
            FragmentAsociadosVentaBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            titleTxt.text = "Te podemos ayudar?"
            subtitleTxt1.text =
                "Cuenta con una gran lista de asociados. \n \n Nos daria mucho gusto ayudarte ha encotrar una"
            subtitleTxt2.text = "Casa a tu medida "
            omitirTxt.text = "Omitir"
            asociadosBtnGo.setOnClickListener {
                //FIXME Esto dirige al fragmento asociado
                Toast.makeText(context, "Has aceptado un asociado TODO", Toast.LENGTH_SHORT).show()
            }
            asociadosBtnGo.setOnClickListener {
                //FIXME Esto dirige al fragmento asociado
                Toast.makeText(context, "Has aceptado un asociado TODO", Toast.LENGTH_SHORT).show()
            }
            omitirBtnCompRent.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    replace(R.id.fragment2, FragmentoTutorialCompra(), "VentaRenta")
                    addToBackStack(null)
                }
            }
            omitirBtnCompRent.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    replace(R.id.fragment2, FragmentoTutorialCompra(), "VentaRenta")
                    addToBackStack(null)
                }
            }
        }
    }
}