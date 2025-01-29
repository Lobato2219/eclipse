package Ejercicios2;

public class Empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	// Constructor para inicializar los atributos
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	// Getter para el salario
	public double getSalario() {
		return salario;
	}

	// Setter para la edad
	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Setter para el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método para sumar un plus al salario
	public void plus(double cantidad) {
		this.salario += cantidad;
	}

	// Método principal para probar la clase Empleado
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Carlos", "Martinez", 37, 800);
		Empleado empleado2 = new Empleado("", "Lopez", 50, 1800);

		// Mostramos el valor actual del salario del empleado1
		System.out.println("El salario del empleado1 es " + empleado1.getSalario());

		// Modificamos la edad del empleado1
		empleado1.setEdad(32);

		// Añadimos un plus al salario
		empleado1.plus(100);

		// Mostramos el salario actualizado
		System.out.println("El salario actual del empleado1 es " + empleado1.getSalario());

		// Modificamos el nombre del empleado2
		empleado2.setNombre("Alejandro");

		// Añadimos un plus al salario
		empleado2.plus(200);

		// Mostramos el salario actualizado del empleado2
		System.out.println("El salario del empleado2 es " + empleado2.getSalario());

	}
}
