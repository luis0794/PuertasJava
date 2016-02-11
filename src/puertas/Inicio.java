package puertas;

import logica.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class Inicio extends JFrame {
	
	Conexion con = new Conexion();
	ConexionMalla conMalla = new ConexionMalla();
	private JPanel contentPane;
	JPasswordField passwordField;
	boolean bandera = false;
	boolean bandera1 = false;
	MenuPuertas menu ;
	private JTextField txtUser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		for(UIManager.LookAndFeelInfo laf:UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(laf.getName()))
                try {
                UIManager.setLookAndFeel(laf.getClassName());
            } catch (Exception ex) {
            }
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setForeground(Color.LIGHT_GRAY);
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 482);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(57, 129, 215, 182);
		contentPane.add(panel);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"7");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"7");
				}
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(10, 11, 52, 31);
		panel.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"8");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"8");
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_1.setBounds(76, 11, 52, 31);
		panel.add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"9");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"9");
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBounds(149, 11, 52, 31);
		panel.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"6");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"6");
				}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(149, 53, 52, 31);
		panel.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"5");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"5");
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_4.setBounds(76, 53, 52, 31);
		panel.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"4");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"4");
				}
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_5.setBounds(10, 53, 52, 31);
		panel.add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"1");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"1");
				}
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_6.setBounds(10, 95, 52, 31);
		panel.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"2");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"2");
				}
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_7.setBounds(76, 95, 52, 31);
		panel.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"0");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"0");
				}
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_8.setBounds(76, 137, 52, 31);
		panel.add(button_8);
		
		JButton button_9 = new JButton("#");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"#");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"#");
				}
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_9.setBounds(10, 137, 52, 31);
		panel.add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"3");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"3");
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_10.setBounds(149, 95, 52, 31);
		panel.add(button_10);
		
		JButton button_11 = new JButton("*");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					txtUser.setText(txtUser.getText()+"*");
				}
				if(bandera1==true)
				{
					passwordField.setText(passwordField.getText()+"*");
				}
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_11.setBounds(149, 137, 52, 31);
		panel.add(button_11);
		
		passwordField = new JPasswordField();
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bandera = false;
				bandera1 = true;
			}
		});
		passwordField.setFont(new Font("SansSerif", Font.BOLD, 60));
		passwordField.setBounds(409, 240, 287, 71);
		contentPane.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Inicio.class.getResource("/media/images/user.png")));
		label.setBounds(326, 139, 48, 57);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Inicio.class.getResource("/media/images/password.png")));
		label_1.setBounds(326, 240, 48, 57);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Inicio.class.getResource("/media/images/back.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bandera==true)
				{
					if(txtUser.getText().length()>0)
					{
						txtUser.setText(txtUser.getText().substring(0, txtUser.getText().length()-1));
					}
				}
				if(bandera1==true)
				{
					if(passwordField.getText().length()>0)
					{
						passwordField.setText(passwordField.getText().substring(0, passwordField.getText().length()-1));
					}
				}
			}
		});
		btnNewButton.setBounds(700, 136, 78, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Inicio.class.getResource("/media/images/login.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(con.login(txtUser.getText(), passwordField.getText()))
				{
					/*Llamar l = new Llamar();
					try {
						l.hola();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}*/
					JOptionPane.showMessageDialog(null, "Bienvenid@, "+txtUser.getText()+"!");
					conMalla.conectar(Integer.parseInt(con.getIdMalla()));
					conMalla.getSemester();
					setVisible(false);
					menu = new MenuPuertas();
					menu.setVisible(true);
				}else
				{
					JOptionPane.showMessageDialog(new JFrame(), "Error!, verifique sus datos.", "Dialog",
						      JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1.setBounds(700, 242, 78, 65);
		contentPane.add(btnNewButton_1);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("SansSerif", Font.BOLD, 60));
		txtUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				bandera = true;
				bandera1 = false;
			}
		});
		txtUser.setBounds(409, 134, 287, 71);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
	}
}
