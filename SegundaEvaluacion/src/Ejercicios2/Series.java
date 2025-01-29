package Ejercicios2;

public class Series {
	private String nombre; // Nombre de la serie
	private String genero; // Género de la serie
	private int temporadas; // Número de temporadas
	private int capitulos; // Número total de capítulos
	private int duracion; // Duración total de la serie en minutos

	// Constructor
	public Series(String nombre, String genero, int temporadas, int capitulos, int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.temporadas = temporadas;
		this.capitulos = capitulos;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Series{" + "nombre='" + nombre + '\'' + ", genero='" + genero + '\'' + ", temporadas=" + temporadas
				+ ", capitulos=" + capitulos + ", duracion=" + duracion + " minutos" + '}';
	}

	public static void main(String[] args) {
		// Crear instancias de Series
		Series serie1 = new Series("Gotham", "Drama", 5, 100, 4500);
		Series serie2 = new Series("Stranger Things", "Terror", 4, 34, 1800);

		// Modificar atributos de las series
		serie1.setNombre("Gotham: La leyenda");
		serie2.setGenero("Ciencia ficción/Terror");

		// Imprimir las series
		System.out.println(serie1);
		System.out.println(serie2);
	}

	private void setGenero(String string) {
		// TODO Auto-generated method stub

	}

	private void setNombre(String string) {
		// TODO Auto-generated method stub

	}
}
