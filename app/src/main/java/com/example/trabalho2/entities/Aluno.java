package com.example.trabalho2.entities;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Curso.class,
        parentColumns = "cursoID", childColumns = "cursoID",
        onDelete = ForeignKey.CASCADE))
public class Aluno {

    @PrimaryKey(autoGenerate = true)
    private int alunoID;
    private int cursoID; //(chave estrangeira)
    private String nomeAluno;
    private String emailAluno;
    private String telefoneAluno;

    public Aluno(int cursoID, String nomeAluno, String emailAluno, String telefoneAluno) {

        this.cursoID = cursoID;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.telefoneAluno = telefoneAluno;
    }

    public int getAlunoID() {
        return alunoID;
    }

    public int getCursoID() {
        return cursoID;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String toString() {
        return getAlunoID() + ": " + getNomeAluno()+
                "Curso: "+getCursoID();
    }

}


