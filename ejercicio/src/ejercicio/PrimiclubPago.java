package ejercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimiclubPago extends JFrame {

	// Constructor del JFrame
	public PrimiclubPago() {
		// Configuración del JFrame
		setTitle("Método de Pago - Primiclub");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		// Cambiar el color de fondo del JFrame
		getContentPane().setBackground(new Color(70, 130, 180));

		// Etiqueta de título con un símbolo
		JLabel etiquetaTitulo = new JLabel("Método de Pago - Primiclub 🎥");
		etiquetaTitulo.setBounds(120, 10, 300, 30);
		etiquetaTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		etiquetaTitulo.setForeground(Color.WHITE);
		add(etiquetaTitulo);

		// Etiqueta para seleccionar el método de pago
		JLabel etiquetaMetodoPago = new JLabel("Selecciona un método de pago:");
		etiquetaMetodoPago.setBounds(50, 50, 300, 20);
		etiquetaMetodoPago.setForeground(Color.WHITE);
		add(etiquetaMetodoPago);

		// ComboBox para seleccionar el método de pago
		String[] metodosPago = { "Tarjeta", "PayPal", "Apple Pay" };
		JComboBox<String> comboBoxPago = new JComboBox<>(metodosPago);
		comboBoxPago.setBounds(50, 80, 200, 30);
		add(comboBoxPago);

		// Etiqueta para pedir la dirección de envío
		JLabel etiquetaDireccion = new JLabel("Introduce tu dirección de envío:");
		etiquetaDireccion.setBounds(50, 130, 300, 20);
		etiquetaDireccion.setForeground(Color.WHITE);
		add(etiquetaDireccion);

		// Campo de texto para la dirección
		JTextField campoDireccion = new JTextField();
		campoDireccion.setBounds(50, 160, 300, 30);
		add(campoDireccion);

		// Botón de "Confirmar Pago"
		JButton botonConfirmar = new JButton("Confirmar Pago");
		botonConfirmar.setBounds(50, 220, 150, 30);
		botonConfirmar.setBackground(Color.WHITE);
		botonConfirmar.setForeground(new Color(70, 130, 180));
		add(botonConfirmar);

		// Etiqueta para mostrar el resultado del pago
		JLabel etiquetaResultado = new JLabel();
		etiquetaResultado.setBounds(50, 270, 400, 30);
		etiquetaResultado.setForeground(Color.WHITE);
		add(etiquetaResultado);

		// Acción del botón "Confirmar Pago"
		botonConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String metodoPagoSeleccionado = (String) comboBoxPago.getSelectedItem();
				String direccion = campoDireccion.getText();

				if (direccion.isEmpty()) {
					etiquetaResultado.setText("Por favor, introduce tu dirección.");
				} else {
					etiquetaResultado
							.setText("Pago confirmado con " + metodoPagoSeleccionado + ". Envío a: " + direccion);
				}
			}
		});

		// Hacer visible el JFrame
		setVisible(true);
	}

	// Método principal
	public static void main(String[] args) {
		// Crear una instancia del JFrame
		new PrimiclubPago();
	}
}
