package br.edu.up.models;

public class Ano {

    private int ano;
    private boolean bissexto;
    private Mes[] meses;
   
    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        this.meses = new Mes[12];
        for (int i = 0; i < meses.length; i++) {
            this.meses[i] = new Mes(obterMes(i), obterQtDias(i, bissexto));
        }
    }

    private String obterMes(int numeroMes) {
        switch (numeroMes) {
            case 0: return "Janeiro";
            case 1: return "Fevereiro";
            case 2: return "Março";
            case 3: return "Abril";
            case 4: return "Maio";
            case 5: return "Junho";
            case 6: return "Julho";
            case 7: return "Agosto";
            case 8: return "Setembro";
            case 9: return "Outubro";
            case 10: return "Novembro";
            case 11: return "Dezembro";
            default: return "";
        }
    }
    private int obterQtDias(int numeroMes, boolean bissexto) {
        switch (numeroMes) {
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
                return 31;
            case 3: case 5: case 8: case 10:
                return 30;
            case 1:
                return bissexto ? 29 : 28;
            default:
                return 0;
        }
    }

    public void adicionarMes(Mes mes){
        for (int i = 0; i < meses.length; i++) {
            if (meses[i]==null) {
                meses[i] = mes;
                return;
            }
        }
        
    }

 




}
