package Ejercicios2;

public class Gato extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println("EL gato maulla: miaauu miaauuu");
	}

	@Override
	public void moverse() {
		System.out.println("El gato camina sigilosamente");
	}

	public static void main(String[] args) {
		Animal gato = new Gato();

		gato.hacerSonido();
		gato.moverse();
	}
}
