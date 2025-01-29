package juego;

import java.util.Scanner;

public class Juego {

	private final Tablero tablero = new Tablero();
	private final Scanner scanner = new Scanner(System.in);

	public void iniciar() {
		boolean jugando = true;
		while (jugando) {
			System.out.println("Menú:");
			System.out.println("1. Colocar barco");
			System.out.println("2. Realizar disparo");
			System.out.println("3. Mostrar tablero");
			System.out.println("4. Salir");
			System.out.print("Elige una opción: ");
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1 -> colocarBarco();
			case 2 -> realizarDisparo();
			case 3 -> tablero.mostrarTablero();
			case 4 -> {
				System.out.println("¡Gracias por jugar!");
				jugando = false;
			}
			default -> System.out.println("Opción inválida. Intenta de nuevo.");
			}
		}
	}

	private void colocarBarco() {
		System.out.print("Introduce la fila (0-9): ");
		int fila = scanner.nextInt();
		System.out.print("Introduce la columna (0-9): ");
		int columna = scanner.nextInt();
		System.out.print("Introduce el tamaño del barco: ");
		int tamano = scanner.nextInt();
		System.out.print("Introduce la dirección (H para horizontal, V para vertical): ");
		char direccion = scanner.next().toUpperCase().charAt(0);

		if (tablero.colocarBarco(fila, columna, tamano, direccion)) {
			System.out.println("Barco colocado con éxito.");
		} else {
			System.out.println("No se pudo colocar el barco. Verifica los datos.");
		}
	}

	private void realizarDisparo() {
		System.out.print("Introduce la fila (0-9): ");
		int fila = scanner.nextInt();
		System.out.print("Introduce la columna (0-9): ");
		int columna = scanner.nextInt();

		System.out.println(tablero.disparar(fila, columna));
	}
}