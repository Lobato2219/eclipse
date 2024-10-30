package Arreglos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public final class EliminarEnArrays {
	public static void main(String[] args) {
		// Crear un ArrayList para almacenar los números
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese números
		System.out.println("Ingresa números para añadir a la lista (ingresa un número negativo para terminar):");

		while (true) {
			System.out.print("Número: ");
			int numero = scanner.nextInt();

			// Si el número es negativo, salimos del bucle
			if (numero < 0) {
				break;
			}

			// Añadir el número al ArrayList
			numeros.add(numero);
		}

		// Eliminar duplicados utilizando un HashSet
		HashSet<Integer> conjunto = new HashSet<>(numeros);
		numeros.clear(); // Limpiar el ArrayList original
		numeros.addAll(conjunto); // Agregar los elementos sin duplicados de vuelta al ArrayList

		// Imprimir el ArrayList sin duplicados
		System.out.println("ArrayList sin duplicados:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
	}
}
