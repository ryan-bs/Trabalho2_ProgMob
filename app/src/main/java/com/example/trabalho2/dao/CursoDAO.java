package com.example.trabalho2.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalho2.entities.Curso;

import java.util.List;

@Dao
public interface CursoDAO {
    @Query("SELECT * FROM Marca WHERE marcaID = :id LIMIT 1")
    Curso getCurso(int id);

    @Query("SELECT * FROM Curso")
    List<Curso> getAll();

    @Insert
    void insertAll(Curso... curso);

    @Update
    void update(Curso corsos);

    @Delete
    void delete(Curso cursos);

}
