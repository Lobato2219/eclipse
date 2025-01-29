package secciones;

public class Capitulos {

	private int numero;
	private String nombre;
	private int duracion;
	private String idioma;

	public Capitulos(String nombre, int numero, int duracion, String idioma) {
		this.nombre = nombre;
		this.numero = numero;
		this.duracion = duracion;
		this.idioma = idioma;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String toString() {
		return "Título del Capítulo: " + nombre + ", Duración: " + duracion + " minutos, Episodio Nº: " + numero
				+ " , idioma: " + idioma;
	}
}
