package com.example.brawl.Prime

import android.os.Parcelable
import android.view.MenuItem
import kotlinx.parcelize.Parcelize

@Parcelize
data class Brawler (
    val nombre: String,
    val rareza: String,
    val clase: String,
    val foto: String,
    val descripcion: String,
    var isFavorito: Boolean = false
) : Parcelable
