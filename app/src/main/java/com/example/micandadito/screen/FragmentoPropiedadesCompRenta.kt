package com.example.micandadito.screen

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.recyclerview.selection.SelectionTracker
import androidx.recyclerview.selection.StableIdKeyProvider
import androidx.recyclerview.selection.StorageStrategy
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.micandadito.R
import com.example.micandadito.adapters.MainAdapter
import com.example.micandadito.adapters.MyItemDetailsLookup
import com.example.micandadito.databinding.FragmentPropiedadesBinding
import com.example.micandadito.screen.fragmentos.FragmentoBusquedaConfig
import com.example.micandadito.screen.fragmentos.FragmentoUsuario
import java.util.*


class FragmentoPropiedadesCompRenta : Fragment() {

    private lateinit var rootView: FragmentPropiedadesBinding
    lateinit var adapter: MainAdapter
    private var tracker: SelectionTracker<Long>? = null


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
            //homeAdapter.getDireccions(mockData())
            //propiedadesRecyclerView.adapter = homeAdapter
        }

        rootView.recyclerInfo.layoutManager = LinearLayoutManager(context)
        setupTracker()
    }


    private fun setupTracker() {
        if (!::adapter.isInitialized) {
            tracker = SelectionTracker.Builder(
                "mySelection",
                rootView.recyclerInfo,
                StableIdKeyProvider(rootView.recyclerInfo),
                MyItemDetailsLookup(rootView.recyclerInfo),
                StorageStrategy.createLongStorage()
            ).withSelectionPredicate(object : SelectionTracker.SelectionPredicate<Long>() {
                override fun canSetStateForKey(key: Long, nextState: Boolean): Boolean {
                    return true
                }

                override fun canSetStateAtPosition(position: Int, nextState: Boolean): Boolean {
                    return true
                }

                override fun canSelectMultiple(): Boolean {
                    return false // Set to false to allow single selecting
                }
            }).build()

            adapter.tracker = tracker
        }
    }


    private fun setupAdapter() {
        adapter.list = createRandomIntList()
        adapter.notifyDataSetChanged()
    }

    private fun createRandomIntList(): List<Int> {
        val random = Random()
        return (1..10).map { random.nextInt() }
    }

}
