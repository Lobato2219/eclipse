package Ejercicios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("ELIGE LA OPCIÓN QUE DESEAS");
		System.out.println("1. PARA MOSTRAR UNA PELÍCULA");
		System.out.println("2. PARA MOSTRAR UNA SERIE Y SUS TEMPORADAS");
		System.out.println("3. PARA SALIR");

		int opcion = leer.nextInt();
		leer.nextLine(); // Limpiar buffer

		switch (opcion) {
		case 1:
			// Crear y mostrar información de una película
			Pelicula pelicula = new Pelicula("El Señor de los Anillos", "Fantasía", 2001, 180);
			System.out.println(pelicula);
			break;

		case 2:
			// Crear una serie con temporadas y capítulos
			Serie serie = new Serie("Breaking Bad", "Drama");
			Temporada temporada1 = new Temporada(1);
			temporada1.addCapitulo(new Capitulo(1, 58));
			temporada1.addCapitulo(new Capitulo(2, 47));

			Temporada temporada2 = new Temporada(2);
			temporada2.addCapitulo(new Capitulo(1, 50));
			temporada2.addCapitulo(new Capitulo(2, 53));

			serie.addTemporada(temporada1);
			serie.addTemporada(temporada2);

			// Mostrar serie y sus temporadas
			System.out.println(serie);
			break;

		case 3:
			System.out.println("¡Hasta luego!");
			break;

		default:
			System.out.println("La opción elegida no es la correcta");
		}

		leer.close();
	}
}

// Clase Película
class Pelicula {
	private String nombre;
	private String genero;
	private int anio;
	private int duracion; // Duración en minutos

	public Pelicula(String nombre, String genero, int anio, int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.anio = anio;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula{" + "nombre='" + nombre + '\'' + ", genero='" + genero + '\'' + ", año=" + anio + ", duracion="
				+ duracion + " minutos" + '}';
	}
}

// Clase Serie
class Serie {
	private String nombre;
	private String genero;
	private ArrayList<Temporada> temporadas;

	public Serie(String nombre, String genero) {
		this.nombre = nombre;
		this.genero = genero;
		this.temporadas = new ArrayList<>();
	}

	public void addTemporada(Temporada temporada) {
		temporadas.add(temporada);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Serie{");
		sb.append("nombre='").append(nombre).append('\'');
		sb.append(", genero='").append(genero).append('\'');
		sb.append(", temporadas=\n");
		for (Temporada t : temporadas) {
			sb.append(t).append('\n');
		}
		sb.append('}');
		return sb.toString();
	}
}

// Clase Temporada
class Temporada {
	private int numero;
	private ArrayList<Capitulo> capitulos;

	public Temporada(int numero) {
		this.numero = numero;
		this.capitulos = new ArrayList<>();
	}

	public void addCapitulo(Capitulo capitulo) {
		capitulos.add(capitulo);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Temporada ").append(numero).append(":\n");
		for (Capitulo c : capitulos) {
			sb.append(c).append('\n');
		}
		return sb.toString();
	}
}

// Clase Capítulo
class Capitulo {
	private int numero;
	private int duracion; // Duración en minutos

	public Capitulo(int numero, int duracion) {
		this.numero = numero;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Capitulo{" + "numero=" + numero + ", duracion=" + duracion + " minutos" + '}';
	}
}
