package com.example.brawl.Prime

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

object Memoria {
    val favorito = mutableListOf<String>()

    fun addFavs(nombre: String) {
        if (!favorito.contains(nombre)){
            favorito.add(nombre)
        }

    }

    fun removefavs(nombre: String){
        favorito.remove(nombre)
    }
    fun esFav(nombre: String): Boolean{
        return favorito.contains(nombre)
    }
}

class NosequeViewModel : ViewModel(){
    private val _argumento = MutableLiveData<String>()
    val argumento : LiveData<String> get() = _argumento

    fun felixapruebame (valor : String) {
        _argumento.value = valor
    }

}