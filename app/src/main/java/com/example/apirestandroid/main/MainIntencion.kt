package com.example.apirestandroid.main

sealed class MainIntencion {

    data object Refrescar:MainIntencion()
    data object RomperTodo:MainIntencion()


}