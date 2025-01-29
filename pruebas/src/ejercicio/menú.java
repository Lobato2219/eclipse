package ejercicio;

import java.util.Scanner;

public class menú {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		// Bucle que se repite hasta que el usuario elija salir (opción 4)
		while (opcion != 4) {
			// Mostrar el menú
			System.out.println("Menú:");
			System.out.println("1. Ingresar dos números y restarlos");
			System.out.println("2. Mostrar mensaje");
			System.out.println("3. Multiplicar dos numeros");
			System.out.println("4. Salir");
			System.out.print("Selecciona una opción: ");

			// Leer la opción elegida
			opcion = scanner.nextInt();

			// Ejecutar la acción según la opción seleccionada
			switch (opcion) {
			case 1:
				System.out.print("Introduce el primer número: ");
				int num1 = scanner.nextInt();
				System.out.print("Introduce el segundo número: ");
				int num2 = scanner.nextInt();
				int resultado = num1 - num2;
				System.out.println("El resultado de la resta es: " + resultado);
				break;

			case 2:
				System.out.println("Nuevo mensaje de mama: Compra pan.");
				// Aquí podemos añadir código para la acción 2
				break;

			case 3:
				System.out.print("Introduce el primer número: ");
				int numero1 = scanner.nextInt();
				System.out.print("Introduce el segundo número: ");
				int numero2 = scanner.nextInt();
				int result = numero1 * numero2;
				System.out.println("El resultado es: " + result);
				// Aquí podemos añadir código para la acción 3
				break;

			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Intenta nuevamente.");
				break;
			}
			System.out.println(); // Línea en blanco para mayor legibilidad en la consola
		}

		// Cerrar el Scanner
		scanner.close();
	}
}
