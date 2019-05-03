package br.com.digitalhouse;

import java.util.List;

public class Aluno {

    private List<Aluno> listaDeAlunos;
    private String nome;
    private String sobrenome;
    private Integer codigoAluno;

    public boolean assistirAula;

    @Override
    public boolean equals(codigoAluno codigoAluno1) {
        return codigoAluno = new codigoAluno1;
    }

    public Aluno(List<Aluno> listaDeAlunos, String nome, String sobrenome, Integer codigoAluno) {
        this.listaDeAlunos = listaDeAlunos;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    @Override
    public String toString() {
        return "nome Aluno: " + this.nome + " \n sobrenome: " + this.sobrenome + " \n codigoAluno: " +
                this.codigoAluno + " \n listaDeAlunos: { " + this.listaDeAlunos + " } ";
    }
}