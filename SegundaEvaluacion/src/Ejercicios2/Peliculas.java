package Ejercicios2;

public class Peliculas {
	private String nombre;
	private String genero;
	private int anio;
	private int duracion; // Duración en minutos

	// Constructor
	public Peliculas(String nombre, String genero, int anio, int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.anio = anio;
		this.duracion = duracion;
	}

	// Setter para nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Setter para genero
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Peliculas{" + "nombre='" + nombre + '\'' + ", genero='" + genero + '\'' + ", año=" + anio
				+ ", duracion=" + duracion + " minutos" + '}';
	}

	public static void main(String[] args) {
		// Crear instancias de Peliculas
		Peliculas pelicula1 = new Peliculas("Venom 2", "Acción/Ciencia ficción", 2021, 120);
		Peliculas pelicula2 = new Peliculas("Men in Black 3", "Acción/Comedia", 2012, 97);

		// Modificar valores usando setters
		pelicula1.setNombre("Venom 2: Carnage Liberado");
		pelicula1.setGenero("Ciencia ficción/Comedia");

		System.out.println(pelicula1);
		System.out.println(pelicula2);
	}
}
