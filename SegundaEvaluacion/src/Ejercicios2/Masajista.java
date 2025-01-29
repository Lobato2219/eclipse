package Ejercicios2;

public class Masajista extends Empleados {
	private int numTitulos;

	public Masajista(String nombre, String dni, int anio, int numTitulos) {
		super(nombre, dni, anio);
		this.numTitulos = numTitulos;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Número de títulos: " + numTitulos);
	}
}
