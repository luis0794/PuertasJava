package puertas;

import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class CambiarContra extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CambiarContra() {
		setLayout(null);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(74, 136, 215, 182);
		add(panel);
		
		JButton button = new JButton("7");
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(10, 11, 52, 31);
		panel.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(76, 11, 52, 31);
		panel.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(149, 11, 52, 31);
		panel.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(149, 53, 52, 31);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(76, 53, 52, 31);
		panel.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.setBounds(10, 53, 52, 31);
		panel.add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBounds(10, 95, 52, 31);
		panel.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.setBounds(76, 95, 52, 31);
		panel.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(76, 137, 52, 31);
		panel.add(button_8);
		
		JButton button_9 = new JButton("#");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBounds(10, 137, 52, 31);
		panel.add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBounds(149, 95, 52, 31);
		panel.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(149, 137, 52, 31);
		panel.add(button_11);
		
		JLabel lblContraseaActual = new JLabel("Actual:");
		lblContraseaActual.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContraseaActual.setBounds(306, 136, 155, 29);
		add(lblContraseaActual);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(471, 136, 245, 35);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(471, 207, 245, 35);
		add(textField_1);
		
		JLabel lblContraseaNueva = new JLabel("Nueva:");
		lblContraseaNueva.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContraseaNueva.setBounds(306, 207, 155, 29);
		add(lblContraseaNueva);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(471, 289, 245, 35);
		add(textField_2);
		
		JLabel lblConfirmar = new JLabel("Volver a escribir: ");
		lblConfirmar.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblConfirmar.setBounds(306, 289, 155, 29);
		add(lblConfirmar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(CambiarContra.class.getResource("/media/images/save.png")));
		btnNewButton.setBounds(656, 359, 60, 57);
		add(btnNewButton);
		
		JButton button_12 = new JButton("");
		button_12.setIcon(new ImageIcon(CambiarContra.class.getResource("/media/images/cancel.png")));
		button_12.setBounds(586, 359, 60, 57);
		add(button_12);

	}
}
