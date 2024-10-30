package ejercicio;

import java.util.Scanner;

public class SumaParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sumaPares = 0;
		int sumaImpares = 0;

		System.out.println("Introduce 10 números:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				sumaPares += numero;
			} else {
				sumaImpares += numero;
			}
		}

		System.out.println("La suma de los números pares es: " + sumaPares);
		System.out.println("La suma de los números impares es: " + sumaImpares);

		scanner.close();
	}
}
