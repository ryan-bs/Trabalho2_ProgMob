package com.example.trabalho2.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.example.trabalho2.entities.AlunoCurso;

import java.util.List;

@Dao
public interface AlunoCursoDAO {

    @Query("SELECT Aluno.alunoID AS alunoID, Aluno.nomeAluno " + "AS nomeCurso, Curso.nomeCurso AS nomeCurso " +
    "From Aluno INNER JOIN Curso ON Aluno.cursoID = Curso.cursoID")
    List<AlunoCurso> getAllCelMarca();
}
