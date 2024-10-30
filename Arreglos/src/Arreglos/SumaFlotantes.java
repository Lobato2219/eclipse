package Arreglos;

public class SumaFlotantes {
	public static void main(String[] args) {
		float[] numeros = { 3.7f, 1.8f, 4.5f, 2.0f, 0.9f, 6.3f };

		// Variable para almacenar la suma de los elementos
		float suma = 0;

		// Recorremos el array sumando sus elementos
		for (float numero : numeros) {
			suma += numero; // Vamos sumando cada valor del array a la suma
		}

		// Una vez tenemos la suma total, calculamos el promedio
		float promedio = suma / numeros.length;

		// Mostramos el resultado
		System.out.println("El promedio de los números es: " + promedio);
	}
}
