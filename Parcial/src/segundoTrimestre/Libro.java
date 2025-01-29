package segundoTrimestre;

public abstract class Libro {
	private String titulo;
	private String autor;
	private boolean disponible;

	// Constructor
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = true;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isDisponible() {
		return disponible;
	}

	// Setter
	protected void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	protected void mostrarInfo() {
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
	}

	protected void prestar() {
		if (disponible) {
			disponible = false;
			System.out.println("El libro '" + titulo + "' ha sido prestado.");
		} else {
			System.out.println("El libro '" + titulo + "' no está disponible.");
		}
	}

	protected void devolver() {
		disponible = true;
		System.out.println("El libro '" + titulo + "' ha sido devuelto.");
	}
}
