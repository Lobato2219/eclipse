package Arreglos;

public class invertir {
	public static void main(String[] args) {
		// Crear un array de 5 números
		int[] numeros = { 10, 20, 30, 40, 50 };

		// Crear un nuevo array para almacenar los números en orden inverso
		int[] numerosInvertidos = new int[numeros.length];

		// Usar un bucle para recorrer el array original desde el final hasta el
		// principio
		for (int i = 0; i < numeros.length; i++) {
			numerosInvertidos[i] = numeros[numeros.length - 1 - i];
		}

		// Imprimir el nuevo array invertido
		System.out.println("El array invertido es: ");
		for (int numero : numerosInvertidos) {
			System.out.print(numero + " ");
		}
	}
}
