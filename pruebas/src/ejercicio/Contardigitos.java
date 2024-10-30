package ejercicio;

import java.util.Scanner;

public class Contardigitos {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Solicitar el ingreso un número entero positivo
		System.out.print("Introduce un número entero positivo: ");
		int numero = scanner.nextInt();

		// Verificar si el número es positivo
		if (numero < 0) {
			System.out.println("Por favor, introduce un número positivo.");
		} else {
			int contadorDigitos = 0;

			// Contar los dígitos del número
			while (numero != 0) {
				numero = numero / 10; // Eliminar el último dígito del número
				contadorDigitos++; // Incrementar el contador de dígitos
			}

			// Imprimir el resultado
			System.out.println("El número tiene " + contadorDigitos + " dígitos.");
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}

}
