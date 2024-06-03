package br.edu.up;

import br.edu.up.models.*;

public class Programa {
    public static void main(String[] args) {

        Mes mes = new Mes("Junho", 30);
        Dia dia = new Dia(15);
        Ano ano = new Ano(2002);

        System.out.println(dia.adicionarCompromisso("diaA", "diaA", "diaA", 3)); 
        System.out.println(dia.adicionarCompromisso("diaB", "diaB", "diaB", 4)); 

        System.out.println(dia.consultarCompromisso(3));
        System.out.println(dia.consultarCompromisso(4));

        System.out.println(dia.excluirCompromisso(4));

        System.out.println(dia.consultarCompromisso(4)); 

  
        System.out.println(mes.adicionarCompromisso("mesA", "mesA", "mesA", 8, 6)); 


        System.out.println(ano.excluirCompromisso("Junho", 6, 8));
        
        System.out.println(mes.adicionarCompromisso("mesA", "mesA", "mesA", 8, 6)); 

        System.out.println(ano.listarCompromissos("Junho"));

        System.out.println();
        System.out.println();

    }
}
