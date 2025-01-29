package ejercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MatriculaSiguiente {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Lista de letras válidas para la matrícula
		ArrayList<Character> letrasValidas = new ArrayList<>(Arrays.asList('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L',
				'M', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'));

		while (true) {
			// Pedir los 4 dígitos de la matrícula
			System.out.print("Introduce los 4 dígitos de la matrícula (0000 - 9999): ");
			String numeroStr = scanner.nextLine().trim();
			if (numeroStr.equals("9999")) {
				System.out.print("Introduce las 3 letras de la matrícula (ZZZ para terminar): ");
				String letrasStr = scanner.nextLine().trim().toUpperCase();
				if (letrasStr.equals("ZZZ")) {
					break;
				}
			}

			// Validar el número de 4 dígitos
			if (!numeroStr.matches("\\d{4}")) {
				System.out.println("Error: Debes ingresar exactamente 4 dígitos.");
				continue;
			}

			int numero = Integer.parseInt(numeroStr);

			// Pedir y validar las 3 letras de la matrícula
			System.out.print("Introduce las 3 letras de la matrícula (ej. BBB): ");
			String letrasStr = scanner.nextLine().trim().toUpperCase();
			if (!letrasStr.matches("[BCDFGHJKLMPRSTVWXYZ]{3}")) {
				System.out.println("Error: Debes ingresar exactamente 3 letras válidas (sin vocales ni N).");
				continue;
			}

			// Convertir las letras a un array de caracteres
			char[] letras = letrasStr.toCharArray();

			// Incrementar la matrícula
			if (numero == 9999) {
				numero = 0;
				for (int i = 2; i >= 0; i--) {
					int index = letrasValidas.indexOf(letras[i]);
					if (index == letrasValidas.size() - 1) {
						letras[i] = 'B'; // Reiniciar la letra al principio de la lista
					} else {
						letras[i] = letrasValidas.get(index + 1); // Pasar a la siguiente letra
						break;
					}
				}
			} else {
				numero++;
			}

			// Mostrar la siguiente matrícula
			System.out.printf("Siguiente matrícula: %04d %c%c%c%n", numero, letras[0], letras[1], letras[2]);
		}

		scanner.close();
	}
}