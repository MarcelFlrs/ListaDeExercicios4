package br.edu.up.models;

public class Ano {

    private int ano;
    private boolean bissexto;
    private Mes[] meses;
   
    public Ano(int ano) {
        meses = new Mes[12];
        meses[0] = new Mes("Janeiro", 31);
        meses[1] = new Mes("Fevereiro", anoBissexto(ano) ? 29 : 28);
        meses[2] = new Mes("Março", 31);
        meses[3] = new Mes("Abril", 30);
        meses[4] = new Mes("Maio", 31);
        meses[5] = new Mes("Junho", 30);
        meses[6] = new Mes("Julho", 31);
        meses[7] = new Mes("Agosto", 31);
        meses[8] = new Mes("Setembro", 30);
        meses[9] = new Mes("Outubro", 31);
        meses[10] = new Mes("Novembro", 30);
        meses[11] = new Mes("Dezembro", 31);
    }

    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public Mes getMes(String nomeMes) {
        for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                return mes;
            }
        }
        return null;
    }

    public void adicionarMes(Mes mes){
        for (int i = 0; i < meses.length; i++) {
            if (meses[i]==null) {
                meses[i] = mes;
                return;
            }
        }
    }

    public String excluirCompromisso(String nomeMes, int hora, int diaMes){
         for (Mes mes : meses) {
            if (mes.getNome().equalsIgnoreCase(nomeMes)) {
                if (diaMes >= 1 && diaMes <= mes.getQtdeDias()) {
                    Dia dia = mes.getDias()[diaMes - 1];
                    if (dia != null) {
                        return dia.excluirCompromisso(hora);
                    } else {
                        return "Dia não existente";
                    }
                } else {
                    return "Dia fora do alcance";
                }
            }
        }
        return "Mês não encontrado";
    }
    
    public String listarCompromissos(String nomeMes) {
        Mes mes = getMes(nomeMes);
        if (mes == null) {
            return "Mês não encontrado";
        }
        for (Dia dia : mes.getDias()) {
            if (dia != null) {
                for (int hora = 1; hora < 24; hora++) {
                    Compromisso compromisso = dia.getCompromisso(hora);
                    if (compromisso != null) {
                        return "Dia " + dia.getDiaMes() + " às "+ hora +" horas: " + compromisso.getAssunto() + " com " + compromisso.getPessoa() + " no local " + compromisso.getLocal() + "\n";
                    }
                }
            }
        }
        return "";
    }
    
    public String listarCompromissos(){

        return "";
    }



}
