package juego;

public class Tablero {

	private final char[][] tablero = new char[10][10];
	private static final char AGUA = '-';
	private static final char BARCO = 'B';
	private static final char ACIERTO = 'X';
	private static final char FALLO = '~';

	public Tablero() {
		// Inicializamos el tablero con agua
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				tablero[i][j] = AGUA;
			}
		}
	}

	public boolean colocarBarco(int fila, int columna, int tamano, char direccion) {
		if (direccion == 'H') { // Horizontal
			if (columna + tamano > 10)
				return false; // Se sale del tablero
			for (int i = 0; i < tamano; i++) {
				if (tablero[fila][columna + i] != AGUA)
					return false; // Espacio ocupado
			}
			for (int i = 0; i < tamano; i++) {
				tablero[fila][columna + i] = BARCO;
			}
		} else if (direccion == 'V') { // Vertical
			if (fila + tamano > 10)
				return false; // Se sale del tablero
			for (int i = 0; i < tamano; i++) {
				if (tablero[fila + i][columna] != AGUA)
					return false; // Espacio ocupado
			}
			for (int i = 0; i < tamano; i++) {
				tablero[fila + i][columna] = BARCO;
			}
		} else {
			return false; // Dirección inválida
		}
		return true;
	}

	public String disparar(int fila, int columna) {
		if (tablero[fila][columna] == BARCO) {
			tablero[fila][columna] = ACIERTO;
			return "Tocado";
		} else if (tablero[fila][columna] == AGUA) {
			tablero[fila][columna] = FALLO;
			return "Agua";
		} else {
			return "Tocado y hundido";
		}
	}

	public void mostrarTablero() {
		System.out.println(" 0 2 3 4 5 6 7 8 9 "); // Encabezado con los números de las columnas
		char filaLetra = 'A'; // Empezamos con la letra A para las filas
		for (int i = 0; i < 10; i++) {
			System.out.print(filaLetra + " "); // Imprimimos la letra correspondiente a la fila
			filaLetra++; // Pasamos a la siguiente letra
			for (int j = 0; j < 10; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println(); // Salto de línea al final de cada fila
		}
	}
}
