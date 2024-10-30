package Arreglos;

public class Inicializacion {
	public static void main(String[] args) {
		// Declaración del arreglo de enteros
		int[] numeros = new int[10]; // Un arreglo de tamaño 10

		// Llenar el arreglo con los valores del 1 al 10
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1; // Asigna el valor correspondiente en cada índice
		}

		// Imprimir los elementos del arreglo
		System.out.println("Elementos del array numeros:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]); // Imprime cada elemento del array
		}
	}
}
