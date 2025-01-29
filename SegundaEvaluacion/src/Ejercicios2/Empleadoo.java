package Ejercicios2;

public abstract class Empleadoo {

	protected String nombre;
	protected double salarioBase;

	public Empleadoo(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSalario();

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario Base: " + salarioBase);
	}
}
