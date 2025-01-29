package Ejercicios2;

public class Revista extends Publicacion implements Isbn {

	@Override
	public void ObtenerIsbn() {
		System.out.println(" ISBN 10 8461245377");

	}

	@Override
	protected void Titulo() {
		System.out.println("Revista Vogue");

	}

	@Override
	protected void AnioSalida() {
		System.out.println("Año de publicación 2017");

	}

}
