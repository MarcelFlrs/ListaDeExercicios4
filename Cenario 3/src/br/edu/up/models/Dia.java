package br.edu.up.models;

public class Dia {

    private int diaMes;
    Compromisso[] compromissos;

    public Dia(int diaMes) {
        this.diaMes = diaMes;
        this.compromissos = new Compromisso[23];
    }

    public String adicionarCompromisso(String pessoa, String local, String assunto, int hora) {
        if (hora >= 1 && hora <= 24) {
            if (compromissos[hora - 1] == null) {
                compromissos[hora - 1] = new Compromisso(pessoa, local, assunto, hora);
            } else {
                return null;
            }
        } else {
            return null;
        }
        return "Compromisso criado";
    }

    public String consultarCompromisso(int hora) {
        if (compromissos[hora - 1] != null) {
            return "Você tem um compromisso agendado para as " + compromissos[hora - 1].getHora() + " Hrs";
        } else {
            return "Não existe compromisso para às " + hora + "hrs";
        }

    }

    public String excluirCompromisso(int hora) {
        if (hora >= 1 && hora <= 24) {
            if (compromissos[hora - 1] != null) {
                compromissos[hora - 1] = null;
                return "Compromisso excluido com sucesso";
            } else {
                return "Compromisso não existente";
            }
        } else {
            return null;
        }
    }

    public Compromisso getCompromisso(int hora) {
        if (hora <= 1 || hora >= 24) {
            return null;
        }
        return compromissos[hora];
    }

    public int getDiaMes() {
        return diaMes;
    }

}
