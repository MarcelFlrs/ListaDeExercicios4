package br.edu.up.models;

public class Ano {

    private static final Mes Mes = null;
    private int ano;
    private boolean bissexto;
    private Mes[] meses;
   
    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
    }

    public void adicionarMes(Mes[] meses){
        for (int i = 0; i < meses.length; i++) {
            if (meses[i]==null) {
                meses[i] = Mes;
                return;
            }
        }
        System.out.println("Não foi possivel adicionar o mês. O ano já está completo.");
    }

}
