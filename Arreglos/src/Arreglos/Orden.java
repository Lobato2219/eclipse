package Arreglos;

import java.util.Arrays;
import java.util.Random;

public class Orden {
	public static void main(String[] args) {
		int[] numeros = { 10 };
		Random rand = new Random();

		// Rellenar el array con números aleatorios
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(100); // Números aleatorios entre 0 y 99
		}

		// Imprimir el array original
		System.out.println("Array original:");
		System.out.println(Arrays.toString(numeros));

		// Ordenar el array en orden ascendente
		Arrays.sort(numeros);

		// Imprimir el array ordenado
		System.out.println("Array ordenado en orden ascendente:");
		System.out.println(Arrays.toString(numeros));
	}

}
