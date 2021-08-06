package com.example.micandadito.screen.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.databinding.FragmentoCompraTutorialBinding

class FragmentoTutorialComp : Fragment() {

    lateinit var fragmentoCompraTutorialBinding: FragmentoCompraTutorialBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentoCompraTutorialBinding =
            FragmentoCompraTutorialBinding.inflate(inflater, container, false)
        return fragmentoCompraTutorialBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }
}