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
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            if (dias[diaMes - 1] == null) {
                dias[diaMes - 1] = new Dia(diaMes);
            }
    
            if (dias[diaMes - 1].consultarCompromisso(hora).equals("Não existe compromisso para às " + hora + "hrs")) {
                dias[diaMes - 1].adicionarCompromisso(pessoa, local, assunto, hora);
                return "Criado compromisso para " + hora + "hrs e dia " + diaMes;
            } else {
                return "Já existe um compromisso para às " + hora + " horas do dia " + diaMes;
            }
        } else {
            return "Não existe o dia " + diaMes;
        }
    }
    



}
