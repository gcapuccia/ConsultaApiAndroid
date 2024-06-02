package com.example.apirestandroid.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {


    var estadoDeUI by mutableStateOf<MainEstado>(MainEstado.Cargando) //estado Inicial

    fun ejecutar(intencion: MainIntencion){

    }
}