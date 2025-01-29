package Ejercicios2;

public class Jugador extends Empleados {
	private String dorsal;
	private String demarcacion;

	public Jugador(String nombre, String dni, int anio, String dorsal, String demarcacion) {
		super(nombre, dni, anio);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	@Override
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Dorsal: " + dorsal);
		System.out.println("Demarcación: " + demarcacion);
	}
}
