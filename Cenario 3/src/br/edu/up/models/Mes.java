package br.edu.up.models;

public class Mes {
    private int nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(int nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
    }

    public String adicionarDia(int diaMes) {
        if (diaMes >= 1 && diaMes <= 31) {
            dias[diaMes - 1] = new Dia(diaMes);
        }
        return "";
    }

}
