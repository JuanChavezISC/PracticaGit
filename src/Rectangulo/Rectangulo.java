package Rectangulo;

public class Rectangulo {
	//metod para calcular el area de un rectangulo
	// area = base por altura
	
	double base;
	double altura;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return (base*altura);
	}
}
