package com.example.micandadito.utility

import com.example.micandadito.screen.dataSearch

object EcuacionFunction {

    fun sumRestaRecamaras(int: Int): Int {
        dataSearch.recamaras = int
        return int
    }

    fun sumRestaBanos(int: Int): Int {
        dataSearch.banos = int
        return int
    }

    fun sumRestaCarros(int: Int): Int {
        dataSearch.banos = int
        return int
    }

    fun onlyNumber(string: String): Boolean {
        var result = string.matches("[0-9]+".toRegex())
        return result
    }

    fun pagoMin(char: CharSequence?) {
        if (char.toString().matches("[0-9]+".toRegex()))
            dataSearch.pagoMinimo = char.toString().toInt()
    }

    fun pagoMax(char: CharSequence?) {
        if (char.toString().matches("[0-9]+".toRegex()))
            dataSearch.pagoMaximo = char.toString().toInt()
    }

    fun direccion(longitude: Double, latitude: Double) {
        if (longitude !== null && latitude !== null) {
            dataSearch.longitude = longitude
            dataSearch.latitude = latitude
        }
    }
}
