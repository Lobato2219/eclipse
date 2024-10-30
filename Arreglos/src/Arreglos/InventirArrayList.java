package Arreglos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InventirArrayList {

	public static void main(String[] args) {
		// Crear un ArrayList para almacenar los números ingresados por el usuario
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

		// Imprimir el ArrayList original
		System.out.println("ArrayList original:");
		System.out.println(numeros);

		// Invertir el ArrayList
		Collections.reverse(numeros);

		// Imprimir el ArrayList en orden inverso
		System.out.println("ArrayList en orden inverso:");
		System.out.println(numeros);
	}
}