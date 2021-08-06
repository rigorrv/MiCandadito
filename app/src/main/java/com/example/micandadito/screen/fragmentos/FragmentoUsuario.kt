package com.example.micandadito.screen.fragmentos

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.example.micandadito.R
import com.example.micandadito.databinding.FragmentoUsuarioBinding
import com.example.micandadito.screen.FragmentoTutorialCompra
import com.example.micandadito.screen.LoginFragment

class FragmentoUsuario : Fragment(), View.OnClickListener {

    private lateinit var rootView: FragmentoUsuarioBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentoUsuarioBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            toolbar2.setNavigationOnClickListener {
                activity?.onBackPressed()
            }
            usuarioTxt.text = "rigo_rv"
            nombreUsuarioTxt.text = "Nombre:"
            usuarioNombreTxt.text = "Rigoberto Romero Valdez"
            usuarioNombreTxt.setOnClickListener(this@FragmentoUsuario)
            correoUsuarioTxt.text = "Correo:"
            usuarioCorreoTxt.text = "rigo.rrv@gmail.com"
            usuarioCorreoTxt.setOnClickListener(this@FragmentoUsuario)
            telefonoUsuarioTxt.text = "Telefono:"
            usuarioTelefonoTxt.text = "3604411977"
            usuarioTelefonoTxt.setOnClickListener(this@FragmentoUsuario)
            direccionUsuarioTxt.text = "Direccion:"
            usuarioDireccionTxt.text =
                "Ave 5 Col. Prados Del Sol, #186, CP: 83100, Hermosillo, Sonora, Mexico"
            usuarioDireccionTxt.setOnClickListener(this@FragmentoUsuario)
            aceptarUsuarioTxt.text = "Aceptar"
            aceptarUsuarioBtn.setOnClickListener(this@FragmentoUsuario)
            cancelarUsuarioTxt.text = "Cancelar"
            cancelarUsuarioBtn.setOnClickListener(this@FragmentoUsuario)
            cerrarSecionTxt.text = "Cerrar Secion"
            cerrarCecionBtn.setOnClickListener(this@FragmentoUsuario)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.usuarioNombreTxt -> {
                rootView.aceptarUsuarioBtn.visibility = View.VISIBLE
                rootView.cancelarUsuarioBtn.visibility = View.VISIBLE
                rootView.cerrarCecionBtn.visibility = View.GONE

            }
            R.id.usuarioCorreoTxt -> {
                rootView.aceptarUsuarioBtn.visibility = View.VISIBLE
                rootView.cancelarUsuarioBtn.visibility = View.VISIBLE
                rootView.cerrarCecionBtn.visibility = View.GONE
            }
            R.id.usuarioTelefonoTxt -> {
                rootView.aceptarUsuarioBtn.visibility = View.VISIBLE
                rootView.cancelarUsuarioBtn.visibility = View.VISIBLE
                rootView.cerrarCecionBtn.visibility = View.GONE
            }
            R.id.usuarioDireccionTxt -> {
                rootView.aceptarUsuarioBtn.visibility = View.VISIBLE
                rootView.cancelarUsuarioBtn.visibility = View.VISIBLE
                rootView.cerrarCecionBtn.visibility = View.GONE
            }
            R.id.aceptarUsuarioBtn -> {
                guardandoInformacion("Estas seguro que deceas hacer los cambios")
            }
            R.id.cancelarUsuarioBtn -> {
                rootView.aceptarUsuarioBtn.visibility = View.GONE
                rootView.cancelarUsuarioBtn.visibility = View.GONE
                rootView.cerrarCecionBtn.visibility = View.VISIBLE
            }
            R.id.cerrarCecionBtn -> {
                cerrarUsuario("Estas seguro que deceas cerrar la secion")
            }
        }
    }

    private fun guardandoInformacion(information: String) {
        val dialogBuilder = AlertDialog.Builder(context)
        val inflater = this.layoutInflater
        val dialogView: View = inflater.inflate(R.layout.alert_dialog_box_usuario, null)
        val info = dialogView.findViewById<TextView>(R.id.infoUsuarioDialog)
        val aceptarBtn = dialogView.findViewById<TextView>(R.id.aceptarBtnAlert)
        info.text = information
        dialogBuilder.setView(dialogView)
        val dialog: AlertDialog = dialogBuilder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
        aceptarBtn.setOnClickListener {
            rootView.aceptarUsuarioBtn.visibility = View.GONE
            rootView.cancelarUsuarioBtn.visibility = View.GONE
            rootView.cerrarCecionBtn.visibility = View.VISIBLE
            Toast.makeText(context, "Informacion Guardada", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
    }

    private fun cerrarUsuario(information: String) {
        val dialogBuilder = AlertDialog.Builder(context)
        val inflater = this.layoutInflater
        val dialogView: View = inflater.inflate(R.layout.alert_dialog_box_usuario, null)
        val info = dialogView.findViewById<TextView>(R.id.infoUsuarioDialog)
        val aceptarBtn = dialogView.findViewById<TextView>(R.id.aceptarBtnAlert)
        info.text = information
        dialogBuilder.setView(dialogView)
        val dialog: AlertDialog = dialogBuilder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
        aceptarBtn.setOnClickListener {
            activity?.supportFragmentManager?.commit {
                replace(R.id.fragment2, LoginFragment(), "VentaRenta")
                addToBackStack(null)
            }
            dialog.dismiss()
        }
    }
}