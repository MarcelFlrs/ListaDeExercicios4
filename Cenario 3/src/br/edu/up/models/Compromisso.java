package br.edu.up.models;

public class Compromisso {

    private String pessoa;
    private String local;
    private String assunto;
    private int hora;
    
    public Compromisso(String pessoa, String local, String assunto, int hora) {
        this.pessoa = pessoa;
        this.local = local;
        this.assunto = assunto;
        this.hora = hora;
    }

}
