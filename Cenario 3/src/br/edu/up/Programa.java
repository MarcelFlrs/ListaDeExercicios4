package br.edu.up;

import br.edu.up.models.*;

public class Programa {
    public static void main(String[] args) {
    

        Dia dia = new Dia(1);
        dia.adicionarCompromisso("a", "b", "c", 3);
        dia.adicionarCompromisso("d", "e", "f", 4);
        dia.consultarCompromisso(3);
        dia.consultarCompromisso(4);
        
    }

    
}
