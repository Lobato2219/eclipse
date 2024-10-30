package Arreglos;

public class ContarVocales {
	public static void main(String[] args) {
		// Crear un array de caracteres que contiene una cadena
		char[] caracteres = "Contar Vocales en un Array".toCharArray();

		// Inicializar un contador para las vocales
		int contadorVocales = 0;

		// Recorrer el array de caracteres
		for (int i = 0; i < caracteres.length; i++) {
			char c = caracteres[i];

			// Comprobar si el carácter es una vocal (mayúscula o minúscula)
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				contadorVocales++;
			}
		}

		System.out.println("Número total de vocales: " + contadorVocales);
	}
}
