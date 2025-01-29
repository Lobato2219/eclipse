package ejercicio;

import java.util.Scanner;

public class ejercicio6Examen {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] nombres = new String[3];
		double[] matematicas = new double[3];
		double[] fisica = new double[3];
		double[] quimica = new double[3];

		System.out.println("Introduce los nombres de los estudiantes:");

		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre del estudiante " + (i + 1) + ": ");
			nombres[i] = scanner.nextLine();
		}

		System.out.println("\nIntroduce las notas en matemáticas:");
		for (int i = 0; i < matematicas.length; i++) {
			System.out.print("Nota de " + nombres[i] + " en matemáticas: ");
			matematicas[i] = scanner.nextDouble();
		}

		System.out.println("\nIntroduce las notas en física:");
		for (int i = 0; i < fisica.length; i++) {
			System.out.print("Nota de " + nombres[i] + " en física: ");
			fisica[i] = scanner.nextDouble();
		}

		System.out.println("\nIntroduce las notas en química:");
		for (int i = 0; i < quimica.length; i++) {
			System.out.print("Nota de " + nombres[i] + " en química: ");
			quimica[i] = scanner.nextDouble();
		}

		System.out.println("\nImprimimos las notas de los estudiantes:");
		for (int i = 0; i < nombres.length; i++) {
			double promedio = (matematicas[i] + fisica[i] + quimica[i]) / 3;
			System.out.printf("El estudiante %s tiene un promedio de %.2f%n", nombres[i], promedio);
		}

		scanner.close();
	}
}
