package secciones;

import java.util.ArrayList;
import java.util.List;

public class Serie {
	private String genero;
	private String nombre;
	private List<Temporada> temporadas;

	public Serie(String genero, String nombre) {
		this.genero = genero;
		this.nombre = nombre;
		this.temporadas = new ArrayList<>();
	}

	public Serie(String genero, String nombre, int numeroTemporadas) {
		this(genero, nombre); // Llama al constructor principal
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Temporada> getTemporadas() {
		return temporadas;
	}

	public void agregarTemporada(Temporada temporada) {
		temporadas.add(temporada);
	}

	public int numeroTemporadas() {
		return temporadas.size();
	}

	@Override
	public String toString() {
		StringBuilder temporadasStr = new StringBuilder();
		for (Temporada temporada : temporadas) {
			temporadasStr.append(temporada.toString()).append("\n");
		}
		return nombre + " - " + genero + " - " + numeroTemporadas() + " temporadas\n" + temporadasStr.toString();
	}

}
