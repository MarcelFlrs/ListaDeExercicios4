package br.edu.up;

import br.edu.up.models.*;

public class Programa {
    public static void main(String[] args) {

        System.out.println();

        Dia dia = new Dia(1);
        Mes mes = new Mes("Junho", 31);
        dia.adicionarCompromisso("diaA", "diaA", "diaA", 4);
        dia.consultarCompromisso(3);
        dia.consultarCompromisso(4);
        
        mes.adicionarCompromisso("mesA", "mesA", "mesA", 4, 3);
        mes.adicionarCompromisso("mesB", "mesB", "mesB", 4, 3);

        dia.excluirCompromisso(4);
        dia.consultarCompromisso(4);
    }

}
