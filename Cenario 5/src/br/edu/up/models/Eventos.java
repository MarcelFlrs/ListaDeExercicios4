package br.edu.up.models;

public class Eventos {

    private String nome;
    private int data;
    private String local;
    private int lotacaoMaxima;
    
    public Eventos(String nome, int data, String local, int lotacaoMaxima) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.lotacaoMaxima = lotacaoMaxima;
    }
}
