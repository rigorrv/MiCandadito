package com.example.micandadito.communicator

import com.example.micandadito.model.DirectionJson

interface Communicator {
    fun getInformation(info: DirectionJson)
    fun addImagesAdapter(info : DirectionJson)
}