package com.example.micandadito.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.micandadito.adapters.TutorialCompraViewPager
import com.example.micandadito.databinding.FragmentoTutorialVentaBinding

class FragmentoTutorialVenta : Fragment() {


    lateinit var fragmentoTutorialVentaBinding: FragmentoTutorialVentaBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentoTutorialVentaBinding =
            FragmentoTutorialVentaBinding.inflate(inflater, container, false)
        return fragmentoTutorialVentaBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val tutorialViewPagerAdapter = TutorialCompraViewPager(childFragmentManager, lifecycle)
        fragmentoTutorialVentaBinding.tutorialViewPager2.adapter = tutorialViewPagerAdapter
    }
}