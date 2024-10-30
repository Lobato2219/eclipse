package Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class ActualizarArraysList {
	public static void main(String[] args) {
		// Crear un ArrayList de enteros y agregar 10 elementos
		ArrayList<Integer> numeros = new ArrayList<>();

		// Llenar el ArrayList con valores iniciales
		for (int i = 1; i <= 10; i++) {
			numeros.add(i * 10); // Agregar valores: 10, 20, ..., 100
		}

		// Imprimir el ArrayList inicial
		System.out.println("ArrayList inicial: " + numeros);

		Scanner scanner = new Scanner(System.in);

		// Permitir al usuario actualizar el valor de un elemento
		while (true) {
			System.out.print("Ingresa el índice del elemento a actualizar (0-9) o -1 para salir: ");
			int indice = scanner.nextInt();

			// Salir del bucle si el usuario ingresa -1
			if (indice == -1) {
				break;
			}

			// Verificar si el índice es válido
			if (indice >= 0 && indice < numeros.size()) {
				System.out.print("Ingresa el nuevo valor para el índice " + indice + ": ");
				int nuevoValor = scanner.nextInt();

				// Actualizar el valor en la posición especificada
				numeros.set(indice, nuevoValor);

				System.out.println("ArrayList actualizado: " + numeros);
			} else {
				System.out.println("Índice inválido. Por favor, ingresa un índice entre 0 y 9.");
			}
		}

		scanner.close();
		System.out.println("Programa finalizado.");
	}
}