package ejercicio;

import java.util.Scanner;

public class ej1 {
	public class ParOImpar {
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario que ingrese un número entero
	        System.out.print("Introduce un número entero: ");
	        int numero = scanner.nextInt();

	        // Determinar si el número es par o impar
	        if (numero % 2 == 0) {
	            // Si el número dividido por 2 da resto 0, es par
	            System.out.println("El número " + numero + " es par.");
	        } else {
	            // Si no, es impar
	            System.out.println("El número " + numero + " es impar.");
	        }

	        // Cerrar el Scanner
	        scanner.close();
	    }
	}
}
