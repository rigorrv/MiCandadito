package com.example.micandadito.model

data class DataSearch(
    var propiedad: String? = "Compra",
    var latitude: Double? = null,
    var longitude: Double? = null,
    var recamaras: Int? = 0,
    var banos: Int? = 0,
    var carros: Int? = 0,
    var instalaciones: String? = "true",
    var cocina: String? = "true",
    var estancia: String? = "true",
    var patio: String? = "true",
    var alberca: String? = "true",
    var pagoMinimo: Int? = null,
    var pagoMaximo: Int? = null

)