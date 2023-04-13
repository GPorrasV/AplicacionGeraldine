package com.example.aplicaciongeraldine.mibd

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class TblEstudiante(
    @PrimaryKey
    val id: Int,
    val nombre: String,
    val apellido: String,
    val carrera: String,
    val anio: String

)

