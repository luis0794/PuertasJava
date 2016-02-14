package puertas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import logica.Conexion;
import logica.ConexionMalla;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JPasswordField passwordField;
	static Conexion con = new Conexion();
	static ConexionMalla conMalla = new ConexionMalla();
	/**
	 * Create the panel.
	 */
	public Perfil() {
		setBackground(new Color(0, 102, 153));
		setLayout(null);
		
		JButton btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio inicio = new Inicio();
				inicio.setVisible(true);
				con.logout();
				conMalla.desconectar();
				setVisible(false);
			}
		});
		btnSalir.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/logout.png")));
		btnSalir.setToolTipText("Salir");
		btnSalir.setBounds(701, 11, 57, 58);
		add(btnSalir);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPuertas puertas = new MenuPuertas();
				puertas.setVisible(true);
				puertas.panel.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/back.png")));
		btnBack.setToolTipText("Salir");
		btnBack.setBounds(6, 11, 57, 58);
		add(btnBack);
		
		JLabel lblNombre = new JLabel("NOMBRES:");
		lblNombre.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNombre.setBounds(175, 61, 90, 29);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDOS:");
		lblApellido.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblApellido.setBounds(175, 165, 105, 29);
		add(lblApellido);
		
		JLabel lblCdula = new JLabel("C\u00C9DULA:");
		lblCdula.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblCdula.setBounds(175, 261, 77, 29);
		add(lblCdula);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContrasea.setBounds(175, 363, 120, 29);
		add(lblContrasea);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("SansSerif", Font.PLAIN, 24));
		txtNombre.setText(con.getName());
		txtNombre.setEditable(false);
		txtNombre.setBounds(305, 41, 245, 71);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("SansSerif", Font.PLAIN, 24));
		txtApellido.setText(con.getlastName());
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBounds(305, 145, 245, 71);
		add(txtApellido);
		
		txtCedula = new JTextField();
		txtCedula.setFont(new Font("SansSerif", Font.PLAIN, 24));
		txtCedula.setText(con.getUser());
		txtCedula.setEditable(false);
		txtCedula.setColumns(10);
		txtCedula.setBounds(305, 241, 245, 71);
		add(txtCedula);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("SansSerif", Font.PLAIN, 24));
		passwordField.setText(con.getPasswd());
		passwordField.setEditable(false);
		passwordField.setBounds(305, 343, 245, 71);
		add(passwordField);
		
		JButton btnCambiar = new JButton("");
		btnCambiar.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/refresh.png")));
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CambiarContra contra = new CambiarContra();
				setVisible(false);
				MenuPuertas puertas = new MenuPuertas();
				contra.setBounds(0, 0, 800, 480);
				puertas.setVisible(true);
				puertas.panel.setVisible(false);
				puertas.panel_1.setVisible(false);
				puertas.contentPane.add(contra);
				contra.setVisible(true);
			}
		});
		btnCambiar.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnCambiar.setBounds(562, 343, 69, 69);
		add(btnCambiar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Perfil.class.getResource("/media/images/fondo.jpg")));
		label.setBounds(0, 0, 800, 480);
		add(label);

	}
}
