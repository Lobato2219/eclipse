package Ejercicios2;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEquipo {

	public static void main(String[] args) {
		// Crear una lista de empleados
		ArrayList<Empleados> empleados = new ArrayList<>();

		// Agregar diferentes tipos de empleados
		empleados.add(new Jugador("Lionel Messi", "12345678A", 1987, "10", "Delantero"));
		empleados.add(new Entrenador("Diego Pablo Simeone", "87654321B", 1970, "FG12345"));
		empleados.add(new Masajista("Javier Rodriguez", "28094765C", 2002, 10));

		// Preguntar al usuario qué rol desea consultar
		Scanner scanner = new Scanner(System.in);

		System.out.println("¿Qué puesto deseas consultar? (Jugador/Entrenador/Masajista):");
		String rolBuscado = scanner.nextLine();

		boolean encontrado = false;

		// Buscar empleados por su rol
		for (Empleados empleado : empleados) {
			if ((rolBuscado.equalsIgnoreCase("Jugador") && empleado instanceof Jugador)
					|| (rolBuscado.equalsIgnoreCase("Entrenador") && empleado instanceof Entrenador)
					|| (rolBuscado.equalsIgnoreCase("Masajista") && empleado instanceof Masajista)) {
				System.out.println("\nInformación del empleado con puesto " + rolBuscado + ":");
				empleado.mostrarDatos();
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró ningún empleado con el puesto: " + rolBuscado);
		}

		scanner.close();
	}
}
