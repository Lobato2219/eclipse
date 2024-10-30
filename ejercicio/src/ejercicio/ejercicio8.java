package ejercicio;

public class ejercicio8 {
public static void main(String[]args) {
	boolean edad12 = false;
			//corregimos
	boolean edad19 = true;
	 // Operación lógica AND
    boolean edadresultado = edad12&& edad19;

    // Operación lógica OR
    boolean edadresultado2 = edad12 || edad19;

    // Operación lógica NOT
    boolean edadresultado3 = !edad12;
    boolean edadresultado4 = !edad19;

    // Imprimir los resultados en la consola
    System.out.println("Resultado de AND (edad12 && edad19): " + edadresultado);
    System.out.println("Resultado de OR (edad12 || edad19): " + edadresultado2);
    System.out.println("Resultado de NOT (!edad19): " + edadresultado3);
    System.out.println("Resultado de NOT (!edad12): " + edadresultado4); 
 }
}

