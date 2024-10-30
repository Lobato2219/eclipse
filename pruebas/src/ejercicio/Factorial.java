package ejercicio;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("dame un numero entero positivo: ");
		int numero = scanner.nextInt();

		if (numero < 0)
			;

		long factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
			System.out.println("el factorial del numero " + numero + " es: " + factorial);
			scanner.close();
		}
	}
}
