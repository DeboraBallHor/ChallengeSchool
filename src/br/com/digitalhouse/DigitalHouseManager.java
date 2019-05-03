package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public abstract class DigitalHouseManager {

    protected int listaDeAlunos;
    protected int listaDeProfs;
    protected int listaDeCursos;
    protected int listaDeMatriculas;

    protected abstract void registrarCurso(String nome, Integer codigoCurso, int qtdeDeAlunos);
    protected abstract void excluirCurso(String nome, Integer codigoCurso, int qtdeDeAlunos);
    protected abstract void registrarProfAdjunto(String nome, String sobrenome, Integer codigoProfAdjunto, int horasDeMnetoria);
    protected abstract void registrarProfTitular (String nome, String sobrenome, Integer codigoProfTitular, String especialidade);
    protected abstract void excluirProf(Integer codigoProf);
    protected abstract void registrarAluno(String nome, String sobrenome, Integer codigoAluno);
    protected abstract void matricularAlunoEmCurso(Integer codigoAluno, Integer codigoCurso);
    protected abstract void alocarProfs(Integer codigoCurso, Integer codigoProfAdjunto, Integer codigoProfTitular);

    protected List<Aluno> listaDeAlunos = new ArrayList<>();
    protected List<Professor> listaDeProfs = new ArrayList<>();
    protected List<Curso> listaDeCursos = new ArrayList<>();
    protected List<Matricula> listaDeMatriculas;

    protected DigitalHouseManager(List<Aluno> listaDeAlunos, List<Professor> listaDeProfs, List<Curso> listaDeCursos, int listaDeMatriculas) {
        this.listaDeAlunos = new listaDeAlunos;
        this.listaDeProfs = new listaDeProfs;
        this.listaDeCursos = new listaDeCursos;
        this.listaDeMatriculas = new listaDeMatriculas;
    }

    public int getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(int listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public int getListaDeProfs() {
        return listaDeProfs;
    }

    public void setListaDeProfs(int listaDeProfs) {
        this.listaDeProfs = listaDeProfs;
    }

    public int getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(int listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public int getListaDeMatriculas() {
        return listaDeMatriculas;
    }

    public void setListaDeMatriculas(int listaDeMatriculas) {
        this.listaDeMatriculas = listaDeMatriculas;
    }
}