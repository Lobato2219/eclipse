package ejercicio;

import java.util.Scanner;

public class NumerosPimos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Los numeros primos son: ");

		for (int i = 2; i <= 100; i++) {
			boolean esPrimo = true;

			// Vemos si tiene mas de dos divisores
			for (int a = 2; a <= i / 2; a++) {
				if (i % a == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println(i);
			}
		}
	}
}
