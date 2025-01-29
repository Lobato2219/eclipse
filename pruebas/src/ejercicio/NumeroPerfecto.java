package ejercicio;

import java.util.Scanner;

public class NumeroPerfecto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que introduzca un número entero
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		int sumaDivisores = 0;

		// Encontrar los divisores propios del número
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				sumaDivisores += i; // Sumar el divisor a la suma
			}
		}

		// Verificar si la suma de los divisores es igual al número
		if (sumaDivisores == numero) {
			System.out.println("El número " + numero + " es un número perfecto.");
		} else {
			System.out.println("El número " + numero + " no es un número perfecto.");
		}

		scanner.close();
	}
}
