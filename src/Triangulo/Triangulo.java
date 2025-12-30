package Triangulo;

public class Triangulo {

	
	// metodo para obtener el area de un triangulo 
	//recordar que el area del triangulo es base*altura/2
	
	double base;
	double altura;
	
	
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

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
	
	public double calcularArea() {
		return (base*altura)/2;
	}
}
