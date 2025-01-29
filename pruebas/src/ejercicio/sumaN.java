package ejercicio;

import java.util.Scanner;

public class sumaN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" introduce un numero entero positivo : ");

		int n = scanner.nextInt();
		if (n > 0) {
			int suma = (n * (n + 1)) / 2; // formula original mates.
			System.out.println(" la suma de los primeros numeros naturales es : " + suma);
		}

	}
}
