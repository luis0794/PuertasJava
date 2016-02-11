package puertas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import logica.Conexion;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JPasswordField passwordField;
	static Conexion con = new Conexion();
	/**
	 * Create the panel.
	 */
	public Perfil(String usuario) {
		setBackground(new Color(0, 102, 153));
		setLayout(null);
		
		JButton btnSalir = new JButton("");
		btnSalir.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/logout.png")));
		btnSalir.setToolTipText("Salir");
		btnSalir.setBounds(683, 11, 57, 58);
		add(btnSalir);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPuertas puertas = new MenuPuertas(usuario);
				puertas.setVisible(true);
				puertas.panel.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/back.png")));
		btnBack.setToolTipText("Salir");
		btnBack.setBounds(6, 11, 57, 58);
		add(btnBack);
		
		JLabel lblNombre = new JLabel("Nombres: ");
		lblNombre.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNombre.setBounds(160, 161, 90, 29);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellidos: ");
		lblApellido.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblApellido.setBounds(160, 224, 90, 29);
		add(lblApellido);
		
		JLabel lblCdula = new JLabel("C\u00E9dula: ");
		lblCdula.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblCdula.setBounds(160, 279, 77, 29);
		add(lblCdula);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a: ");
		lblContrasea.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContrasea.setBounds(160, 339, 105, 29);
		add(lblContrasea);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtNombre.setText(con.getName());
		txtNombre.setEditable(false);
		txtNombre.setBounds(274, 160, 245, 35);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtApellido.setText(con.getlastName());
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(274, 223, 245, 35);
		add(txtApellido);
		
		txtCedula = new JTextField();
		txtCedula.setFont(new Font("SansSerif", Font.PLAIN, 14));
		txtCedula.setText(con.getUser());
		txtCedula.setEditable(false);
		txtCedula.setColumns(10);
		txtCedula.setBounds(274, 278, 245, 35);
		add(txtCedula);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		passwordField.setText(con.getPasswd());
		passwordField.setEditable(false);
		passwordField.setBounds(277, 338, 245, 35);
		add(passwordField);
		
		JButton btnCambiar = new JButton("Cambiar");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiarContra contra = new CambiarContra();
				contra.setVisible(true);
				setVisible(false);
			}
		});
		btnCambiar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCambiar.setBounds(552, 341, 90, 28);
		add(btnCambiar);

	}
}
