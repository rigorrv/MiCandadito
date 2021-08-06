package com.example.micandadito.screen.fragmentos

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
import com.example.micandadito.databinding.FragmentRegisterBinding

class FragmentoRegistrar : Fragment(), View.OnClickListener {

    lateinit var rootView: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rootView = FragmentRegisterBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            toolBarRegister.setNavigationOnClickListener {
                activity?.onBackPressed()
            }
            nameEditTx.hint = "Nombre"
            usuarioEditTx.hint = "Usuario"
            telefonoEditText.hint = "Telefono"
            ciudadEditText.hint = "Ciudad"
            correoEditText.hint = "Correo"
            passEditText.hint = "Contrasena"
            passEditText2.hint = "Contrasena"
            registrarUsuarioTxt.text = "Registrar"
            registrarBtn.setOnClickListener(this@FragmentoRegistrar)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.registrarBtn -> {
                if (checkFields())
                    activity?.onBackPressed()
                else
                    errorRegistro("Un campo se encuentra vacio")
            }
        }
    }

    private fun checkFields(): Boolean {
        rootView.run {
            if (nameEditTx.text.isEmpty() == true
                || usuarioEditTx.text.isEmpty() == true
                || telefonoEditText.text.isEmpty() == true
                || ciudadEditText.text.isEmpty() == true
                || correoEditText.text.isEmpty() == true
                || passEditText.text.isEmpty() == true
                || passEditText2.text.isEmpty() == true
            )
                return false
        }
        return true
    }

    private fun errorRegistro(information: String) {
        val dialogBuilder = AlertDialog.Builder(context)
        val inflater = this.layoutInflater
        val dialogView: View = inflater.inflate(R.layout.alert_dialog_box_usuario, null)
        val info = dialogView.findViewById<TextView>(R.id.infoUsuarioDialog)
        info.text = information
        dialogBuilder.setView(dialogView)
        val dialog: AlertDialog = dialogBuilder.create()
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }
}