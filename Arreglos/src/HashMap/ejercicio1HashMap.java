package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ejercicio1HashMap {

	public static void main(String[] args) {
		// Array de cadenas con palabras
		String[] palabras = { "manzana", "banana", "pera", "manzana", "naranja", "banana", "pera", "manzana" };

		// Crear un HashMap para almacenar la frecuencia de cada palabra
		HashMap<String, Integer> frecuenciaPalabras = new HashMap<>();

		// Contar la frecuencia de cada palabra
		for (String palabra : palabras) {
			// Si la palabra ya está en el HashMap, incrementa su valor en 1
			if (frecuenciaPalabras.containsKey(palabra)) {
				frecuenciaPalabras.put(palabra, frecuenciaPalabras.get(palabra) + 1);
			} else {
				// Si la palabra no está en el HashMap, agrégala con un valor inicial de 1
				frecuenciaPalabras.put(palabra, 1);
			}
		}

		// Imprimir la frecuencia de cada palabra
		System.out.println("Frecuencia de palabras:");
		for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
	}
}
