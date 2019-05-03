package br.com.digitalhouse;

import java.util.List;

public class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoProf;
    private List<Professor> listaDeProfs;

    public boolean darAula;

    public Professor(List<Professor> listaDeProfs) {
        this.listaDeProfs = listaDeProfs;
    }

    public Professor(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProf, List<Professor> listaDeProfs) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProf = codigoProf;
    }

    public List<Professor> getListaDeProfs() {
        return listaDeProfs;
    }

    public void setListaDeProfs(List<Professor> listaDeProfs) {
        this.listaDeProfs = listaDeProfs;
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

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(Integer codigoProf) {
        this.codigoProf = codigoProf;
    }

    @Override
    public String toString() {
        return "nome Professor: " + this.nome + " \n sobrenome: " + this.sobrenome + " \n tempodeCasa: " +
                this.tempoDeCasa + " \n codigoProf: " + this.codigoProf;
    }
}