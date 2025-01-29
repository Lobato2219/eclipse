package Ejercicios2;

public class Triangulo extends Figura {

	private double base;
	private double altura;
	private double ladoA;
	private double ladoB;

	public Triangulo(double base, double altura, double ladoA, double ladoB) {
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public double calcularArea() {
		return base * altura / 2;
	}

	@Override
	public double calcularPerimetro() {
		return base + ladoA + ladoB;
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

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

}
