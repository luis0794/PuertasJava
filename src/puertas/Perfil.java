package puertas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Perfil(String usuario) {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/logout.png")));
		btnSalir.setToolTipText("Salir");
		btnSalir.setBounds(683, 11, 57, 58);
		add(btnSalir);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				MenuPuertas puertas = new MenuPuertas(usuario);
				puertas.setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/back.png")));
		btnBack.setToolTipText("Salir");
		btnBack.setBounds(6, 11, 57, 58);
		add(btnBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/user.png")));
		label.setBounds(72, 85, 57, 58);
		add(label);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNombre.setBounds(160, 161, 77, 29);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblApellido.setBounds(160, 224, 77, 29);
		add(lblApellido);
		
		JLabel lblCdula = new JLabel("C\u00E9dula: ");
		lblCdula.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblCdula.setBounds(160, 279, 77, 29);
		add(lblCdula);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContrasea.setBounds(160, 339, 105, 29);
		add(lblContrasea);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(274, 160, 245, 35);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(274, 223, 245, 35);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(274, 278, 245, 35);
		add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(277, 338, 245, 35);
		add(passwordField);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				CambiarContra contra = new CambiarContra();
				contra.setVisible(true);
			}
		});
		btnCambiar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCambiar.setBounds(552, 341, 90, 28);
		add(btnCambiar);

	}
}
