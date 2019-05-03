package br.com.digitalhouse;

public class ProfessorAdjunto {

    private String nome;
    private String sobrenome;
    private Integer codigoProfAdjunto;
    private int horasDeMentoria;

    public boolean darAula;
    public boolean realizarMentoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer codigoProfAdjunto, int horasDeMentoria, boolean darAula, boolean realizarMentoria) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoProfAdjunto = codigoProfAdjunto;
        this.horasDeMentoria = horasDeMentoria;
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

    public Integer getCodigoProfAdjunto() {
        return codigoProfAdjunto;
    }

    public void setCodigoProfAdjunto(Integer codigoProfAdjunto) {
        this.codigoProfAdjunto = codigoProfAdjunto;
    }

    public int getHorasDeMentoria() {
        return horasDeMentoria;
    }

    public void setHorasDeMentoria(int horasDeMentoria) {
        this.horasDeMentoria = horasDeMentoria;
    }
}