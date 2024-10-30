package ejercicio;
import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer el número del usuario
        Scanner scanner;
		scanner = new Scanner(System.in);

        // Solicitar un número entero al usuario
        System.out.print("Introduce un número entero: ");
        
        // Asegurarse de que el usuario ingrese un entero
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt(); // Leer el número ingresado

            // Comprobar si es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } else {
            System.out.println("Por favor, introduce un número entero válido.");
        }

       
       
    }
}


