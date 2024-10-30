package ejercicio;

public class ejercicio6 {
	    public static void main(String[] args) {
	        // Declaración e inicialización de las variables
	        int a = 5;
	        int b = 10;

	        // Imprimir los valores antes del intercambio
	        System.out.println("Antes del intercambio:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Intercambiar los valores sin usar una variable temporal
	        a = a + b;  // a ahora es la suma de ambos valores
	        b = a - b;  // b obtiene el valor original de a
	        a = a - b;  // a obtiene el valor original de b

	        // Imprimir los valores después del intercambio
	        System.out.println("Después del intercambio:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
	}


