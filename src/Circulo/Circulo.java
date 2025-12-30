package Circulo;

//Calcular el area de un circulo
public class Circulo {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calcularArea() {

        return Math.PI * r * r;
    }
}
