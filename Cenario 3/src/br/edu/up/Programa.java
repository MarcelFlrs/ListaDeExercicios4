package br.edu.up;

import br.edu.up.models.*;

public class Programa {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println();
        
        Mes mes = new Mes("Junho", 30);
        Dia dia = new Dia(15);


        System.out.println(dia.adicionarCompromisso("diaA", "diaA", "diaA", 3));
        System.out.println(dia.adicionarCompromisso("João", "Café", "Reunião", 15));
        System.out.println(dia.consultarCompromisso(3));
        System.out.println(dia.consultarCompromisso(4));
        System.out.println(dia.excluirCompromisso(4));
        System.out.println(dia.consultarCompromisso(4));
        
        System.out.println(mes.adicionarDia(4));
        System.out.println(mes.adicionarCompromisso("mesA", "mesA", "mesA", 8, 6));
        System.out.println(mes.adicionarCompromisso("mesA", "mesA", "mesA", 8, 6));


        System.out.println();
        System.out.println();

    }
    
}
