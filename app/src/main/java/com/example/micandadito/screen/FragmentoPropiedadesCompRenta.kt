package com.example.micandadito.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.micandadito.R
import com.example.micandadito.databinding.FragmentPropiedadesBinding
import com.example.micandadito.screen.fragmentos.FragmentoBusquedaConfig
import com.example.micandadito.screen.fragmentos.FragmentoUsuario


class FragmentoPropiedadesCompRenta : Fragment() {

    private lateinit var rootView: FragmentPropiedadesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = FragmentPropiedadesBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //addImagesAdapter(mockData()[0])
        rootView.run {
            propiedadesToolBar.title = "Villa del Palmar"
            propiedadesToolBar.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.userBtn -> {
                        activity?.supportFragmentManager?.commit {
                            replace(R.id.fragment2, FragmentoUsuario(), "VentaRenta")
                            addToBackStack(null)
                        }
                    }
                    R.id.searchBtn -> {
                        activity?.supportFragmentManager?.commit {
                            replace(R.id.fragment2, FragmentoBusquedaConfig(), "VentaRenta")
                            addToBackStack(null)
                        }
                    }
                }
                true
            }
            fotosPropiedadesBtn.text = "Fotos"
            mapaPropiedadesBtn.text = "Mapa"
        }
    }
}
