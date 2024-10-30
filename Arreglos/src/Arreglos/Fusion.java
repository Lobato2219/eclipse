package Arreglos;

import java.util.Arrays;

public class Fusion {
	public static void main(String[] args) {
		// Crear dos arrays de enteros
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };

		// Fusionar los dos arrays
		int[] arrayFusionado = new int[array1.length + array2.length];

		// Copiar elementos del primer array al nuevo array
		for (int i = 0; i < array1.length; i++) {
			arrayFusionado[i] = array1[i];
		}

		// Copiar elementos del segundo array al nuevo array
		for (int i = 0; i < array2.length; i++) {
			arrayFusionado[array1.length + i] = array2[i];
		}

		System.out.println("Array fusionado:");
		System.out.println(Arrays.toString(arrayFusionado));
	}
}
