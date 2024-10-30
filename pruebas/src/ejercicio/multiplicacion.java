package ejercicio;

import java.util.Scanner; // Importar la clase Scanner para leer 

public class multiplicacion {
	public static void main(String[] args) {

		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que introduzca un número entero
		System.out.print("Introduce un número entero: ");
		int numero = sc.nextInt(); // Leer el número ingresado

		// Usar un bucle for para imprimir la tabla de multiplicar del 1 al 10
		System.out.println("Tabla de multiplicar del " + numero + ":");
		for (int i = 1; i <= 10; i++) { // Bucle for del 1 al 10
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		sc.close(); // Cerrar el Scanner
	}

}
