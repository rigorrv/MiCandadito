package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentBanosBinding
import com.example.micandadito.utility.EcuacionFunction.sumRestaBanos

class FragmentoBanos : Fragment() {
    lateinit var rootView: FragmentBanosBinding
    var num = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = FragmentBanosBinding.inflate(inflater, container, false)
        return rootView.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rootView.run {
            siguienteTxt.text = "Siguiente"
            titleTxt.text = "Cuantos"
            subtitleTxt.text = "Banos necesitas"
            numBanTxt.text = "0"
            menBtnBan.setOnClickListener {
                num = num - 1
                numBanTxt.text = sumRestaBanos(num).toString()
            }
            masBtnBan.setOnClickListener {
                num = num + 1
                numBanTxt.text = sumRestaBanos(num).toString()
            }
        }
    }
}