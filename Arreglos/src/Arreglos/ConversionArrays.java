package Arreglos;

import java.util.ArrayList;
import java.util.Random;

public class ConversionArrays {

	public static void main(String[] args) {
		// Crear un ArrayList para almacenar los números
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();

		// Llenar el ArrayList con 10 números aleatorios entre 1 y 100
		for (int i = 0; i < 10; i++) {
			int numeroAleatorio = random.nextInt(100) + 1;
			numeros.add(numeroAleatorio);
		}

		// Imprimir el ArrayList
		System.out.println("ArrayList:");
		System.out.println(numeros);

		// Convertir el ArrayList a un array de enteros
		Integer[] arrayEnteros = numeros.toArray(new Integer[0]);

		// Imprimir el array
		System.out.println("Array convertido:");
		for (int num : arrayEnteros) {
			System.out.print(num + " ");
		}
	}
}
