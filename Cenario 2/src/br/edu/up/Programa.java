package br.edu.up;

public class Programa {
    public static void main(String[] args) {

        // Criando um objeto da classe
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        double distanciaEntrePontos = ponto1.calcularDistancia(ponto2);

    }
}
