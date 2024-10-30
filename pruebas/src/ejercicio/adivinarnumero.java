package ejercicio;

import java.util.Scanner;
import java.util.Random;

public class adivinarnumero {
	public static void main(String[] args) {
		// Crear un objeto Random para generar un número aleatorio
		Random random = new Random();
		int numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100

		// Crear un objeto Scanner para leer la entrada
		Scanner scanner = new Scanner(System.in);
		int intento = 0; // Variable para almacenar el número ingresado

		// Bucle que se repite hasta que el usuario adivine correctamente
		while (intento != numeroAleatorio) {
			System.out.print("Introduce un número entre 1 y 100: ");
			intento = scanner.nextInt();

			if (intento < numeroAleatorio) {
				System.out.println("El número es mayor.");
			} else if (intento > numeroAleatorio) {
				System.out.println("El número es menor.");
			} else {
				System.out.println("¡Felicidades! Has adivinado el número.");
			}
		}

		// Cerrar el objeto Scanner
		scanner.close();
	}
}
