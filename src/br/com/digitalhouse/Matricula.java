package br.com.digitalhouse;

import java.util.Date;
import java.util.List;

public class Matricula {

    private List<Matricula> listaDeMatriculas;
    private String Aluno;
    private String Curso;
    private Date dataDeMatricula;

    public boolean realizarMatricula;

    public Matricula(List<Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }

    public Matricula(String aluno, String curso, Date dataDeMatricula) {
        Aluno = aluno;
        Curso = curso;
        this.dataDeMatricula = dataDeMatricula;
    }

    public List<Matricula> getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(List<Matricula> listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }

    public String getAluno() {
        return Aluno;
    }

    public void setAluno(String aluno) {
        Aluno = aluno;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(Date dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }
}