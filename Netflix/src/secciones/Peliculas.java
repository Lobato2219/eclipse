package secciones;

import java.util.ArrayList;
import java.util.List;

public class Peliculas {

	private String nombre;
	private String genero;
	private String director;
	private int anio;
	private int duracion;
	private List<Usuario> usuariosFavoritos;

	public Peliculas(String nombre, String genero, String director, int anio, int duracion) {
		this.nombre = nombre;
		this.genero = genero;
		this.director = director;
		this.anio = anio;
		this.duracion = duracion;
		this.usuariosFavoritos = new ArrayList<>();
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	private void MostrarInfo() {
		System.out.println("titulo: " + nombre);
		System.out.println("genero: " + genero);
		System.out.println("director: " + director);
		System.out.println("anio: " + anio);
		System.out.println("duracion: " + duracion);
	}

	public List<Usuario> getUsuariosFavoritos() {
		return usuariosFavoritos;
	}

	public void addUsuarioFavorito(Usuario usuario) {
		this.usuariosFavoritos.add(usuario);
	}

	@Override
	public String toString() {
		return "Título: " + nombre + ", Género: " + genero + ", Director: " + director + ", Año: " + anio
				+ ", Duración: " + duracion + " minutos";
	}
}
