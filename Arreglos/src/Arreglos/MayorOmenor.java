package Arreglos;

public class MayorOmenor {

	public static void main(String[] args) {
		int[] numeros = { 34, 15, 88, 2, 67, 45, 99, 23, 56, 12 };

		// Inicializar variables para el mayor y el menor
		int mayor = numeros[0];
		int menor = numeros[0];

		// Recorrer el array y actualizar los valores de mayor y menor
		for (int numero : numeros) {
			if (numero > mayor) {
				mayor = numero;
			}
			if (numero < menor) {
				menor = numero;
			}
		}

		// Imprimir los resultados
		System.out.println("El mayor número es: " + mayor);
		System.out.println("El menor número es: " + menor);
	}
}
