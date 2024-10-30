package Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList {

	public static void main(String[] args) {
		// Crear un ArrayList de enteros
		ArrayList<Integer> numeros = new ArrayList<>();

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, ingrese 5 números enteros:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt();
			numeros.add(numero); // Agrega cada número al ArrayList
		}

		scanner.close();

		System.out.println("Contenido del ArrayList:");
		System.out.println(numeros);
	}
}
