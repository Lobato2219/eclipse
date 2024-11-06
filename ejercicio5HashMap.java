package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ejercicio5HashMap {

	public static <K, V> Map<V, K> invertirMapa(Map<K, V> mapaOriginal) {
		Map<V, K> mapaInvertido = new HashMap<>();

		// Iterar sobre las entradas del mapa original y agregar a mapaInvertido
		for (Map.Entry<K, V> entrada : mapaOriginal.entrySet()) {
			mapaInvertido.put(entrada.getValue(), entrada.getKey());
		}

		return mapaInvertido;
	}

	public static void main(String[] args) {
		// Crear un HashMap de ejemplo
		Map<String, Integer> mapaOriginal = new HashMap<>();
		mapaOriginal.put("a", 1);
		mapaOriginal.put("b", 2);
		mapaOriginal.put("c", 3);

		// Imprimir el HashMap original
		System.out.println("HashMap original: " + mapaOriginal);

		// Invertir el HashMap
		Map<Integer, String> mapaInvertido = invertirMapa(mapaOriginal);

		// Imprimir el HashMap invertido
		System.out.println("HashMap invertido: " + mapaInvertido);
	}
}
