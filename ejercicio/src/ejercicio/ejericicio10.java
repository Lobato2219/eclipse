package ejercicio;

public class ejericicio10 {
	    public static void main(String[] args) {
	        // Declaración e inicialización de las variables
	        double precioProducto = 100.0;  // Precio del producto
	        double porcentajeIVA = 21.0;    // Porcentaje del IVA (21%)

	        // Calcular el valor del IVA y el precio final
	        double iva = precioProducto * (porcentajeIVA / 100);
	        double precioFinal = precioProducto + iva;

	        // Mostrar el precio final en pantalla
	        System.out.println("El precio del producto es: " + precioProducto + " euros.");
	        System.out.println("El IVA es: " + iva + " euros.");
	        System.out.println("El precio final con IVA incluido es: " + precioFinal + " euros.");
	    }
	}


