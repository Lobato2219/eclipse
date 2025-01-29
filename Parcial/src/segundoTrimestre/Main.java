package segundoTrimestre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);

		// Aqui puedes Agregar libros:
		LibroFisico libro1 = new LibroFisico("La hipotesis del amor", "Novela de Ali Hazelwood", "Sección A", 488);
		LibroFisico libro2 = new LibroFisico("Harry Potter y la Piedra Filosofal", "J.K Rowling", "Sección F", 264);
		LibroDigital libro3 = new LibroDigital("El dia que mi hermana quiso volar", "Novela de Alejandro Palomas", 3.18,
				"PDF");
		LibroDigital libro4 = new LibroDigital("Temp", " De Melanie Harllow", 3.20, "PDF");

		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		biblioteca.agregarLibro(libro4);

		boolean salir = false;

		while (!salir) {
			System.out.println("--- Menú Biblioteca ---");
			System.out.println("1. Listar libros");
			System.out.println("2. Buscar un libro por título");
			System.out.println("3. Prestar un libro");
			System.out.println("4. Devolver un libro");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1: // Listar libros
				System.out.println("Lista de libros en la biblioteca:");
				biblioteca.listarLibros();
				break;

			case 2: // Buscar un libro
				System.out.print("Introduce el título del libro que quieras buscar: ");
				String tituloBuscar = scanner.nextLine();
				Libro libroEncontrado = biblioteca.buscarLibro(tituloBuscar);
				if (libroEncontrado != null) {
					libroEncontrado.mostrarInfo();
				} else {
					System.out.println("El libro '" + tituloBuscar + "' no se encontró.");
				}
				break;

			case 3: // Solicitar el prestamo un libro
				System.out.print("Introduce el título del libro que quieras pedir prestado: ");
				String tituloPrestar = scanner.nextLine();
				biblioteca.prestarLibro(tituloPrestar);
				break;

			case 4: // Devolver un libro
				System.out.print("Introduce el título del libro que quieras devolver: ");
				String tituloDevolver = scanner.nextLine();
				biblioteca.devolverLibro(tituloDevolver);
				break;

			case 5: // Salir
				System.out.println("Saliendo del sistema...");
				salir = true;
				break;

			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		}

		scanner.close();
	}
}