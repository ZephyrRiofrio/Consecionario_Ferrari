package codigo.ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import javax.swing.Timer;
import java.awt.event.MouseEvent;
import java.awt.event.*;
import java.util.Random;

public class iniciar_sesion extends JFrame implements MouseListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel formulario;
	private JPanel panel_imagen;
	private JLabel lblImagen;
	private JLabel lblTitulo;
	private JLabel lblIniciarSesion;
	private JLabel lblCorreo;
	private JTextField textFieldCorreo;
	private JSeparator separatorCorreo;
	private JLabel lblContrasenia;
	private JPasswordField passwordFieldContrasenia;
	private JSeparator separatorContrasenia;
	private JButton btnAcceder;
	private JLabel lblVista;
	private JLabel lblCargaContrasenia;
	private JLabel lblCargaCorreo;
	private JLabel lblErrorDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iniciar_sesion frame = new iniciar_sesion();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void mostrarOcultarElementosCarga(boolean valor) {
		textFieldCorreo.setEnabled(valor);
		passwordFieldContrasenia.setEnabled(valor);
		btnAcceder.setEnabled(valor);
		lblVista.setEnabled(valor);
		lblVista.setFocusable(valor);
		
		lblCargaCorreo.setVisible(!valor);
		lblCargaContrasenia.setVisible(!valor);
	}
	
	private void accionBotonAcceder() {
		mostrarOcultarElementosCarga(false);
		
		Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            	if (verificarDatos()) {
            		accederMenu();
            	} else {
            		mostrarOcultarElementosCarga(true);
            	}
        		
                ((Timer) evt.getSource()).stop();
            }
        });
		
		timer.setRepeats(false);
		timer.start();
	}
	
	private boolean verificarDatos() {
		String correoIngre, contraseniaIngre, correoCorrec, contraseniaCorrec;
		boolean datosCorrectos = false;
		
		correoCorrec = "mathiasriofrio0906@gmail.com";
		contraseniaCorrec = "091206Cibertec";
		
		
		try {
			correoIngre = textFieldCorreo.getText();
			contraseniaIngre = new String(passwordFieldContrasenia.getPassword());
			
			if (correoIngre.isEmpty() || contraseniaIngre.isEmpty()) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("No se han ingresado los datos");
				datosCorrectos = false;
			} else if (!(correoIngre.equals(correoCorrec)) || !(contraseniaIngre.equals(contraseniaCorrec))) {
				lblErrorDatos.setVisible(true);
				lblErrorDatos.setText("Los datos son incorrectos");
				datosCorrectos = false;
			} else {
				datosCorrectos = true;
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(this, "Exception - " + e, "Exception", JOptionPane.ERROR_MESSAGE);
		}
		
		return datosCorrectos;
	}
	
	private void accederMenu() {
		menu menu_frame = new menu();
		
		menu_frame.setLocationRelativeTo(null);
		menu_frame.setVisible(true);
		
		this.dispose();
	}

	/**
	 * Create the frame.
	 */
	public iniciar_sesion() {
		setTitle("Iniciar sesión");
		setIconImage(Toolkit.getDefaultToolkit().getImage(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_ventana/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		formulario = new JPanel();
		formulario.setBackground(Color.WHITE);
		formulario.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.add(formulario, BorderLayout.CENTER);
		formulario.setLayout(null);
		
		lblTitulo = new JLabel("");
		lblTitulo.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/título_rend.png")));
		lblTitulo.setBounds(23, 32, 141, 24);
		formulario.add(lblTitulo);
		
		lblIniciarSesion = new JLabel("Iniciar sesión");
		lblIniciarSesion.setFont(new Font("Roboto Thin", Font.BOLD, 25));
		lblIniciarSesion.setBounds(23, 67, 195, 41);
		formulario.add(lblIniciarSesion);
		
		lblCorreo = new JLabel("Correo electrónico:");
		lblCorreo.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		lblCorreo.setBounds(23, 119, 174, 29);
		formulario.add(lblCorreo);
		
		textFieldCorreo = new JTextField();
		textFieldCorreo.addKeyListener(this);
		textFieldCorreo.setBorder(new EmptyBorder(0, 0, 0, 0));
		textFieldCorreo.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		textFieldCorreo.setBounds(23, 152, 281, 20);
		formulario.add(textFieldCorreo);
		textFieldCorreo.setColumns(10);
		
		separatorCorreo = new JSeparator();
		separatorCorreo.setBackground(Color.BLACK);
		separatorCorreo.setBounds(23, 178, 281, 4);
		formulario.add(separatorCorreo);
		
		lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		lblContrasenia.setBounds(23, 206, 174, 24);
		formulario.add(lblContrasenia);
		
		lblVista = new JLabel("");
		lblVista.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVista.addMouseListener(this);
		lblVista.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
		lblVista.setBounds(314, 235, 14, 20);
		formulario.add(lblVista);
		
		passwordFieldContrasenia = new JPasswordField();
		passwordFieldContrasenia.addKeyListener(this);
		passwordFieldContrasenia.setBorder(new EmptyBorder(0, 0, 0, 0));
		passwordFieldContrasenia.setEchoChar('*');
		passwordFieldContrasenia.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		passwordFieldContrasenia.setBounds(23, 235, 281, 20);
		formulario.add(passwordFieldContrasenia);
		
		separatorContrasenia = new JSeparator();
		separatorContrasenia.setBackground(Color.BLACK);
		separatorContrasenia.setBounds(23, 262, 281, 4);
		formulario.add(separatorContrasenia);
		
		btnAcceder = new JButton("Acceder");
		btnAcceder.addMouseListener(this);
		btnAcceder.setFocusPainted(false);
		btnAcceder.setBorderPainted(false);
		btnAcceder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAcceder.setBackground(SystemColor.textHighlight);
		btnAcceder.setForeground(Color.WHITE);
		btnAcceder.setFont(new Font("Roboto", Font.BOLD, 13));
		btnAcceder.setBounds(23, 295, 97, 29);
		formulario.add(btnAcceder);
		
		lblCargaCorreo = new JLabel("");
		lblCargaCorreo.setVisible(false);
		lblCargaCorreo.setFocusable(false);
		lblCargaCorreo.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/gifs/gifs_login/circulo_de_carga_rend.gif")));
		lblCargaCorreo.setSize(new Dimension(14, 14));
		lblCargaCorreo.setPreferredSize(new Dimension(14, 14));
		lblCargaCorreo.setBounds(337, 152, 20, 20);
		formulario.add(lblCargaCorreo);
		
		lblCargaContrasenia = new JLabel("");
		lblCargaContrasenia.setVisible(false);
		lblCargaContrasenia.setFocusable(false);
		lblCargaContrasenia.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/gifs/gifs_login/circulo_de_carga_rend.gif")));
		lblCargaContrasenia.setSize(new Dimension(14, 14));
		lblCargaContrasenia.setPreferredSize(new Dimension(14, 14));
		lblCargaContrasenia.setBounds(337, 235, 20, 20);
		formulario.add(lblCargaContrasenia);
		
		lblErrorDatos = new JLabel("");
		lblErrorDatos.setFocusable(false);
		lblErrorDatos.setVisible(false);
		lblErrorDatos.setForeground(Color.RED);
		lblErrorDatos.setFont(new Font("Roboto Light", Font.PLAIN, 11));
		lblErrorDatos.setBounds(130, 303, 174, 14);
		formulario.add(lblErrorDatos);
		
		panel_imagen = new JPanel();
		panel_imagen.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_imagen.setPreferredSize(new Dimension(250, 350));
		contentPane.add(panel_imagen, BorderLayout.EAST);
		panel_imagen.setLayout(new BorderLayout(0, 0));
		
		lblImagen = new JLabel("");
		Random rand = new Random();
		
		int numeroMax = 4;
		int numeroMin = 1;
		
		int numeroAleatorio = rand.nextInt((numeroMax - numeroMin) + 1) + numeroMin;
		
		switch(numeroAleatorio) {
		case 1:
			lblImagen.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_1_rend.jpg")));
			break;
			
		case 2:
			lblImagen.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_2_rend.jpg")));
			break;
			
		case 3:
			lblImagen.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_3_rend.jpg")));
			break;
			
		case 4:
			lblImagen.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/login_carrusel_4_rend.jpg")));
			break;
		}
		
		panel_imagen.add(lblImagen, BorderLayout.CENTER);

	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == btnAcceder) {
			mouseClickedBtnAcceder(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == lblVista) {
			mousePressedLblVista(e);
		}
	}
	public void mouseReleased(MouseEvent e) {
		if (lblVista.isEnabled() == true) {
			lblVista.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
			
			passwordFieldContrasenia.setEchoChar('*');
		}
	}
	protected void mousePressedLblVista(MouseEvent e) {
		if (lblVista.isEnabled() == true) {
			lblVista.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_cerrado_rend.png")));
			
			passwordFieldContrasenia.setEchoChar((char)0);
		}
	}
	protected void mouseClickedBtnAcceder(MouseEvent e) {
		accionBotonAcceder();
	}
	public void keyPressed(KeyEvent e) {
		if (e.getSource() == passwordFieldContrasenia) {
			keyPressedPasswordFieldContrasenia(e);
		}
		if (e.getSource() == textFieldCorreo) {
			keyPressedTextFieldCorreo(e);
		}
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
	}
	protected void keyPressedTextFieldCorreo(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (new String(passwordFieldContrasenia.getPassword()).isEmpty()) {
				passwordFieldContrasenia.grabFocus();
			} else {
				accionBotonAcceder();
			}
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			passwordFieldContrasenia.grabFocus();
		}
	}
	protected void keyPressedPasswordFieldContrasenia(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (passwordFieldContrasenia.getEchoChar() != '*') {
				lblVista.setIcon(new ImageIcon(iniciar_sesion.class.getResource("/recursos/imagenes/imagenes_login/ojo_abierto_rend.png")));
				
				passwordFieldContrasenia.setEchoChar('*');
				accionBotonAcceder();
				
			} else {
				accionBotonAcceder();
			}
			
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			textFieldCorreo.grabFocus();
		}
	}
}
