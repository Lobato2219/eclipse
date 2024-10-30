package Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class OperacionesBasicasArrays {
	public static void main(String[] args) {
		// Crear un ArrayList de cadenas (String)
		ArrayList<String> nombres = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String nombre;

		System.out.println("Ingresa nombres (escribe 'fin' para terminar):");
		while (true) {
			nombre = scanner.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break; // Termina el bucle si se ingresa "fin"
			}
			nombres.add(nombre); // Agrega el nombre al ArrayList
		}

		// Imprimir todos los nombres ingresados
		System.out.println("\nNombres ingresados:");
		for (String n : nombres) {
			System.out.println(n);
		}

		// Permitir al usuario eliminar un nombre específico
		System.out.println("\n¿Deseas eliminar un nombre? (escribe 'no' para salir):");
		while (true) {
			String nombreAEliminar = scanner.nextLine();
			if (nombreAEliminar.equalsIgnoreCase("no")) {
				break; // Termina el bucle si se ingresa "no"
			}
			if (nombres.remove(nombreAEliminar)) {
				System.out.println("El nombre '" + nombreAEliminar + "' ha sido eliminado.");
			} else {
				System.out.println("El nombre '" + nombreAEliminar + "' no se encontró en la lista.");
			}

			// Mostramos la lista actualizada
			System.out.println("\nLista actualizada de nombres:");
			for (String n : nombres) {
				System.out.println(n);
			}

			System.out.println("\n¿Deseas eliminar otro nombre? (escribe 'no' para salir):");
		}

		scanner.close();
		System.out.println("Programa finalizado.");
	}
}
