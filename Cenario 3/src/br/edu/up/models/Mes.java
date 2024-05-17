package br.edu.up.models;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(String nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public String adicionarDia(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1] = new Dia(diaMes);
        }
        return "";
    }

    public String adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes) {

        dias[diaMes-1] = new Dia(diaMes);

        if (dias[diaMes] != null) {
            if (dias[diaMes - 1].consultarCompromisso(hora).equals("1")) {
                dias[diaMes - 1].adicionarCompromisso(pessoa, local, assunto, (hora + 1));
                System.out.println("Criado compromisso para " + hora + "hrs e dia " + diaMes);

            } else{
                System.out.println("Já existe um compromisso para às " + hora + " horas do dia " + diaMes);
            }
        } else {
            System.out.println("Não existe o dia " + diaMes);
        }
        return "";
    }



}
