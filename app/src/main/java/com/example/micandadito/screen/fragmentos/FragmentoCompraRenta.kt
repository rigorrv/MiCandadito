package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentCompraRentaBinding
import com.example.micandadito.screen.dataSearch

class FragmentoCompraRenta : Fragment() {

    lateinit var rootView: FragmentCompraRentaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentCompraRentaBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Buscas"
            compraTxt.text = "Comprar"
            rentaTxt.text = "Rentar"
            compraBtnCheck.setOnClickListener {
                Toast.makeText(context, "Cocina ${compraBtnCheck.isChecked}", Toast.LENGTH_SHORT)
                    .show()
                dataSearch.propiedad = "Compra"
            }
            rentaBtnCheck.setOnClickListener {
                Toast.makeText(context, "Cocina ${rentaBtnCheck.isChecked}", Toast.LENGTH_SHORT)
                    .show()
                dataSearch.propiedad = "Renta"
            }
        }
    }
}
