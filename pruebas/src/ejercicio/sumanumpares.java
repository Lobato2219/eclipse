package ejercicio;

public class sumanumpares {
	public static void main(String[] args) {
		int suma = 0;
		for (int num = 1; num <= 100; num++) {

			if (num % 2 == 0) { // Verifica si el número es par
				suma += num;

				System.out.println(" la suma de los numeros pares del 1 al 100 son: " + suma);
			}
		}
	}
}
