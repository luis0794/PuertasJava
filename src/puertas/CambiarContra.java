package puertas;

import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Conexion;
import logica.Encriptacion;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CambiarContra extends JPanel {
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	boolean bandera = false;
	boolean bandera1 = false;
	boolean bandera2 = false;
	MenuPuertas menu;
	Conexion con = new Conexion();
	Encriptacion cripto = new Encriptacion();

	public CambiarContra() {
		setBackground(new Color(0, 102, 153));
		setLayout(null);
		
		JLabel lblContraseaActual = new JLabel("ACTUAL:");
		lblContraseaActual.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContraseaActual.setBounds(411, 18, 155, 29);
		add(lblContraseaActual);
		
		JLabel lblContraseaNueva = new JLabel("NUEVA:");
		lblContraseaNueva.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblContraseaNueva.setBounds(411, 142, 155, 29);
		add(lblContraseaNueva);
		
		JLabel lblConfirmar = new JLabel("REPETIR:");
		lblConfirmar.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblConfirmar.setBounds(411, 268, 155, 29);
		add(lblConfirmar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cAct = passwordField.getText();
				String cNew = passwordField_1.getText();
				String cRNew = passwordField_2.getText();
				try {
					if(cAct.equals(cripto.Desencriptar(con.getPasswd())))
					{
						if(cNew.equals("") || cRNew.equals(""))
						{
							JOptionPane.showMessageDialog(new JFrame(), "Llene todos los campos!", "Dialog",
								      JOptionPane.ERROR_MESSAGE);
						}else
						{
							if(cNew.equals(cRNew))
							{
								con.updatePass(cRNew);
								JOptionPane.showMessageDialog(null, "Contraseña actualizada con exito!");
								menu = new MenuPuertas();
						        menu.setVisible(true);
						        setVisible(false);
							}else
							{
								JOptionPane.showMessageDialog(new JFrame(), "Las contraseñas no coinciden", "Dialog",
									      JOptionPane.ERROR_MESSAGE);
							}
						}
					}else
					{
						JOptionPane.showMessageDialog(new JFrame(), "La contraseña actual no es la correcta", "Dialog",
						      JOptionPane.ERROR_MESSAGE);
					}
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(CambiarContra.class.getResource("/media/images/save.png")));
		btnNewButton.setBounds(569, 379, 60, 57);
		add(btnNewButton);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ax = JOptionPane.showConfirmDialog(null, "Deseas cancelar?");
		        if(ax == JOptionPane.YES_OPTION)
		        {
		        	menu = new MenuPuertas();
			        menu.setVisible(true);
			        setVisible(false);
		        }
		            
			}
		});
		button_12.setIcon(new ImageIcon(CambiarContra.class.getResource("/media/images/cancel.png")));
		button_12.setBounds(475, 379, 60, 57);
		add(button_12);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				bandera = true;
				bandera1 = false;
				bandera2 = false;
			}
		});
		passwordField.setFont(new Font("SansSerif", Font.BOLD, 50));
		passwordField.setBounds(411, 45, 287, 71);
		add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bandera = false;
				bandera1 = true;
				bandera2 = false;
			}
		});
		passwordField_1.setFont(new Font("SansSerif", Font.BOLD, 50));
		passwordField_1.setBounds(411, 168, 287, 71);
		add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bandera = false;
				bandera1 = false;
				bandera2 = true;
			}
		});
		passwordField_2.setFont(new Font("SansSerif", Font.BOLD, 50));
		passwordField_2.setBounds(411, 296, 287, 71);
		add(passwordField_2);
		
		JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					if(passwordField.getText().length()>0)
					{
						passwordField.setText(passwordField.getText().substring(0, passwordField.getText().length()-1));
					}
				}
				if(bandera1==true)
				{
					if(passwordField_1.getText().length()>0)
					{
						passwordField_1.setText(passwordField_1.getText().substring(0, passwordField_1.getText().length()-1));
					}
				}
				if(bandera2==true)
				{
					if(passwordField_2.getText().length()>0)
					{
						passwordField_2.setText(passwordField_2.getText().substring(0, passwordField_2.getText().length()-1));
					}
				}
			}
		});
		button_13.setIcon(new ImageIcon(CambiarContra.class.getResource("/media/images/back.png")));
		button_13.setBounds(700, 47, 78, 65);
		add(button_13);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"7");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"7");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"7");
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 60));
		button.setBounds(38, 45, 96, 90);
		add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"8");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"8");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"8");
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_1.setBounds(132, 45, 96, 90);
		add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"9");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"9");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"9");
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_2.setBounds(227, 45, 96, 90);
		add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"6");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"6");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"6");
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_3.setBounds(227, 135, 96, 90);
		add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"5");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"5");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"5");
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_4.setBounds(132, 135, 96, 90);
		add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"4");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"4");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"4");
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_5.setBounds(38, 135, 96, 90);
		add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"1");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"1");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"1");
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_6.setBounds(38, 224, 96, 90);
		add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"2");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"2");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"2");
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_7.setBounds(132, 224, 96, 90);
		add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"3");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"3");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"3");
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_8.setBounds(227, 224, 96, 90);
		add(button_8);
		
		JButton button_9 = new JButton("*");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"*");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"*");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"*");
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_9.setBounds(227, 314, 96, 90);
		add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"0");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"0");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"0");
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_10.setBounds(132, 314, 96, 90);
		add(button_10);
		
		JButton button_11 = new JButton("#");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					passwordField.setText(passwordField.getText()+"#");
				}
				if(bandera1==true)
				{
					passwordField_1.setText(passwordField_1.getText()+"#");
				}
				if(bandera2==true)
				{
					passwordField_2.setText(passwordField_2.getText()+"#");
				}
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 60));
		button_11.setBounds(38, 314, 96, 90);
		add(button_11);

	}
}
