package Ejercicios2;

public class Pajaro extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println("El pajaro pia: Pio Pio");
	}

	@Override
	public void moverse() {
		System.out.println("El pajaro vuela gracias a sus alas");
	}

	public static void main(String[] args) {
		Animal pajaro = new Pajaro();

		pajaro.hacerSonido();
		pajaro.moverse();
	}
}
