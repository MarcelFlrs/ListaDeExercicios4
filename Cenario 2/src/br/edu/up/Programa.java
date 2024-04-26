package br.edu.up;

public class Programa {
    public static void main(String[] args) {

        // Criando um objeto da classe
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        double distanciaEntrePontos = ponto1.calcularDistancia(ponto2);
        Ponto destino = new Ponto(7,2);
        double pontoAoDestino = ponto2.calcularDistancia(destino);

        ponto1.setX(10);
        ponto1.setY(3);
        distanciaEntrePontos = ponto1.calcularDistancia(ponto2);

        System.out.printf("Distancia do ponto 1 ao ponto 2: %.2f" , distanciaEntrePontos);
        System.out.printf("\nDistancia do ponto 2 às coordenadas (7,2): %.2f"  , pontoAoDestino);
        System.out.printf("\nDistancia entre os dois pontos com o ponto 1 alterado para x=10 e y=3: %.2f", distanciaEntrePontos);
    }
}
