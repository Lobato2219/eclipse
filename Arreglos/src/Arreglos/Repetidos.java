package Arreglos;

import java.util.HashSet;

public class Repetidos {
	public static void main(String[] args) {

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 9, 5, };

		// Conjunto para almacenar los números ya vistos
		HashSet<Integer> numerosVistos = new HashSet<>();
		// Conjunto para almacenar los números repetidos
		HashSet<Integer> numerosRepetidos = new HashSet<>();

		// Recorremos el array para detectar los repetidos
		for (int numero : numeros) {
			// Si el número ya está en 'numerosVistos', es un número repetido
			if (!numerosVistos.add(numero)) {
				numerosRepetidos.add(numero);
			}
		}

		// Imprimimos los números repetidos
		if (numerosRepetidos.isEmpty()) {
			System.out.println("No hay números repetidos.");
		} else {
			System.out.println("Números repetidos: " + numerosRepetidos);
		}
	}
}