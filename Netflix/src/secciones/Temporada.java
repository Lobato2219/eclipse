package secciones;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
	private int numero;
	private int anio;
	private List<Capitulos> capitulos;

	public Temporada(int numero, int anio) {
		this.numero = numero;
		this.anio = anio;
		this.capitulos = new ArrayList<>();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public List<Capitulos> getCapitulos() {
		return capitulos;
	}

	public void agregarCapitulo(Capitulos capitulo) {
		capitulos.add(capitulo);
	}

	public int numeroCapitulos() {
		return capitulos.size();
	}

	@Override
	public String toString() {
		StringBuilder capitulosStr = new StringBuilder();
		for (Capitulos capitulo : capitulos) {
			capitulosStr.append(capitulo.toString()).append("\n");
		}
		return "Temporada " + numero + " (" + anio + ") - " + numeroCapitulos() + " capítulos\n"
				+ capitulosStr.toString();
	}

}
