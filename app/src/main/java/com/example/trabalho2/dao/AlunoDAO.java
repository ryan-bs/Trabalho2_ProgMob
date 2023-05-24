package com.example.trabalho2.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.trabalho2.entities.Aluno;

public interface AlunoDAO {
    @Query("SELECT * FROM Aluno WHERE alunoID = :id LIMIT 1")
    Aluno getAluno(int id);
    @Update
    void update(Aluno aluno);
    @Insert
    void insertAll(Aluno... aluno);
    @Delete
    void delete(Aluno aluno);
}
