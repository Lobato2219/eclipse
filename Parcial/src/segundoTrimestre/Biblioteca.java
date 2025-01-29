package segundoTrimestre;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> listaLibros = new ArrayList<>();

	public void agregarLibro(Libro libro) {
		listaLibros.add(libro);
		System.out.println("Libro agregado: " + libro.getTitulo());
	}

	public void listarLibros() {
		if (listaLibros.isEmpty()) {
			System.out.println("No hay libros en la biblioteca.");
			return;
		}

		System.out.println("--- Lista de Libros en la Biblioteca ---");
		for (Libro l : listaLibros) {
			l.mostrarInfo();
			System.out.println("-------------------");
		}
	}

	public Libro buscarLibro(String titulo) {
		for (Libro libro : listaLibros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				return libro;
			}
		}
		return null;
	}

	public void prestarLibro(String titulo) {
		Libro libro = buscarLibro(titulo);
		if (libro != null) {
			libro.prestar();
		} else {
			System.out.println("El libro '" + titulo + "' no se encontró.");
		}
	}

	public void devolverLibro(String titulo) {
		Libro libro = buscarLibro(titulo);
		if (libro != null) {
			libro.devolver();
		} else {
			System.out.println("El libro '" + titulo + "' no se encontró.");
		}
	}
}
