package Arreglos;

public class Rotacion {
	public static void main(String[] args) {
		// Crear un array de 5 números
		int[] array = { 1, 2, 3, 4, 5 };

		// Imprimir el array original
		System.out.println("Array original:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		// Almacenar el último elemento del array
		int ultimoElemento = array[array.length - 1];

		// Mover todos los demás elementos una posición hacia la derecha
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}

		// Colocar el último elemento al inicio
		array[0] = ultimoElemento;

		System.out.println("\nArray después de la rotación:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
