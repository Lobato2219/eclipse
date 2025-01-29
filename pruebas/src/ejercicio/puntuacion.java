package ejercicio;
import java.util.Scanner;  // Importar la clase Scanner 

public class puntuacion {
	 public static void main(String[] args) {
	        // Crear un objeto Scanner para leer 
	        Scanner sc = new Scanner(System.in);

	        // Solicitar al usuario que introduzca la puntuación
	        System.out.print("Introduce la puntuación (0-100): ");
	        int puntuacion = sc.nextInt();  // Leer la puntuación ingresada

	        // Verificar la calificación según las reglas dadas
	        if (puntuacion >= 90) {
	            System.out.println("Calificación: A");
	        } else if (puntuacion >= 80) {
	            System.out.println("Calificación: B");
	        } else if (puntuacion >= 70) {
	            System.out.println("Calificación: C");
	        } else if (puntuacion >= 60) {
	            System.out.println("Calificación: D");
	        } else {
	            System.out.println("Calificación: F");
	        }

	        sc.close();  // Cerrar el objeto Scanner
	    }
	}


