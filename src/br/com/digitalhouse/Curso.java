package br.com.digitalhouse;

import java.util.List;

public abstract class Curso {

    private String nome;
    private Integer codigoCurso;
    private int qtdeDeAlunos;
    private List<Aluno> listaDeAlunos;
    private List<Curso> listaDeCursos;

    public abstract ProfessorTitular;
    public abstract ProfessorAdjunto;

    public abstract void adicionarAluno(String nomeAluno, String sobrenome, Integer codigoAluno);
    public  abstract void excluirAluno (String nomeAluno, String sobrenome, Integer codigoAluno);

    public Curso(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public Curso(String nome, Integer codigoCurso, int qtdeDeAlunos, List<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.qtdeDeAlunos = qtdeDeAlunos;
        this.listaDeAlunos = listaDeAlunos;
    }

    public List<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(List<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public int getQtdeDeAlunos() {
        return qtdeDeAlunos;
    }

    public void setQtdeDeAlunos(int qtdeDeAlunos) {
        this.qtdeDeAlunos = qtdeDeAlunos;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(int listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    @Override
    public String toString() {
        return "nome Curso: " + this.nome + " \n codigoCurso: " + this.codigoCurso + " \n qtdeDeAlunos: " +
                this.qtdeDeAlunos + " \n listaDeAlunos: { " + this.qtdeDeAlunos + " } ";
    }
}