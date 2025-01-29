package Ejercicios2;

public class Avion extends Vehiculo {

	@Override
	public void velocidad() {
		System.out.println(
				"Por ejemplo un avion comun sus velocidades pueden variar desde aproximadamente 240 km/h durante el despegue. ");

	}

	@Override
	public void capacidad() {
		System.out.println("Hasta 400 personas puede llevar un avion.");

	}

	public void volar() {
		System.out.println("Puede volar hasta 890 km/h como maximo.");
	}

	public static void main(String[] args) {
		Vehiculo avion = new Avion();
		avion.velocidad();
		avion.capacidad();
		if (avion instanceof Avion) {
			((Avion) avion).volar();
		}
	}

}
