package br.edu.up.models;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Veiculo> vagas;
    private int capacidade;
    private int carrosEntraram;
    private int carrosSairam;


    public Estacionamento(int capacidade) {
        this.capacidade = capacidade;
        this.vagas = new ArrayList<>(capacidade);
        this.carrosEntraram = 0;
        this.carrosSairam = 0;
    }

    public boolean adicionarCarro(Veiculo veiculo){
        if (vagas.size() < capacidade) {
            vagas.add(veiculo);
            carrosEntraram++;
            return true;
        }
        return false;
    }
    
    public boolean removerCarro(String placa){
        for (Veiculo veiculo : vagas) {
            if (veiculo.getPlaca().equals(placa)) {
                vagas.remove(veiculo);
                carrosSairam++;
                return true;
            }
        }
        return false;
    }

    public int getCarrosEntraram() {
        return carrosEntraram;
    }

    public int getCarrosSairam() {
        return carrosSairam;
    }

    public int vagasDisponiveis() {
        return capacidade - vagas.size();
    }

    public double calcularPagamento() {
        return carrosSairam * 5.0;
    }


}
