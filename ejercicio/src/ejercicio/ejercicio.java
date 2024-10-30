package ejercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Dimension;
import javax.swing.JPasswordField;

public class ejercicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIntroduceNombreUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio frame = new ejercicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejercicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblimagen = new JLabel("New label");
		lblimagen.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblimagen.setIcon(new ImageIcon("C:\\Users\\esper\\Downloads\\image empresa.png"));
		lblimagen.setBounds(332, 0, 258, 371);
		contentPane.add(lblimagen);
		
		JLabel lblNewLabel_1 = new JLabel("INICIAR SESIÓN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(20, 71, 157, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("LOGO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(87, 47, 73, 0);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("USUARIO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 123, 110, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("CONTRASEÑA");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(20, 200, 110, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(20, 267, 96, 21);
		btnNewButton.setFocusPainted(false);                
		btnNewButton.setBorderPainted(false);              
		btnNewButton.setOpaque(true);
		contentPane.add(btnNewButton);
	

	
		
		JLabel lblNewLabel_4 = new JLabel("LOGO");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(87, 48, 85, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\esper\\Downloads\\image logo.png"));
		lblNewLabel_3.setBounds(0, 10, 180, 58);
		contentPane.add(lblNewLabel_3);
		
		txtIntroduceNombreUsuario = new JTextField(20);
		txtIntroduceNombreUsuario.setForeground(Color.GRAY);
		txtIntroduceNombreUsuario.setText("introduce nombre usuario");
		txtIntroduceNombreUsuario.setMaximumSize(new Dimension(2147483647, 30));
		txtIntroduceNombreUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		txtIntroduceNombreUsuario.setBounds(20, 147, 284, 30);
		contentPane.add(txtIntroduceNombreUsuario);
		
		passwordField = new JPasswordField(20);
		passwordField.setToolTipText("");
		passwordField.setMaximumSize(new Dimension(2147483647, 30));
		passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		passwordField.setBounds(20, 213, 284, 30);
		contentPane.add(passwordField);
	}
}

