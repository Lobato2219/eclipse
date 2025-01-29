package Ejercicios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Canciones {
	// ArrayList para almacenar objetos de tipo Canciones2
	private static ArrayList<Canciones2> canciones = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char opcion;

		do {
			System.out.println("\n--- Gestión de Canciones ---");
			System.out.println("A. Alta de Canción");
			System.out.println("B. Listado de Canciones");
			System.out.println("C. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextLine().toUpperCase().charAt(0);

			switch (opcion) {
			case 'A':
				Alta(scanner); // Método para dar de alta canciones
				break;
			case 'B':
				Listado(); // Método para listar canciones
				break;
			case 'C':
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida. Intente nuevamente.");
			}
		} while (opcion != 'C');

		scanner.close();
	}

	// Método Alta(): Solicita los datos y agrega la canción al ArrayList
	private static void Alta(Scanner scanner) {
		System.out.println("\n--- Alta de Canción ---");
		System.out.print("Ingrese el nombre de la canción: ");
		String nombreCancion = scanner.nextLine();

		System.out.print("Ingrese el grupo musical: ");
		String grupoMusica = scanner.nextLine();

		System.out.print("Ingrese el año de publicación: ");
		int anioPublicacion = Integer.parseInt(scanner.nextLine());

		// Crear un objeto de tipo Canciones2 y añadirlo al ArrayList
		Canciones2 nuevaCancion = new Canciones2(nombreCancion, grupoMusica, anioPublicacion);
		canciones.add(nuevaCancion);

		System.out.println("Canción añadida con éxito.");
	}

	// Método Listado(): Recorre el ArrayList y muestra las canciones
	private static void Listado() {
		System.out.println("\n--- Listado de Canciones ---");
		if (canciones.isEmpty()) {
			System.out.println("No hay canciones registradas.");
		} else {
			for (Canciones2 cancion : canciones) {
				System.out.println("Grupo: " + cancion.getGrupoMusica() + ", Canción: " + cancion.getNombreCancion()
						+ ", Año: " + cancion.getAnioPublicacion());
			}
		}
	}
}
