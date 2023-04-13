package com.example.aplicaciongeraldine.mibd

import androidx.annotation.RequiresPermission.Read
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
 interface DEstudiante {
    @Insert
    fun insertar(estudiante :TblEstudiante)

    @Query("DELETE * FROM TblEstudiante WHERE id = :id ")
    fun eliminar(id : Int)

    @Query("ALTER * FROM TblEstudiante WHERE id = :id")
    fun editar(estudiante: TblEstudiante)



    @Read
    fun mostrar(estudiante: TblEstudiante)

}