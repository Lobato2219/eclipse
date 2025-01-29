package Ejercicios2;

public class Libro extends Publicacion implements Isbn {

	@Override
	protected void Titulo() {
		System.out.println("Titulo: La hipótesis del amor.");
	}

	@Override
	protected void AnioSalida() {
		System.out.println("Fecha salida: 14 de septiembre de 2021.");
	}

	@Override
	public void ObtenerIsbn() {
		System.out.println("Isbn: 9788418945182.");

	}

}
