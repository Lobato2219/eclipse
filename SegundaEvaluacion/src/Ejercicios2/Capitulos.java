package Ejercicios2;

public class Capitulos {
	private int numero; // Número del capítulo
	private String titulo; // Título del capítulo
	private int duracion; // Duración del capítulo en minutos

	// Constructor
	public Capitulos(int numero, String titulo, int duracion) {
		this.numero = numero;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Capitulos{" + "numero=" + numero + ", titulo='" + titulo + '\'' + ", duracion=" + duracion + " minutos"
				+ '}';
	}

	public static void main(String[] args) {
		// Crear instancias de Capitulos
		Capitulos capitulo1 = new Capitulos(1, "Piloto", 45);
		Capitulos capitulo2 = new Capitulos(2, "El regreso", 50);
		Capitulos capitulo3 = new Capitulos(3, "El plan maestro", 48);

		// Modificar atributos de los capítulos
		capitulo3.setTitulo("Plan secreto");
		capitulo3.setDuracion(52);

		// Imprimir los capítulos
		System.out.println(capitulo1);
		System.out.println(capitulo2);
		System.out.println(capitulo3);
	}
}
