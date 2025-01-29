package Ejercicios2;

public class Diseñador extends Empleadoo {
	private double bonoCreatividad;

	public Diseñador(String nombre, double salarioBase, double bonoCreatividad) {
		super(nombre, salarioBase);
		this.bonoCreatividad = bonoCreatividad;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + bonoCreatividad;
	}

	public void crearDiseno() {
		System.out.println(nombre + " está creando un diseño.");
	}
}
