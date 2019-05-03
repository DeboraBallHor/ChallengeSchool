package br.com.digitalhouse;

public class ProfessorTitular {

    private String nome;
    private String sobrenome;
    private Integer codigoProfTitular;
    private String especialidade;

    public boolean darAula;
    public boolean ministrarEspecialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer codigoProfTitular, String especialidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoProfTitular = codigoProfTitular;
        this.especialidade = especialidade;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getCodigoProfTitular() {
        return codigoProfTitular;
    }

    public void setCodigoProfTitular(Integer codigoProfTitular) {
        this.codigoProfTitular = codigoProfTitular;
    }
}