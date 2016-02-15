package puertas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Conexion;
import logica.ConexionMalla;
import logica.EstadoLabs;
import logica.Llamar;

import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ResourceBundle.Control;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MenuPuertas extends JFrame {

	public JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;
	static EstadoLabs estado = new EstadoLabs();
	static boolean[] est = estado.estado();
	Conexion con = new Conexion();
	static ConexionMalla conMalla = new ConexionMalla();
	static LinkedList<String> promo = conMalla.getPromo();
	static Llamar pulso = new Llamar();
	
	public MenuPuertas() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 480);
		setLocationRelativeTo(null);
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
		btnPuerta1.setEnabled(est[0]);
		btnPuerta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorio1.php"))
					{
						con.saveReg(1, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(0))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnPuerta1.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab1r.png")));
		btnPuerta1.setBounds(46, 168, 213, 93);
		panel.add(btnPuerta1);
		
		JButton btnPuerta2 = new JButton("");
		btnPuerta2.setEnabled(est[1]);
		btnPuerta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){		
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorio2.php"))
					{
						con.saveReg(2, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(1))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnPuerta2.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab2r.png")));
		btnPuerta2.setBounds(293, 168, 213, 93);
		panel.add(btnPuerta2);
		
		JButton btnPuerta3 = new JButton("");
		btnPuerta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorio3.php"))
					{
						con.saveReg(3, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(2))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnPuerta3.setEnabled(est[2]);
		btnPuerta3.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab3r.png")));
		btnPuerta3.setBounds(545, 168, 213, 93);
		panel.add(btnPuerta3);
		
		JButton btnPuerta4 = new JButton("");
		btnPuerta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorio4.php"))
					{
						con.saveReg(4, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(3))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta4.setEnabled(est[3]);
		btnPuerta4.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab4r.png")));
		btnPuerta4.setBounds(46, 280, 213, 93);
		panel.add(btnPuerta4);
		
		JButton btnPuerta5 = new JButton("");
		btnPuerta5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorio5.php"))
					{
						con.saveReg(5, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(4))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta5.setEnabled(est[4]);
		btnPuerta5.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab5r.png")));
		btnPuerta5.setBounds(293, 280, 213, 93);
		panel.add(btnPuerta5);
		
		JButton btnPuerta6 = new JButton("");
		btnPuerta6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorio6.php"))
					{
						con.saveReg(6, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(5))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta6.setEnabled(est[5]);
		btnPuerta6.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/lab6r.png")));
		btnPuerta6.setBounds(545, 280, 213, 93);
		panel.add(btnPuerta6);
		
		JButton btnPerfil = new JButton("");
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				Perfil perfil = new Perfil();
				perfil.setVisible(true);
				perfil.setBounds(0, 0, 800, 480);
				contentPane.add(perfil);
				
			}
		});
		btnPerfil.setToolTipText("Configuraci\u00F3n");
		btnPerfil.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/setting.png")));
		btnPerfil.setBounds(634, 11, 57, 58);
		panel.add(btnPerfil);
		
		JButton btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Inicio inicio = new Inicio();
				inicio.setVisible(true);
				con.logout();
				conMalla.desconectar();
				setVisible(false);
			}
		});
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
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/fondo.jpg")));
		label.setBounds(0, 0, 794, 451);
		panel.add(label);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 794, 451);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 102, 153));
		
		JButton btnPuerta7 = new JButton("");
		btnPuerta7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratorioelec.php"))
					{
						con.saveReg(7, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(6))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta7.setEnabled(est[6]);
		btnPuerta7.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/ELECTr.png")));
		btnPuerta7.setBounds(46, 168, 213, 93);
		panel_1.add(btnPuerta7);
		
		JButton btnPuerta8 = new JButton("");
		btnPuerta8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratoriomac.php"))
					{
						con.saveReg(8, estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(7))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta8.setEnabled(est[7]);
		btnPuerta8.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/macr.png")));
		btnPuerta8.setBounds(293, 168, 213, 93);
		panel_1.add(btnPuerta8);
		
		JButton btnPuerta9 = new JButton("");
		btnPuerta9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/laboratoriotele.php"))
					{
						con.saveReg(Integer.parseInt(conMalla.getLab(0)), estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(0))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta9.setEnabled(est[8]);
		btnPuerta9.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/telecomur.png")));
		btnPuerta9.setBounds(545, 168, 213, 93);
		panel_1.add(btnPuerta9);
		
		JButton btnPuerta10 = new JButton("");
		btnPuerta10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/admin.php"))
					{
						con.saveReg(Integer.parseInt(conMalla.getLab(10)), estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(9))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta10.setEnabled(est[9]);
		btnPuerta10.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/ADMr.png")));
		btnPuerta10.setBounds(46, 280, 213, 93);
		panel_1.add(btnPuerta10);
		
		JButton btnPuerta11 = new JButton("");
		btnPuerta11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/direccion.php"))
					{
						con.saveReg(Integer.parseInt(conMalla.getLab(11)), estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(10))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta11.setEnabled(est[10]);
		btnPuerta11.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/DIREr.png")));
		btnPuerta11.setBounds(293, 280, 213, 93);
		panel_1.add(btnPuerta11);
		
		JButton btnPuerta12 = new JButton("");
		btnPuerta12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(pulso.pulsoPHP("http://192.168.0.101/home/pi/Desktop/pulsos/profe.php"))
					{
						con.saveReg(Integer.parseInt(conMalla.getLab(12)), estado.fechaL(), estado.hora(), conMalla.getSemester(Integer.parseInt(promo.get(11))), estado.fechaC());
						JOptionPane.showMessageDialog(null, "Abierto!");
						Inicio inicio = new Inicio();
						inicio.setVisible(true);
						setVisible(false);
					}else
					{
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (HeadlessException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnPuerta12.setEnabled(est[11]);
		btnPuerta12.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/profer.png")));
		btnPuerta12.setBounds(545, 280, 213, 93);
		panel_1.add(btnPuerta12);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				Perfil perfil = new Perfil();
				perfil.setVisible(true);
				perfil.setBounds(0, 0, 800, 480);
				contentPane.add(perfil);
			}
		});
		button_6.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/setting.png")));
		button_6.setToolTipText("Configuraci\u00F3n");
		button_6.setBounds(634, 11, 57, 58);
		panel_1.add(button_6);
		
		JButton btnSalir2 = new JButton("");
		btnSalir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio inicio = new Inicio();
				inicio.setVisible(true);
				con.logout();
				conMalla.desconectar();
				setVisible(false);
			}
		});
		btnSalir2.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/logout.png")));
		btnSalir2.setToolTipText("Salir");
		btnSalir2.setBounds(701, 11, 57, 58);
		panel_1.add(btnSalir2);
		
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
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(MenuPuertas.class.getResource("/media/images/fondo.jpg")));
		label_1.setBounds(0, 0, 794, 451);
		panel_1.add(label_1);
	}
}
