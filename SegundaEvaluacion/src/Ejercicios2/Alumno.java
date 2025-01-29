package Ejercicios2;

public class Alumno {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private int edad;

	public Alumno(String nombre, String apel1, String apel2, String dni, int edad) {
		this.nombre = nombre;
		this.apellido1 = apel1;
		this.apellido2 = apel2;
		this.dni = dni;
		this.edad = edad;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	// Setter para el nombre
	public void setdni(String dni) {
		this.dni = dni;
	}

	public String toString() {
		return "Alumno{" + "nombre='" + nombre + '\'' + ", apellido1='" + apellido1 + '\'' + ", apellido2='" + apellido2
				+ '\'' + ", dni='" + dni + '\'' + ", edad=" + edad + '}';
	}

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Esperanza", "Lobato", "Gonzalez", "XXXXXXXXXD", 19);
		Alumno alumno2 = new Alumno("Diego", "Santaliestra", " ", "XXXXXXXXXXB", 18);

		alumno2.setApellido2("Garcia");
		alumno1.setdni("06325630D");

		System.out.println(alumno1);
		System.out.println(alumno2);

	}

}
