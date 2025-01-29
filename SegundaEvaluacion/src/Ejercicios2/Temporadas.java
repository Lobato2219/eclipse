package Ejercicios2;

public class Temporadas {
	private int numero; // Número de la temporada
	private int capitulos; // Número total de capítulos en la temporada
	private int duracion; // Duración total de la temporada en minutos

	// Constructor
	public Temporadas(int numero, int capitulos, int duracion) {
		this.numero = numero;
		this.capitulos = capitulos;
		this.duracion = duracion;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Temporadas{" + "numero=" + numero + ", capitulos=" + capitulos + ", duracion=" + duracion + " minutos"
				+ '}';
	}

	public static void main(String[] args) {
		// Crear instancias de Temporadas
		Temporadas temporada1 = new Temporadas(1, 22, 990);
		Temporadas temporada2 = new Temporadas(2, 20, 900);
		Temporadas temporada3 = new Temporadas(3, 10, 500);

		// Modificar atributos de las temporadas
		temporada3.setCapitulos(12);
		temporada3.setDuracion(600);

		// Imprimir las temporadas
		System.out.println(temporada1);
		System.out.println(temporada2);
		System.out.println(temporada3);
	}
}
