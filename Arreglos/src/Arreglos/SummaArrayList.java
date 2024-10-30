package Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class SummaArrayList {
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

		// Convertir el ArrayList en un array de tipo Integer
		Integer[] arrayNumeros = numeros.toArray(new Integer[0]);

		// Sumar todos los elementos del array
		int suma = 0;
		for (int num : arrayNumeros) {
			suma += num;
		}

		// Imprimir el resultado de la suma
		System.out.println("La suma de todos los elementos es: " + suma);
	}
}
