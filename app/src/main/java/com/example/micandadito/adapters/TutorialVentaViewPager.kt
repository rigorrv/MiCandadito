package com.example.micandadito.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.micandadito.screen.fragmentos.*

class TutorialVentaViewPager(
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    val items = 10
    override fun getItemCount(): Int {
        return items
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 ->
                FragmentoCompraRenta()
            1 ->
                FragmentoDireccion()
            2 ->
                FragmentoPago()
            3 ->
                FragmentoRecamaras()
            4 ->
                FragmentoBanos()
            5 ->
                FragmentoCochera()
            6 ->
                FragmentoCocina()
            7 ->
                FragmentoEstancia()
            8 ->
                FragmentoPatio()
            9 ->
                FragmentoAlberca()
            10 ->
                FragmentoInstalaciones()
            else -> FragmentoCompraRenta()
        }
    }
}