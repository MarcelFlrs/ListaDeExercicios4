package br.edu.up.models;

public class Veiculos {

    private String modelo;
    private char placa;
    private String cor;
    
    public Veiculos(String modelo, char placa, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public char getPlaca() {
        return placa;
    }
    public void setPlaca(char placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

}
