package br.edu.up.models;

public class Dia {
    private int diaMes;
    private Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[23];
    }
    
    public String adicionarCompromisso(String pessoa, String local, String assunto, int hora){
        if (hora >= 1 && hora <= 24) {
            if(compromissos[hora-1] == null){
                compromissos[hora - 1] = new Compromisso(pessoa, local, assunto, hora);
            }else{
                return null;
            }
        }else{
            return null;
        }
        return "Compromisso criado";
    }

    public String consultarCompromisso(int hora){
        if (compromissos[hora - 1] != null){
            System.out.println("Você tem um compromisso agendado para as " + compromissos[hora-1].getHora()+ " Hrs");
            return "Compromisso existente";
        }else{
            return "1";
        }

    }

    
}
