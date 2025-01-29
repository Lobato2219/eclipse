package Ejercicios2;

public class Gerente extends Empleadoo {

	private double bonificacionGerente;

	public Gerente(String nombre, double salarioBase, double bonificacionGerente) {
		super(nombre, salarioBase);
		this.bonificacionGerente = bonificacionGerente;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + bonificacionGerente;
	}

	public void liderarReunion() {
		System.out.println(nombre + " está liderando una reunión.");
	}

}
