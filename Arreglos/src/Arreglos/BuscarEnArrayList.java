package Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarEnArrayList {
	public static void main(String[] args) {
		// Crear un ArrayList de enteros
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		// Permitir al usuario agregar 10 números
		System.out.println("Ingresa 10 números enteros:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt(); // Leer el número ingresado
			numeros.add(numero); // Agregar el número al ArrayList
		}

		System.out.print("Ingresa un número a buscar en la lista: ");
		int numeroABuscar = scanner.nextInt();

		// Verificar si el número está presente y obtener el índice
		int indice = numeros.indexOf(numeroABuscar);
		if (indice != -1) {
			System.out.println("El número " + numeroABuscar + " se encuentra en el índice: " + indice);
		} else {
			System.out.println("El número " + numeroABuscar + " no está presente en la lista.");
		}

		scanner.close();
	}

}
