package br.edu.up.models;

public class Relatorio {
    private int carrosEntraram;
    private int carrosSairam;
    private double valorTotal;
    
    public Relatorio(int carrosEntraram, int carrosSairam, double valorTotal){
        this.carrosEntraram = carrosEntraram;
        this.carrosSairam = carrosSairam;
        this.valorTotal = valorTotal;
    }

    public String gerarRelatorio(){
        return "Relatório do período:\n" + 
        "Carros que entraram:" + carrosEntraram + 
        "\nCarros que saíram:" + carrosEntraram + 
        "\nValor total:" + valorTotal;
    }

    public int getCarrosEntraram() {
        return carrosEntraram;
    }

    public int getCarrosSairam() {
        return carrosSairam;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}

