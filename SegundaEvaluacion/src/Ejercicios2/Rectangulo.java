package Ejercicios2;

public class Rectangulo extends Figura {

	private double ancho;
	private double largo;

	public Rectangulo(double ancho, double largo) {
		this.ancho = ancho;
		this.largo = largo;

	}

	@Override
	public double calcularArea() {
		return ancho * largo;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (largo + ancho);
	}

	public double getAncho() {
		return ancho;
	}

	public double setAncho(double ancho) {
		return this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

}
