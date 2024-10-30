package Excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejoExcepciones {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// Solicitar al usuario que ingrese un número entero
			System.out.print("Por favor, ingresa un número entero: ");
			int numero = scanner.nextInt();

			// Mostrar el número ingresado
			System.out.println("Has ingresado el número: " + numero);
		} catch (InputMismatchException e) {
			// Manejar la excepción si el usuario ingresa un valor no numérico
			System.out.println("Error: Debes ingresar un número entero.");
		}
	}
}
