package com.example.micandadito.screen

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.micandadito.R
import com.example.micandadito.adapters.TutorialCompraViewPager
import com.example.micandadito.databinding.FragmentoCompraContenedorBinding
import com.example.micandadito.model.DataSearch


var dataSearch = DataSearch()

class FragmentoTutorialCompra : Fragment() {

    private lateinit var rootView: FragmentoCompraContenedorBinding
    private var aprovacionPrecio = ""
    private var aprovacionDireccion = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView =
            FragmentoCompraContenedorBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tutorialViewPagerAdapter = TutorialCompraViewPager(childFragmentManager, lifecycle)
        rootView.run {
            tutorialViewPager1.adapter = tutorialViewPagerAdapter
            siguienteBtn.setOnClickListener {
                tutorialViewPager1.currentItem += 1
                if (tutorialViewPager1.currentItem == 10) {
                    if (!aprovarBusqueda()) {
                        siguienteBtn.visibility = View.GONE
                    }
                }
            }
        }
        getAlerDialog("Desliza a la izquierda o derecha para configurar busqueda")
    }

    private fun aprovarBusqueda(): Boolean {
        if (dataSearch.pagoMaximo == null || dataSearch.pagoMaximo == null) {
            getAlerDialog("Necesitas asignar precio a la busqueda")
            rootView.tutorialViewPager1.currentItem = 1
            return true
        } else
            aprovacionPrecio = ""
        if (dataSearch.longitude == null || dataSearch.latitude == null) {
            rootView.tutorialViewPager1.currentItem = 2
            getAlerDialog("Necesitas asignar una direccion a la busqueda")
            return true
        } else {
            aprovacionDireccion = ""
        }
        return false
    }

    private fun getAlerDialog(information: String) {
        val dialogBuilder = AlertDialog.Builder(context)
        val inflater = this.layoutInflater
        val dialogView: View = inflater.inflate(R.layout.alert_dialog_box, null)
        val info = dialogView.findViewById<TextView>(R.id.infoDialog)
        info.text = information
        dialogBuilder.setView(dialogView)
        val dialog: AlertDialog = dialogBuilder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

}