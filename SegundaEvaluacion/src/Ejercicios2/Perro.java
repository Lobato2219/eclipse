package Ejercicios2;

public class Perro extends Animal {

	@Override
	public void hacerSonido() {
		System.out.println("EL perro ladra: Guau guau");
	}

	@Override
	public void moverse() {
		System.out.println("El perro corre rapidamente a sus 4 patas");

	}

	public static void main(String[] args) {
		Animal perro = new Perro();
		perro.hacerSonido();
		perro.moverse();
	}
}
