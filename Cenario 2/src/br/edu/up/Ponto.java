package br.edu.up;

public class Ponto {

    private double x;
    private double y;
    private double distanciaPontos;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Ponto outroPonto) {
        distanciaPontos = Math.sqrt(Math.pow((this.x - outroPonto.x), 2) + Math.pow((this.y - outroPonto.y), 2));

        return distanciaPontos;
    }
}
