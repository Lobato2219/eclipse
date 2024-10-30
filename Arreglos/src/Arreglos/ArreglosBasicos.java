package Arreglos;

public class ArreglosBasicos {
	public static void main(String[] args) {
		// Declaración y inicialización de un arreglo de enteros
		int[] numeros = { 10, 20, 30, 40, 50 };
		// Acceso a los elementos del arreglo
		System.out.println("El primer elemento es: " + numeros[0]); // Imprime 10
		System.out.println("El segundo elemento es: " + numeros[1]); // Imprime 20
		// Modificación de un elemento del arreglo
		numeros[2] = 100;
		System.out.println("El tercer elemento modificado es: " + numeros[2]); // Imprime 100
	}
}
