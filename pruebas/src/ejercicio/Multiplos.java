package ejercicio;

import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		int suma = 0;

		// Bucle que recorre los números del 1 al 1000
		for (int i = 1; i <= 1000; i++) {
			// Verificar si el número es múltiplo de 3 o 5
			if (i % 3 == 0 || i % 5 == 0) {
				suma += i; // Sumar el número a la variable suma
			}
		}

		// Mostrar el resultado
		System.out.println("La suma de todos los múltiplos de 3 y 5 entre 1 y 1000 es: " + suma);
	}
}
