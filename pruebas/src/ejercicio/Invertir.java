package ejercicio;

import java.util.Scanner;

public class Invertir {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Pedir al usuario que ingrese un número entero
		System.out.println("ingresa un numero: ");
		int numero = scanner.nextInt();

		// Variable para almacenar el número invertido
		int numeroInvertido = 0;

		// Bucle para invertir el número
		while (numero != 0) {
			int digito = numero % 10; // Obtener el último dígito
			numeroInvertido = numeroInvertido * 10 + digito; // Construir el número invertido
			numero /= 10; // Eliminar el último dígito del número original
		}

		// Mostrar el número invertido
		System.out.println("El número invertido es: " + numeroInvertido);
	}
}