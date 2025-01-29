package segundoTrimestre;

public class LibroFisico extends Libro {

	private String ubicacion;
	private int numPaginas;

	public LibroFisico(String titulo, String autor, String ubicacion, int numPaginas) {
		super(titulo, autor);
		this.ubicacion = ubicacion;
		this.numPaginas = numPaginas;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Ubicacion: " + ubicacion + "seccion estanteria");
		System.out.println("numPaginas" + numPaginas);
	}

}
