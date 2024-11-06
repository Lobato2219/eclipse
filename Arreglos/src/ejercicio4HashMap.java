package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ejercicio4HashMap {

	public static void eliminarElementosMenores(HashMap<String, Integer> mapa, int limite) {
		// evitamos errores de modificación concurrente al eliminar elementos
		Iterator<Map.Entry<String, Integer>> iterador = mapa.entrySet().iterator();

		while (iterador.hasNext()) {
			Map.Entry<String, Integer> entrada = iterador.next();
			if (entrada.getValue() < limite) {
				iterador.remove(); // Elimina la entrada si el valor es menor al límite
			}
		}
	}

	public static void main(String[] args) {
		// Crear un HashMap de ejemplo con algunos valores
		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("A", 10);
		mapa.put("B", 5);
		mapa.put("C", 20);
		mapa.put("D", 15);
		mapa.put("E", 3);

		// Pedir al usuario que ingrese el límite
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el límite para eliminar elementos: ");
		int limite = scanner.nextInt();

		// Mostrar el HashMap original
		System.out.println("HashMap original: " + mapa);

		// Llamar al método para eliminar elementos menores al límite dado
		eliminarElementosMenores(mapa, limite);

		System.out.println("HashMap después de eliminar elementos menores a " + limite + ": " + mapa);
	}
}