package puertas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ControlGPIO;

import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;
import java.awt.event.ActionEvent;

public class MenuPuertas extends JFrame {

	public JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;

	public MenuPuertas(String usuario) {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(0, 0, 794, 451);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnPuerta1 = new JButton("");
		btnPuerta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControlGPIO gpio = new ControlGPIO();
				try {
					gpio.uno();
					JOptionPane.showMessageDialog(null, "Abrio?");
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPuerta1.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab1r.png")));
		btnPuerta1.setBounds(46, 168, 213, 93);
		panel.add(btnPuerta1);
		
		JButton btnPuerta2 = new JButton("");
		btnPuerta2.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab2r.png")));
		btnPuerta2.setBounds(293, 168, 213, 93);
		panel.add(btnPuerta2);
		
		JButton btnPuerta3 = new JButton("");
		btnPuerta3.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab3r.png")));
		btnPuerta3.setBounds(545, 168, 213, 93);
		panel.add(btnPuerta3);
		
		JButton btnPuerta4 = new JButton("");
		btnPuerta4.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab4r.png")));
		btnPuerta4.setBounds(46, 280, 213, 93);
		panel.add(btnPuerta4);
		
		JButton btnPuerta5 = new JButton("");
		btnPuerta5.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab5r.png")));
		btnPuerta5.setBounds(293, 280, 213, 93);
		panel.add(btnPuerta5);
		
		JButton btnPuerta6 = new JButton("");
		btnPuerta6.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab6r.png")));
		btnPuerta6.setBounds(545, 280, 213, 93);
		panel.add(btnPuerta6);
		
		JButton btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				Perfil perfil = new Perfil(usuario);
				perfil.setVisible(true);
				perfil.setBounds(0, 0, 784, 441);
				contentPane.add(perfil);
				
			}
		});
		btnPerfil.setToolTipText("Configuraci\u00F3n");
		btnPerfil.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/setting.png")));
		btnPerfil.setBounds(634, 11, 57, 58);
		panel.add(btnPerfil);
		
		JButton btnSalir = new JButton("");
		btnSalir.setToolTipText("Salir");
		btnSalir.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/logout.png")));
		btnSalir.setBounds(701, 11, 57, 58);
		panel.add(btnSalir);
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		button_8.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/next.png")));
		button_8.setBounds(709, 385, 49, 50);
		panel.add(button_8);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 794, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 102, 153));
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/ELECTr.png")));
		button.setBounds(46, 168, 213, 93);
		panel_1.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/macr.png")));
		button_1.setBounds(293, 168, 213, 93);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/telecomur.png")));
		button_2.setBounds(545, 168, 213, 93);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/ADMr.png")));
		button_3.setBounds(46, 280, 213, 93);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/DIREr.png")));
		button_4.setBounds(293, 280, 213, 93);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/profer.png")));
		button_5.setBounds(545, 280, 213, 93);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/setting.png")));
		button_6.setToolTipText("Configuraci\u00F3n");
		button_6.setBounds(634, 11, 57, 58);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/logout.png")));
		button_7.setToolTipText("Salir");
		button_7.setBounds(701, 11, 57, 58);
		panel_1.add(button_7);
		
		JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		button_9.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/previous.png")));
		button_9.setBounds(46, 385, 49, 50);
		panel_1.add(button_9);
	}
}
