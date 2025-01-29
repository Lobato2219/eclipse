package Ejercicios2;

public class Coche extends Vehiculo {

	@Override
	public void velocidad() {
		System.out.println("Depende del caballaje.");

	}

	@Override
	public void capacidad() {
		System.out.println("Normalmente tiene una capacidad de llevar a 5 personas.");

	}

	public static void main(String[] args) {
		Vehiculo coche = new Coche();
		coche.velocidad();
		coche.capacidad();
	}
}
