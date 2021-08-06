package com.example.micandadito.model

data class DirectionJson(
    val usuario: String,
    val nombre: String,
    val foto: String,
    val direccion: String,
    val ciudad: String,
    val estado: String,
    val Pais: String,
    val telefono: String,
    val fecha: String,
    val email: String,
    val imagenes: List<ImagenesJson>,
    val detalles: List<Detalles>,
    var pagoMinimo: Int,
    var pagoMaximo: Int,
    var selected : Boolean
)

data class ImagenesJson(
    val imagenes: String
)

data class Detalles(
    var propiedad: String,
    var latitude: Double,
    var longitude: Double,
    var recamaras: Int,
    var banos: Int,
    var carros: Int,
    var instalaciones: String,
    var cocina: String,
    var estancia: String,
    var patio: String,
    var alberca: String,
    val hospital: String,
    val parque: String,
    val escuela: String,
    val tienda: String
)