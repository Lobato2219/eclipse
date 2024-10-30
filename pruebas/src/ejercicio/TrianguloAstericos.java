package ejercicio;

import java.util.Scanner;

public class TrianguloAstericos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que introduzca un número entero positivo
		System.out.print("Introduce un número entero positivo: ");
		int N = scanner.nextInt();

		// Validar que el número sea positivo
		if (N > 0) {
			// Bucle para imprimir el triángulo
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println(); // Imprimir nueva línea después de cada fila
			}
		} else {
			System.out.println("El número debe ser entero positivo.");
		}

		scanner.close();
	}
}
