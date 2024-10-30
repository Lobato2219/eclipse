package Arreglos;

public class sumaArreglos {

	public static void main(String[] args) {
		// Crear un array de 5 números enteros
		int[] numeros = { 10, 20, 30, 40, 50 };

		// Variable para almacenar la suma
		int suma = 0;

		// Bucle para iterar sobre el array y sumar los elementos
		for (int numero : numeros) {
			suma += numero;
		}

		// Mostrar el resultado
		System.out.println("La suma de los elementos del array es: " + suma);
	}
}
