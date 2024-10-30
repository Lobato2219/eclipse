package Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class FiltrarArrayList {
	public static void main(String[] args) {
		// Crear un ArrayList para almacenar los números ingresados por el usuario
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<Integer> numerosPares = new ArrayList<>();
		ArrayList<Integer> numerosImpares = new ArrayList<>();
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

		// Filtrar los números en pares e impares
		for (int num : numeros) {
			if (num % 2 == 0) {
				numerosPares.add(num);
			} else {
				numerosImpares.add(num);
			}
		}

		// Imprimir el ArrayList de números pares
		System.out.println("Números pares:");
		System.out.println(numerosPares);

		// Imprimir el ArrayList de números impares
		System.out.println("Números impares:");
		System.out.println(numerosImpares);
	}
}
