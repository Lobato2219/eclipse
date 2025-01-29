package ejercicio;

import java.util.Scanner;

public class mayorde3 {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que introduzca tres números enteros
		System.out.print("Introduce el primer número: ");
		int num1 = sc.nextInt(); // Leer el primer número
		System.out.print("Introduce el segundo número: ");
		int num2 = sc.nextInt(); // Leer el segundo número
		System.out.print("Introduce el tercer número: ");
		int num3 = sc.nextInt(); // Leer el tercer número

		// Verificar cuál es el mayor número o si son iguales
		if (num1 == num2 && num2 == num3) {
			System.out.println("Los tres números son iguales.");
		} else if (num1 >= num2 && num1 >= num3) {
			System.out.println("El número mayor es: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("El número mayor es: " + num2);
		} else {
			System.out.println("El número mayor es: " + num3);
		}

		sc.close();
	}
}
