package Ejercicios2;

public class TestEmpleados {
	public static void main(String[] args) {
		// Crear instancias de cada tipo de empleado
		Gerente gerente = new Gerente("Laura", 5000, 600);
		Programador programador = new Programador("Carlos", 3000, 10, 50);
		Diseñador diseñador = new Diseñador("Ana", 2500, 800);

		// Mostrar información y salario de cada empleado
		gerente.mostrarInformacion();
		System.out.println("Salario total: " + gerente.calcularSalario());
		gerente.liderarReunion(); // Método específico
		System.out.println();

		programador.mostrarInformacion();
		System.out.println("Salario total: " + programador.calcularSalario());
		programador.escribirCodigo(); // Método específico
		System.out.println();

		diseñador.mostrarInformacion();
		System.out.println("Salario total: " + diseñador.calcularSalario());
		diseñador.crearDiseno(); // Método específico
	}
}
