package br.edu.up.models;

public class Mes {
    private String nome;
    private int qtdeDias;
    private Dia[] dias;

    public Mes(String nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        this.dias = new Dia[qtdeDias];
    }

    public String adicionarDia(int diaMes) {
        if (diaMes >= 1 && diaMes <= qtdeDias) {
            dias[diaMes - 1] = new Dia(diaMes);
        }
        return "";
    }

    public String adicionarCompromisso(String pessoa, String local, String assunto, int hora, int diaMes){
        Dia dia = dias[diaMes - 1];
        int horaDisponivel = verificarHoraDisponivel(dia.compromissos);
        if (hora != -1) {
            dia.adicionarCompromisso(pessoa, local, assunto, (horaDisponivel + 1) );
        }else{
            System.out.println("Já existe um compromisso para a hora " + hora + " no dia " + diaMes);
        }
        return "";
    }

    private int verificarHoraDisponivel(Compromisso[] compromissos){
        for (int i = 0; i < compromissos.length; i++) {
            if (compromissos[i] == null) {
                return i;
            }
        }
        return -1;
        
    }

}
