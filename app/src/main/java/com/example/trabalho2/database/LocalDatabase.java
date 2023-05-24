package com.example.trabalho2.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.trabalho2.dao.AlunoCursoDAO;
import com.example.trabalho2.dao.AlunoDAO;
import com.example.trabalho2.dao.CursoDAO;
import com.example.trabalho2.entities.Aluno;
import com.example.trabalho2.entities.Curso;

@Database(entities = {Curso.class, Aluno.class}, version = 2)
public abstract class LocalDatabase extends RoomDatabase {
    private static LocalDatabase INSTANCE;
    public static LocalDatabase getDatabase(Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    LocalDatabase.class, "CursosOnline").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
    public abstract AlunoDAO alunoModel();
    public abstract CursoDAO cursoModel();
    public abstract AlunoCursoDAO alunoCursoModel();
}
