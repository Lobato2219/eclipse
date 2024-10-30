package ejercicio;

import java.util.Scanner;

public class DigitosNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar al usuario que introduzca un número entero
		System.out.print("Introduce un número entero: ");
		int numero = scanner.nextInt();

		int suma = 0;
		int digito;

		// Convertir el número a su valor absoluto (en caso de que sea negativo)
		numero = Math.abs(numero);

		// Bucle para sumar los dígitos del número
		while (numero > 0) {
			digito = numero % 10; // Obtenemos el último dígito
			suma += digito; // Suma del dígito a la suma
			numero /= 10; // Eliminar el último dígito
		}

		// Mostrar el resultado
		System.out.println("La suma de los dígitos es: " + suma);

		scanner.close();
	}
}
