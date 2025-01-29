package Ejercicios2;

public class Canciones2 {
	private String nombreCancion;
	private String grupoMusica;
	private int anioPublicacion;

	// Constructor
	public Canciones2(String nombreCancion, String grupoMusica, int anioPublicacion) {
		this.nombreCancion = nombreCancion;
		this.grupoMusica = grupoMusica;
		this.anioPublicacion = anioPublicacion;
	}

	// Getters y Setters
	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	public String getGrupoMusica() {
		return grupoMusica;
	}

	public void setGrupoMusica(String grupoMusica) {
		this.grupoMusica = grupoMusica;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
}
