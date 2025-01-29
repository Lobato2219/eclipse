package secciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Netflix {
	private List<Usuario> usuario;
	private List<Peliculas> peliculas;
	private List<Serie> series;
	private List<Juego> juegos;

	public Netflix() {
		usuario = new ArrayList<>();
		peliculas = new ArrayList<>();
		series = new ArrayList<>();
		juegos = new ArrayList<>();
	}

	public void mostrarPeliculas() {
		System.out.println("Películas disponibles:");
		for (Peliculas pelicula : peliculas) {
			System.out.println(pelicula);
		}
	}

	public void mostrarSeries() {
		System.out.println("Series disponibles:");
		for (Serie serie : series) {
			System.out.println(serie);
		}
	}

	public void mostrarJuegos() {
		System.out.println("Juegos disponibles:");
		for (Juego juego : juegos) {
			System.out.println(juego);
		}
	}

	public void mostrarMenu() {
		System.out.println("Bienvenido a Netflix");
		System.out.println("1. Mostrar Películas");
		System.out.println("2. Mostrar Series");
		System.out.println("3. Mostrar Juegos");
		System.out.println("4. Salir");
		System.out.print("Elige una opción: ");
	}

	public static void main(String[] args) {
		Netflix app = new Netflix();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		// Agregar películas
		Peliculas pelicula1 = new Peliculas("Harry Potter y el Príncipe Mestizo", "Fantasía", "David Yates", 2009, 153);
		Peliculas pelicula2 = new Peliculas("Kraven", "Accion", "J.C Chandor", 2024, 127);
		Peliculas pelicula3 = new Peliculas("Juntos y Revueltos", "Comedia", "Frank Coraci", 2014, 117);

		app.peliculas.add(pelicula1);
		app.peliculas.add(pelicula2);
		app.peliculas.add(pelicula3);

		// Agregar series con temporadas y capítulos
		Serie serie1 = new Serie("Misterio y Fantasía", "Stranger Things", 5);
		// Temporada 1
		Temporada temporada1 = new Temporada(1, 2016);
		temporada1.agregarCapitulo(new Capitulos("Capítulo 1: La desaparición de Will Byers", 1, 50, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 2: La extraña del laboratorio", 2, 45, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 3: Luces de Navidad", 3, 51, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 4: El cuerpo", 4, 48, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 5: La pulga y el acróbata", 5, 47, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 6: El monstruo", 6, 50, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 7: El baño", 7, 41, "Inglés"));
		temporada1.agregarCapitulo(new Capitulos("Capítulo 8: El mundo del revés", 8, 54, "Inglés"));

		serie1.agregarTemporada(temporada1);

		// Temporada 2
		Temporada temporada2 = new Temporada(2, 2017);
		temporada2.agregarCapitulo(new Capitulos("Capítulo 1: MADMAX", 1, 49, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 2: Truco o trato, bicho raro", 2, 55, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 3: El renacuajo", 3, 52, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 4: Will, el sabio", 4, 51, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 5: Dig Dug", 5, 55, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 6: El espía", 6, 50, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 7: La hermana perdida", 7, 44, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 8: El azote", 8, 56, "Inglés"));
		temporada2.agregarCapitulo(new Capitulos("Capítulo 9: El portal", 9, 62, "Inglés"));

		serie1.agregarTemporada(temporada2);

		// Temporada 3
		Temporada temporada3 = new Temporada(3, 2019);
		temporada3.agregarCapitulo(new Capitulos("Capítulo 1: Suzie, ¿me recibes?", 1, 51, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 2: Ratas de centro comercial", 2, 50, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 3: El caso de la socorrista desaparecida", 3, 50, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 4: El sauna", 4, 53, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 5: La fuente", 5, 53, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 6: E pluribus unum", 6, 50, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 7: La mordedura", 7, 55, "Inglés"));
		temporada3.agregarCapitulo(new Capitulos("Capítulo 8: La batalla de Starcourt", 8, 77, "Inglés"));

		serie1.agregarTemporada(temporada3);

		// Temporada 4
		Temporada temporada4 = new Temporada(4, 2022);
		temporada4.agregarCapitulo(new Capitulos("Capítulo 1: El club Hellfire", 1, 78, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 2: Maldición de Vecna", 2, 74, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 3: El monstruo y la superhéroe", 3, 67, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 4: Querido Billy", 4, 78, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 5: El proyecto Nina", 5, 75, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 6: Buceando", 6, 73, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 7: El laboratorio de Hawkins", 7, 98, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 8: Papá", 8, 85, "Inglés"));
		temporada4.agregarCapitulo(new Capitulos("Capítulo 9: El piggyback", 9, 150, "Inglés"));

		Serie serie2 = new Serie("Comedia y Drama Adolescente", "Yo Nunca", 4);

		// Temporada 1
		Temporada Temporada1 = new Temporada(1, 2020);
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 1: Pilot", 1, 27, "Inglés"));
		Temporada1
				.agregarCapitulo(new Capitulos("Capítulo 2: ... me convertí en una mala estudiante", 2, 27, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 3: ... comencé una guerra nuclear", 3, 28, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 4: ... dije que lo sentía", 4, 27, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 5: ... comencé a reventar globos", 5, 26, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 6: ... estaba cansada de ser invisible", 6, 26, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 7: ... estaba en el infierno", 7, 29, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 8: ... lo arruiné con mi mejor amiga", 8, 28, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 9: ... tuvo mi momento épico", 9, 29, "Inglés"));
		Temporada1.agregarCapitulo(new Capitulos("Capítulo 10: ... no podía decidir", 10, 30, "Inglés"));

		serie2.agregarTemporada(temporada1);

		// Temporada 2
		Temporada Temporada2 = new Temporada(2, 2021);
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 1: ... estoy de vuelta, baby", 1, 30, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 2: ... supliqué por el afecto de Ben", 2, 28, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 3: ... tenía una crisis de identidad", 3, 29, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 4: ... estaba enamorada de mi madre", 4, 28, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 5: ... me molesté con alguien en línea", 5, 29, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 6: ... fui una mala dama de honor", 6, 30, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 7: ... tuve un novio secreto", 7, 29, "Inglés"));
		Temporada2.agregarCapitulo(
				new Capitulos("Capítulo 8: ... estoy siendo juzgada por mi sexualidad", 8, 30, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 9: ... tuve un pequeño desliz", 9, 30, "Inglés"));
		Temporada2.agregarCapitulo(new Capitulos("Capítulo 10: ... dije que lo siento", 10, 32, "Inglés"));

		serie2.agregarTemporada(temporada2);

		// Temporada 3
		Temporada Temporada3 = new Temporada(3, 2022);
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 1: ... rompí las reglas", 1, 29, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 2: ... jugué con fuego", 2, 30, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 3: ... me volví viral", 3, 28, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 4: ... no estaba lista", 4, 30, "Inglés"));
		Temporada3.agregarCapitulo(
				new Capitulos("Capítulo 5: ... estuve atrapada en un triángulo amoroso", 5, 30, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 6: ... era una dama de honor pésima", 6, 29, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 7: ... tuve problemas de confianza", 7, 29, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 8: ... encontré una pieza que faltaba", 8, 28, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 9: ... tuve que madurar", 9, 30, "Inglés"));
		Temporada3.agregarCapitulo(new Capitulos("Capítulo 10: ... tomé una decisión importante", 10, 32, "Inglés"));
		serie2.agregarTemporada(temporada3);

		// Temporada 4
		Temporada Temporada4 = new Temporada(4, 2023);
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 1: ... finalmente tenía todo", 1, 30, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 2: ... quise deshacerme de Paxton", 2, 28, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 3: ... estaba en modo fiesta", 3, 29, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 4: ... tuve que decidir entre chicos", 4, 30, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 5: ... me enfrenté a mi peor miedo", 5, 31, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 6: ... fue el mejor día de mi vida", 6, 30, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 7: ... obtuve mi gran momento", 7, 32, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 8: ... tomé una decisión adulta", 8, 31, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 9: ... me di cuenta de que crecí", 9, 30, "Inglés"));
		Temporada4.agregarCapitulo(new Capitulos("Capítulo 10: ... dije adiós", 10, 33, "Inglés"));

		serie2.agregarTemporada(temporada4);

		app.series.add(serie1);
		app.series.add(serie2);

		// Agregar juegos
		Juego juego1 = new Juego("GTA V", "Acción", "PC/Consola");
		Juego juego2 = new Juego("God of War", "Aventura", "PC/Consola");
		Juego juego3 = new Juego("Call of Duty", "FPS", "PC/Consola");

		app.juegos.add(juego1);
		app.juegos.add(juego2);
		app.juegos.add(juego3);

		while (!exit) {
			app.mostrarMenu();
			int opcion = scanner.nextInt();
			scanner.nextLine();
			switch (opcion) {
			case 1:
				System.out.println("Lista de Películas: ");
				app.mostrarPeliculas();
				break;
			case 2:
				System.out.println("Lista de Series: ");
				app.mostrarSeries();
				break;
			case 3:
				System.out.println("Lista de Juegos: ");
				app.mostrarJuegos();
				break;
			case 4:
				System.out.println("Saliendo del sistema...");
				exit = true;
				break;
			default:
				System.out.println("Opción no válida. Inténtalo de nuevo.");
				break;
			}
		}

		scanner.close();
		System.out.println("Gracias por usar Netflix.");
	}
}
