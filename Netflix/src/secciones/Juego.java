package secciones;

class Juego {
	private String nombre;
	private String genero;
	private String plataforma;

	public Juego(String nombre, String genero, String plataforma) {
		this.nombre = nombre;
		this.genero = genero;
		this.plataforma = plataforma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return nombre + " - " + genero + " - Plataforma: " + plataforma;
	}
}
