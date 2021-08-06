package com.example.micandadito.screen

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.bumptech.glide.Glide
import com.example.micandadito.R
import com.example.micandadito.adapters.propiedadesinfoadapter.PropiedadesInformacionAdapter
import com.example.micandadito.adapters.propiedadesinfoadapter.PicturesAdapter
import com.example.micandadito.databinding.FragmentPropiedadesInformacionBinding
import com.example.micandadito.model.DirectionJson
import com.example.micandadito.screen.fragmentos.FragmentoUsuarioPropiedad

class FragmentoPropiedadesInformacion(val info: DirectionJson) : Fragment() {

    lateinit var rootView: FragmentPropiedadesInformacionBinding
    val propiedadInformacionAdapter = PropiedadesInformacionAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentPropiedadesInformacionBinding.inflate(inflater, container, false)
        return rootView.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rootView.run {
            toolBar.title = "Villas Del Palmar"
            propietarioTxt.text = "Propietario: ${info.nombre}"
            toolBar.title = info.direccion
            precioTxt.text = "$${info.pagoMaximo}"
            fotosPropiedadesBtn.text = "Mapa"
            mapaPropiedadesBtn.text = "Mapa"

            Glide.with(this@FragmentoPropiedadesInformacion)
                .load(info.foto)
                .into(avatarMiniImg)

            toolBar.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.phoneBtn -> {
                        activity?.supportFragmentManager?.commit {
                            replace(R.id.fragment2, FragmentoUsuarioPropiedad(info), "VentaRenta")
                            addToBackStack(null)
                        }
                    }
                    R.id.email -> {
                        Toast.makeText(context, "TODO", Toast.LENGTH_SHORT).show()
                    }
                    R.id.sms -> {
                        Toast.makeText(context, "TODO", Toast.LENGTH_SHORT).show()
                    }
                    R.id.whatsapp -> {
                        Toast.makeText(context, "TODO", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
            toolBar.setNavigationOnClickListener {
                activity?.onBackPressed()
            }
            val picturesAdapter = PicturesAdapter(context, info.imagenes)
            imagenesAdapter.adapter = picturesAdapter
            info.detalles.let {
                for (info in it) {
                    propiedadInformacionAdapter.getDireccions(info)
                }
            }
            propiedadesRecyclerView.adapter = propiedadInformacionAdapter
        }
    }
}

