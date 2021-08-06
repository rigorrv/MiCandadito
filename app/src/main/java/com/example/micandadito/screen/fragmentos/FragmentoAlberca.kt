package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.example.micandadito.R
import com.example.micandadito.databinding.FragmentAlbercaBinding
import com.example.micandadito.screen.FragmentoTutorialCompra
import com.example.micandadito.screen.dataSearch

class FragmentoAlberca : Fragment() {

    lateinit var rootView: FragmentAlbercaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentAlbercaBinding.inflate(inflater, container, false)
        return rootView.root
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Finalizar"
            titleTxt.text = "Buscas"
            subtitleTxt.text = "con alberca?"
            checkAlberca.setOnClickListener {
                if (checkAlberca.isChecked)
                    dataSearch.alberca = "true"
                else
                    dataSearch.alberca = "false"
            }
            siguienteTxt.setOnClickListener {
                activity?.supportFragmentManager?.commit {
                    replace(R.id.fragment2, FragmentSetUpSearch(), "VentaRenta")
                    addToBackStack(null)
                }
            }
        }
    }
}