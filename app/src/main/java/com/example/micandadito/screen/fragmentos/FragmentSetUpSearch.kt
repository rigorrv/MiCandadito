package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.example.micandadito.R
import com.example.micandadito.databinding.FragmentoConfigurandoBusquedaBinding
import com.example.micandadito.screen.FragmentoPropiedadesCompRenta
import com.example.micandadito.screen.FragmentoTutorialCompra

class FragmentSetUpSearch : Fragment() {

    lateinit var rootView: FragmentoConfigurandoBusquedaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentoConfigurandoBusquedaBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rootView.aceptarInfoBtn.setOnClickListener {
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragment2, FragmentoPropiedadesCompRenta(), "VentaRenta")
                addToBackStack(null)
            }
        }
    }

    private fun getInfo(boolean: Boolean) {
        if (boolean)
            rootView.progressBarInfo.visibility = View.VISIBLE
        else
            rootView.aceptarInfoBtn.visibility = View.GONE
    }
}