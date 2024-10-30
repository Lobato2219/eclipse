package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio3HashMap {

	// Método para verificar si hay duplicados en la lista de números
	public static boolean hayDuplicados(int[] numeros) {
		HashMap<Integer, Integer> frecuenciaNumeros = new HashMap<>();

		// Contar la frecuencia de cada número
		for (int numero : numeros) {
			frecuenciaNumeros.put(numero, frecuenciaNumeros.getOrDefault(numero, 0) + 1);
		}

		// Verificar si algún número tiene una frecuencia mayor que 1
		for (int frecuencia : frecuenciaNumeros.values()) {
			if (frecuencia > 1) {
				return true; // Hay duplicados
			}
		}
		return false; // No hay duplicados
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario el tamaño de la lista de números
		System.out.print("¿Cuántos números deseas ingresar?: ");
		int n = scanner.nextInt();
		int[] numeros = new int[n];

		// Pedir al usuario que ingrese los números
		System.out.println("Ingresa los números:");
		for (int i = 0; i < n; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		// Verificar si hay duplicados y mostrar el resultado
		if (hayDuplicados(numeros)) {
			System.out.println("Hay al menos un número repetido en la lista.");
		} else {
			System.out.println("No hay números repetidos en la lista.");
		}
	}
}
