package ejercicio;

import java.util.Scanner;

public class SumaEnteros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que introduzca dos números enteros A y B
		System.out.print("Introduce el número A: ");
		int A = scanner.nextInt();

		System.out.print("Introduce el número B: ");
		int B = scanner.nextInt();

		int suma = 0;

		// Determinar el rango de los números entre A y B
		if (A > B) {
			// Si A es mayor que B, intercambiamos los valores para evitar problemas
			int temp = A;
			A = B;
			B = temp;
		}

		// Sumar los números desde A hasta B
		for (int i = A; i <= B; i++) {
			suma += i;
		}

		// Mostrar el resultado
		System.out.println("La suma de los números entre " + A + " y " + B + " es: " + suma);

		scanner.close();
	}
}
