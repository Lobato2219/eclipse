package Ejercicios2;

public class TestFiguras {
	public static void main(String[] args) {
		// Crear un rectángulo y un círculo
		Figura rectangulo = new Rectangulo(5, 3);
		Figura circulo = new Circulo(4);
		Figura triangulo = new Triangulo(7, 4, 8, 9);
		// Mostrar información y calcular área
		System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
		System.out.println("Perimetro del rectángulo: " + rectangulo.calcularPerimetro());
		System.out.println("Área del círculo: " + circulo.calcularArea());
		System.out.println("Perimetro del círculo: " + circulo.calcularPerimetro());
		System.out.println("Área del triangulo: " + triangulo.calcularArea());
		System.out.println("Perimetro  del triangulo: " + triangulo.calcularPerimetro());

	}
}
