package Ejercicios2;

public class Empleados {
	private String nombre;
	private String dni;
	private int anio;

	public Empleados(String nombre, String dni, int anio) {
		this.nombre = nombre;
		this.dni = dni;
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void pedirDatos() {
		System.out.println("Datos del empleado: ");
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Año de ingreso: " + anio);
	}

	public void examinarFicha() {
		System.out.println("Ficha del empleado está siendo examinada.");
	}
}
