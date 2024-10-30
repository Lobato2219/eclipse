package ejercicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimiclubCatalogo extends JFrame {

	// Constructor del JFrame
	public PrimiclubCatalogo() {
		// Configuración del JFrame
		setTitle("Catálogo de Primiclub");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		// Etiqueta de bienvenida
		JLabel etiquetaTitulo = new JLabel("Catálogo de Primiclub");
		etiquetaTitulo.setBounds(130, 10, 200, 30);
		add(etiquetaTitulo);

		// ComboBox para el catálogo
		JLabel etiquetaCatalogo = new JLabel("Selecciona una película:");
		etiquetaCatalogo.setBounds(50, 50, 200, 20);
		add(etiquetaCatalogo);

		String[] peliculas = { "El Señor de los Anillos", "Matrix", "Avatar", "Inception", "Titanic" };
		JComboBox<String> comboBoxPeliculas = new JComboBox<>(peliculas);
		comboBoxPeliculas.setBounds(50, 80, 200, 30);
		add(comboBoxPeliculas);

		// Botón para seleccionar versión física
		JButton botonFisico = new JButton("Versión Física");
		botonFisico.setBounds(50, 130, 130, 30);
		add(botonFisico);

		// Botón para seleccionar versión digital
		JButton botonDigital = new JButton("Versión Digital");
		botonDigital.setBounds(200, 130, 130, 30);
		add(botonDigital);

		// Etiqueta para mostrar la selección del usuario
		JLabel etiquetaResultado = new JLabel("Selecciona una opción.");
		etiquetaResultado.setBounds(50, 180, 300, 30);
		add(etiquetaResultado);

		// Acción del botón "Versión Física"
		botonFisico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peliculaSeleccionada = (String) comboBoxPeliculas.getSelectedItem();
				etiquetaResultado.setText("Has seleccionado la versión física de: " + peliculaSeleccionada);
			}
		});

		// Acción del botón "Versión Digital"
		botonDigital.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peliculaSeleccionada = (String) comboBoxPeliculas.getSelectedItem();
				etiquetaResultado.setText("Has seleccionado la versión digital de: " + peliculaSeleccionada);
			}
		});

		// Hacer visible el JFrame
		setVisible(true);
	}

	// Método principal
	public static void main(String[] args) {
		// Crear una instancia del JFrame
		new PrimiclubCatalogo();
	}
}
