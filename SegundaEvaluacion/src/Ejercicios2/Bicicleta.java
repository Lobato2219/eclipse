package Ejercicios2;

public class Bicicleta extends Vehiculo {

	@Override
	public void velocidad() {
		System.out.println("La bicicleta va a un máximo de 10 km por hora.");
	}

	public void capacidad() {
		System.out.println("La bicicleta tiene la capacidad de llevar a dos personas máximo.");
	}

	public void pirueta() {
		System.out.println("La bicicleta hace una pirueta.");
	}

	public static void main(String[] args) {
		Vehiculo bicicleta = new Bicicleta(); // Polimorfismo
		bicicleta.velocidad();
		bicicleta.capacidad();
		if (bicicleta instanceof Bicicleta) {
			((Bicicleta) bicicleta).pirueta();
		}
	}

}
