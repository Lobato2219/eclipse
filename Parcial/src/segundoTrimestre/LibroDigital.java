package segundoTrimestre;

public class LibroDigital extends Libro {
	private double tamanoArchivo; // en MB
	private String formato; // PDF, EPUB, etc.

	// Constructor
	public LibroDigital(String titulo, String autor, double tamanoArchivo, String formato) {
		super(titulo, autor);
		this.tamanoArchivo = tamanoArchivo;
		this.formato = formato;
	}

	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tamaño del archivo: " + tamanoArchivo + " MB");
		System.out.println("Formato: " + formato);
	}
}
