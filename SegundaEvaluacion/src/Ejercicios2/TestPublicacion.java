package Ejercicios2;

public class TestPublicacion {
	public static void main(String[] args) {
		Libro libro = new Libro();
		Revista revista = new Revista();
		Periodico periodico = new Periodico();

		libro.Titulo();
		libro.AnioSalida();
		libro.ObtenerIsbn();

		revista.Titulo();
		revista.AnioSalida();
		revista.ObtenerIsbn();

		periodico.Titulo();
		periodico.AnioSalida();
	}
}
