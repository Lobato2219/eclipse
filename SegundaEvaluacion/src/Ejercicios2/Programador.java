package Ejercicios2;

public class Programador extends Empleadoo {

	private int horasExtra;
	private double pagoPorHoraExtra;

	public Programador(String nombre, double salarioBase, int horasExtra, double pagoPorHoraExtra) {
		super(nombre, salarioBase);
		this.horasExtra = horasExtra;
		this.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (horasExtra * pagoPorHoraExtra);
	}

	public void escribirCodigo() {
		System.out.println(nombre + " está escribiendo código.");
	}
}
