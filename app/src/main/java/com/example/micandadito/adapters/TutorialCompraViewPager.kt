package com.example.micandadito.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.micandadito.screen.fragmentos.*

class TutorialCompraViewPager(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    val items = 11
    override fun getItemCount(): Int {
        return items
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 ->
                FragmentoCompraRenta()
            1 ->
                FragmentoPago()
            2 ->
                FragmentoDireccion()
            3 ->
                FragmentoRecamaras()
            4 ->
                FragmentoBanos()
            5 ->
                FragmentoCochera()
            6 ->
                FragmentoInstalaciones()
            7 ->
                FragmentoCocina()
            8 ->
                FragmentoEstancia()
            9 ->
                FragmentoPatio()
            10 ->
                FragmentoAlberca()
            else -> FragmentoCompraRenta()
        }
    }


}