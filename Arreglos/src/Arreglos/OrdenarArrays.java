package Arreglos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarArrays {
	public static void main(String[] args) {
		// Crear un ArrayList para almacenar los números
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese números
		System.out.println("Ingresa números para añadir a la lista (un número negativo para terminar):");

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

		// Ordenar el ArrayList en orden ascendente
		Collections.sort(numeros);

		// Imprimir el ArrayList ordenado
		System.out.println("ArrayList ordenado en orden ascendente:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
	}
}
