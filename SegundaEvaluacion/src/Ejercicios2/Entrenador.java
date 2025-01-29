package Ejercicios2;

public class Entrenador extends Empleados {
	private String idFederacion;

	public Entrenador(String nombre, String dni, int anio, String idFederacion) {
		super(nombre, dni, anio);
		this.idFederacion = idFederacion;
	}

	@Override
	public void mostrarDatos() {
		// Llama al método de la clase base para mostrar los datos comunes
		super.mostrarDatos();
		// Agrega los datos específicos de la clase Entrenador
		System.out.println("ID de Federación: " + idFederacion);
	}
}
